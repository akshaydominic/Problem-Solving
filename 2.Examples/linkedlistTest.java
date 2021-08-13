public class linkedlistTest{
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
            next = null;
        }
    }

    public static linkedlistTest insertElement(linkedlistTest list,int data){
        Node new_node = new Node(data);
        new_node.next = null;

        if(list.head == null){
            list.head = new_node;
        }else{

            Node last = list.head;
            while(last.next!=null){
                last=last.next;
            }
            last.next= new_node;
        }
        return list;
        
    }
    public static void printList(linkedlistTest list){
        Node currentNode = list.head;
        System.out.println("Linked list -");
        while(currentNode!=null){
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args){
        linkedlistTest list = new linkedlistTest();
        list = insertElement(list, 3);
        list = insertElement(list, 4);
        list = insertElement(list, 5);
        list = insertElement(list, 6);
        list = insertElement(list, 7);
        
        printList(list);
    }

}
