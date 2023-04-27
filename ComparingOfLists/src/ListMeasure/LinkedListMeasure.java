package ListMeasure;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMeasure {
    // Переменная отвечает за кол-во операций
    int numberOfOperations = 1000;
    List<Integer> linkedList = new LinkedList<>();

    // Переменные для подсчета количества вызовов методов
    public int addMethodCount = 0;
    public int getMethodCount = 0;
    public int removeMethodCount = 0;

    // Измерение времени выполнения для LinkedList
    public long linkedListAddTime = MeasureTime.measureTime(() -> {
        for (int i = 0; i < numberOfOperations; i++) {
            linkedList.add(i);
            addMethodCount++;
        }
    });

    public long linkedListGetTime = MeasureTime.measureTime(() -> {
        for (int i = 0; i < numberOfOperations; i++) {
            linkedList.get(i);
            getMethodCount++;
        }
    });

    public long linkedListRemoveTime = MeasureTime.measureTime(() -> {
        for (int i = 0; i < numberOfOperations; i++) {
            linkedList.remove(0);
            removeMethodCount++;
        }
    });
}