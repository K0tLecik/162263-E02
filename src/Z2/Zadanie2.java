package Z2;

import java.util.ArrayList;
import java.time.LocalDate;

public class Zadanie2
{
    public static void main(String[] args)
    {
        ArrayList<Integer> tabInt = new ArrayList<>();
        tabInt.add(1);
        tabInt.add(2);
        tabInt.add(3);
        tabInt.add(4);
        tabInt.add(5);
        tabInt.add(6);
        tabInt.add(7);

        ArrayList<String> tabStr = new ArrayList<>();
        tabStr.add("a");
        tabStr.add("b");
        tabStr.add("c");
        tabStr.add("d");
        tabStr.add("e");
        tabStr.add("f");
        tabStr.add("g");
        tabStr.add("h");

        ArrayList<LocalDate> tabDate = new ArrayList<>();
        tabDate.add(LocalDate.of(2020, 12, 10));
        tabDate.add(LocalDate.of(2010, 11, 5));
        tabDate.add(LocalDate.of(1815, 1, 3));
        tabDate.add(LocalDate.of(2018, 10, 16));
        tabDate.add(LocalDate.of(2016, 2, 7));
        tabDate.add(LocalDate.of(2003, 7, 23));

        wypiszCoDrugi(tabInt);
        wypiszCoDrugi(tabStr);
        wypiszCoDrugi(tabDate);
    }


    public static <T extends  Iterable<E>, E> void wypiszCoDrugi(T tab)
    {
        boolean x = true;

        for (E t: tab)
        {
            if (x == true)
            {
                System.out.println(t + ",");
            }
            x = !x;
        }
    }

}
