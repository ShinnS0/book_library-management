package day14;

import java.util.LinkedList;

public class LinkList_Testing {

	public static void main(String[] args) {
		LinkedList<String> link_list = new LinkedList<>();
		
		//add
		link_list.add("Aung Aung");
		link_list.add(0, "Nilar");
		link_list.add("Kyaw Kyaw");
		
		System.out.println(link_list);
		
		link_list.addFirst("Cherry");
		link_list.addLast("Jeon");
		System.err.println(link_list);
		
		System.out.println("[1]" + link_list.get(1));
		System.out.println("last element : " + link_list.getLast());
		
	}
}
