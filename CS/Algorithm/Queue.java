public class Queue<T extends Object> {
    private Node<T> back, front;
    private int size;

    private class Node<T extends Object> {
        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
        }
    }

    public Queue() {
        this.size = 0;
    }

    public void push(T value) {
        Node node = new Node(value);
        size++;
        if (front == null) {
            back = node;
            front = node;
        } else {
            back.next = node;
            back = node;
        }
    }

    public T pop() {
        if (front == null) return null;
        size--;
        T ret = front.value;
        front = front.next;
        return ret;
    }

    public T peek() {
        if (front == null) return null;
        return front.value;
    }

    public T back() {
        if (back == null) return null;
        return back.value;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0 ? true : false;
    }
}
