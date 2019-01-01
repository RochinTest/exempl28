//). Создать программу, выводящую на экран случайно сгенерированное трёхзначное
// натуральное число и его наибольшую цифру.
//Примеры работы программы:
//В числе 208 наибольшая цифра 8
//В числе 774 наибольшая цифра 7
public class Main {

    public static void main(String[] args) {
        int[] s = new int[3];
        int accum = 0;
        int a = (int) (Math.random() * 899 + 100);
        int b = a;
        for (int i = 0; a != 0; a /= 10, i++) {
            accum = Math.max(accum, a % 10);


        }

        System.out.println("В числе " + b + " наибольшая цифра " + accum);

    }
}
