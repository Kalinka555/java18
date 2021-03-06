package lessons.lesson13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> set = new ArrayList<>();
        set.add(23); //
        set.add(13);
        set.add(22);
        set.add(23);
        set.add(90);
        set.add(23);
        set.add(17);
        System.out.println(set); // выводит только уникальные номера (одинаковые элементы выводит только один  раз, нет порядка
        // вхождения, нет индекса

        //1 способ прохода по коллекции - генерируя индексы
        for (int i = 0; i < set.size(); i++) {
            System.out.println(set.get(i));
        }
        for (Integer num : set) {
            System.out.println(num);
        }
        //  с помощью итератора
        for(Iterator<Integer> iter= set.iterator(); iter.hasNext();){
            System.out.println(iter.next());
        }
    }
}
