package Exercise;

public class Point {
    private int _x, _y;

    public Point() {
        this._x = 1;
        this._y = 1;
    }

    public Point(int x) {
        this._x = x;

    }

    public Point(int x, int y) {
        this._x = x;
        this._y = y;
    }

    public int get_x() {
        return _x;
    }

    public int get_y() {
        return _y;
    }
//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("Diem{");
//        sb.append("x=").append(x);
//        sb.append(", y=").append(y);
//        sb.append('}');
//        return sb.toString();
//    }

//    public static Point parseFromString(String str) {
//        String[] parts = str.split(",");
//        Point ret = new Point();
//        ret.x = Integer.parseInt(parts[0]);
//        ret.y = Integer.parseInt(parts[1]);
//        return ret;
//    }

    public double distance(Point another) {
        double dx = another._x - this._x;
        double dy = another._y - this._y;
        return Math.sqrt(dx * dx + dy * dy);
    }


}
