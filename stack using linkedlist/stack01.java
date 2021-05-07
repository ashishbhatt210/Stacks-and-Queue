public class stack01 {
    
    private class Node{
        int data = 0;
        Node next = null;

        Node(int data){
            this.data = data;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int elementCount = 0;

    private void addFirst(int data){
        Node node = new Node(data);
        if(this.elementCount == 0){
            this.head = this.tail = node;
        }
        else{
            node.next = this.head;
            this.head = node;
        }

        this.elementCount++;
    }

    private int removeFirst(){
        Node rn = this.head;
        if(this.elementCount == 1){
            this.head = this.tail = null;
        }
        else{
            this.head = rn.next;
        }
        rn.next = null;
        this.elementCount--;

        return rn.data;
    }

    public int size(){
        return elementCount;
    }

    public boolean isEmpty(){
        return elementCount == 0;
    }

    public void push(int data){
        addFirst(data);
    }

    public int top(){
        return this.tail.data;
    }

    public int pop(){
        return removeFirst();
    }
}