package Exercise;

public class AppCal {
    public static void main(String[] args) {
        Point point1=new Point(0,0);
        Point point2=new Point(0,3);
        Point point3=new Point(4,0);
//        Triangle tg=new Triangle(point1,point2,point3);
        Triangle tgvc = new Triangle(new Point(0, 0), new Point(0,1 ), new Point(1, 0));
        Triangle tgc = new Triangle(new Point(3, 2), new Point(0, 3), new Point(0, 3));
        Triangle tg = new Triangle(new Point(0, 1), new Point(5, 2), new Point(4, 0));
        Triangle tgd = new Triangle(new Point(3, 2), new Point(0, 2), new Point(0, 3));
        System.out.println(Triangle.calPerimeter(tgd));
        System.out.println(Triangle.calArea(tgd));
    }
}
