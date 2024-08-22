package basicDataStructures;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("Ron Barceló");
        stack.push("Jhonnie Walker");
        stack.push("JB");

        System.out.println("The stack is empty: " + stack.empty());
        System.out.println(stack);
        String drinkRemoved = stack.pop();
        System.out.println("Top element removed");
        System.out.println(stack);
        System.out.println("The drink removed was: " + drinkRemoved);
        System.out.println("Now the top element is: " + stack.peek());
        System.out.println("The stack size is: " + stack.size());
        System.out.println("The drink Ron Barceló is in the stack: " + stack.search("Ron Barceló"));
        System.out.println("The drink JB is in the stack: " + stack.search("JB"));

    }

}
