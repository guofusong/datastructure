package fun.guofusong.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkStackTest extends MyLinkStack {

    @Test
    public void initStack1() {

        MyLinkStack myLinkStack = new MyLinkStack();
        myLinkStack.initStack();

    }

    @Test
    public void stackEmpty1() {

        MyLinkStack myLinkStack = new MyLinkStack();
        System.out.println(myLinkStack.stackEmpty());

    }

    @Test
    public void push1() {

        MyLinkStack myLinkStack = new MyLinkStack();

        System.out.println(myLinkStack.stackEmpty());

        myLinkStack.push(123456);

        System.out.println(myLinkStack.stackEmpty());

    }

    @Test
    public void pop1() {

        MyLinkStack myLinkStack = new MyLinkStack();

        System.out.println(myLinkStack.stackEmpty());

        myLinkStack.push(123456);

        System.out.println(myLinkStack.stackEmpty());

        System.out.println(myLinkStack.pop());

        System.out.println(myLinkStack.stackEmpty());

        System.out.println(myLinkStack.pop());

    }

    @Test
    public void getTop1() {

        MyLinkStack myLinkStack = new MyLinkStack();

        System.out.println(myLinkStack.stackEmpty());

        myLinkStack.push(123456);

        myLinkStack.push("abcdefghijklmn");

        System.out.println(myLinkStack.stackEmpty());

        System.out.println(myLinkStack.getTop());

        System.out.println(myLinkStack.stackEmpty());

        System.out.println(myLinkStack.pop());

        System.out.println(myLinkStack.pop());

    }
}