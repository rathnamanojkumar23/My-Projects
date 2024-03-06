package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class DifferentSets {

	public static void main(String[] args) {

		Random obj = new Random();
		
		// will not follow order and  but have unique number
		HashSet<Integer> set = new HashSet<>();
		
		// in what way the numbers are printed the same way they are printed
		LinkedHashSet<Integer> lhset = new LinkedHashSet<>(); 
		
		// will follow orders the numbers in descending order
		TreeSet<Integer> tset = new TreeSet<Integer>();
		for (int i = 1; i <= 5; i++) {
			int number = obj.nextInt(100);
			set.add(number);
			lhset.add(number);
			tset.add(number);
			System.out.println("loop random number : " + number);
		}
		System.out.println("HashSet elements : " + set);
		System.out.println("LinkeHashset elements : " + lhset);
		System.out.println("TreeSet elements : " + tset);
	}
}
