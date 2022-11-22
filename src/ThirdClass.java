public class ThirdClass {
    public static double middleNum(int ... n){
        double sum = 0;
        for (int i: n) {
            sum += i;
        }
        return sum / n.length;
    }

    public static int minimum(int ... n){
        int min = n[0];
        for (int i: n) {
            if(min > i){
                min = i;
            }
        }
        return min;
    }
    public static int maximum(int ... n){
        int max = n[0];
        for (int i: n) {
            if(max < i){
                max = i;
            }
        }
        return max;
    }
}
