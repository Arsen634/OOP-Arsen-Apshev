package functions;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class SinFunctionTest {
    MathFunction test1 = new SqrFunction();
    @Test
    public void testEquals(){
        Assert.assertEquals(0.0    , test1.apply(0));
    }
}