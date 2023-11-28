package com.nihil.common.delayed;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.DelayQueue;

public class DelayedMap<K, V> {
    private final Map<K, DelayedItem<V>> map = new ConcurrentHashMap<>();
    private final DelayQueue<DelayedItem<V>> delayQueue = new DelayQueue<>();

    public void put(K key, V value, long delay) {
        DelayedItem<V> delayedItem = new DelayedItem<>(value, delay);
        map.put(key, delayedItem);
        delayQueue.put(delayedItem);
    }

    public V get(K key) {
        DelayedItem<V> delayedItem = map.get(key);
        return (delayedItem != null) ? delayedItem.getItem() : null;
    }

    public V remove(K key){
        DelayedItem<V> delayedItem = map.remove(key);
        return (delayedItem != null) ? delayedItem.getItem() : null;
    }

    public void removeExpiredItems() {
        DelayedItem<V> delayedItem;
        while ((delayedItem = delayQueue.poll()) != null) {
            map.remove(delayedItem.getItem());
        }
    }
}