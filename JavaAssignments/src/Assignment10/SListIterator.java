package Assignment10;

public class SListIterator {
  Node root;
  private int size;

  public void append(int data) {
    size++;
    Node newNode = new Node(data);
    if (root == null) {
      root = newNode;
    } else {
      Node temp = root;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
    }
  }

  public void remove() {
    if (size > 0) {
      size--;
    } else {
      System.out.println("There are no elements to remove");
      return;
    }
    Node temp = root;
    if (temp.next == null) {
      root = null;
      return;
    }
    Node p = null;
    while (temp.next != null) {
      p = temp;
      temp = temp.next;
    }
    p.next = null;
  }

  public void display() {
    Node temp = root;
    while (temp != null) {
      System.out.print(temp.data);
      if (temp.next != null)
        System.out.print(" -> ");
      temp = temp.next;
    }
    System.out.println();
  }

  public int size() {
    return size;
  }
}
