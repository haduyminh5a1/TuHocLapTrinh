package JavaNangCao.DataStructures.DoublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;
    private static class Node{
        int data;
        Node next;
        Node prev;

        Node (int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public boolean search(int data){
        Node currentNode = head;
        while (currentNode.next != null){
            if (currentNode.data == data) return true;
            currentNode = currentNode.next;
        }
        return false;
    }

    public int searchByIndex(int index){
        
    }
}
