package generics.Lab3.quiz1;

public class testStack {
    public static void main(String[] args) {
        GenericStack<String> myStack = new GenericStack<>();
        myStack.push("CPS 2232");
        myStack.push("Joseph");
        myStack.push("Waldron");
        myStack.push("Section 2");
        System.out.println(myStack.toString());
        myStack.pop();
        System.out.println(myStack.peek());
        System.out.println(myStack.toString());
    }
}
