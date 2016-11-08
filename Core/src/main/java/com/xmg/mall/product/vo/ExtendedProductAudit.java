
package com.xmg.mall.product.vo;

import com.xmg.mall.product.domain.ProductAudit;

public class ExtendedProductAudit
    extends ProductAudit
{

    private final static long serialVersionUID = 1L;
    protected com.xmg.mall.product.domain.Product product;
    protected com.xmg.mall.employee.domain.Employee employee;

    public com.xmg.mall.product.domain.Product getProduct() {
        return this.product;
    }

    public ExtendedProductAudit setProduct(com.xmg.mall.product.domain.Product product) {
        this.product = product;
        return this;
    }

    public com.xmg.mall.employee.domain.Employee getEmployee() {
        return this.employee;
    }

    public ExtendedProductAudit setEmployee(com.xmg.mall.employee.domain.Employee employee) {
        this.employee = employee;
        return this;
    }

}
