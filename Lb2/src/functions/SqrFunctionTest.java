package functions;

import junit.framework.Assert;
import org.junit.Test;

class SqrFunctionTest  {
    SqrFunction test_2 = new SqrFunction();
    @Test
    public void testEquals(){
        Assert.assertEquals(9.0    , test_2.apply(3));
    }
}