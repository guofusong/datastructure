package fun.guofusong.linetable;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListTest extends MyArrayList {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void size1() {
        MyArrayList<String> mal = new MyArrayList<String>(23);
        System.out.println(mal.size());
    }

    @Test
    public void add1() {
        MyArrayList<String> mal = new MyArrayList<String>();
        for(int i = 0; i < 100; i ++) {
            mal.add("hello");
        }
        System.out.println(mal.size());
        System.out.println(mal.get(99));
    }

    @Test
    public void add2() {
        MyArrayList<String> mal = new MyArrayList<String>();
        mal.add(0, "hello");
        System.out.println(mal.get(0));
    }

    @Test
    public void get1() {
    }

    @Test
    public void remove1() {
        MyArrayList<String> mal = new MyArrayList<String>();
        mal.add(0, "hello");
        System.out.println(mal.get(0));
        mal.remove(0);
        System.out.println(mal.get(0));
    }

    @Test
    public void contains1() {
        MyArrayList<String> mal = new MyArrayList<String>();
        mal.add("你好");
        System.out.println(mal.contains("你好"));
    }

    @Test
    public void walk() {
        MyArrayList<String> mal = new MyArrayList<String>();
        for(int i = 0; i < 100; i++) {
            mal.add("添加内容"+i);
        }
        mal.remove(98);
        for(int i = 0 ; i < mal.size(); i++) {
            System.out.println("下标：" + i + " , "+mal.get(i));
        }
    }
}