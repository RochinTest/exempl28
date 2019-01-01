//). Создать программу, выводящую на экран случайно сгенерированное трёхзначное
// натуральное число и его наибольшую цифру.
//Примеры работы программы:
//В числе 208 наибольшая цифра 8
//В числе 774 наибольшая цифра 7
public class Main {

    public static void main(String[] args) {
        int a = (int) (Math.random() * 28799 + 1);
        int hours = (a / 3600);
        System.out.println(a);

        if (hours == 0) {
            System.out.println("Осталось меньше часа");

        } else if (hours >= 5) {
            System.out.println(" Осталось " + hours + " часов ");

        } else {
            System.out.println(" Осталось " + hours + " часа ");

        }
    }
}