class question1
{
static class Node
{
    int data;
    Node next;
}

static Node nextNode(int key)
{
    Node temp = new Node();
    temp.data = key;
    temp.next = null;
    return temp;
}
static Node oddEven(Node first)
{
    if (first == null)
        return null;

    Node odd = first;
    Node even = first.next;

    Node evenFirst = even;
 
    while (1 == 1)
    {

        if (odd == null || even == null ||
                        (even.next) == null)
        {
            odd.next = evenFirst;
            break;
        }

        odd.next = even.next;
        odd = even.next;
 
        if (odd.next == null)
        {
            even.next = null;
            odd.next = evenFirst;
            break;
        }
 
        // Connecting even nodes
        even.next = odd.next;
        even = odd.next;
    }
    return first;
}
 
static void printout(Node node)
{
    while (node != null)
    {
        System.out.print(node.data + " ");
        node = node.next;
    }
    System.out.println("NULL") ;
}

public static void main(String[] args)
{
    Node head = nextNode(1);
    first.next = nextNode(2);
    first.next.next = nextNode(3);
    first.next.next.next = nextNode(4);
    first.next.next.next.next = nextNode(5);
 
    head = oddEven(head);
 
    System.out.println("Odd first Even next");
    printout(head);
}
}