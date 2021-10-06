package Exercise;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    //Triangle- tam giác thường
    Triangle tg = new Triangle(new Point(0, 1), new Point(5, 2), new Point(4, 0));
    //right triangle- tam giác vuông
    Triangle tgv = new Triangle(new Point(0, 0), new Point(0, 3), new Point(4, 0));
    //isosceles right triangle- tam giác vuông cân
    Triangle tgvc = new Triangle(new Point(0, 0), new Point(0, 1), new Point(1, 0));
    //isosceles triangle- tam giác cân*
    Triangle tgc = new Triangle(new Point(3, 2), new Point(0, 2), new Point(0, 3));
    // equilateral triangle-Tam giác deu* (toa do chua dung)
    Triangle tgd = new Triangle(new Point(3, 2), new Point(0, 2), new Point(0, 3));
    //Khong phai tam giac
    Triangle ktg = new Triangle(new Point(0, 0), new Point(1, 1), new Point(1, 1));


    @Test
    @DisplayName("Calculate Perimeter triangle")
    void calculatePerimeterTriangle() {
        double actual = Triangle.calPerimeter(tg);
        double expected = 11.458193116710234;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Calculate Perimeter right triangle")
    void calculatePerimeterRightangledTriangle() {
        double actual = Triangle.calPerimeter(tgv);
        double expected = 12d;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Calculate Permeter isosceles right Triangle")
    void calculatePermeterIsoscelesRightTriangle() {
        double actual = Triangle.calPerimeter(tgvc);
        double expected = 3.414213562373095;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Calculate Permeter isosceles triangle ")
    void calculatePermeterIsoscelesTriangle() {
        double actual = Triangle.calPerimeter(tgc);
        double expected = 7.16227766016838;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Calculate Perimeter Equilateral triangle")
    void calculatePerimeterEquilateralTriangle() {
        double actual = Triangle.calPerimeter(tgd);
        double expected = 7.16227766016838;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Calculate area triangle")
    void calculateAreaTriangle() {
        double actual = Triangle.calArea(tg);
        double expected = 4.499999999999998;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Calculate area right-angled triangle")
    void calculateAreaRightangledTriangle() {
        double actual = Triangle.calArea(tgv);
        double expected = 6d;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Calculate area isosceles right Triangle")
    void calculateAreaIsoscelesRightTriangle() {
        double actual = Triangle.calArea(tgvc);
        double expected = 0.49999999999999983;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Calculate Area isosceles triangle")
    void calculateAreaIsoscelesTriangle() {
        double actual = Triangle.calArea(tgc);
        double expected = 1.5000000000000007;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Calculate Area equilateraltriangle")
    void calculateAreaEquilateralTriangle() {
        double actual = Triangle.calArea(tgc);
        double expected = 1.5000000000000007;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Not Triangle Permater")
    void notTrianglePermater() {
        double actual = Triangle.calArea(ktg);
        double expected = -1d;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Not Triangle Area ")
    void notTriangleArea() {
        double actual = Triangle.calArea(ktg);
        double expected = -1d;
        assertEquals(expected, actual);
    }
}