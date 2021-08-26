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
                System.out.print(" ");
            }
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("QUEUE is Empty.Please add Data to delete ");
        }
        else
            front=front.next;

    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        System.out.println("The Elements in Queue is ");
        queue.display();

        System.out.println("The Elements after delete in Queue is ");
        queue.dequeue();
        queue.display();

    }
}
