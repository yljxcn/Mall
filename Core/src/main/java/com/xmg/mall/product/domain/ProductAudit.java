
package com.xmg.mall.product.domain;

import com.xmg.mall.base.domain.BasicDomain;

public class ProductAudit
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Integer state;
    public final static int STATE_SUCCESS = 0;
    public final static int STATE_FAILURE = (STATE_SUCCESS + 1);
    protected Long productId;
    protected Long employeeId;
    protected String note;

    public ProductAudit setState(Integer state) {
        this.state = state;
        return this;
    }

    public Integer getState() {
        return this.state;
    }

    public final static Integer[] getValidStates() {
        Integer[] validStates = new Integer[] {STATE_SUCCESS, STATE_FAILURE };
        return validStates;
    }

    public boolean isSuccess() {
        return (this.state == STATE_SUCCESS);
    }

    public ProductAudit setSuccess() {
        this.state = STATE_SUCCESS;
        return this;
    }

    public boolean isFailure() {
        return (this.state == STATE_FAILURE);
    }

    public ProductAudit setFailure() {
        this.state = STATE_FAILURE;
        return this;
    }

    public Long getProductId() {
        return this.productId;
    }

    public ProductAudit setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public Long getEmployeeId() {
        return this.employeeId;
    }

    public ProductAudit setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public String getNote() {
        return this.note;
    }

    public ProductAudit setNote(String note) {
        this.note = note;
        return this;
    }

}
