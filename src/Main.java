import java.util.Arrays;

//). Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
// Определите какой элемент является в этом массиве максимальным и
// сообщите индекс его последнего вхождения в массив.
public class Main {

    public static void main(String[] args) {
        int a = 0,b=0;
        int[] s = new int[12];

        for (int i = 0; i < 12; i++) {
            s[i] = (int) (Math.random() * 30 - 15);

            System.out.print(" "+s[i]);
             a = (int) (Math.max(a, s[i]));
             if (a==s[i]) b=i;
        }
         System.out.println();
        System.out.print("максимальное значение = " + a+" индекс " +b);
        //a = (a + s[i]);

    }


}


