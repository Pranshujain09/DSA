// import java.util.LinkedList;

// main memory - an array of bites
// heap area is the area we store dynamically allocayed objects
//  in java all non primitive types are dynamically allocated ex- linked list

// make node class in java
// create object in node class
// linked list a type of self refrential structures coz Node in node next is  same as node in CLASS Node









// ******Linked list  of 3 nodes in java******





// import java.util.*;

// class test{

// static class Node{
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }

// }

// public static void main(String args[]){
//     Node head = new Node(10);
//     Node temp1= new Node(20);
//     Node temp2 = new Node (30);
//     head.next=temp1;
//     temp1.next=temp2;
//     System.out.print(head.data+"-->"+temp1.data+"-->"+ temp2.data);
// }

// }

















//  TRAVERSING LINKED LIST





// class test{
//    static class Node{
//         int data;
//         Node next;

//         Node(int x){
//             data=x;
//             next= null;

//         }
//         // this is a constructor
//     }

//     public static void print(Node head){
//         Node curr= head;
//         while( curr!= null){
//             System.out.println(curr.data +" ");
//             curr= curr.next;
//         }

//     }

//     public static void main (String args[]){

//         Node head= new Node(10);
//         Node temp1= new Node(20);
//         Node temp2= new Node(30);
//         head.next= temp1;
//         temp1.next= temp2;
//         temp2.next= null;
//         print( head);
//         // instance is a object, here- head, temp1, temp2

//     }
// }



















//  ***** Recursive traversal ******




// class test{
//   static  class Node{
//         int data;
//         Node next;
//         Node(int x){
//             data= x;
//             next=null;
//         }

//     }
//     public static void print( Node head){
//         Node curr=head;
//         if(head==null)
//         return;
//         System.out.println(curr.data);

//         print(curr.next);
//     }

//     public static void main (String args[]){
//         Node head= new Node(10);
//         Node temp1= new Node(20);
//         Node temp2= new Node(30);
//         head.next= temp1;
//         temp1.next= temp2;
//         temp2.next= null;

//         print(head);

//     }
// }
















// ******      PROBLEM       *******








// ******** INSERT AT BEGIN *********

// class test {
//     static class Node {
//         int data;
//         Node next;

//         Node(int x) {
//             data = x;
//             next = null;
//         }

//     }

//     static Node head;

//     public static void insert(int x) {
//         Node temp = new Node(x);
//         temp.next = head;
//         head = temp;
//     }

//     public static void print() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.println(temp.data);
//             temp = temp.next;
//         }
//     }

//     public static void main(String[] args) {
//         // Node head = null;
//         // System.out.println(head);
//         // Node list = null;
//         insert(10);
//         insert(20);
//         insert(30);
//         print();

//     }
// }







//  *******INSERT AT END********


// ****** middle of the ll *******

class test{
   static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }

    public static int middle(Node head){
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;

    }


    public static void main (String[] args){
        Node head= new Node(10);
        Node temp1= new Node(20);
        Node temp2= new Node(20);
        head.next=temp1;
        temp1.next = temp2;
        System.out.println(middle(head));


    }
}