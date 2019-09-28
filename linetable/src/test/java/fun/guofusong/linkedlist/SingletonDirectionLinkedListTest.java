package fun.guofusong.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonDirectionLinkedListTest extends SingletonDirectionLinkedList {

    @Test
    public void size1() {

        SingletonDirectionLinkedList<String> singletonDirectionLinkedList = new SingletonDirectionLinkedList();

        System.out.println(singletonDirectionLinkedList.size());

    }

    @Test
    public void push1() {

        SingletonDirectionLinkedList<String> singletonDirectionLinkedList = new SingletonDirectionLinkedList();

        singletonDirectionLinkedList.push("123456");

        System.out.println(singletonDirectionLinkedList.size());

        System.out.println(singletonDirectionLinkedList.get(0));

    }

    @Test
    public void add1() {

        SingletonDirectionLinkedList<String> singletonDirectionLinkedList = new SingletonDirectionLinkedList();

        singletonDirectionLinkedList.add("123456");

        System.out.println(singletonDirectionLinkedList.size());

        System.out.println(singletonDirectionLinkedList.get(0));

    }

    @Test
    public void get1() {

        SingletonDirectionLinkedList<String> singletonDirectionLinkedList = new SingletonDirectionLinkedList();

        singletonDirectionLinkedList.add("123456");

        singletonDirectionLinkedList.add("12345sfa6");

        System.out.println(singletonDirectionLinkedList.size());

        System.out.println(singletonDirectionLinkedList.get(0));

    }

    @Test
    public void remove() {

        SingletonDirectionLinkedList<String> singletonDirectionLinkedList = new SingletonDirectionLinkedList();

        singletonDirectionLinkedList.add("123456");

        singletonDirectionLinkedList.add("12345sfa6");

        System.out.println(singletonDirectionLinkedList.size());

        singletonDirectionLinkedList.add("sfsadfasf");

        System.out.println(singletonDirectionLinkedList.size());

        System.out.println(singletonDirectionLinkedList.remove(0));

        System.out.println(singletonDirectionLinkedList.get(0));

        System.out.println(singletonDirectionLinkedList.size());

        System.out.println(singletonDirectionLinkedList.remove(0));

        System.out.println(singletonDirectionLinkedList.size());

        System.out.println(singletonDirectionLinkedList.remove(0));

        System.out.println(singletonDirectionLinkedList.size());

        System.out.println(singletonDirectionLinkedList.remove(0));

        System.out.println(singletonDirectionLinkedList.size());

    }

    @Test
    public void pop1() {

        SingletonDirectionLinkedList<String> singletonDirectionLinkedList = new SingletonDirectionLinkedList();

        singletonDirectionLinkedList.add("123456");

        singletonDirectionLinkedList.add("12345sfa6");

        singletonDirectionLinkedList.add("sfsadfasf");

        System.out.println(singletonDirectionLinkedList.pop());

        System.out.println(singletonDirectionLinkedList.pop());

        System.out.println(singletonDirectionLinkedList.pop());

        System.out.println(singletonDirectionLinkedList.pop());

    }

    @Test
    public void take1() {

        SingletonDirectionLinkedList<String> singletonDirectionLinkedList = new SingletonDirectionLinkedList();

        singletonDirectionLinkedList.add("123456");

        singletonDirectionLinkedList.add("12345sfa6");

        singletonDirectionLinkedList.add("sfsadfasf");

        System.out.println(singletonDirectionLinkedList.take());

        System.out.println(singletonDirectionLinkedList.take());

        System.out.println(singletonDirectionLinkedList.take());

        System.out.println(singletonDirectionLinkedList.take());

    }

}