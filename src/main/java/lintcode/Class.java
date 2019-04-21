package lintcode;

class Student {
    public int id;

    public Student(int id) {
        this.id = id;
    }
}

public class Class {
    /**
     * Declare a public attribute `students` which is an array of `Student`
     * instances
     */
    // write your code here.
    public Student[] students;

    /**
     * Declare a constructor with a parameter n which is the total number of
     * students in the *class*. The constructor should create n Student
     * instances and initialized with student id from 0 ~ n-1
     */
    // write your code here
    Class(int n){
        for(int i = 0; i < n; i++){
            students[i] = new Student(i);
        }
    }

    public static void main(String[] args) {
        Class cls = new Class(5);
        System.out.println(cls.students[1]);
    }
}
