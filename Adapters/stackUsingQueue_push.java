import java.util.Queue;
import java.util.LinkedList;

public class stackUsingQueue_push {

    Queue<Integer> que = new LinkedList<>();
    Queue<Integer> temp = new LinkedList<>();
    int peekEle = 0;

    public int size(){
        return que.size();
    }

    public boolean isEmpty(){
        return que.isEmpty();
    }

    // O(1)
    public void push(int data){
        this.peekEle = data;
        this.que.add(data);
    }

    // O(1)
    public int peek(){
        return this.peekEle;
    }

    // O(n)
    public int pop(){
        while(this.que.size() != 1){
            this.temp.add(this.que.remove());
        }

        int rData = this.que.remove();

        while(this.temp.size() != 0){
            this.push(this.temp.remove());
        }

        return rData;
    }
}