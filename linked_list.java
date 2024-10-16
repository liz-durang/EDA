//Linked List 

class Main{
    public static void main(String[] args){
        Node head = new Node(1);
         
        head.appendToTail(5);
        head.appendToTail(6);
        head.appendToTail(8);
         
        Node.printLinkedList(head);
         
        head = Node.deleteNode(head, 6);
         
        Node.printLinkedList(head);
    }
}

class Node{
    Node next = null;
    int data; 
    
    public Node(int d){
        data = d;
    }
    
    public void appendToTail(int d){
        Node end = new Node(d);
        Node n = this; 
        while (n.next != null){
            n = n.next;
        }
        n.next = end;
    }
    
    public static Node deleteNode(Node head, int d){
        Node n = head; 
        
        if(n.data == d){
            return head.next;
        }
        
        while (n.next != null){
            if(n.next.data == d){
                n.next = n.next.next;
                return head; 
            }
            
            n = n.next; 
        }
        return head;
    }
    
    public static void printLinkedList(Node n){
        Node current = n; 
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
         System.out.println("null"); 
    }
}
