public class max_in_array {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int n = m.length;
        int i = 0;
        int max = -100;
        while(i < n){
            if(max < m[i]){
                max = m[i];
            }
            i = i + 1;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.print(max(numbers));
    }
}
