package fun.guofusong.stack;

public class MyLinkStack <T> {

    private SingletonNode top;

    public MyLinkStack() {
        initStack();
    }

    public void initStack() {
        top = null;
    }

    public boolean stackEmpty() {
        return top == null;
    }

    public void push(T t) {
        if (top == null) {
            top = new SingletonNode(t, null);
        } else {
            top = new SingletonNode(t , top);
        }
    }

    public T pop() {
        if (stackEmpty()) {
            throw new RuntimeException("stack empty .");
        }
        T t = (T) top.getData();
        top = top.getNext();
        return t;
    }

    public T getTop() {
        if (stackEmpty()) {
            throw new RuntimeException("stack empty .");
        }
        return (T) top.getData();
    }

}

class SingletonNode <T> {

    private Object data;

    private SingletonNode next;

    public SingletonNode(T t, SingletonNode<T> next) {
        this.data = t;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public SingletonNode getNext() {
        return next;
    }

    public void setNext(SingletonNode next) {
        this.next = next;
    }
}
