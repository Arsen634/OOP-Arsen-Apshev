package functions;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class ConstantFunctionTest {
    MathFunction test1 = new ConstantFunction(2.64);
    @Test
    public void testEquals(){
        Assert.assertEquals(2.64    , test1.apply(15));
        Assert.assertEquals(2.64    , test1.apply(154));
        Assert.assertEquals(2.64    , test1.apply(6555));
        Assert.assertEquals(2.64    , test1.apply(-7));
    }
}