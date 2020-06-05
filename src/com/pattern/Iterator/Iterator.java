package com.pattern.Iterator;

public interface Iterator<T> {
    T first();

    T next();

    T current();

    boolean hasnext();
}
