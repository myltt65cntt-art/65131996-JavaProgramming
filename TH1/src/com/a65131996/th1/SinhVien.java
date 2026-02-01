package com.a65131996.th1;
import java.util.Scanner;
public class SinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ và tên sinh viên: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        double diemTB = Double.parseDouble(sc.nextLine());
        System.out.println("----- THÔNG TIN SINH VIÊN -----");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Điểm trung bình: " + diemTB);
        sc.close();
    }
}
