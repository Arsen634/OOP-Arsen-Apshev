package functions;
import java.lang.Math;
public class SqrFunction implements MathFunction {
    public double apply(double x)
    {
        return Math.pow(2,x);
    }
}