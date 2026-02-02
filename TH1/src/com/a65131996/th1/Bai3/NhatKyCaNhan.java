package com.a65131996.th1.Bai3;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class NhatKyCaNhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("=== NHẬT KÝ CÁ NHÂN ===");
        System.out.println("1. Ghi nhật ký");
        System.out.println("2. Đọc nhật ký");
        System.out.print("Chọn chức năng: ");
        choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            try {
                FileWriter writer = new FileWriter("nhatky.txt", true);
                System.out.print("Nhập nội dung nhật ký: ");
                String noiDung = sc.nextLine();
                writer.write(noiDung + "\n");
                writer.close();
                System.out.println(" Đã ghi nhật ký!");
            } catch (IOException e) {
                System.out.println(" Lỗi khi ghi file!");
            }
        } else if (choice == 2) {
            try {
                FileReader reader = new FileReader("nhatky.txt");
                int ch;
                System.out.println("NỘI DUNG NHẬT KÝ:");
                while ((ch = reader.read()) != -1) {
                    System.out.print((char) ch);
                }
                reader.close();
            } catch (IOException e) {
                System.out.println(" Không đọc được file!");
            }
        } else {
            System.out.println(" file không hợp lệ!");
        }

        sc.close();
    }
}