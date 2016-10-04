
package cecs220_a3_p5;

import java.util.*;


public class Course 
{

    private String name;
    private List<Student> student;

    public Course(String name) 
    {
        this.name = name;
        student = new ArrayList<Student>();
    }
 
    public void addStudents(Student students) 
    {
        student.add(students);
    }

    public void roll()
    {
        System.out.println("Course: " + name);
        System.out.println("Students:");
        for(Student students : student)
        {
            System.out.println(" " + students.getName());
        }
    
    }
    public void average()
    {
        double sum = 0.0;
        for (int i = 0; i < student.size(); i++)  
        {
            sum += student.get(i).getAvg() ; 
        }
        System.out.println("Overall Average: " + sum/student.size());
    }
    
    
}
