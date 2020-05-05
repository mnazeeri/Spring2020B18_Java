package day34_CustomCLass;

public class Student {

    String name;
    String nationality;
    int age;
    double GPA;
    char gender;
    boolean pass;

    public void setStudentInfo(String name, String nationality, int age, double GPA, char gender, boolean pass){

        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.GPA = GPA;
        this.gender = gender;
        this.pass = pass;


    }
    public String toString(){
        return "Name: "+name+", Gender: "+gender+"nationality: "+nationality+ "Age: "+age+", pass"+pass;
    }

}
