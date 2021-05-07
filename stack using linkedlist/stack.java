import java.util.LinkedList;

public class stack {
    private LinkedList<Integer> ll = new LinkedList<>();
    public int capacity;
    public int elementCount;
    public int[] arr;

    public stack(int i) {
    }

    public stack() {
    }

    public int size(){
        return ll.size();
    }

    public boolean isEmpty(){
        return ll.size() == 0;
    }

    public void push(int data) throws Exception{
        ll.addFirst(data);
    }

    public int top(){
        return ll.getFirst();
    }

    public int pop(){
        return ll.removeFirst();
    }

    public void initializeVariables(int i) {
    }

    protected void push_(int ele) {
    }

    public char[] display() {
        return null;
    }

    public void intializeVariables(int i) {
    }
}