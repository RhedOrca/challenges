package challenges;

import java.util.*;
import java.io.*;

class Node {
	public Node(int value) {
		this.val = value;
	}
	public Node(int value, Node next) {
		this.val = value;
		this.next = next;
	}
	int val;
	Node next;
}


class Lister {
	public static void listReverser(Node curr) {
		Stack<Node> stacky = new Stack<Node>();
		while(curr.next != null) {
			stacky.push(curr);
			curr = curr.next;
		}
		System.out.println(curr.val);
		while(!stacky.isEmpty()) {
			System.out.println(stacky.peek().val);
			stacky.pop();
		}
	}
}
public class Main {

	public static void main(String[] args) {
		Node node4 = new Node(4);
		Node node3 = new Node(3, node4);
		Node node2 = new Node(2, node3);
		Node node1 = new Node(1, node2);
		Lister.listReverser(node1);
	}	
}
