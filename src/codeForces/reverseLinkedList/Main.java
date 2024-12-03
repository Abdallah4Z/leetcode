package codeForces.reverseLinkedList;

import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i =0 ; i < n ; i++) {
            Node head , current;

            int lll = in.nextInt();
            head = new Node(in.nextInt());
            current = head;
            for (int j = 1; j < lll; j++) {
                current.next = new Node(in.nextInt());
                current = current.next;
            }

            Node prev = null;
            Node next ;
            current = head;

            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            head = prev;

// p
            current = head;
            while (current != null){
                System.out.print (current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
