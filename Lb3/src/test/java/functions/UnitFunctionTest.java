package functions;
import junit.framework.Assert;
import org.testng.annotations.Test;
public class UnitFunctionTest{
    MathFunction test1 = new UnitFunction();
    @Test
    public void testEquals(){
        Assert.assertEquals(1.0    , test1.apply(4));
        Assert.assertEquals(1.0    , test1.apply(-5));
        Assert.assertEquals(1.0    , test1.apply(4.3556));
        Assert.assertEquals(1.0    , test1.apply(0));
    }
}