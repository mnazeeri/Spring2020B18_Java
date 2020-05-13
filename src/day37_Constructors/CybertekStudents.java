package day37_Constructors;

public class CybertekStudents {

    static String schoolName;
    String studentName; // we must know these
    int groupNumber; // we must know these
    String batch; // we must know these

    public CybertekStudents (String studentName, int groupNumber, String batch){
        schoolName = "Cybertek University";
        this.studentName = studentName;
        this.groupNumber = groupNumber;
        this.batch = batch;
    }

    public String toString(){
        return "Name: "+studentName+", Batch: "+batch+", in Group: "+groupNumber+", School Name: "+schoolName;

    }
}

class CObject{

public static void main(String[]args){

    CybertekStudents student1 = new CybertekStudents("Murtaza", 10, "Batch 18");

    System.out.println(student1);

    CybertekStudents student2 = new CybertekStudents("Messi", 18, "Batch 15");
    System.out.println(student2);

        }
        }
