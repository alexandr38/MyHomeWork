package week1.student;

/**
 * Created by Agryzkov on 05.07.2016.
 */
public class Student {

    /*
    *  поля:
    *		Имя
    *		Адрес
    *		Предметы
    *	методы:
    *		учиться
    *		добавить предмет
    *		удалить предмет из списка последний
    *		показать всю информацию о предметах
    *		получить средний бал за все предметы
    */

    String name;
    String adress;
    SubjectList subjectList;

    public void initStudent(String name, String adress) {
        this.name = name;
        this.adress = adress;
        this.subjectList = new SubjectList();
    }

    // add subject
    public void addSubjectToStudent (String name, int hour) {
        Subject newSubj = new Subject();
        newSubj.initSubject(name, hour);
        this.subjectList.addSubjectToList(newSubj);
    }

    // delete last subj from list
    public void delLastSubjectFromStudent() {
        this.subjectList.deleteSubjectFromList();
    }

    // show inf for student subjects as string
    public String showAllStudentSubjAsString () {
        return subjectList.subjectListAsString();
    }

    // average score of the subjects
    public float averageScoreOfStudentSubj() {
       return this.subjectList.getAverageScoreFromSubjList();
    }

    // training
    public void trainingOfStudent ( String nameOfSubject, int hourOfTrain ) {
        int indexSubj = this.subjectList.findSubjByName(nameOfSubject);
        if (indexSubj == -1) {
            System.out.println("subject not found!");
        } else {
            Subject findSubj = this.subjectList.getSubjByIndex(indexSubj);
            findSubj.setUsedHoursBySubject(hourOfTrain);
            this.subjectList.setSubjByIndex(findSubj, indexSubj);
        }
    }
}
