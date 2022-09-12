package BaiTap.XayDungLopPTBac2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap so a = ");
        double a = sc.nextDouble();
        System.out.print("nhap so b = ");
        double b = sc.nextDouble();
        System.out.print("nhap so c = ");
        double c = sc.nextDouble();

        PhuongTrinhBac2 phuongTrinhBac2 = new PhuongTrinhBac2(a, b, c);

        if (phuongTrinhBac2.getDiscriminalt() > 0){
            System.out.println("R1 = " + phuongTrinhBac2.getRoot1());
            System.out.println("R2 = " + phuongTrinhBac2.getRoot2());
        } else if (phuongTrinhBac2.getDiscriminalt() == 0) {
            System.out.println("delta = " + phuongTrinhBac2.getDiscriminalt());
        }else {
            System.out.println("Phuong trinh vo nghiem");
        }


    }
}
