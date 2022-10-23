package practice_Linked_List;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		Node n1 = new Node(10, null);
		Node n2 = new Node(11, null);
		Node n3 = new Node(12, null);
		n1.next = n2;
       
		
		LL l1 = new LL(n1);
		LL l2 = new LL(n2);
		LL l3 = new LL(n3);
		System.out.println(l1.head.data);


	}

}
