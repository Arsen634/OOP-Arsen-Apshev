package functions;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class RootFunctionTest {
    MathFunction test1 = new RootFunction ();
    @Test
    public void testEquals(){
        Assert.assertEquals(4.0    , test1.apply(16));
        Assert.assertEquals(12.0    , test1.apply(144));
        Assert.assertEquals(25.0    , test1.apply(625));
        Assert.assertEquals(10.0    , test1.apply(100));
    }
}