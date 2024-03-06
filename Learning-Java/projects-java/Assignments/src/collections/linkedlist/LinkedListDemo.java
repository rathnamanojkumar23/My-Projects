package collections.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		Object obj[] = new Object[100000];
		for(int i=0;i<obj.length;i++) {
			obj[i] = new Object();
		}
		
		LinkedList<Object> list = new LinkedList<>();
		long start = System.currentTimeMillis();
		for(Object objt:obj) {
			list.add(objt);
			
		}
		System.out.println("Linked list : "+ list);
		long end = System.currentTimeMillis();
		System.out.println("time taken : " + (end-start));
	}

}
