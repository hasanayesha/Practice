class Node{
	int data;
	Node next;
	
	public Node(int data){
		this.data = data;
		next = null;
	}
}

public class linkedList{
	Node head;
	
	public linkedList(int data){
		head = new Node(data);
	}
	
	public void add(int data){
		Node temp = head;
		while (temp.next != null)
			temp = temp.next;
		temp.next = new Node(data);
	}
	
	public void delete(int val){
		Node prev = null;
		Node current = head;
		if (head.data == val){
			head = head.next;
			return;
		}
		while (current != null && current.data != val){
			prev = current;
			current = current.next;
		}
		if (current.data == val)
			prev.next = current.next;
		else
			System.out.println("Value does not exist");
	}
	
	public void print(){
		Node temp = head;
		while(temp != null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public void count(){
		int c = 0;
		if(head == null)
			System.out.print(c);
		else{
			Node t = head;
			while (t!= null){
				c += 1;
				t = t.next;
			}
			System.out.println(c);
		}
	}
	public static void main(String [] args){
		linkedList l = new linkedList(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.print();
		l.delete(2);
		l.print();
		l.count();
	}
}