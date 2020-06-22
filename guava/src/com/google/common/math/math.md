# math 包源码阅读

## BigIntegerMath.java (BigInteger 算术运算类)

### 计算大于等于x的最小2次幂，BigIntegerMath#ceilingPowerOfTwo
1. 通过log2函数计算x以2为底的对数n，再用位运算 0 | 1 << n
    ```
    public static BigInteger ceilingPowerOfTwo(BigInteger x) {
            return BigInteger.ZERO.setBit(log2(x, CEILING));//最大对数
    }
    ```
   
### 计算小于等于x的最大2次幂，BigIntegerMath#floorPowerOfTwo
1. 通过log2函数计算x以2为底的对数n，再用位运算 0 | 1 << n
    ```
    public static BigInteger floorPowerOfTwo(BigInteger x) {
        return BigInteger.ZERO.setBit(log2(x, FLOOR));//最小对数
    }
    ```


