package week1.student;

/**
 * Created by Agryzkov on 06.07.2016.
 */
public class TestSubject {

    public static void main(String[] args) {

        // create subject
        Subject subject = new Subject();
        subject.initSubject("fisica", 20);

        // print info
        System.out.println(subject.showInfBySubjAsString());


        // exam || set
        subject.setEvaluationBySubject(5);
        System.out.println(subject.showInfBySubjAsString());



    }
}
