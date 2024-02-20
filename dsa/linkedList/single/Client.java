package dsa.linkedList.single;

public class Client {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addNode(9);
        list.addNode(7);
        list.addNode(56);
        list.addNode(8);

        list.displayList(list.head);

        var reverseList = list.reverseListRecursive(list.head);
        System.out.println();
        list.displayList(reverseList);
    }
}
