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
    Subject[] subjectList = new Subject[10];
    private int indexList = 0;

    public void addSubjectToTheStudent (Subject subject ) {
        if( indexList >= subjectList.length ) {
            Subject[] temp = new Subject[ subjectList.length*2 ];
            System.arraycopy( subjectList, 0, temp, 0, subjectList.length );
            subjectList = temp;
        }
        subjectList[indexList] = subject;
        indexList ++;
    }

    // delete last subject
    public void deleteSubjectToTheStudent ( Subject[] subjectList ) {
        Subject[] temp = new Subject[ subjectList.length - 1 ];
        System.arraycopy(subjectList, 0, temp, 0, subjectList.length - 1);
        subjectList = temp;
    }

    // average score of the subject
    public float averageScoreOfSubjects ( Subject[] subjectList ) {
        float averageScore = 0;
        for ( int i = 0; i < subjectList.length; i++ ) {
            averageScore += subjectList[i].evaluationBySubject;
        }
        return averageScore/subjectList.length;
    }

    // training
    public void trainingOfStudent ( String nameOfSubject, int hourOfTrain ) {
        for ( int i = 0; i < subjectList.length; i++ ) {
            if ( subjectList[i].name.equals( nameOfSubject ) ) {
                subjectList[i].usedHoursBySubject += hourOfTrain;
                break;
            }
        }
    }

    // show all info by subject
    public void showAllInfOfSubject () {

    }
}
