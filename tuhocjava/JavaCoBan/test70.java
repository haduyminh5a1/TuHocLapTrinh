
import java.util.Scanner;
class Node {
    int data;
    Node next;

    // constructor
    Node(int x) {
        data = x;
        next = null;
    }
}

public class test70 {
public static boolean search(Node head, int data){
    Node currentNode = head;
    while (currentNode!=null){
        if (currentNode.data == data){
            return true;
        }
        currentNode = currentNode.next;
    }
    return false;
}
static void printList(Node head){
    Node currentNode =  head;

    while (currentNode!=null){
        System.out.print(currentNode.data);
        if (currentNode.next!=null) {
            System.out.print("->");
        }
        currentNode = currentNode.next;
    }
}
public static Node insertAtFront(Node head, int data){
    Node newNode = new Node(data);
    newNode.next = head;
    return newNode;
}
public static Node insertAtEnd(Node head, int data){
    Node newNode = new Node(data);
    if (head == null){
        return newNode;
    }
    Node lastNode = head;
    while (lastNode.next != null) {
        lastNode = lastNode.next;
    }
    lastNode.next = newNode;
    return head;
}
public static Node insertAtPosition(Node head,int index, int data){
    Node newNode = new Node(data);
    if (index == 0){
        newNode.next = head;
        return newNode;
    }
    if (index < 0){
        return head;
    }
    Node currentNode = head;
    for (int i=0;i<index-1 && currentNode != null;i++){
        currentNode = currentNode.next;
    }
    if (currentNode == null){
        return head;
    }
    newNode.next = currentNode.next;
    currentNode.next = newNode;

    return head;    
}
public static Node deleteAtStart(Node head){
    if (head == null) return null;
    Node temp = head;
    head = head.next;
    temp = null;
    return head;
}
public static Node deleteAtEnd(Node head){
    if (head == null) return null;
    if (head.next == null) return null;
    Node secondLastNode = head;
    while (secondLastNode.next.next != null){
        secondLastNode = secondLastNode.next;
    }
    secondLastNode.next = null;
    return head;
}
public static Node deleteAtPosition(Node head, int index){
    Node temp = head;
    if (head == null) return null;
    if (index < 0) return head;
    if (index == 0) {
        head = head.next;
        return head;
    }
    for (int i=0;i<index-1;i++){
        if (temp == null || temp.next == null) {
            return head;       
        }
        temp = temp.next;
    }
    if (temp.next != null)
        temp.next = temp.next.next;
    return head;
}
public static void main(String[] args) {
    Node head = new Node(2);
    head.next = new Node(3);
    head.next.next = new Node(4);
    head.next.next.next = new Node(5);

    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int m = input.nextInt();
    int index = input.nextInt();
    int p = input.nextInt();
    int q = input.nextInt();

    head = insertAtFront(head, n);
    printList(head);
    System.out.println();

    head = insertAtEnd(head, m);
    printList(head);
    System.out.println();

    head = insertAtPosition(head, index, p);
    printList(head);
    System.out.println();

    head = deleteAtPosition(head, q);
    printList(head);
}
}

