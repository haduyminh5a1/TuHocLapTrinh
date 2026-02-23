package JavaNangCao.DataStructures.SinglyLinkedList;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean search(int data) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.data == data) return true;
            currentNode = currentNode.next;
        }
        return false;
    }

    public void insertAtFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void insertAtPosition(int data, int index) {
        if (index < 0 || index > size) return;
        if (index == 0) {
            insertAtFront(data);
            return;
        }
        if (index == size) {
            insertAtEnd(data);
            return;
        }
        Node currentNode = head;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }
        Node newNode = new Node(data);
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        size++;
    }

    public void deleteAtStart() {
        if (head == null) return;
        head = head.next;
        size--;
        if (size == 0) {
            tail = null;
        }
    }

    public void deleteAtEnd() {
        if (head == null) return;
        if (head.next == null) {
            head = tail = null;
            size--;
            return;
        }
        Node currentNode = head;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        tail = currentNode;
        size--;
    }

    public void deleteAtPosition(int index) {
        if (index < 0 || index >= size) return;
        if (index == 0) {
            deleteAtStart();
            return;
        }
        if (index == size - 1) {
            deleteAtEnd();
            return;
        }
        Node currentNode = head;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
        size--;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void reverse() {
        if (size <= 1) return;
        Node prev = null;
        Node currentNode = head;
        Node next = null;

        tail = head; 
        while (currentNode != null) {
            next = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = next;
        }
        head = prev;
    }
}