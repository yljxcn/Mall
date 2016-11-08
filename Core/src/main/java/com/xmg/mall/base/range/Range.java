package com.xmg.mall.base.range;


public class Range<T extends Comparable<T>, V> {

    private T minimum;
    private T maximum;
    private V extraValue;

    public Range() {
    }

    public Range(T e1, T e2, final V extraValue) {
        if ((e1 != null && e2 != null) && e1.compareTo(e2) > 0) {
            T temp = e1;
            e1 = e2;
            e2 = temp;
        }
        minimum = e1;
        maximum = e2;
        this.extraValue = extraValue;
    }

    public boolean within(final T e) {
        boolean matchMinimum = minimum == null || minimum.compareTo(e) <= 0;
        boolean matchMaximum = maximum == null || maximum.compareTo(e) >= 0;
        return matchMinimum && matchMaximum;
    }

    public boolean without(final T e) {
        return !within(e);
    }

    public T getMinimum() {
        return minimum;
    }

    public void setMinimum(T minimum) {
        this.minimum = minimum;
    }

    public T getMaximum() {
        return maximum;
    }

    public void setMaximum(T maximum) {
        this.maximum = maximum;
    }

    public V getExtraValue() {
        return extraValue;
    }

    public void setExtraValue(V extraValue) {
        this.extraValue = extraValue;
    }
}
