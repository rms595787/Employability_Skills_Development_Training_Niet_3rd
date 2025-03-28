import Day1;
import java.util.Scanner;

public class problem1{
    /* 
    Print this pattern
    *
    * *
    * * *
         *
         * *
         * * *
              *
              * *
              * * *
    */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of the pattern:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(" ".repeat(i*n*2));
                System.out.println("* ".repeat(j));
            }
        }
    }
}