package ThucHanhTaoLopHCN;

public class Rectangle {
    double width, height;
    public Rectangle() {
    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double dientich(){
        return this.width * this.height;
    }
    public double chuvi(){
        return (this.width + this.height) * 2;
    }
    public String display(){
        return "Rectangle {" + "width = " + width + " height = " + height +"}";
    }

}
