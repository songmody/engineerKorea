package linkedList;

public class LinkedListNode {
    Node header;

    static class Node {
        int data;
        Node next = null;
    }

    LinkedListNode(){
        header = new Node();
    }

    void append(int d) {
        Node n = header;
        Node end = new Node();
        end.data = d;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    void delete(int d) {
        Node n = header;
        while (n.next != null) {
            if (d == n.next.data) {
                n.next = n.next.next;   //없는 값을 배정해줘야하니깐.
            } else {
                n = n.next;
            }
        }
    }

    void retrieve() {
        Node n = header.next;   //header 다음 데이터를 n에 할당
        while (n.next != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println(n.data);
    }

    /* 정렬되지 않은 LinkedList에서 중복값 삭제하기
    *   buffer사용 x, pointer사용해서?
    *
    *  buffer사용시에는 hashSet으로 가능 /공간복잡 : O(N), 시간:O(N)
    *  pointer사용 시 공간복잡(n과 r사용) : O(1), 시간 : O(N의 제곱)
    *  */
    void removeDups() {
        Node n = header;
        while (n != null && n.next != null) {
            //r의 시작 노드값은 n과 같다.
            Node r = n;
            while (r.next != null) {
                if (n.data == r.next.data) {
                    r.next = r.next.next;
                } else {
                    r = r.next;
                }
            }
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LinkedListNode ll = new LinkedListNode();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(2);
        ll.append(1);
        ll.retrieve();
        //첫번쨰 노드에 접근할 수 있음.
//        ll.delete(1);
        ll.removeDups();
        ll.retrieve();
    }
}
