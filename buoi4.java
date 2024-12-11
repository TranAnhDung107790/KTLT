package buoi4;
import java.util.Scanner;  
public class buoi4 {  
    private static void printNumbers(int n) {  
        System.out.print("Danh sách các phần tử n = " + n + " là: ");  
        for (int i = 1; i <= n; i++) {  
            System.out.print(i + " ");  
        }  
        System.out.println();  
    }  
    private static void printOddNumbers(int n) {  
        System.out.print("Danh sách các số lẻ n <= " + n + " là: ");  
        for (int i = 1; i <= n; i += 2) {  
            System.out.print(i + " ");  
        }  
        System.out.println();  
    }  
    private static void printEvenNumbers(int n) {  
        System.out.print("Danh sách các số chẵn n <= " + n + " là: ");  
        for (int i = 2; i <= n; i += 2) {  
            System.out.print(i + " ");  
        }  
        System.out.println();  
    }  
    private static void printOddNumbersLessThan(int n) {  
        System.out.print("Danh sách các số lẻ n < " + n + " là: ");  
        for (int i = 1; i < n; i += 2) {  
            System.out.print(i + " ");  
        }  
        System.out.println();  
    }  
    private static void printEvenNumbersLessThan(int n) {  
        System.out.print("Danh sách các số chẵn n < " + n + " là: ");  
        for (int i = 2; i < n; i += 2) {  
            System.out.print(i + " ");  
        }  
        System.out.println();  
    }  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Nhập giá trị n: ");  
        int n = scanner.nextInt();  
        printNumbers(n);  
        printOddNumbers(n);  
        printEvenNumbers(n);  
        printOddNumbersLessThan(n);  
        printEvenNumbersLessThan(n);  
        
        scanner.close();  
    }  
}  