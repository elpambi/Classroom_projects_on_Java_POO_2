package arrayList.practicaArrayList1;

import java.util.ArrayList;

public class PracticaArray {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("lorem");
		al.add("ipsum");
		al.add("dolore");
		
		System.out.println(al);
		
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(4);
		al2.add(3);
		al2.add(2);
		al2.add(1);
		
		System.out.println(al2);
		
		System.out.println(al2.indexOf(3));
		System.out.println(al2.size());
		System.out.println(al2.isEmpty());
		
		
		
		
	}
}
