
import java.util.Arrays;;

public class BuiltInMethodArray {
    public static void main(String[] args) {
        int [] arr = {20,30,90,54,60};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}
