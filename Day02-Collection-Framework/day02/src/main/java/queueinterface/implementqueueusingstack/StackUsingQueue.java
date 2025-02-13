package queueinterface.implementqueueusingstack;

public class StackUsingQueue {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(7);
        stack.push(13);
        stack.push(15);

        //print current stack
        System.out.println("Stack :"+stack.queue1);

        //pop top element
        System.out.println("popped element" +stack.pop());

        //print top element
        System.out.println("Top element "+stack.top());

        //check if  stack is empty or not
        System.out.println("Is  Stack EMpty ?"+stack.isEmpty());
    }
}
