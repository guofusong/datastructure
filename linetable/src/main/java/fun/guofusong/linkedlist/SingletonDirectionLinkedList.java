package fun.guofusong.linkedlist;

public class SingletonDirectionLinkedList<T> {

    private SingletonDirectionNode<T> head;

    private int length;

    public int size() {
        return length;
    }

    public void push(T t) {

        if (head == null) {
            head = new SingletonDirectionNode<T>(t , null);
        } else {
            head = new SingletonDirectionNode<T>(t, head);
        }

        length ++ ;

    }

    public void add(T t) {

        length ++;

        if (head == null) {
            head = new SingletonDirectionNode<T>(t, null);
            return;
        }

        SingletonDirectionNode<T> node = null;

        for (int i=0; i<length; i++) {
            if (i == 0) {
                node = head;
            } else {
                node = node.getNext();
            }
            if (i < length - 1) {
                node.setNext(new SingletonDirectionNode<T>(t, null));
            }
        }

    }

    public void add(int index, T t) {

        if (index < 0 || index > length - 1) {
            throw new IndexOutOfBoundsException();
        }

        if (head == null) {

            if (index == 0) {
                head = new SingletonDirectionNode<T>(t, null);
            } else {
                throw new IndexOutOfBoundsException();
            }

        } else {

            SingletonDirectionNode<T> node = null;

            for (int i=0; i<length; i++) {

                if (i == 0) {
                    node = head;
                } else {
                    node = node.getNext();
                }

                if (index == i) {

                    SingletonDirectionNode<T> node1 = node.getNext();

                    SingletonDirectionNode<T> newNode = new SingletonDirectionNode<T>(t, node1);

                    node.setNext(newNode);

                    return;

                }

            }

        }

    }

    public T get(int i) {

        if (i < 0 || i > length - 1) {
            throw new IndexOutOfBoundsException();
        }

        SingletonDirectionNode<T> node = null;

        for (int _i = 0; _i < length; _i++) {

            if (_i == 0) {
                node = head;
            } else {
                node = node.getNext();
            }

            if (i == _i) {
                return node.getObject();
            }

        }

        return null;

    }

    public T remove(int index) {

        if (index < 0 || index > length - 1) {
            throw new IndexOutOfBoundsException();
        }

        if (head == null) {
            throw new IndexOutOfBoundsException();
        }

        SingletonDirectionNode<T> node = head;

        for (int i=0; i<length; i++) {

            if (node == null) {
                return null;
            }

            SingletonDirectionNode<T> node1 = node.getNext();

            if (i == index) {

                T t = node.getObject();

                if (i == 0) {
                    head = node1;
                } else {

                    if (node1 != null) {
                        node.setNext(node1.getNext());
                    } else {
                        node.setNext(null);
                    }
                }

                length --;

                return t;

            }

            node = node1;

        }

        return null;

    }

    public T pop() {

        if (head == null) {
            throw new IndexOutOfBoundsException();
        }

        return remove(length - 1);

    }

    public T take() {

        if (head == null) {
            throw new IndexOutOfBoundsException();
        }

        return remove(0);

    }

}
