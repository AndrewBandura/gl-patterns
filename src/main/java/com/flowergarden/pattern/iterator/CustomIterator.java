package com.flowergarden.pattern.iterator;

public interface CustomIterator<T> {
    boolean hasNext();
    T next();
    boolean hasPrevious();
    T previous();
}
