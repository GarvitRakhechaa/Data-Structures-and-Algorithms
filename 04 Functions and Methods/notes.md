Bilkul! Chalo ek-ek karke **har point** ko **detail me samjhte hain**, taaki **proper clarity** mile. 🚀  

---  

# 📌 **Methods & Functions in Java (A to Z) - With Full Explanation**  

## **🔥 1. Method Definition in Java**  
Java me **function ko method kehte hain**, aur ye **class ke andar likha jata hai**.  
Method **reusable code** hota hai jo baar-baar execute ho sakta hai.  

### ✅ **Example (Simple Method)**  
```java
public class Main {
    static void sayHello() {  // Method Definition
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        sayHello();  // Method Call
    }
}
```
✅ **Output:**  
```
Hello, World!
```
📌 **Samajhne ki Baat:**  
- `sayHello()` ek **method** hai jo **Hello, World! print karta hai**.  
- `main()` method ke andar **method call kiya** gaya (`sayHello();`).  

---  

## **📌 2. Method Types in Java**  

Java me **2 types ke methods** hote hain:  

### ✅ **(i) Predefined Methods (Built-in)**
👉 Java me **pehle se diye gaye methods**, jaise `Math.max()`, `String.length()`.  

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(Math.max(10, 20));  // 20
        System.out.println("Hello".length());  // 5
    }
}
```
✅ **Output:**  
```
20  
5
```
📌 **Samajhne ki Baat:**  
- `Math.max(10, 20)` → Maximum number return karega (20).  
- `"Hello".length()` → String ka length return karega (5).  

---

### ✅ **(ii) User-Defined Methods**
👉 Hum **apne custom methods** bhi bana sakte hain.  

```java
public class Main {
    static void greet() {
        System.out.println("Good Morning!");
    }

    public static void main(String[] args) {
        greet();  // Method call
    }
}
```
✅ **Output:**  
```
Good Morning!
```
📌 **Samajhne ki Baat:**  
- `greet()` method **Good Morning print karta hai**.  
- `main()` method ke andar isko **call kiya gaya**.  

---

## **📌 3. Method with Parameters & Return Type**  

### ✅ **(i) Method with Parameters**
👉 Method **arguments accept** karke kaam kar sakta hai.  

```java
public class Main {
    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        greet("Alice");
        greet("Bob");
    }
}
```
✅ **Output:**  
```
Hello, Alice!  
Hello, Bob!
```
📌 **Samajhne ki Baat:**  
- `greet(String name)` method me ek **parameter** hai (`name`).  
- Jab method **call hota hai**, tab `"Alice"` aur `"Bob"` pass kiya jata hai.  

---

### ✅ **(ii) Method with Return Type**
👉 Agar method **koi value return** kare, to **return type specify karna zaroori hota hai**.  

```java
public class Main {
    static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        int result = square(5);
        System.out.println("Square: " + result);
    }
}
```
✅ **Output:**  
```
Square: 25
```
📌 **Samajhne ki Baat:**  
- `square(int num)` method ek **integer return karta hai** (`num * num`).  
- `main()` me method call hua, aur **result variable me store** kiya gaya.  

---

## **📌 4. Method Overloading (Same Name, Different Parameters)**  

Agar ek hi class me **same naam ke multiple methods** ho, par **alag-alag parameters** ho, to ise **method overloading** kehte hain.  

```java
public class Main {
    static void print(int num) {
        System.out.println("Integer: " + num);
    }

    static void print(String text) {
        System.out.println("String: " + text);
    }

    public static void main(String[] args) {
        print(10);
        print("Hello");
    }
}
```
✅ **Output:**  
```
Integer: 10  
String: Hello
```
📌 **Samajhne ki Baat:**  
- `print(int num)` → Integer leta hai.  
- `print(String text)` → String leta hai.  
- Java **automatically decide karta hai** kaunsa method call hoga.  

---

## **📌 5. Method Overriding (Same Name, Different Behavior in Subclass)**  
Agar **parent class** ka method **child class** me redefine kiya jaye, to **method overriding** hoti hai.  

```java
class Parent {
    void show() {
        System.out.println("Parent Class");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child Class");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();  // Child Class
    }
}
```
✅ **Output:**  
```
Child Class
```
📌 **Samajhne ki Baat:**  
- **Parent class me `show()` method hai**.  
- **Child class usko override kar raha hai** (`@Override`).  
- **Runtime pe child class ka method execute hoga** (`Child Class`).  

---

## **📌 6. Static vs Non-Static Methods**  

### ✅ **(i) Static Methods**
- **Directly class name se call kiye ja sakte hain.**  
- **Object banane ki zaroorat nahi hoti.**  

```java
public class Main {
    static void sayHello() {
        System.out.println("Hello from Static Method!");
    }

    public static void main(String[] args) {
        sayHello();  // Static method call
    }
}
```

---

### ✅ **(ii) Non-Static Methods**
- **Object banakar call karna padta hai.**  

```java
public class Main {
    void show() {
        System.out.println("Hello from Non-Static Method!");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.show();  // Non-static method call
    }
}
```

---

## **📌 7. Recursive Methods (Method Calling Itself)**  
Agar method **khud ko call kare**, to use **recursion** kehte hain.  

```java
public class Main {
    static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));  // 120
    }
}
```

---

## **🔥 Summary (Methods in Java at a Glance)**  
| **Concept** | **Description** |
|------------|---------------|
| **Predefined Methods** | Java ke built-in methods (`Math.max()`) |
| **User-Defined Methods** | Custom methods jo hum likhte hain |
| **Method Parameters** | Method arguments accept kar sakta hai |
| **Return Type** | Method result return kar sakta hai (`int`, `String`, etc.) |
| **Method Overloading** | Same method name but different parameters |
| **Method Overriding** | Subclass me method redefine karna |
| **Static Methods** | Directly class name se call hote hain |
| **Non-Static Methods** | Object banakar call karna hota hai |
| **Recursion** | Method khud ko call karta hai |

---
