package com.annotation.test;

/**
 * @Author Varun Adhikari
 */
public class ListEXAMPLE {
	public static void main(String[] args) {
		
		Node node1 = new Node("first");
		Node node2 = new Node("Second");
		Node node3 = new Node("third");
		Node node4 = new Node("fourth");
		Node node5 = new Node("fifth");
		TestList queu = new TestList();
		
		queu.insert(node1);
		queu.insert(node2);
		queu.insert(node3);
		queu.insert(node4);
		queu.insert(node5);
		
		queu.display();
		
		queu.deleteFromHead();
		System.out.println("-----------------");
		queu.display();
		
	}
}

class TestList {

	private Node head;
	private Node tail;

	public void insert(Node nodeToInsert) {
		Node node = head;
		if (node == null) {
			head = nodeToInsert;
			tail = nodeToInsert;
		} else {
			tail.setNextNode(nodeToInsert);
			tail = nodeToInsert;
		}
	}

	public void display() {
		Node node = head;
		do {
			System.out.println("Node Val: " + node.getValue());
			if (node.getNextNode().getNextNode() == null) {
				System.out.println("Node Val: " + node.getNextNode().getValue());
				break;
			}
			node = node.getNextNode();
		} while (node.getNextNode() != null);
		
		System.out.println( "-----------------");
		System.out.println( "head : " + head.getValue());
		System.out.println( "tail : "+ tail.getValue());
	}

	public void deleteFromHead() {
		if(head == null){
			System.out.println("List is empty. Nothing to delete");
		}else if(head.getNextNode() == null){
			head = null;
			tail = null;
		}else{
			head = head.getNextNode();
		}
	}

	public void deleteFromTail() {
		if(tail == null){
			System.out.println("List is empty. Nothing to delete");
		}else if(head.getNextNode() == null){
			head = null;
			tail = null;
		}else{
			Node node = head;
			while(node.getNextNode()!=null){
				if(node.getNextNode().getNextNode() == null){
					node.setNextNode(null);
					tail = node;
					break;
				}
				node = node.getNextNode();
			}
		}
	}
}

class Node{
	
	private String value;
	private Node nextNode;
	
	Node(String val){
		this.value = val;
	}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
}