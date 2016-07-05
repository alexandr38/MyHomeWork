package week1.student;

/**
 * Created by Agryzkov on 05.07.2016.
 */
public class Subject {

    /*
    *   имя
   	*	количество часов в семестре
  	*	количество проработанных часов студентом
  	*	оценка студента за предмет
  	* методы:
    *		сдать экзамен
    *		показать информацию о предмете
    *		получить оценку студента за предмет
	*/
    String name;
    int numOfHoursPerSemester;
    int usedHoursBySubject;
    int evaluationBySubject;

    // pass the exam
    private void passExam(int evaluationBySubject) {
        this.evaluationBySubject = evaluationBySubject;
    }

    // show information by subject
    private void showInfBySubj() {
        String result = String.format("name of subject: %s \t numOfHoursPerSemester: %d \t " +
                "usedHoursBySubject: %d \t evaluationBySubject: %d ;\n", name, numOfHoursPerSemester, usedHoursBySubject, evaluationBySubject);
        System.out.println( result );
    }

}
