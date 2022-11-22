public class FourthClass {
    public static int factorial(int number){
        int factorial = 1;
        while (number > 0) {
            factorial *= number;
            number -= 2;
        }
        return factorial;
    }
    public static int factorialR(int number){
        if (number <= 2){
            return number;
        }
        return number * factorialR(number - 2);
    }
}
