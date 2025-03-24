public class Box3Params<K, V, T>{
    private K key;
    private V value;
    private T value2;

    public Box3Params(K key, V value, T value2) {
        this.key = key;
        this.value = value;
        this.value2 = value2;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public T getValue2() {
        return value2;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setValue2(T value2) {
        this.value2 = value2;
    }
}
