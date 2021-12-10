package linkedList;

public class Node {

    int data;
    Node next = null;

    Node(int d){
        this.data = d;
    }

    void append(int d){
        Node n = this;
        Node end = new Node(d);
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
    }

    void delete(int d){
        Node n = this;
        while(n.next != null) {
            if(d == n.next.data){
                n.next = n.next.next;   //없는 값을 배정해줘야하니깐.
            }else {
                n = n.next;
            }
        }
    }

    void retrieve(){
        Node n = this;
        while (n.next !=null){
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println(n.data);
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.append(2);
        head.append(3);
        head.append(4);
        head.retrieve();
        //delete
        head.delete(3);
        head.retrieve();
    }
}
