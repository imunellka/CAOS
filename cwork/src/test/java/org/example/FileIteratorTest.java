package org.example;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileIteratorTest {
    public void test1() {
        FileIterator it = new FileIterator("src/input.txt");
        assertEquals(true, it.hasNext());
        assertEquals(true, it.hasNext());
        assertEquals("hello", it.next());
        assertEquals("i'm file tester ", it.next());
        assertEquals("it's good", it.next());
        assertEquals(false, it.hasNext());
    }

    public void test2() {
        FileIterator it = new FileIterator("src/input2.txt");
        assertEquals(false, it.hasNext());
        assertEquals(false, it.hasNext());
    }

    public void test3() {
        FileIterator it = new FileIterator("src/input3.txt");
        try {
            while (it.hasNext()) {
                it.next();
            }
        } catch (Exception e) {
            assertEquals("Opsss", "some troubles in cycle");
        }
    }
}

