/* import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class linked {
      /*  LinkedList<Integer> l1 = new LinkedList<>();
      // adding elements
        l1.add(3);
        l1.add(7);
        l1.add(10);
        l1.add(2,6);

       // remove elements
      // l1.remove();
      // l1.removeFirst();
      // l1.removeLast();

        Iterator it = l1.iterator();
        while(it.hasNext()) {
            System.out.println(it.next()+" ");
        }
        System.out.println();
        System.out.println(l1.size());
        boolean b1 = l1.contains(11);
        System.out.println(b1);

        //copying from sTACK TO LINKED

        Stack<String> s1 = new Stack<>();
        LinkedList<String> l2 = new LinkedList<>();
        s1.push("hello");
        s1.push("what up");
        l2.addAll(s1);

        Iterator it1 = l2.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next()+" ");
        }
*/

// circular list
     /*   Node head, tail;
        class Node{
            int data;
            Node next;
            Node tail;

            Node(int data){
                this.data = data;
            }
        }
        void insertElements(int data)
        Node newNode = new Node(data);
        if (head==null){
            head=newNode;
            tail=newNode;
            tail.next=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
            tail.next = head;
        }
        void displayElements(){
            if(tail==null){
                System.out.println("circular LL is empty");
            }
            else{
                do{
                    System.out.println(n1.data);
                    n1=n1.next;
                }while (n1.next!=head);
            }
        }

        void deleteElements(){
            if (tail!=head){
                head = head.next;
                tail.next=head;
            }
            else{
                head=tail=null;
            }
        }




    }
public static void main(String[] args) {
    linked.list1 = new LList();
    list1.insertElements(2);
    list1.insertElements(6);
    list1.insertElements(4);
    list1.displayElements();
    list1.deleteElement();
}
       */