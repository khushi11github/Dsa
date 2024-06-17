public class doublylinkedlist {
Node head;
Node tail;


    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
        }
    }



public void insertFirst(int val){
    Node newnode = new Node(val);
   newnode.next = head;
   newnode.prev = null;
   if(head != null){
    head.prev = newnode;

   }
   head = newnode;
}
public void display(){




    

}

public static void main(String[] args) {
    
}









    
}
