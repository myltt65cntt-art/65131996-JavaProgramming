package com.a65131996.th1.THNXCB;
import java.util.Scanner;
public class TheTichKhoiLapPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh của khối lập phương: ");
        double canh = sc.nextDouble();
        double theTich = canh * canh * canh;
        System.out.println("Thể tích khối lập phương là: " + theTich);
        sc.close();
    }
}

