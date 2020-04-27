import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        String S = in.nextLine(); // Запись введённого числа в строковую переменную S
        int X = Integer.parseInt(S); // Конвертация строковой переменной S в переменную X типа int
        double Y = X; // Конвертация числа X типа int в число Y типа double
        System.out.println("Ваше число типа String: " + S);
        System.out.println("Ваше число типа int: " + X);
        System.out.println("Ваше число типа double: " + Y);
    }
}
