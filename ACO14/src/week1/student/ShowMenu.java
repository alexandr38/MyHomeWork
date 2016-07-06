package week1.student;

import java.util.Scanner;

/**
 * Created by Agryzkov on 06.07.2016.
 */
public class ShowMenu {

    private Scanner scanner = new Scanner(System.in);
    private Student student;

    public void start(Student student) {

        this.student = student;
        while (true) {
            showMainMenu();
            int choise = scanner.nextInt();
            switch (choise) {

            }
        }
    }

    private void showMainMenu() {
        System.out.println("1. add student");
        System.out.println("2. add subject");
        System.out.println("3. delete last subject");
        System.out.println("4. training the student");
        System.out.println("5. show info for all subject of student");
        System.out.println("6. average score the student");
        System.out.println("7. Student score of the subject");
        System.out.println("8. information of the subject");
        System.out.println("0. exit");
    }

    
}
