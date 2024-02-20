package functions;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class SqrFunctionTest {
    MathFunction test1 = new SqrFunction();
    @Test
    public void testEquals(){
        Assert.assertEquals(16.0    , test1.apply(4));
    }
}