import java.util.ArrayList;

public class _06_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(3) ;
        arr.add(0,5);
        arr.add(1,6);
        arr.add(2,7);
        arr.add(3,8);
        arr.add(4,9);
        arr.add(5,10);
        arr.add(50);
        for(int i = 0; i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        arr.set(3, 200);

        for(int i = 0; i<arr.size();i++){
            System.out.print(arr.get(i) + " ");
        }
    }
    
}
