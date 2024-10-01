import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Assert.assertFalse
import org.junit.Test
import testing.NumberUtils

class NumberUtilsTest {

    private val numberUtils = NumberUtils()

    @Test
    fun testFactorial() {
        assertEquals(1, numberUtils.factorial(0))
        assertEquals(120, numberUtils.factorial(5))
        assertEquals(720, numberUtils.factorial(6))
    }

    @Test(expected = IllegalArgumentException::class)
    fun testFactorialNegative() {
        numberUtils.factorial(-1)
    }

    @Test
    fun testFibonacci() {
        assertEquals(0, numberUtils.fibonacci(0))
        assertEquals(1, numberUtils.fibonacci(1))
        assertEquals(1, numberUtils.fibonacci(2))
        assertEquals(2, numberUtils.fibonacci(3))
        assertEquals(5, numberUtils.fibonacci(5))
    }

    @Test(expected = IllegalArgumentException::class)
    fun testFibonacciNegative() {
        numberUtils.fibonacci(-1)
    }

    @Test
    fun testIsEven() {
        assertTrue(numberUtils.isEven(4))
        assertFalse(numberUtils.isEven(5))
    }

    @Test
    fun testIsOdd() {
        assertTrue(numberUtils.isOdd(3))
        assertFalse(numberUtils.isOdd(8))
    }

    @Test
    fun testMax() {
        assertEquals(10, numberUtils.max(10, 5))
        assertEquals(5, numberUtils.max(2, 5))
    }
}