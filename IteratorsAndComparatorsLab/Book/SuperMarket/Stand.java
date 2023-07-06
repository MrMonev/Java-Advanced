package IteratorsAndComparatorsLab.Book.SuperMarket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stand implements Iterable<String> {

    private List<String> fruits;

    public Stand() {
        this.fruits = new ArrayList<>();
    }

    public void setFruits(List<String> fruits) {
        this.fruits = fruits;
    }


     // ITERATOR
    @Override
    public Iterator<String> iterator() {
        return new ShopAssistant();
    }

    private class ShopAssistant implements Iterator<String> {
        // Iterator -> Инструментът който обхожда

        private int index = 0;
        @Override
        public boolean hasNext() {
            return index < fruits.size();
        }

        @Override
        public String next() {
            return fruits.get(index++);
        }
    }
}
