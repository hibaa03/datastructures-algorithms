class rightnode {
    Node head;
    /* Linked list Node*/
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    /* Deletes nodes which have a node with greater value node on left side */
    void delLesserNodes()
    {
        /* 1.Reverse the linked list */
        reverseList();
        /* 2) In the reversed list, delete nodes which
        have a node with greater value node on left
        side. Note that head node is never deleted
        because it is the leftmost node.*/
        _delLesserNodes();
        /* 3) Reverse the linked list again to retain
        the original order */
        reverseList();
    }
    /* Deletes nodes which have greater value node(s)on left side */
    void _delLesserNodes()
    {
        Node current = head;
        Node maxnode = head;
        Node temp;
        while (current != null && current.next != null) {
            /* If current is smaller than max, then delete
            current */
            if (current.next.data < maxnode.data) {
                temp = current.next;
                current.next = temp.next;
                temp = null;
            }
            /* If current is greater than max, then update    max and move current */
            else {
                current = current.next;
                maxnode = current;
            }
        }
    }
    void push(int new_data)
    {

        Node new_node = new Node(new_data);

        new_node.next = head;
        head = new_node;
    }
    void reverseList()
    {
        Node current = head;
        Node prev = null;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    void printList()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        rightnode llist = new rightnode();
        llist.push(9);
        llist.push(2);
        llist.push(6);
        llist.push(5);
        llist.push(11);
        llist.push(5);
        llist.push(2);
        llist.push(12);
        System.out.println("Given Linked List");
        llist.printList();
        llist.delLesserNodes();
        System.out.println("Modified Linked List");
        llist.printList();
    }
}