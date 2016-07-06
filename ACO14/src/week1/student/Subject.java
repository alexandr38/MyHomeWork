package week1.student;

/**
 * Created by Agryzkov on 05.07.2016.
 */
public class Subject {

    /*
    *   ���
   	*	���������� ����� � ��������
  	*	���������� ������������� ����� ���������
  	*	������ �������� �� �������
  	* ������:
    *		����� �������
    *		�������� ���������� � ��������
    *		�������� ������ �������� �� �������
	*/
    String name;
    int numOfHoursPerSemester;
    int usedHoursBySubject;
    int evaluationBySubject;

    // init subject
    public void initSubject(String name, int numOfHoursPerSemester) {
        this.name = name;
        this.numOfHoursPerSemester = numOfHoursPerSemester;
    }

    // set evaluation by subject
    public void setEvaluationBySubject(int evaluationBySubject) {
        this.evaluationBySubject = evaluationBySubject;
    }

    // show information by subject as string
    public String showInfBySubjAsString() {
        String result = String.format("name of subject: %s \t numOfHoursPerSemester: %d \t " +
                "usedHoursBySubject: %d \t evaluationBySubject: %d ;\n", name, numOfHoursPerSemester, usedHoursBySubject, evaluationBySubject);
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
