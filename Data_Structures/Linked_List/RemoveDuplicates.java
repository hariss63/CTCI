import java.util.HashSet;

public class RemoveDuplicates 
{
  private class Node
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

    Node delete(Node head, int d)
    {
      Node n = head;

      if (n.data == d)
      {
        return head.next;
      }

      while (n.next != null)
      {
        if (n.next.data == d)
        {
          n.next = n.next.next;
          return head; // head didn't change 
        }
        n = n.next;
      }
      return head;
    }
    void print()
    {
    }
  }

  public static void main(String[] args)
  {
    Node linked = new Node(5);
    linked.add(2);
    linked.add(3);
    linked.add(2);
    linked.add(7);
  }

  public static void removeDuplicates(Node head)
  {
    // assuming linked list of integers
    HashSet<Integer> seen = new HashSet<Integer>();
    Node curr = head;
    while (curr.next != null)
    {
      seen.add(curr.data);
      if seen.contains(curr.next)
      {
        curr.next = curr.next.next;
      }
      curr = curr.next;
    }
  }
}
