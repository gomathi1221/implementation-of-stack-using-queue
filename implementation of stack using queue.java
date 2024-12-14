import java.util.*;
class MyStack {
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();
public MyStack() {
  
}

public void push(int x) {
    q2.add(x);
    while(!q1.isEmpty()){
        q2.add(q1.poll());
    }
    Queue<Integer> temp=new LinkedList<>();
    temp=q1;
    q1=q2;
    q2=temp;
    
}

public int pop() {
    if(!q1.isEmpty()){
        return q1.poll(); 
    }
    return -1;
}

public int top() {
  if(q1.isEmpty()){
    return -1;
  }
  return q1.peek();
}

public boolean empty() {
    if(!q1.isEmpty()){
        return false;
    }
    return true;
}
}

/**
* Your MyStack object will be instantiated and called as such:
* MyStack obj = new MyStack();
* obj.push(x);
* int param_2 = obj.pop();
* int param_3 = obj.top();
* boolean param_4 = obj.empty();
*/