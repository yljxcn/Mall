
package com.xmg.mall.employee.domain;

import com.xmg.mall.base.domain.BasicDomain;

public class Employee
    extends BasicDomain
{

    private final static long serialVersionUID = 1L;
    protected Integer state;
    public final static int STATE_NORMAL = 0;
    public final static int STATE_LOCK = (STATE_NORMAL + 1);
    public final static int STATE_CANCEL = (STATE_LOCK + 1);
    protected String avatar;
    protected String name;
    protected String password;

    public Employee setState(Integer state) {
        this.state = state;
        return this;
    }

    public Integer getState() {
        return this.state;
    }

    public final static Integer[] getValidStates() {
        Integer[] validStates = new Integer[] {STATE_NORMAL, STATE_LOCK, STATE_CANCEL };
        return validStates;
    }

    public boolean isNormal() {
        return (this.state == STATE_NORMAL);
    }

    public Employee setNormal() {
        this.state = STATE_NORMAL;
        return this;
    }

    public boolean isLock() {
        return (this.state == STATE_LOCK);
    }

    public Employee setLock() {
        this.state = STATE_LOCK;
        return this;
    }

    public boolean isCancel() {
        return (this.state == STATE_CANCEL);
    }

    public Employee setCancel() {
        this.state = STATE_CANCEL;
        return this;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public Employee setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public String getPassword() {
        return this.password;
    }

    public Employee setPassword(String password) {
        this.password = password;
        return this;
    }

}
