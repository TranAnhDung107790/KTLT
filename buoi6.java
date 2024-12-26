package buoi6;
import java.util.Scanner;

public class buoi6; {
    
    public static void thongTin1_1() {
        String hoTen = "Trần Anh Dũng";
        String ngaySinh = "29/10/2006";
        String diemTongKet = "5.0";
        String tuoi = "18";
        
        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.printf("Họ và tên: %s%n", hoTen);
        System.out.printf("Ngày sinh: %s%n", ngaySinh);
        System.out.printf("Điểm tổng kết: %.2f%n", Float.parseFloat(diemTongKet));
        System.out.printf("Tuổi: %d%n", Integer.parseInt(tuoi));
        System.out.println("-----HẾT-----");
    }

    public static void thongTin1_2() {
        String hoTen = "Trần Anh Dũng";
        String ngaySinh = "29/10/2006";
        Float diemTongKet = 5.0f;
        int tuoi = 18;
        
        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.printf("Họ và tên: %s%n", hoTen);
        System.out.printf("Ngày sinh: %s%n", ngaySinh);
        System.out.printf("Điểm tổng kết: %.2f%n", diemTongKet);
        System.out.printf("Tuổi: %d%n", tuoi);
        System.out.println("-----HẾT-----");
    }

    public static void thongTin2_1() {
        String hoTen, ngaySinh, diemTongKet, tuoi;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nNhập họ và tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhập điểm: ");
        diemTongKet = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = sc.nextLine();
        
        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.printf("Họ và tên: %s%n", hoTen);
        System.out.printf("Ngày sinh: %s%n", ngaySinh);
        System.out.printf("Điểm tổng kết: %.2f%n", Float.parseFloat(diemTongKet));
        System.out.printf("Tuổi: %d%n", Integer.parseInt(tuoi));
        System.out.println("-----HẾT-----");
        
        sc.close();
    }

    public static void thongTin2_2() {
        String hoTen, ngaySinh;
        float diemTongKet;
        int tuoi;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nNhập họ và tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhập điểm: ");
        diemTongKet = sc.nextFloat();
        System.out.print("Nhập tuổi: ");
        tuoi = sc.nextInt();
        
        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.printf("Họ và tên: %s%n", hoTen);
        System.out.printf("Ngày sinh: %s%n", ngaySinh);
        System.out.printf("Điểm tổng kết: %.2f%n", diemTongKet);
        System.out.printf("Tuổi: %d%n", tuoi);
        System.out.println("-----HẾT-----");
        
        sc.close();
    }

    public static void main(String[] args) {
        thongTin1_1();
        thongTin1_2();
        thongTin2_1();
        thongTin2_2();
    }
}
    

