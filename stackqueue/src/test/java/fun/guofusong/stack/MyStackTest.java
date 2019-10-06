package fun.guofusong.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyStackTest extends MyStack {

    @Test
    public void initStack1() {

        MyStack myStack = new MyStack();
        myStack.initStack();

    }

    @Test
    public void stackEmpty1() {

        MyStack myStack = new MyStack();
        System.out.println(myStack.stackEmpty());

        myStack.push("123456");
        myStack.push(123456);
        System.out.println(myStack.stackEmpty());

    }

    @Test
    public void stackFull1() {

        MyStack myStack = new MyStack();
        for (int i=0; i<8; i++) {
            myStack.push(123456);
        }
        System.out.println(myStack.stackEmpty());

    }

    @Test
    public void push1() {
        MyStack myStack = new MyStack();
        for (int i=0; i<8; i++) {
            myStack.push(123456);
        }
        System.out.println(myStack);
    }

    @Test
    public void pop1() {

        MyStack myStack = new MyStack();
        for (int i=0; i<8; i++) {
            myStack.push(123456);
        }

        System.out.println(myStack.stackFull());

        System.out.println(myStack.pop());

        System.out.println(myStack.stackFull());

    }

    @Test
    public void getTop1() {

        MyStack myStack = new MyStack();
        for (int i=0; i<8; i++) {
            myStack.push(123456);
        }

        System.out.println(myStack.stackFull());

        System.out.println(myStack.getTop());

        System.out.println(myStack.stackFull());

    }

    @Test
    public void testPop() {

        MyStack myStack = new MyStack();

        myStack.push(123456);

        myStack.push("123456");

        myStack.push("abcdsfds");

        myStack.push('a');

        myStack.push('1');

        myStack.push(true);

        myStack.push(234L);

        myStack.push(234D);

        System.out.println(myStack.pop());

        System.out.println(myStack.pop());

        System.out.println(myStack.pop());

        System.out.println(myStack.pop());

        System.out.println(myStack.pop());

        System.out.println(myStack.pop());

        System.out.println(myStack.pop());

        System.out.println(myStack.pop());

        System.out.println(myStack.stackEmpty());

        System.out.println(myStack.pop());

    }

}