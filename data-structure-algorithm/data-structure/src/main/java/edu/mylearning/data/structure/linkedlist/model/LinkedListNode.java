package edu.mylearning.data.structure.linkedlist.model;

public class LinkedListNode {
    private int value;
    private LinkedListNode next;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }
}
