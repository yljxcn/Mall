package com.xmg.mall.web.controller.product;

import com.xmg.mall.base.query.Pagination;
import com.xmg.mall.base.query.PaginationUtil;
import com.xmg.mall.base.query.QueryCondition;
import com.xmg.mall.product.qo.SkuPropertyQuery;
import com.xmg.mall.product.qo.SkuPropertyRelationshipValueQuery;
import com.xmg.mall.product.service.SkuPropertyRelationshipValueService;
import com.xmg.mall.product.vo.ExtendedCatalogProperty;
import com.xmg.mall.product.vo.ExtendedSkuProperty;
import com.xmg.mall.product.vo.ExtendedSkuPropertyRelationshipValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lony on 2017/2/15.
 */
@Controller("skuPropertyRelationshipValueController")
@RequestMapping("/skuPropertyRelationshipValue")
public class SkuPropertyRelationshipValueController {

    private SkuPropertyRelationshipValueService skuPropertyRelationshipValueService;

    @Autowired
    public void setSkuPropertyRelationshipValueService(SkuPropertyRelationshipValueService skuPropertyRelationshipValueService) {
        this.skuPropertyRelationshipValueService = skuPropertyRelationshipValueService;
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<ExtendedSkuPropertyRelationshipValue> list(Long skuPropertyId) {
        SkuPropertyRelationshipValueQuery qo = new SkuPropertyRelationshipValueQuery();
        qo.setSkuPropertyId(skuPropertyId);
        qo.setOrderBySequence(QueryCondition.ORDER_BY_KEYWORD_ASC);
        return skuPropertyRelationshipValueService.listSkuPropertyRelationshipValues(qo);
    }
}
