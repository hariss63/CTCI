import java.util.HashSet;

public class KthToLast
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
    System.out.println(kthToLast(linked, 3));
  }

  public static int kthToLast(Node n, int k)
  {
    int len = size(n);
    int pos = len - k + 1; // position that this element occupies in the list (1 -based index)
    int count = 1;
    while (count < pos)
    {
      n = n.next;
      count++;
    }
    return n.data;
  }

  private static int size(Node n)
  {
    if (n == null)
    {
      return 0;
    }
    return 1 + size(n.next);
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

  private static Node deleteNode(Node head)
  {
    return head.next;
  }
}
