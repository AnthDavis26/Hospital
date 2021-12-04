package com.solvd.hospital.utils;

import java.util.Objects;

public class Node<T> {
    private T value;
    private Node prev;
    private Node next;

    public Node(T value) {
        this.value = value;
        this.prev = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.hashCode() != obj.hashCode()
                || getClass() != obj.getClass())
            return false;

        Node other = (Node) obj;

        if (value != other.getValue())
            return false;
        if (prev != other.getPrev())
            return false;
        if (next != other.getNext())
            return false;

        return value.equals(other.getValue());
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}