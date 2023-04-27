import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTests {

    @Test
    public void testArrayListGet() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        assertEquals(Optional.of(10), Optional.ofNullable(arrayList.get(0)));
        assertEquals(Optional.of(20), Optional.ofNullable(arrayList.get(1)));
        assertEquals(Optional.of(30), Optional.ofNullable(arrayList.get(2)));
    }

    @Test
    public void testArrayListRemove() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        assertEquals(Optional.of(10), Optional.ofNullable(arrayList.remove(0)));
        assertEquals(Optional.of(20), Optional.ofNullable(arrayList.remove(0)));
        assertEquals(1, arrayList.size());
        assertEquals(Optional.of(30), Optional.ofNullable(arrayList.remove(0)));
    }

    @Test
    public void testArrayListAdd() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        assertEquals(3, arrayList.size());
        assertEquals(Optional.of(10), Optional.ofNullable(arrayList.get(0)));
        assertEquals(Optional.of(20), Optional.ofNullable(arrayList.get(1)));
        assertEquals(Optional.of(30), Optional.ofNullable(arrayList.get(2)));
    }

    @Test
    public void testLinkedListGet() {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        assertEquals(Optional.of(10), Optional.ofNullable(linkedList.get(0)));
        assertEquals(Optional.of(20), Optional.ofNullable(linkedList.get(1)));
        assertEquals(Optional.of(30), Optional.ofNullable(linkedList.get(2)));
    }

    @Test
    public void testLinkedListRemove() {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        assertEquals(Optional.of(10), Optional.ofNullable(linkedList.remove(0)));
        assertEquals(Optional.of(20), Optional.ofNullable(linkedList.remove(0)));
        assertEquals(1, linkedList.size());
        assertEquals(Optional.of(30), Optional.ofNullable(linkedList.get(0)));
    }

    @Test
    public void testLinkedListAdd() {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        assertEquals(3, linkedList.size());
        assertEquals(Optional.of(10), Optional.ofNullable(linkedList.get(0)));
        assertEquals(Optional.of(20), Optional.ofNullable(linkedList.get(1)));
        assertEquals(Optional.of(30), Optional.ofNullable(linkedList.get(2)));
    }
}