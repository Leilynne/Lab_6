import java.util.Arrays;

public class SixthClass {
     public static int[] link (int[] array, int length) {
          if (length >= array.length) {
             return array.clone();
          }
          return Arrays.copyOf(array, length);
     }
}
