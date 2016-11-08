package com.xmg.mall.base.event;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationEventDispatcher implements ApplicationListener<ApplicationEvent>{

	static final Log LOG = LogFactory.getLog(ApplicationEventDispatcher.class);
	private Map<Class<?>, List<EventMapping >> eventMap;

	public void setEventMapping(List<EventMapping> eventMapping) {
		
		eventMap = new HashMap<Class<?>, List<EventMapping>>();
		
		for (EventMapping em : eventMapping) {
			List<EventMapping> ems = eventMap.get(em.getEventClass());
			if(ems == null){
				ems = new ArrayList<EventMapping>();
				eventMap.put(em.getEventClass(), ems);
			}
			ems.add(em);
			
			// 检查
			lookupMethod(em.getTarget(), em.getTargetMethod(), em.getEventClass());
		}
		
	}

	private void dispatch(EventMapping mapping, ApplicationEvent event){
		
		Class<? extends ApplicationEvent> eventClass = mapping.getEventClass();
		Object target = mapping.getTarget();
		String targetMethodName = mapping.getTargetMethod();

		if(!eventClass.isInstance(event))
			return;

		Method targetMethod = lookupMethod(target, targetMethodName, eventClass);
		
		if(LOG.isDebugEnabled()) 
			LOG.debug("将准备触发事件监听方法：" + target + ":" + targetMethodName);
		
		try {
			targetMethod.invoke(target, event);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public void onApplicationEvent(ApplicationEvent e) {
		List<EventMapping> eventMapping = eventMap.get(e.getClass());
		if(eventMapping == null)
			return;
		for (EventMapping mapping : eventMapping) {
			dispatch(mapping, e);
		}
	}
	
	public Method lookupMethod(Object target, String targetMethodName, Class<?> eventClass){
		try {
			return target.getClass().getMethod(targetMethodName, eventClass);
		} catch (SecurityException ex) {
			throw new RuntimeException("事件转发器无法访问指定的目标事件监听类的目标方法"
					+ targetMethodName + " - "+ eventClass.getName(), ex);
		} catch (NoSuchMethodException ex) {
			throw new RuntimeException("事件转发器找不到指定目标事件监听类的目标方法："
										+ targetMethodName
										+ ", 或其方法参数不符合特定事件类："
										+ eventClass.getName(), ex);
		}
	}

}
