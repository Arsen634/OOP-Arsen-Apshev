package functions;

import junit.framework.Assert;

class MathFunctionTest {
    IdentityFunction test_1 = new IdentityFunction();

    public void testEquals(){
        Assert.assertEquals(11.0    , test_1.apply(11));
    }
}