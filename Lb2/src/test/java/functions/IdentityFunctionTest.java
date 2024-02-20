package functions;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class IdentityFunctionTest {
    MathFunction test1 = new IdentityFunction();
    @Test
    public void testEquals(){
        Assert.assertEquals(15.0    , test1.apply(15));
    }
}