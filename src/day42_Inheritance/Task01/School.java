package day42_Inheritance.Task01;

import java.util.ArrayList;
import java.util.Arrays;

/*
Create a class called school
        create 3 objects of student and set their info
        create an ArrayList of student to store all student objects
        use fo reach loop to print out each students's name and studentID
 */
public class School { //School has a student

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setStudentInfo("Murtaza", 30, 'M', 12345, "Coding");
        student2.setStudentInfo("Messi", 33, 'M', 123000, "Sports" );
        student3.setStudentInfo("Mushtari", 23, 'F', 9876, "Biology");

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(student1,student2,student3));

        for(Student each : studentList){
            //System.out.println(each);

            System.out.println("Name: "+each.name+", ID: "+each.studentID);
        }
    }
}
