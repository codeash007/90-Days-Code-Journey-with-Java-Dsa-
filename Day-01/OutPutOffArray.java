import java.util.Scanner;

public class OutPutOffArray {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

System.out.print("Enter the value of x: ");
int x = sc.nextInt();

int[] arr = new int[x];


        // Input    

        System.out.println("Enter array elements:");
for (int i = 0; i < arr.length; i++) {
    arr[i] = sc.nextInt();
}

        
        //OutPut 

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }
    }
    
}
