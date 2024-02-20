package dsa.linkedList.single;

public class SinglyLinkedList {
    Node head = null;
    Node tail = null;

    public Node addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail=newNode;
        }
        else {
            tail.next=newNode;
            tail=newNode;
        }
        return head;
    }

    public void displayList(Node head) {
        Node temp=head;

        while (temp != null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public Node reverseListRecursive(Node curr) {
        if (curr == null || curr.next == null) return curr;
        Node rest = reverseListRecursive(curr.next);
        curr.next.next=curr;
        curr.next=null;
        return rest;
    }

}
