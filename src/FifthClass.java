public class FifthClass {
    public static int sumSqrt(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number * number;
            number--;
        }
        return sum;
    }

    public static int sumSqrtR(int number) {
        if (number < 2){
            return 1;
        }
        return number * number + sumSqrtR(number - 1);
    }
}
