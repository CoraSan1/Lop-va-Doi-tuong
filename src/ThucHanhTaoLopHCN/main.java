package ThucHanhTaoLopHCN;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap chieu rong:");
        double width = sc.nextDouble();
        System.out.println("Nhap chieu dai:");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("hinh chu nhat co " + rectangle.display());
        System.out.println("chu vi hinh chu nhat la " + rectangle.chuvi());
        System.out.println("dien tich hinh chu nhat la " + rectangle.dientich());
    }



}
