package july.pace;

import com.google.common.annotations.GwtCompatible;
import com.google.common.math.BigIntegerMath;
import junit.framework.TestCase;

import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * Created on 2020/6/22
 *
 * @author xingxing.zhong
 */
@GwtCompatible(emulated = true)
public class SimpleBigIntegerTester extends TestCase {

    public void testSimpleCeilingPowerOfTwo() {
        BigInteger ofTwo = BigIntegerMath.ceilingPowerOfTwo(new BigInteger("3000"));
        assertEquals(ofTwo, new BigInteger("4096"));

        System.out.println(BigIntegerMath.ceilingPowerOfTwo(new BigInteger("3")));
        System.out.println(BigIntegerMath.floorPowerOfTwo(new BigInteger("3")));
        System.out.println(BigIntegerMath.floorPowerOfTwo(new BigInteger("3000")));//2048
    }

    public void testBit() {
        System.out.println(BigIntegerMath.log2(new BigInteger("3"), RoundingMode.CEILING));//向上取整
        System.out.println(BigIntegerMath.log2(new BigInteger("3000"), RoundingMode.CEILING));
        System.out.println(0 | 1 << 2);
    }

    public void testTry() {
        try {
            System.out.println("try");
            return;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("exception");
        } finally {
            System.out.println("finally");
        }
    }
}
