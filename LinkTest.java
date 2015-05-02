	
	public class LinkLoopTest {
		
		static Node root = null;
		
		public static void main(String[] args) {
			
			Node n20 = new Node(20);
			
			
			Node n10 = new Node(10);
			Node n5 = new Node(5);
			Node n15 = new Node(15);
			
			Node n30 = new Node(30);
			Node n25 = new Node(25);
			Node n40 = new Node(40);
			
			add(n15);
			add(n5);
			add(n40);
			add(n25);
			
			//Adding loop inside the list
			//	n10.next=n15;
			//add(n10);
			
			print();
			
			System.out.println("-------------------------------------------");
			detectLoop(root);
			
			//removeNode(5);
			System.out.println("-------------------------------------------");
			//print();
		}
		
		public static void detectLoop(Node node) {
			Node fast=root;
			Node slow = root;
			Node previous = slow;
			
			while(fast!=null && slow!=null) {
				fast = fast.next.next;
				slow = slow.next;
				
				if(fast == slow) {
					System.out.println("Loop is detected :"+fast.data+ previous.data);
					return;
				}
				previous = slow;
					
			}
			System.out.println("No Loop is found in this Linked List");
			
		}
		
		public static void removeNode(int adata) {
			
			if(root == null)
				return;
			
			Node current = root;
			while(current!=null) {
				if(current.next!=null && current.next.data==adata)
					current.next = current.next.next;
				current = current.next;
			}
		}
		
		public static void add(Node node) {
			
			if(root == null) {
				root = node;
			} else  {
				Node current = root;
				while(current.next!=null) {	
					current = current.next;
				}
				current.next=node;
			}
		}
		
		public static void print() {
			int count =1;
			if(root == null) {
				return;
			} else {
				Node current =root;
				while(current!=null && count<30) {
					count++;
					System.out.println(current.data);
					current = current.next;
				}
			}
		}
		
	}
	
	class Node {
		
		Node next;
		int data;
		
		Node(int adata) {
			data = adata;
		}
	}
