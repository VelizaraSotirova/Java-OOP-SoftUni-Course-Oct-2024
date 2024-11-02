package Lab._03_Random_Array_List;

import java.util.ArrayList;

public class RandomArrayList<T> extends ArrayList<T> {
    public T getRandomElement() {
        return super.removeFirst();
    }
}
