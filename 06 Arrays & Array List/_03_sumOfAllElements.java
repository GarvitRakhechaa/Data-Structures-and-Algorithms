public class _03_sumOfAllElements {
    public static void main(String[] args) {
      int[] var1 = new int[]{45, 30, 60, 25, 90, 33, 50, 20};
      int sum = 0;
        for(int i = 0; i < var1.length; i++){
            sum = sum + var1[i];
        }
        System.out.println(sum);
    }
}
