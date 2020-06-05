package com.pattern.Iterator;

public class Test {
    public static void main(String[] args) {
        String[] strs = {"a","b","c","d"};
        Iterator<String> iterator = new ConcreateIterator<>(strs);
        while (iterator.hasnext()){
            System.out.print(iterator.next());
        }
    }
}
