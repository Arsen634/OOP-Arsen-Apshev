package functions;

import junit.framework.Assert;
import org.testng.annotations.Test;
public class IdentityFunctionTest {
    MathFunction test1 = new IdentityFunction();
    @Test
    public void testEquals(){
        Assert.assertEquals(15.0    , test1.apply(15));
        Assert.assertEquals(3.0    , test1.apply(3));
        Assert.assertEquals(1.0    , test1.apply(1));
        Assert.assertEquals(-15.0    , test1.apply(-15));
    }
}