import java.util.Scanner;

public class StudentMarks{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of student");
        int x = sc.nextInt();

        int arr[] = new int[x];

        System.out.println("Enter the marks of student");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Student who Failed (marks < 35):");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 35) {
                System.out.println("Roll No: " + i);
            }
        }
    }
}
