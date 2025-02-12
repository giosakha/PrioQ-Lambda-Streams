	package finkhalas;
import java.util.*;
//prioQ custom Comparator

	public class CreatePriorityQueueExample {
	    public static void main(String[] args) {
	        // A custom comparator that compares two Strings by their length.
	        Comparator<String> stringLengthComparator = new Comparator<String>() {
	            @Override
	            public int compare(String s1, String s2) {
	                return s1.length() - s2.length();
	            }
	        };

	        // Create a Priority Queue with a custom Comparator
	        PriorityQueue<String> namePriorityQueue = new PriorityQueue<>(stringLengthComparator);

	        // Add items to a Priority Queue (ENQUEUE)
	        namePriorityQueue.add("Lisa");
	        namePriorityQueue.add("Robert");
	        namePriorityQueue.add("John");
	        namePriorityQueue.add("Chris");
	        namePriorityQueue.add("Angelina");
	        namePriorityQueue.add("Joe");

	        // Remove items from the Priority Queue (DEQUEUE)
	        while (!namePriorityQueue.isEmpty()) {
	            System.out.println(namePriorityQueue.remove());
	        }
	    }
	}
	
/////////////////
	class Employee implements Comparable<Employee> {
	    private String name;
	    private double salary;

	    public Employee(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    @Override
	    public String toString() {
	        return "Employee{" +
	                "name='" + name + '\'' +
	                ", salary=" + salary +
	                '}';
	    }

	    // Compare two employee objects by their salary
	    @Override
	    public int compareTo(Employee employee) {
	        if (this.getSalary() > employee.getSalary()) {
	            return 1;
	        } else if (this.getSalary() < employee.getSalary()) {
	            return -1;
	        } else {
	            return 0;
	        }
	    }
	}

	public class CreatePriorityQueueExample {
	    public static void main(String[] args) {
	        PriorityQueue<Employee> employeePriorityQueue = new PriorityQueue<>();
	        // Add items to the Priority Queue
	        employeePriorityQueue.add(new Employee("Rajeev", 100000.00));
	        employeePriorityQueue.add(new Employee("Chris", 145000.00));
	        employeePriorityQueue.add(new Employee("Andrea", 115000.00));
	        employeePriorityQueue.add(new Employee("Jack", 167000.00));

	        /*
	        The compareTo() method implemented in the Employee class is used to determine in what order the objects should be dequeued.
	        */
	        while (!employeePriorityQueue.isEmpty()) {
	            System.out.println(employeePriorityQueue.remove());
	        }
	    }
	}
