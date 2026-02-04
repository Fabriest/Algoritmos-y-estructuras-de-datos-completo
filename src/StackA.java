
import java.util.ArrayList;


public class StackA<T> implements Stack<T>
{
    private ArrayList<T> data1;

    public StackA() {
        data1 = new ArrayList<T>();
    }


    @Override
    public T pop() {

        int length = data1.size();
        if (length == 0) {
            message("Stack underflow");
        }

        T value = data1.get(length - 1);
        data1.remove(length - 1);
        
        return value;

    }

    @Override
    public void push(T value) {
        data1.add(value);
    }

    @Override
    public T peek() {
        if (data1.size() == 0) {
            message("Stack underflow1");
        }
        int length = data1.size();
        T value = data1.get(length - 1);

        return value;
    }

    public void message(String message) {
        System.out.println(message);
    }
}
