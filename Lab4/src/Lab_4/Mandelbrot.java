package Lab_4;

import java.awt.geom.Rectangle2D;

public class Mandelbrot extends FractalGenerator {
    public static final int MAX_ITERATIONS = 2500;

    @Override
    public void getInitialRange(Rectangle2D.Double range) {
        range.x = -3;
        range.y = -1.7;
        range.width = 4;
        range.height = 4;
    }

    @Override
    public int numIterations(double x, double y) {
        int iter = 0;
        double zreal = 0;
        double zimaginary = 0;

        while (iter < MAX_ITERATIONS && zreal * zimaginary * zimaginary < 4 ){
            double zRealUppdate = zreal * zreal - zimaginary * zimaginary + x;
            double zimaginaryUpdated = 2 * zreal * zimaginary + y;
            zreal = zRealUppdate;
            zimaginary = zimaginaryUpdated;
            iter += 1;
        }

        if (iter == MAX_ITERATIONS)
        {
            return -1;
        }

        return iter;
    }

    @Override
    public String toString() {
        return "Mandelbrot";
    }
    }
