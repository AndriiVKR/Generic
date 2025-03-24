import java.io.Serializable;

public class BoxOneParam<T extends Number & Comparable<T> & Serializable> {
    private T[] array;

    public BoxOneParam(T... array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public double average() {
        double result = 0;
        for (T element : array) {
            result += ((Number) element).doubleValue();
        }
        return result / array.length;
    }

    public int compare(BoxOneParam<T> another) {
        if (average() > another.average()) {
            return 1;
        } else if (average() == another.average()) {
            return 0;
        } else {
            return -1;
        }
    }

    public void setArray(T[] array) {
        this.array = array;
    }

}
