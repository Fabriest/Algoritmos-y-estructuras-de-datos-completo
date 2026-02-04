public class StackO<T> implements Stack<T>
{
    private Object[] data;
    private int top;
    private int capacity;

    public StackO() {
        data = new Object[10];
        capacity = 10;
        top = -1;
    }

    @Override
    public void push(T value) {
        if (top == capacity - 1) {
            message("Stack overflow");
            return;
        }
        data[++top] = value;
    }

    @Override
    public T pop() {
        if (top == -1) {
            message("Stack underflow");
            return null;
        }
        T value = (T) data[top];
        data[top--] = null;
        return value;
    }

    @Override
    public T peek() {
        if (top == -1) {
            message("Stack underflow");
            return null;
        }
        T value = (T) data[top];
        return value;
    }

    public void message(String message) {
        System.out.println(message);
    }
    
}
