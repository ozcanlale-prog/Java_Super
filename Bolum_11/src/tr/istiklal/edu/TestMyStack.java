package tr.istiklal.edu;

import java.util.ArrayList;
public class MyStack<E> extends ArrayList<E> {
 public boolean isEmpty() { return super.isEmpty(); }
 public int getSize() { return size(); }
 public E peek() { return get(getSize() - 1); }
 public E pop() {
     E o = get(getSize() - 1);
     remove(getSize() - 1);
     return o;
 }
 public void push(E o) { add(o); }
}