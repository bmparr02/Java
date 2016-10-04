
package cecs220_a3_p5;

public class CourseMain
{
    public static void main(String[] args) 
    {
        Course course = new Course("Underwater Basket Weaving");
        course.addStudents(new Student("Bill", 89.5));
        course.addStudents(new Student("Sarah", 91.2));
        course.addStudents(new Student("Jimmy", 88.4));
        course.roll();
        course.average();
    }

}

