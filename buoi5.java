package buoi5;  
import java.util.Scanner;  
public class buoi5 {  
    public static int findMax(int a, int b) {  
        if (a >= b) {  
            return a;  
        } else {  
            return b;  
        }  
    }  
    public static int findMin(int a, int b) {  
        if (a <= b) {  
            return a;  
        } else {  
            return b;  
        }  
    }  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");  
        int number1 = input.nextInt();  
        System.out.print("Nhập số thứ hai: ");  
        int number2 = input.nextInt();  
        int max = findMax(number1, number2);  
        int min = findMin(number1, number2);  

        System.out.println("Số lớn nhất giữa " + number1 + " và " + number2 + " là " + max);  
        System.out.println("Số nhỏ nhất giữa " + number1 + " và " + number2 + " là " + min);  

        input.close();
}  
    
}
