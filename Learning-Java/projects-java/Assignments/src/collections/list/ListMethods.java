package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 10 ;i<=100;i++){
			list.add(i);
			
		}
		System.out.println("list : " + list);
		list.add(2, 2312);
		System.out.println("list after insert : " + list);
		
		list.set(1,143);
		System.out.println("list after replace : " + list);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(111);
		list2.add(222);
		list2.add(333);
		
		System.out.println("list after addding : " + list2);
		
		list.addAll(4, list2);
		System.out.println("list after addall: " + list);
		
		if(list.contains(222)) {
			System.out.println("List has the value");
		}
		else {
			System.out.println("list doesnot have the value");
		}
		
		System.out.println("elemets in the list are :");
		for(int i = 0 ; i< list.size();i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(0);
		System.out.println("list after removing : " + list);
	}

}
