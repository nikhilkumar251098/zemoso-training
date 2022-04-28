package Assignment10;

public class SLL {
  public static void main(String[] args) {
    SL list = new SL();
    SListIterator sListIterator = list.iterator();
    for (int i = 10; i <= 20; i++) {
      sListIterator.append(i);
    }
    sListIterator.display();
    sListIterator.remove();
    sListIterator.display();
//        sListIterator.remove();
    System.out.println(sListIterator.size());
  }
}
