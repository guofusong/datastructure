package fun.guofusong.linkedlist;

public class SingletonDirectionNode <T> {

    private T object;

    private SingletonDirectionNode next;

    public SingletonDirectionNode (T object, SingletonDirectionNode next) {
        this.object = object;
        this.next = next;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public SingletonDirectionNode getNext() {
        return next;
    }

    public void setNext(SingletonDirectionNode next) {
        this.next = next;
    }

}
