package LinkedList;

public class LinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAfter(int insertAfter, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            System.out.println("List is empty");
        } else {
            int flag=0;
            Node current = head;
            while (current.next != null) {
                if (current.data == insertAfter) {
                    newNode.next = current.next;
                    current.next = newNode;
                    System.out.println("Item Added");
                    flag=1;
                    break;
                }
                current=current.next; 
            }
            if(flag==0){
                System.out.println("No Such Item Exist.\nItem cannot be added.");
            }
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("\nLinkedList is empty");
        } else {
            System.out.println("\nPrinting nodes of linkedlist");
            while (current != null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
        }
    }

    public void deleteByKey(int data){
        Node current = head;
        Node prev = null;
        if(head==null){
            System.out.println("List is empty\nDelete operatoin failed.");
        }
        else if (head.next == null) {
            if (head.data == data) {
                head = null;
                System.out.println("Item Deleted.");
            } else {
                System.out.println("Item not found.\nDelete operation failed.");
            }
        }
        else {
            while (current != null && current.data!=data) {
                prev = current;
                current = current.next;
            }
            if(current==null){
                System.out.println("Item not found.\nDelete operation failed.");
            }
            else{
                prev.next = current.next;
                System.out.println("Item deleted.");
            }
        }
    }

    public static void main(String[] args) {
        LinkedList listobj = new LinkedList();

        // Inserting elements
        listobj.insert(1);
        listobj.insert(2);
        listobj.insert(3);
        listobj.insert(4);
        listobj.insert(5);

        // Displaying
        //listobj.display();

        //listobj.insertAtBegin(6);
        //listobj.display();
        //listobj.insertAfter(3, 10);
        //System.out.println("");
        //listobj.display();

        listobj.deleteByKey(5);
        listobj.display();
    }
} 