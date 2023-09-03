// Задача 2. Напишите функцию printPrimeNums, которая выведет 
// на экран все простые числа в промежутке от 1 до 1000,
//  каждое на новой строке.
// Напишите свой код в методе printPrimeNums класса PrimeNumbers.

class Function{
    public static void printPrimeNums(){
        for (int i = 1; i <= 1000; i++) {
            Integer result = i;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    result = null;
                    break;
                }
            }
            if (result != null) {
                System.out.println(result);
            }  
        }
    }
}

public class PrimeNumbers {
    public static void main(String[] args) {
        Function.printPrimeNums();
    }
}
