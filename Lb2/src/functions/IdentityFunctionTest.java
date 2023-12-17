package functions;

import junit.framework.Assert;
import org.junit.Test;

class IdentityFunctionTest {

    MathFunction test_1 = new IdentityFunction();
    @Test
    public void testEquals(){
        Assert.assertEquals(11.0    , test_1.apply(11));
    }
}