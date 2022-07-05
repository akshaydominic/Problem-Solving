import java.util.ArrayList;
import java.util.List;

public class SplitLinkedList {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode head = a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
       // traversalLinkedlist(head);
        System.out.println();
        List <ListNode> result = SplitLinkedList1(head);
        ListNode t1 = result.get(0);
        ListNode t2 = result.get(1);
        traversalLinkedlist(t1);
        System.out.println();
        traversalLinkedlist(t2);

       

    }
    public static void traversalLinkedlist(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    public static List<ListNode> SplitLinkedList1(ListNode head){
         ListNode temp = head;
         ListNode evenhead = new ListNode();
         ListNode oddhead = new ListNode();

        while(temp!=null){
            if(temp.val % 2 == 0){
                InsertAtEnd(evenhead, temp.val);
            }else{
                InsertAtEnd(oddhead, temp.val);
            }
            temp = temp.next;
        }
        List<ListNode> result = new ArrayList<>();
       ListNode odd = RemoveStartingelement(oddhead);
       ListNode even = RemoveStartingelement(evenhead);
        result.add(odd);
        result.add(even);
        return result;

    }

    public static void InsertAtEnd(ListNode head,int data){
        ListNode temp = head; // 1 2 3 4 // 0
        ListNode tail = null;
       
        while(temp!=null){
            tail = temp;
            temp = temp.next;
        }
        //now only insertion at end 
        ListNode endNode = new ListNode(data);
        if(tail == temp){
            tail = endNode;
        }else{
            tail.next = endNode;
        }
    }
    public static ListNode RemoveStartingelement(ListNode head){
        ListNode temp = head;
        head = temp.next;
        temp = null;
        return head;

    }

    
}
class ListNode{
    public int val;
    public ListNode next;
    ListNode(int x){
        this.val = x;
        next = null;
    } 
    ListNode(){

    }
}
