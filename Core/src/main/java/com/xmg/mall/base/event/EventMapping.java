package com.xmg.mall.base.event;

import org.springframework.context.ApplicationEvent;

public class EventMapping {

	private Class<? extends ApplicationEvent> eventClass; 
	private Object target;		
	private String targetMethod;	

	public Class<? extends ApplicationEvent> getEventClass() {
		return eventClass;
	}

	public void setEventClass(Class<? extends ApplicationEvent> eventClass) {
		this.eventClass = eventClass;
	}

	public Object getTarget() {
		return target;
	}
	
	public void setTarget(Object target) {
		this.target = target;
	}

	public String getTargetMethod() {
		return targetMethod;
	}

	public void setTargetMethod(String targetMethod) {
		this.targetMethod = targetMethod;
	}
}
