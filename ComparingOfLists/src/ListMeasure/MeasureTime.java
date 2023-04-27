package ListMeasure;

public class MeasureTime {
    // Лямбда-функция для измерения времени выполнения операции
    static long measureTime(Runnable action) {
        long startTime = System.nanoTime();
        action.run();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
