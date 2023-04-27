import ListMeasure.ArrayListMeasure;
import ListMeasure.LinkedListMeasure;


public class Main {
    public static void main(String[] args) {
        // Создание экземпляров классов
        ArrayListMeasure alm = new ArrayListMeasure();
        LinkedListMeasure llm = new LinkedListMeasure();

        // Вывод результатов
        System.out.println("ArrayList - Add: \t\t" + "Number of calls: \t" + alm.addMethodCount + "\t" + "Time: \t" + alm.arrayListAddTime + "\t ns");
        System.out.println("LinkedList - Add: \t\t" + "Number of calls: \t" + llm.addMethodCount + "\t" + "Time: \t" + llm.linkedListAddTime + "\t ns");
        System.out.println("ArrayList - Get: \t\t" + "Number of calls: \t" + alm.getMethodCount + "\t"+ "Time: \t"  + alm.arrayListGetTime + "\t ns");
        System.out.println("LinkedList - Get: \t\t" + "Number of calls: \t" + llm.getMethodCount + "\t" +"Time: \t" + + llm.linkedListGetTime + "\t ns");
        System.out.println("ArrayList - Remove: \t" + "Number of calls: \t" + alm.removeMethodCount + "\t" + "Time: \t" +  alm.arrayListRemoveTime + "\t ns");
        System.out.println("LinkedList - Remove: \t" + "Number of calls: \t" + llm.removeMethodCount + "\t" +"Time: \t" + llm.linkedListRemoveTime + "\t ns");
    }
}
