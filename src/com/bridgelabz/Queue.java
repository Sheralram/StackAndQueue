package com.bridgelabz;

public class Queue {
    Node front,rear;

    public void enqueue(int x) {                                         // Enqueue in Queue
        Node newNode=new Node(x);
        if(isEmpty()){
            rear = newNode;
            front = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
    }

    public boolean isEmpty() {

        return rear == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.print("\n Queue is empty. Add data in Queue");
        }
        else {
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.display();

    }
}
