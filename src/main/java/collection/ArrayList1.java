package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        //Using simple for loop
        System.out.println("Using simple ForLoop");
        for (int index = 0; index < arrayList.size(); index++)
            System.out.println(arrayList.get(index));

        //Using Advanced for loop or forEach loop
        System.out.println("Using Advanced for looop");
        for (Integer num : arrayList)
            System.out.println(num);

        //ForEach java 8 Lambda Expression
        System.out.println("Using for loop with Lambda Expression");
        arrayList.forEach(num -> System.out.println(num));

        //Using Enumerate through the ArrayList
        Enumeration<Integer> enumeration = Collections.enumeration(arrayList);
        System.out.println("ArrayList element using Enumeration");
        while (enumeration.hasMoreElements())
            System.out.println(enumeration.nextElement());

        //While loop for iterating ArrayList
        System.out.println("While loop");
        int count = 0;
        while (arrayList.size() > count) {
            System.out.println(arrayList.get(count));
            count++;
        }
        //Looping ArrayList using iterator
        Iterator<Integer> iterator = arrayList.iterator();
        System.out.println("Iterator");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
