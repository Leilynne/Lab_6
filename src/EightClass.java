import java.util.Arrays;

public class EightClass {
    public static double middle (int[] array){
        int sum = 0;
        for (int i: array) {
            sum += i;
        }
        return (double) sum / array.length;
    }
}
