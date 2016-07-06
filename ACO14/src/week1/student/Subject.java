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

    // init subject
    public void initSubject(String name, int numOfHoursPerSemester) {
        this.name = name;
        this.numOfHoursPerSemester = numOfHoursPerSemester;
        this.usedHoursBySubject = 0;
        this.evaluationBySubject = 0;

    }

    // set evaluation by subject
    public void setEvaluationBySubject(int evaluationBySubject) {
        this.evaluationBySubject = evaluationBySubject;
    }

    // show information by subject as string
    public String showInfBySubjAsString() {
        String result = String.format("name of subject: %15s \t numOfHoursPerSemester: %4d \t " +
                "usedHoursBySubject: %4d \t evaluationBySubject: %4d ;\n", name, numOfHoursPerSemester, usedHoursBySubject, evaluationBySubject);
        return result;
    }

    // get evaluation by subject
    public int getEvaluationBySubject() {
        return evaluationBySubject;
    }

    // name of subject
    public String getSubjName() {
        return name;
    }

    // get used hours by subject
    public int getUsedHoursBySubject() {
        return usedHoursBySubject;
    }

    // set used hours by subject
    public void setUsedHoursBySubject(int usedHoursBySubject) {
        this.usedHoursBySubject = usedHoursBySubject;
    }

}
