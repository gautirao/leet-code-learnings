package com.goutham.examples.maps;

public class SimpleHashMap<K,V> {
    private Entry<K,V>[] buckets;
    private int capacity = 16;

    public SimpleHashMap() {
        buckets = new Entry[capacity];
    }

    public void put(K key, V value){

    }
}
