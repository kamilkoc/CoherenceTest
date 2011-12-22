package com.taskin.coherence.stuff;

import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 * User: taskin
 * Date: 04.04.2011
 * Time: 00:43
 * To change this template use File | Settings | File Templates.
 */
public class Pencil implements Iterable<String> {
    String a[];

    public Pencil() {
        a = new String[]{"a","b","c","d","e"};
    }

    @Override
    public Iterator<String> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<String> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index != a.length;
        }

        @Override
        public String next() {
            return a[index++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("CsvIterator does not support remove operation");
        }
    }
}
