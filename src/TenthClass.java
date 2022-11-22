public class TenthClass {
    public static int[] newMassive (int ... n) {
        int min = n[0];
        int max = n[0];

        for (int j : n) {
            if (min > j) {
                min = j;
            } else if (max < j) {
                max = j;
            }
        }
        return new int[] {min, max};
    }
}
