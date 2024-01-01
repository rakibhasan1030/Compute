# Compute [![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://github.com/rakibhasan1030/Compute/blob/master/LICENSE) [![](https://jitpack.io/v/rakibhasan1030/Compute.svg)](https://jitpack.io/#rakibhasan1030/Compute)

The `Compute` library is a lightweight and versatile Kotlin utility for performing common mathematical operations. It provides a simple and intuitive interface through the `Calculator` class, allowing developers to easily handle addition, subtraction, multiplication, and division of numeric values.

## 🔑 Key Features:
 - Addition: Perform addition of two numbers with ease.
 - Subtraction: Calculate the difference between two numbers effortlessly.
 - Multiplication: Multiply numeric values effortlessly.
 - Division: Safely handle division with built-in checks for dividing by zero.


## 🛠️ Installation

Compute is installed by adding the following dependency to your `build.gradle` file:
```kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}
```

#### Gradle Groovy DSL
```groovy
dependencies {
  implementation 'com.github.rakibhasan1030:Compute:1.0.0'
}
```

#### Gradle Kotlin DSL
```kotlin
dependencies {
  implementation("com.github.rakibhasan1030:Compute:1.0.0")
}
```

#### Apache Maven
Add the following dependency to your `build.gradle` file:
```kotlin
<repositories>
    <repository>
        <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
</repositories>
```
#### Add the dependency
```kotlin
<dependency>
    <groupId>com.github.rakibhasan1030</groupId>
        <artifactId>Compute</artifactId>
    <version>1.0.0</version>
</dependency>
```


## ⚙️ Usage 
To get started with Compute, just invoke the Calculator class and tailor its functionality to suit your requirements.<br>Example:
```kotlin
import rakib.hasan.compute.Calculator

fun main() {
    // Example usage of the Calculator class
    try {
        // Add two numbers
        val sum = Calculator.add(5.0, 3.0)
        println("Sum: $sum")

        // Subtract two numbers
        val difference = Calculator.subtract(8.0, 4.0)
        println("Difference: $difference")

        // Multiply two numbers
        val product = Calculator.multiply(2.0, 6.0)
        println("Product: $product")

        // Divide two numbers
        val quotient = Calculator.divide(10.0, 2.0)
        println("Quotient: $quotient")
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}
```


## ✍️ Authors
- [Rakib Hasan](https://www.github.com/rakibhasan1030)


## 🌱 Contributions
Contributions are always welcome!


## 🛡️ License
    MIT License

    Copyright (c) 2023 Rakib Hasan

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
      SOFTWARE.

