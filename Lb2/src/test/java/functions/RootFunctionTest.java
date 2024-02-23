package functions;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class RootFunctionTest {
    MathFunction test1 = new RootFunction ();
    @Test
    public void testEquals(){
        Assert.assertEquals(4.0    , test1.apply(16));
    }
}