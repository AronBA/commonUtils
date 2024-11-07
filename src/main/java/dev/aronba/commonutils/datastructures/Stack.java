package dev.aronba.commonutils.datastructures;

public class Stack {

    private final String[] stackArray;
    private int size = 0;


    public Stack(int size) {
        this.stackArray = new String[size];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isFull() {
        return size == stackArray.length;
    }

    public Object pop() {
        if (size == 0) return null;
        this.size--;
        return this.stackArray[this.size];
    }

    public void push(String ring) {
        this.stackArray[this.size] = ring;
        this.size++;
    }
}
