package week1.student;

/**
 * Created by Agryzkov on 06.07.2016.
 */
public class TestStudent {

    public static void main(String[] args) {

        // create student
        Student student = new Student();
        student.initStudent("colobok", "ukraine");

        // add subject to student, start list[5]
        student.addSubjectToStudent("mathematica",20);
        student.addSubjectToStudent("fisics",10);
        student.addSubjectToStudent("himia", 15);
        student.addSubjectToStudent("history",5);
        student.addSubjectToStudent("english",30);
        student.addSubjectToStudent("capital",25);

        // show info for all subject
        System.out.println(student.showAllStudentSubjAsString());

        // delete last subject
        student.delLastSubjectFromStudent();

        // control of delete
        System.out.println(student.showAllStudentSubjAsString());

        // training student
        student.trainingOfStudent("english", 5);
        student.trainingOfStudent("mathematica", 5);

        // control of training
        System.out.println(student.showAllStudentSubjAsString());

    }
}
