package linkedList;

public class Node {

    int data;
    Node next = null;

    Node(int d) {
        this.data = d;
    }

    void append(int d) {
        Node n = this;
        Node end = new Node(d);
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    void delete(int d) {
        Node n = this;
        while (n.next != null) {
            if (d == n.next.data) {
                n.next = n.next.next;   //없는 값을 배정해줘야하니깐.
            } else {
                n = n.next;
            }
        }
    }

    void retrieve() {
        Node n = this;
        while (n.next != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println(n.data);
    }

    /*
    * LinkedList 뒤에서부터 k번째에 있는 데이터 찾기.
    * */
    private static Node KthToLast(Node first, int k){
        Node n = first;
        int totalCnt = 1;   //마지막 노드는 반복문에 포함안되므로 1부터시작
        while (n.next != null){
            totalCnt++;
            n = n.next;
        }
        n = first;
        for(int i = 1; i<totalCnt-k+1; i++){
            n = n.next;
        }
        return n;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.append(2);
        head.append(3);
        head.append(4);
        head.append(5);
        head.append(6);

        head.retrieve();
        //delete
//        head.delete(3);
//        head.retrieve();
        int k = 2;
        Node kth = KthToLast(head, k);
        System.out.println("Lst k(" + k + ")th data is " + kth.data);
    }
}
