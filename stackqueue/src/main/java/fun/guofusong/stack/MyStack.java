package fun.guofusong.stack;

public class MyStack<T> {

    private static final Integer DEFAULT_CAPACITY = 8;

    // 栈的容量
    private int size = DEFAULT_CAPACITY;

    // 下标
    private int index = -1;

    // 数据集合
    private Object[] arr = null;

    public MyStack() {
        arr = new Object[size];
    }

    public MyStack(int size) {
        this.size = size;
        arr = new Object[size];

    }

    public void initStack() {
        index = -1;
        arr = new Object[size];
    }

    public boolean stackEmpty() {
        return index == -1 ? true : false;
    }

    public boolean stackFull() {
        return index == size - 1 ? true : false;
    }

    public void push(T t) {
        if (stackFull()) {
            throw new RuntimeException("stack full .");
        }
        index ++;
        arr[index] = t;
    }

    public T pop() {
        if (stackEmpty()) {
            throw new RuntimeException("stack empty .");
        }
        T t = (T) arr[index];
        arr[index] = null;
        index --;
        return t;
    }

    public T getTop() {
        if (stackEmpty()) {
            throw new RuntimeException("stack empty .");
        }
        return (T) arr[index];
    }

}
