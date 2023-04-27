package ListMeasure;
import java.util.ArrayList;
import java.util.List;

public class ArrayListMeasure {
    // Переменная отвечает за кол-во операций
    int numberOfOperations = 1000;
    List<Integer> arrayList = new ArrayList<>();

    // Переменные для подсчета количества вызовов методов
    public int addMethodCount = 0;
    public int getMethodCount = 0;
    public int removeMethodCount = 0;

    // Измерение времени выполнения для ArrayList
    public long arrayListAddTime = MeasureTime.measureTime(() -> {
        for (int i = 0; i < numberOfOperations; i++) {
            arrayList.add(i);
            addMethodCount++;
        }
    });

    public long arrayListGetTime = MeasureTime.measureTime(() -> {
        for (int i = 0; i < numberOfOperations; i++) {
            arrayList.get(i);
            getMethodCount++;
        }
    });

    public long arrayListRemoveTime = MeasureTime.measureTime(() -> {
        for (int i = 0; i < numberOfOperations; i++) {
            arrayList.remove(0);
            removeMethodCount++;
        }
    });
}
