package buoi7;
import java.util.Scanner;

public class Dung107790 {
    
    public static void hienThiGiaTri(int n) {
        System.out.print("Danh sách các phần tử là: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t");
        }
    }

    public static float nhapDiem() {
        Scanner sc = new Scanner(System.in);
        float diem = -1;
        while (diem < 0 || diem > 10) {
            System.out.print("\nNhập điểm số (0-10): ");
            if (sc.hasNextFloat()) {
                diem = sc.nextFloat();
                if (diem < 0 || diem > 10) {
                    System.out.println("Điểm không hợp lệ, giá trị phải nằm trong khoảng từ 0-10 !!!");
                }
            } else {
                System.out.println("Dữ liệu không hợp lệ, hãy nhập lại!!!");
                sc.next();
            }
        }
        return diem;
    }

    public static int nhapSoNguyen() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print("\nNhập giá trị nguyên: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                valid = true;
            } else {
                System.out.println("Dữ liệu không hợp lệ, hãy nhập lại!!!");
                sc.next();
            }
        }
        return n;
    }

    public static int nhapTuoi() {
        Scanner sc = new Scanner(System.in);
        int tuoi = -1;
        while (tuoi < 0 || tuoi > 150) {
            System.out.print("\nNhập tuổi (0-150): ");
            if (sc.hasNextInt()) {
                tuoi = sc.nextInt();
                if (tuoi < 0 || tuoi > 150) {
                    System.out.println("Tuổi không hợp lệ, giá trị phải nằm trong khoảng từ 0-150 !!!");
                }
            } else {
                System.out.println("Dữ liệu không hợp lệ, hãy nhập lại!!!");
                sc.next();
            }
        }
        return tuoi;
    }

    public static void main(String[] args) {
        hienThiGiaTri(10);
        nhapDiem();
        nhapSoNguyen();
        nhapTuoi();
    }
}