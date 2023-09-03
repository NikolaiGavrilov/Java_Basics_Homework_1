// Задача 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n).

// Внутри класса TriangularNumber напишите метод countNTriangle, 
// который принимает число n и возвращает его n-ое треугольное число.

// Пример: 
// n = 4 -> 10

// n = 5 -> 15
import java.util.Scanner;

class Funct{
    public static int countNTriangle(int n){
        int summ = n;
        while (n > 1){
            n -= 1;
            summ += n;
        }
        return summ;
    }
}

public class TriangularNumber {
    public static void main(String[] args) {
        System.out.println("Введите число n для вычисления треугольного числа(сумма от 1 до n): ");
        Scanner scanUserNumber = new Scanner(System.in);
        int userNumber = scanUserNumber.nextInt();
        while (userNumber <= 0){
            System.out.println("Введите число, которое больше нуля: ");
            Scanner scanUserNumberAgain = new Scanner(System.in);
            userNumber = scanUserNumberAgain.nextInt();
        }
        int result = Funct.countNTriangle(userNumber);
        System.out.println("Ваш результат: ");
        System.out.println(result);
    }
    
}
