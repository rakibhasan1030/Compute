package rakib.hasan.compute

class Calculator private constructor() {
    companion object {
        @JvmStatic
        fun add(a: Double, b: Double): Double {
            return a + b
        }

        @JvmStatic
        fun subtract(a: Double, b: Double): Double {
            return a - b
        }

        @JvmStatic
        fun multiply(a: Double, b: Double): Double {
            return a * b
        }

        @JvmStatic
        fun divide(a: Double, b: Double): Double {
            if (b != 0.0) {
                return a / b
            } else {
                throw IllegalArgumentException("Cannot divide by zero.")
            }
        }
    }
}