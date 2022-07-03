public class LinkedList1 {
    public static void main(String[] args) {
        Node a1 = new Node(10);
        Node head = a1;
        Node a2 = new Node(20);
        a1.next = a2;
        System.out.println("Printing Linked list");
        Node temp = head;
        Node tail = null;
        while(temp!=null){
            System.out.print(temp.data + " ");
            if(temp.next == null){
                tail = temp;
            }
            temp=temp.next;

        }
        System.out.println("Printing the tail Node");
        System.out.print("Tail "+tail.data);

    }
}
class Node{
    int data;
    Node next;

    Node(){

    }
    Node(int data){
        this.data = data;
        next  = null;
    }
}
