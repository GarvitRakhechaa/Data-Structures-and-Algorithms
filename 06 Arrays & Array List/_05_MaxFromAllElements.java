public class _05_MaxFromAllElements {
    public static void main(String[] args) {
        int[] var1 = new int[]{45, 30, 60, 25, 90, 33, 50, 20};
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < var1.length;i++ ){
            if(var1[i]> max){
                max = Math.max(max, var1[i]);
            }
        }
        System.out.println(max);
    }
}
