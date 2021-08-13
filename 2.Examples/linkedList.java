public class linkedList{
    Node head;
    static class Node{
         int data;
         Node next;

         Node(int d){
            this.data=d;
            this.next = null;
         }
    }
    public static linkedList insertList(linkedList list ,int data){
        Node new_node = new Node(data);
        new_node.next = null;


        if(list.head==null){
            list.head = new_node;
        }
        else{

            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }

            last.next = new_node;
        }

        return list;
    }
    public static void printList(linkedList list){
        Node currNode = list.head;
        System.out.println("Linked list: ");

        while(currNode != null){
            System.out.print(currNode.data+" ");
            currNode = currNode.next;
        }
    }
    public static void main(String[] args){
        linkedList list = new linkedList();

        list = insertList(list, 10);
        list = insertList(list, 20);
        list = insertList(list, 30);
        list = insertList(list, 40);
        list = insertList(list, 50);
        
        printList(list);
    }
}