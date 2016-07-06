package week1.student;

/**
 * Created by Agryzkov on 06.07.2016.
 */
public class SubjectList {

    private Subject[] subjectList = new Subject[5];
    private int indexList = 0;

    // add subject
    public void addSubjectToList(Subject subject) {
        if (indexList >= subjectList.length && subjectList.length > 0) {
            Subject[] temp = new Subject[ subjectList.length*2 ];
            System.arraycopy( subjectList, 0, temp, 0, subjectList.length );
            subjectList = temp;
        }
        subjectList[indexList] = subject;
        indexList++;
    }

    // delete last subject
    public void deleteSubjectFromList () {
        Subject[] temp = new Subject[ indexList - 1 ];
        System.arraycopy(subjectList, 0, temp, 0, indexList - 1);
        subjectList = temp;
        indexList--;
    }

    // find pos subject by name
    public int findSubjByName(String name) {
        // -1 if subj not found
        int posSubj = -1;
        for ( int i=0; i < indexList; i++ ) {
            if ( name.equals(subjectList[i].getSubjName())) {
                posSubj = i;
            }
        }
        return posSubj;
    }

    // get subj on index
    public Subject getSubjByIndex(int index) {
        return subjectList[index];
    }

    // set subj for index
    public void setSubjByIndex(Subject subj, int index) {
        this.subjectList[index] = subj;
    }

    public String subjectListAsString() {
        String result = " Subject list for student \n";
        for ( int i = 0; i < indexList; i++ ) {
            Subject curSubject = subjectList[i];
            result += curSubject.showInfBySubjAsString();
        }
        return result;
    }

    // get average score from list
    public float getAverageScoreFromSubjList() {
        float averageScore = 0;
        for ( int i = 0; i < indexList; i++ ) {
            Subject curSubject = subjectList[i];
            averageScore += curSubject.getEvaluationBySubject();
        }
        return averageScore/subjectList.length;
    }


}
