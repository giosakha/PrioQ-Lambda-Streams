package finkhalas;
//without Lambda
@FunctionalInterface
interface Drawable {
    void draw();
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        int width = 10;
        // with lambda
        Drawable d2 = () -> System.out.println("Drawing " + width);
        d2.draw();
    }
}
//single param 
interface Sayable {
    String say(String name);
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        // Lambda expression with single parameter.
        Sayable s1 = (name) -> {
            return "Hello, " + name;
        };
        System.out.println(s1.say("Sonoo"));

        // You can omit function parentheses
        Sayable s2 = name -> {
            return "Hello, " + name;
        };
        System.out.println(s2.say("Sonoo"));
    }
}
//multiple parameter 
interface Addable {
    int add(int a, int b);
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        // Multiple parameters in lambda expression
        Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10, 20));

        // Multiple parameters with data type in lambda expression
        Addable ad2 = (int a, int b) -> (a + b);
        System.out.println(ad2.add(100, 200));
    }
}
// with or w/out return keyword 
interface Addable {
    int add(int a, int b);
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        // Lambda expression without return keyword.
        Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10, 20));

        // Lambda expression with return keyword.
        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad2.add(100, 200));
    }
}
//For each loop
import java.util.*;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        list.forEach((n) -> System.out.println(n));
    }
}
//Multiple statements 
interface Sayable {
    String say(String message);
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        // You can pass multiple statements in lambda expression
        Sayable person = (message) -> {
            String str1 = "I would like to say, ";
            String str2 = str1 + message;
            return str2;
        };
        System.out.println(person.say("time is precious."));
    }
}
//Comparator
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();
        
        // Adding Products
        list.add(new Product(1, "HP Laptop", 25000f));
        list.add(new Product(2, "Dell Mouse", 1500f));
        
        System.out.println("Sorting on the basis of name...");
        Collections.sort(list, (p1, p2) -> p1.name.compareTo(p2.name));

        for (Product p : list) {
            System.out.println(p.id + " " + p.name + " " + p.price);
        }
    }
}
//reverse a string 
interface MyInterface {
    // abstract method
    String reverse(String n);
}

public class Main {
    public static void main(String[] args) {
        // declare a reference to MyInterface
        // assign a lambda expression to the reference
        MyInterface ref = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        // call the method of the interface
        System.out.println("Lambda reversed = " + ref.reverse("Lambda"));
    }
}
//sorting with lambda
import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    int age;
    int id;

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student [Name: " + this.getName() + ", Age: " + this.getAge() + ", Id: " + this.getId() + "]";
    }
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Kevin", 23, 2003));
        studentList.add(new Student("Lu", 1, 1113));

        System.out.println("Before Sorting the student data:");
        studentList.forEach((s) -> System.out.println(s));

        System.out.println("After Sorting the student data by Age:");
        studentList.sort((s1, s2) -> s1.getAge() - s2.getAge());
        studentList.forEach((s) -> System.out.println(s));

        System.out.println("After Sorting the student data by Name:");
        studentList.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        studentList.forEach((s) -> System.out.println(s));

        System.out.println("After Sorting the student data by Id:");
        studentList.sort((s1, s2) -> s1.getId() - s2.getId());
        studentList.forEach((s) -> System.out.println(s));
    }
}
// in reverse order , switch s1 by s2
