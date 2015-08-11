import java.util.HashSet;

public class DeleteMiddleNode
{
  private static class Node
  {
    Node next = null;
    int data;

    public Node(int d)
    {
      data = d;
    }

    void add(int d)
    {
      Node end = new Node(d);
      Node n = this;
      while (n.next != null)
      {
        n = n.next;
      }
      n.next = end;
    }
  }

  public static void main(String[] args)
  {
    Node linked = new Node(5);
    linked.add(2);
    linked.add(3);
    linked.add(2);
    linked.add(7);
    printList(linked);
    Node del = linked.next.next;
    deleteNode(del);
    printList(linked);
  }


  private static void printList(Node head)
  {
    Node n = head;
    while (n.next != null)
    {
      System.out.printf("%d -> ", n.data);
      n = n.next;
    }
    System.out.println(n.data);
  }

  private static void deleteNode(Node head)
  {
    if (head == null || head.next == null) {
      head = null;
    }
    else {
      head.data = head.next.data;
      head.next = head.next.next;
    }
  }
}
