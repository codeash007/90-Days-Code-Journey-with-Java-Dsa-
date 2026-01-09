import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of an Array:=");
        int n = sc.nextInt();
        
        System.out.println("Enter the Target Number := ");
        int x = sc.nextInt();
        

        System.out.println("Enter the Array Element:=");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //SoLUTION

        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                flag = true;
                break;
                
            }
        }
        if(flag == true)System.out.println("Element Found");
        else{
            System.out.println("Element Not Found");
        }
        


    }
    
}
