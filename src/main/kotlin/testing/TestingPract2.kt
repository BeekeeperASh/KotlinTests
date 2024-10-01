package testing

class NumberUtils {

    // Вычислить факториал
    fun factorial(n: Int): Int {
        if (n < 0) throw IllegalArgumentException("Факториал не определен для отрицательных чисел")
        return if (n == 0) 1 else n * factorial(n - 1)
    }

    // Вычислить n-е число Фибоначчи
    fun fibonacci(n: Int): Int {
        if (n < 0) throw IllegalArgumentException("Число Фибоначчи не определено для отрицательных чисел")
        return when (n) {
            0 -> 0
            1 -> 1
            else -> fibonacci(n - 1) + fibonacci(n - 2)
        }
    }

    // Проверка на четность
    fun isEven(n: Int): Boolean {
        return n % 2 == 0
    }

    // Проверка на нечетность
    fun isOdd(n: Int): Boolean {
        return n % 2 != 0
    }

    // Нахождение максимального из двух чисел
    fun max(a: Int, b: Int): Int {
        return if (a > b) a else b
    }
}

//if (n < 0) throw IllegalArgumentException("Факториал не определен для отрицательных чисел")
//if (n < 0) throw IllegalArgumentException("Число Фибоначчи не определено для отрицательных чисел")
