//Stack  

class Main{
    public static void main(String[] args){
        Node stack = new Node(1);
         
        stack = stack.push(5);
        stack = stack.push(6);
        stack = stack.push(8);
         
        Node.printLinkedList(stack);
         
        stack = stack.pop();

        Node.printLinkedList(stack);
    }
}

class Node{
    Node next = null;
    int data; 
    
    public Node(int d){
        data = d;
    }
    
    public Node push(int d){
        Node newHead = new Node(d);
        newHead.next = this; 
        return newHead;
    }
    
    public Node pop(){
        if (this == null){
            return null;
        }
        System.out.println("Elemento removido: " + this.data);
        
        return this.next;
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