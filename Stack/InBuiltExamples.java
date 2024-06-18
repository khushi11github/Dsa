import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuiltExamples {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
//insertion
 stack.push(44);
 stack.push(55);
 stack.push(66);
//deletion :- pop
System.out.println( stack.pop());
System.out.println( stack.pop());
System.out.println( stack.pop());

Queue<Integer> queue = new LinkedList<>();
queue.add(3);
queue.add(4);
queue.add(5);
//peek to get first element 
System.out.println(queue.peek());
// remove the head -- removes
// for deque we use Arraydeque.. faster than linkedlist 








}


}