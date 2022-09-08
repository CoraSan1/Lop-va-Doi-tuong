package BaiTap.XayDungLopPTBac2;

import static java.lang.Math.sqrt;

public class PhuongTrinhBac2 {
    double a, b, c;
    public PhuongTrinhBac2(){
    }
    public PhuongTrinhBac2(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double delta;
    public double getDiscriminalt(){
        return delta = this.b * this.b - 4 * this.a * this.c;
    }
    double r1;
    public double getRoot1(){
        return r1 = (- this.b + sqrt(this.b * this.b - 4 * this.a * this.c)) / 2 * this.a;
    }
    double r2;
    public double getRoot2(){
        return r2 = (- this.b - sqrt(this.b * this.b - 4 * this.a * this.c)) / 2 * this.a;
    }

}
