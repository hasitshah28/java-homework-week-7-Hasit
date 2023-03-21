package javahomework;

/**
 *
 */
public class Pr15_WallArea {
    double width;
    double height;

    public Pr15_WallArea() {

    }
    public Pr15_WallArea(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width =0;
        } else{
            this.width = width;
        }

    }
    public void setHeight(double height) {
        if (height < 0) {
            this.height =0;
        } else{
            this.height =height;
        }
    }

    public double getArea(){
        double area =this.width* this.height;
        return area;

    }

    public static void main(String[] args) {
        Pr15_WallArea wall = new Pr15_WallArea(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }

}
