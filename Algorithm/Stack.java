import java.util.Arrays;

public class Stack<T extends Object> {
    private static final int DEFAULT_ARRAY_SIZE = 10;
    private int size;
    private int top;
    private T[] stackArr;

    public Stack() {
        this.size = DEFAULT_ARRAY_SIZE;
        this.top = 0;
        this.stackArr = (T[]) new Object[DEFAULT_ARRAY_SIZE];
    }

    public Stack(int size) {
        this.size = size;
        this.top = 0;
        this.stackArr = (T[]) new Object[size];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        if (top == 0) return true;
        else return false;
    }

    public T peek() {
        if (top == 0)
            return null;
        return stackArr[top - 1];
    }

    public void push(T item) {
        resize();
        stackArr[top++] = item;
    }

    public T pop() {
        if (top == 0)
            return null;
        T ret = stackArr[--top];
        stackArr[top] = null;
        resize();
        return ret;
    }

    private void resize() {
        if (top == size) {
            size *= 2;
            stackArr = Arrays.copyOf(stackArr, size);
        } else if (size > DEFAULT_ARRAY_SIZE && top < size / 2) {
            size /= 2;
            stackArr = Arrays.copyOf(stackArr, size);
        }
    }
}