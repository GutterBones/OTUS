
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] questions = new String[]{
                "How many people live in Russia?",
                "What is the area of Russia?",
                "Which country is the largest in the world?",
                "How many people live in Russia?"};
        String[][] answers = new String[][]{
                {"(1) 100 - 120 million",
                        "(2) 120 - 140 million",
                        "(3) 140 - 160 million",
                        "(4) more than 160 million"},
                {"(1)less than 15 million square kilometers",
                        "(2)15 - 17 million million square kilometers",
                        "(3)17 - 19 million million square kilometers",
                        "(4)more than 19 million square kilometers"},
                {"(1)Russia",
                        "(2)USA",
                        "(3)China",
                        "(4)Uganda",
                        "(5)Ukraine"},
                {"(1) 100 - 120 million",
                        "(2) 120 - 140 million",
                        "(3) 140 - 160 million",
                        "(4) more than 160 million"}
        };

        int[] userAnswers = new int[questions.length];
        int[] rightAnswers = new int[]{3, 3, 1, 3};
        int r = 0;
        int w = 0;

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < answers[i].length; j++) {
                System.out.println(answers[i][j]);
            }
            System.out.println("Enter number: ");
            while (in.hasNext()) {
                if (in.hasNextInt()) {
                    userAnswers[i] = in.nextInt();
                    if (userAnswers[i] < 0 || userAnswers[i] > answers[i].length) {
                        System.out.println("Number must be more than 0, choose one if answers above");
                    }
                    else {
                        break;
                    }
                }
                else {
                    System.out.println("Not a number! Enter once again");
                    in.next();
                }
            }
            if (userAnswers[i] == rightAnswers[i]) {
                System.out.println("You are right!");
                r++;
            } else {
                System.out.println("You are wrong! Right answer is: " + rightAnswers[i]);
                w++;
            }
        }
        System.out.println("Right answers:"+r+"  " +"Wrong answers"+w);
    }
}