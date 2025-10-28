import java.util.Scanner;

public class Matrixe {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
//        first we take input of Matrix:
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        System.out.println("Enter the element of first 3*3 matrix ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=Sc.nextInt();
            }
        }
        System.out.println("Enter the element of second 3*3 matrix ");
        for(int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                b[i][j] = Sc.nextInt();
            }
        }
        for(int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                c[i][j] = a[i][j] * b[i][j];
            }
        }
        System.out.println("Multiplication of two matrix ");
        for(int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }Sc.close();
    }
}
