public  class OrderedPair<K,V> implements Pair<K,V> {
    private K key;
    private V value;
    public OrderedPair(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    public static void main(String[] args)
    {
        Pair<String, Integer> pair1 = new OrderedPair<>("MSSV: ", 242520);
        Pair<String, String> pair2 = new OrderedPair<>("HoTen: ", "Phạm Tuấn Hưng");

        System.out.println(pair1.getKey() + pair1.getValue());
        System.out.println(pair2.getKey() + pair2.getValue());
    }
}
