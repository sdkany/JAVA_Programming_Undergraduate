package chapter06;

import java.util.LinkedList;

public class MyStack<T>{
    private LinkedList<T> list;

    public MyStack() {
        this.list = new LinkedList<T>();
    }

    public MyStack(LinkedList list) {
        this.list = list;
    }

    // = new LinkedList<Character>();
    public boolean isEmpty(){
        if(list == null)
            return false;
        return list.isEmpty();
    }

    public void push(T o){
        list.addFirst(o);
    }

    public T pop(){
        return list.removeFirst();
    }

    public T peek(){
        return list.getFirst();
    }

    public void show(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack();
        System.out.println(myStack.isEmpty());
        myStack.push("123");
        myStack.push("abc");
        System.out.println(myStack.isEmpty());
        myStack.show();

        System.out.println(myStack.pop());

        System.out.println(MyStack.reverse("123456789"));
    }

    public static String reverse(String a){
        MyStack<Character> myStack = new MyStack<Character>();
        for (int i = 0; i < a.length(); i++) {
            myStack.push(a.charAt(i));
        }
        //myStack.push(123);
        String b = "";
        while (!myStack.isEmpty()){
            b += myStack.pop();
        }
        return b;
    }

}
