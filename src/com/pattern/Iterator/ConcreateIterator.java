package com.pattern.Iterator;

import java.util.function.Consumer;

public class ConcreateIterator<T> implements Iterator {
    private T[] array;
    private int current = 0;
    public ConcreateIterator(T[] array){
        this.array = array;
    }
    @Override
    public Object first() {
        return array[0];
    }

    @Override
    public Object next() {
        return array[current++];
    }

    @Override
    public Object current() {
        return array[current];
    }

    @Override
    public boolean hasnext() {
        return current!=array.length;
    }
}
