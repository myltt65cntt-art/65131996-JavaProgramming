package com.a65131996.th1.Bai3;
import java.util.Scanner;
public class TinhTienDien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số điện (kWh): ");
        int soDien = sc.nextInt();
        double tienDien;
        if (soDien <= 50) {
            tienDien = soDien * 1678;
        } else if (soDien <= 100) {
            tienDien = 50 * 1678
                    + (soDien - 50) * 1734;
        } else if (soDien <= 200) {
            tienDien = 50 * 1678
                    + 50 * 1734
                    + (soDien - 100) * 2014;
        } else if (soDien <= 300) {
            tienDien = 50 * 1678
                    + 50 * 1734
                    + 100 * 2014
                    + (soDien - 200) * 2536;
        } else {
            tienDien = 50 * 1678
                    + 50 * 1734
                    + 100 * 2014
                    + 100 * 2536
                    + (soDien - 300) * 2834;
        }
        System.out.println("Số điện đã dùng: " + soDien + " kWh");
        System.out.println("Tiền điện phải trả: " + tienDien + " đồng");

        sc.close();
    }
}
