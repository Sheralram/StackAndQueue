package com.bridgelabz;

public class Stack {


    public static void main(String[] args) {
        System.out.println("Welcome Stack and Queue program");
        StackAndQueue list = new StackAndQueue();
        list.push(70);
        list.push(30);
        list.push(56);
        list.peek();
        System.out.println("The Stack elements are ");
        list.display();
        list.pop();
        System.out.println("\nafter deletion ");
        list.display();
        System.out.printf("\nTop element is %d\n", list.peek());
    }

}


