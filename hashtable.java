public class hashtable {
    private hashnode[] buckets;
    private int numofbuckets;
    private int size;


    public hashtable() {
        this(10);
    }

    public hashtable(int capacity) {
        this.numofbuckets = capacity;
        buckets = new hashnode[numofbuckets];
        this.size = 0;
    }

    private class hashnode {
        private Integer key;
        private String value;
        private hashnode next;

        public hashnode(Integer key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void put(Integer key, String value) {
        if (key == null || value == null) {
            throw new IllegalArgumentException("Key is null");
        }
        int bucketIndex = getBucketIndex(key);
        hashnode head = buckets[bucketIndex];
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = buckets[bucketIndex];
        hashnode node = new hashnode(key, value);
        buckets[bucketIndex] = node;
    }

    private int getBucketIndex(Integer key) {
        return key % numofbuckets;
    }

    public String get(Integer key) {
        if (key==null){
            throw new IllegalArgumentException("Key is null");
        }
        int bucketIndex = getBucketIndex(key);
        hashnode head = buckets[bucketIndex];
        while(head!=null){
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public String remove(Integer key) {
        if (key==null){
            throw new IllegalArgumentException("Key is null");
        }

        int bucketIndex = getBucketIndex(key);
        hashnode head = buckets[bucketIndex];
        hashnode previous = null;
        while (head!=null){
            if (head.key.equals(key)){
                break;
            }
            previous = head;
            head = head.next;
        }
        if (head==null){
            return null;
        }
        size--;
        if (previous!=null){
            previous.next = head.next;
        } else {
            buckets[bucketIndex] = head.next;
        }
        return null;
    }

    public static void main(String[] args) {
        hashtable table = new hashtable(10);
        table.put(105, "tom");
        table.put(21, "sana");
        table.put(21,"harry");
        table.put(31,"dinesh");
        System.out.println(table.size);
        System.out.println(table.get(31));
        System.out.println(table.remove(105));
        System.out.println(table.size);
    }
}
