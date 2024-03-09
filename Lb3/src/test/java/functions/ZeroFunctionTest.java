package functions;

import junit.framework.Assert;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ZeroFunctionTest {
    MathFunction test1 = new ZeroFunction();
    @Test
    public void testEquals(){
        Assert.assertEquals(0.0    , test1.apply(4));
        Assert.assertEquals(0.0    , test1.apply(-8));
        Assert.assertEquals(0.0    , test1.apply(6.859));
        Assert.assertEquals(0.0    , test1.apply(0));
    }
}