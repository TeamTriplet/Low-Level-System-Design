package MyHashMap;
import java.util.HashMap;

public class MyHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 1 << 4;
    private static final int MAXIMUM_CAPACITY = 1 << 30;

    public Entry[] hashTable;

    public MyHashMap(){
        hashTable = new Entry[DEFAULT_CAPACITY];
    }

    public MyHashMap(int capacity){
        int tableSize = tableSizeFor(capacity);
        hashTable = new Entry[tableSize];
    }

    final int tableSizeFor(int capacity){
        int n = capacity - 1;
        n |= n>>>1;
        n |= n>>>2;
        n |= n>>>4;
        n |= n>>>8;
        n |= n>>>16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n+1;
    }

    class Entry<K, V>{
        public K key;
        public V value;
        public Entry next;

        Entry(K k, V v){
            key = k;
            value = v;
            next = null;
        }
    }

    public void put(K key, V value){
        int hashCode = key.hashCode() % hashTable.length;
        Entry entry = hashTable[hashCode];

        if(entry == null){
            hashTable[hashCode] = new Entry(key, value);
        } else {
            Entry prevNode = entry;
            while(entry != null){
                if(entry.key == key){
                    entry.value = value;
                    return;
                }
                prevNode = entry;
                entry = entry.next;
            }
            prevNode.next = new Entry(key, value);
        }
    }

    public V get(K key){
        int hashCode = key.hashCode() % hashTable.length;
        Entry entry = hashTable[hashCode];

        while(entry != null){
            if(entry.key == key) return (V) entry.value;
            entry = entry.next;
        }
        return null;
    }
}
