package com.nihil.common.delayed;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayedItem<T> implements Delayed {
    private final T item;
    private final long expirationTime;

    public DelayedItem(T item, long delay) {
        this.item = item;
        this.expirationTime = System.currentTimeMillis() + delay;
    }

    public T getItem() {
        return item;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(expirationTime - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed other) {
        long diff = this.getDelay(TimeUnit.MILLISECONDS) - other.getDelay(TimeUnit.MILLISECONDS);
        return Long.compare(diff, 0);
    }
}