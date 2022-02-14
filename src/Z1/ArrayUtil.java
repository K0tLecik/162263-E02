package Z1;

import java.time.LocalTime;

public class ArrayUtil
{
        public static void main(String[] args)
        {
                Integer[] prawdaInt = {1,2,3,4,3,2,1};
                Integer[] niePrawdaInt = {1,2,3,4,5,6};
                LocalTime[] prawdaTime = {LocalTime.of(10,00), LocalTime.of(12, 13), LocalTime.of(23, 30), LocalTime.of(23, 30), LocalTime.of(12, 13), LocalTime.of(10,00)};
                LocalTime[] niePrawdaTime = {LocalTime.of(10,00), LocalTime.of(12, 13), LocalTime.of(23, 30), LocalTime.of(10,00), LocalTime.of(12, 13), LocalTime.of(23, 30)};
                ArrayUtil.jestPalindromem(prawdaInt);
                ArrayUtil.jestPalindromem(niePrawdaInt);
                ArrayUtil.jestPalindromem(prawdaTime);
                ArrayUtil.jestPalindromem(niePrawdaTime);
        }

        public static <T extends Comparable> void jestPalindromem(T[] tab)
        {
            boolean palindrom = true;

            for(int i = 0; i < tab.length / 2; i++)
            {
                    if(!tab[i].equals(tab[tab.length - 1 - i]))
                    {
                            palindrom = false;
                    }
            }
            if(palindrom == true)
            {
                    System.out.println("Jest palindromem");
            }
            else
            {
                    System.out.println("Nie jest palindromem");
            }
        }

}
