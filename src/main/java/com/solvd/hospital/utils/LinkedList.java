package com.solvd.hospital.utils;

import java.util.Iterator;
import java.util.Objects;

public class LinkedList<T> implements Iterable<T> {	
	private Node head;
	private Node current;
	private int theSize;
	
	public LinkedList() {
		head = new Node(null);
		current = head;
		theSize = 0;
	}
	
	@Override
	public String toString() {
		return head.toString();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(head);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || this.hashCode() != obj.hashCode() 
				|| getClass() != obj.getClass())
			return false;
		
		Node other = (Node) obj;
		
		return head.equals(other);
	}
	
	public void add(T value) {
		Node node = new Node(value);
		node.setPrev(current);
		current.setNext(node);
		current = current.getNext();
		theSize++;
	}

	public void pop(){
		Node itr = head;

		for (int i = 0; i < size()-1; i++)
		{
			itr = itr.getNext();
		}

		itr.setNext(null);
		theSize--;
	}

	public int size() {
		return theSize;
	}

	public Iterator<T> iterator() {
		return new Iterator<T>() {
			Node itr = head;
			
			@Override
			public boolean hasNext() {
				return itr.getNext() != null;
			}

			@Override
			public T next() {
				if (itr != null) {
					itr = itr.getNext();
					T value = (T) itr.getValue();
					return value;
				};
				
				return null;
			}
		};
	}
}