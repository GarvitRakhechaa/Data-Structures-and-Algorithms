// Q5 : Find the element 'x' in the array . Take array
// and x as input.
public class _04_LinearSearch {
    public static void main(String[] args) {
        int[] var1 = new int[]{45, 30, 60, 25, 90, 33, 50, 20};
        int count = 0;
            for(int i = 0 ; i < var1.length; i++){
                if(var1[i] == 55){
                    System.out.println("item fount at index: "+var1[i]);
                    count = 1;
                    break;
                }
            }
            if(count==0){
                System.out.println("item not fount");
            }

    }
}
