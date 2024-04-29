package chapter11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyHashMapTest {

    @Test
    void testPutAndGet() {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 10);
        hashMap.put(2, 20);
        hashMap.put(3, 30);

        assertEquals(10, hashMap.get(1));
        assertEquals(20, hashMap.get(2));
        assertEquals(30, hashMap.get(3));
        assertEquals(-1, hashMap.get(4));
    }

    @Test
    void testRemove() {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 10);
        hashMap.put(2, 20);
        hashMap.put(3, 30);

        hashMap.remove(2);
        assertEquals(-1, hashMap.get(2));

        hashMap.remove(4);
        assertEquals(-1, hashMap.get(4));
    }
}
