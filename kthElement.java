public class kthElement{
	Node head;
	
	public kthElement(int data){
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
	
	public void kthElement(int k){
		int l = 0;
		Node temp = head;
		
		while (temp!=null){
			temp = temp.next;
			l++;
		}
		if (k>l){
			System.out.println("List is too small");
			return;
		}
		temp = head;
		
		for(int i = 1;i < l - k + 1; i++)
			temp = temp.next;
		System.out.println(temp.data);
	}
	
	public static void main(String [] args){
		kthElement l = new kthElement(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.print();
		l.delete(2);
		l.print();
		l.count();
		l.kthElement(2);
	}
}