package LINKEDLIST;

public class linkedlist1 {
    Node head= null; // head of list
    Node tail;
    int size = 0;

    linkedlist1(){
    }

    static class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next = null;
        }
    }
    public Node insertrecursion(String val.int index, Node node){
        if(index==0){
            Node newnode = new Node(val);
            size++'
            return temp;'
        }
        
    }

    public void addFist(String i){
        Node newnode = new Node(i);
        if(newnode!= null){
            newnode.next= head;
            head = newnode;
        }
        size++;
    }

    public void print(){
        Node temp = head;
        while(temp!= null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void insertlast(String val){
        Node temp = head;
        while(temp!=null){
            Node node = temp;
            temp = temp.next;
            if(temp==null){
                Node newnode = new Node(val);
                node.next = newnode;
                break;
            }
        }

    }
public void deleteFirst(){
    if(head!=null){
       
        head = head.next;
        System.out.print("deleted");
        
    }
}



    public static void main(String[] args) {

        linkedlist1 list = new linkedlist1();
        list.addFist("20");
        list.addFist("40");
        list.addFist("500");
        System.out.println("added");
list.insertlast("2002");
        list.print();
        
    }
}





