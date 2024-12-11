package buoi2 ;

import java.util.Scanner;  

public class dung107790 {  
    public static void main(String[] args) {  
        String className = "IT24A";
        int number1 = 15; 
        double number2 = 8.2; 
        System.out.println("Chào mừng các bạn đến với lớp " + className + "!");  
        System.out.println("Số thứ nhất là: " + number1);  
        System.out.println("Số thứ hai là: " + number2);  
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Xin hãy nhập tên lớp mới: ");  
        String inputClassName = scanner.nextLine();  
        System.out.print("Nhập số thứ tự của bạn: ");  
        int studentNumber = scanner.nextInt();  
        scanner.nextLine();
        System.out.print("Nhập họ và tên của bạn: ");  
        String fullName = scanner.nextLine(); 
        System.out.println("Xin chào sinh viên lớp " + inputClassName + "!");  
        System.out.println("Lớp học: " + inputClassName);  
        System.out.println("Số thứ tự: " + studentNumber);  
        System.out.println("Họ và tên: " + fullName);  
        scanner.close();   
    }  
}   
    
