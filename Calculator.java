// Задача 3. Реализуйте простой калькулятор

// Напишите класс Calculator, который будет выполнять 
// математические операции (+, -, *, /) над двумя числами
//  и возвращать результат. В классе должен быть метод 
//  calculate, который принимает оператор и значения 
//  аргументов и возвращает результат вычислений.

// При неверно переданном операторе, программа должна 
// вывести сообщение об ошибке "Некорректный оператор: 'оператор'".
import java.util.Scanner;

public class Calculator {
  public int calculate(char op, int a, int b) {
      // Введите свое решение ниже
  int result = 0;
    if (op == '+'){
      result = a+b;
    }
    else if (op == '-'){
      result = a-b;
    }
    else if (op == '*'){
      result = a*b;
    }
    else if (op == '/'){
      result = a/b;
    }
    else{
    System.out.println("Некорректный оператор: 'оператор'");
    }
  return result;
  }

  public static void main(String[] args) { 
    System.out.println("Введите число а: ");
    Scanner scanner1 = new Scanner(System.in);
    int a = scanner1.nextInt();
    Scanner scanner2 = new Scanner(System.in);
    System.out.println("Введите операцию, выбирая из +, -, *, /: "); 
    char op=scanner2.next().charAt(0);
    System.out.println("Введите число b: ");
    Scanner scanner3 = new Scanner(System.in);
    int b = scanner3.nextInt();
    Calculator calculator = new Calculator();
    int result = calculator.calculate(op, a, b);
    System.out.println("Результат вычислений калькулятора: ");
    System.out.println(result);
  }
}
    

