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
        System.out.println("after add 6 subjects");
        System.out.println(student.showAllStudentSubjAsString());

        // delete last subject
        student.delLastSubjectFromStudent();

        // control of delete
        System.out.println("after delete last subject");
        System.out.println(student.showAllStudentSubjAsString());

        // training student
        student.trainingOfStudent("english", 5);
        student.trainingOfStudent("mathematica", 5);

        // control of training
        System.out.println("after training");
        System.out.println(student.showAllStudentSubjAsString());

        // bad subject
        System.out.println("after bad search subject");
        student.trainingOfStudent("capital", 5);


        // exam
        Subject examSubj = new Subject();
        examSubj = student.subjectList.getSubjByIndex(3);
        examSubj.setEvaluationBySubject(5);
        student.subjectList.setSubjByIndex(examSubj,3);

        examSubj = student.subjectList.getSubjByIndex(4);
        examSubj.setEvaluationBySubject(3);
        student.subjectList.setSubjByIndex(examSubj,4);

        System.out.println("after exam");
        System.out.println(student.showAllStudentSubjAsString());


        // average score
        float averScore = student.averageScoreOfStudentSubj();
        System.out.println("average score = " + averScore);
    }
}
