package com.a65131996.th1.Bai2;
public class BaiTapQuyDoiTienTe {
    public static void main(String[] args) {
        double soUSD = 100;
        double soEUR = 50;
        double vndFromUSD = soUSD * 23500;
        double vndFromEUR = soEUR * 27000;
        System.out.println("Số tiền USD: " + soUSD);
        System.out.println("Quy đổi sang VND: " + vndFromUSD + " đ");
        System.out.println("Số tiền EUR: " + soEUR);
        System.out.println("Quy đổi sang VND: " + vndFromEUR + " đ");
    }
}

