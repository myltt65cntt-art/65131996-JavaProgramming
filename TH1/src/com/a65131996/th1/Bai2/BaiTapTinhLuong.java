package com.a65131996.th1.Bai2;
import java.util.Scanner;
public class BaiTapTinhLuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số giờ làm: ");
        int soGioLam = sc.nextInt();
        System.out.print("Nhập lương theo giờ: ");
        double luongGio = sc.nextDouble();
        double tongLuong = 0;
        if (soGioLam <= 40) {
            tongLuong = soGioLam * luongGio;
        } else {
            tongLuong = 40 * luongGio
                    + (soGioLam - 40) * luongGio * 1.5;
        }
        System.out.println("Số giờ làm: " + soGioLam);
        System.out.println("Lương theo giờ: " + luongGio);
        System.out.println("Tổng lương: " + tongLuong + " đồng");
        sc.close();
    }
}

