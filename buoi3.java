package buoi3
public class anhdung
{
    public static String gioiTinh(boolean gioiTinh)
    {
        return gioiTinh ? "Nam" : "Nữ";
    }

    //
    public static void main (String[] args)
    {
        int maSinhVien = 107790, tuoi = 18;
        String hoVaTen = "Tran Anh Dung", ngaySinh = "29/10/2006", lop = "IT24A", diaChi = " Hue ", khoa = "CNTT";
        boolean gioiTinh = true; // true: Nam, false: Nu

        System.out.println("-----THÔNG TIN SINH VIÊN-----");
        System.out.println("Ma so sinh vien: " + maSinhVien);
        System.out.println("Ho va ten: " + hoVaTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Gioi tinh: " + gioiTinh(gioiTinh));
        System.out.println("Lop: " + lop);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Khoa: " + khoa);
        System.out.println("-------------Hết-------------");
    }

    
}