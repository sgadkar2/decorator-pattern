package assignment02;

public class Test {
    
    public static void main(String[] args){

        Person person = new Person("Samsher", "09/29/2023");

        AbstractStudent student = new ConcreteStudent(person);

        System.out.println(student.getCourses());
        System.out.println(student.getCourseList());

        student = new CourseDecorator(student, "CS", "542", "Design Patterns", 3, "01", "IP");
        student = new CourseDecorator(student, "CS", "552", "Intro to Cloud Computing", 3, "01", "IP");
        student = new CourseDecorator(student, "CS", "558", "Intro to Computer Security", 3, "01", "IP");

        System.out.println(student.getCourses());
        System.out.println(student.getCourseList());

        student.setGrade("CS", "542", "01", "A");

        System.out.println(student.getCourses());
        System.out.println(student.getCourseList());

    }
}
