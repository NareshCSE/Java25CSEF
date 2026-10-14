package mypackagebp;
import java.util.Scanner;
class Node {
    int data;
    Node prev, next;
    Node(int data) {

        this.data = data;

        prev = next = null;

    }

}

public class CreateList {

    Node head = null;
    // a) Create a doubly linked list
    void create(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }
    // b) Delete a given element
    void delete(int value) {
        Node temp = head;
        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null) {

            System.out.println("Element not found.");

            return;

        }
        if (temp == head) {

            head = temp.next;

        }

        if (temp.next != null) {

            temp.next.prev = temp.prev;

        }



        if (temp.prev != null) {

            temp.prev.next = temp.next;

        }



        System.out.println("Element deleted successfully.");

    }



    // c) Display the list

    void display() {

        Node temp = head;



        if (temp == null) {

            System.out.println("List is empty.");

            return;

        }



        while (temp != null) {

            System.out.print(temp.data + " ");

            temp = temp.next;

        }

        System.out.println();

    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CreateList list = new CreateList();



        System.out.print("Enter number of elements: ");

        int n = sc.nextInt();



        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {

            list.create(sc.nextInt());

        }



        System.out.print("Original List: ");

        list.display();



        System.out.print("Enter element to delete: ");

        int value = sc.nextInt();



        list.delete(value);



        System.out.print("List after deletion: ");

        list.display();



        sc.close();

    }

}

