import java.util.Scanner;

public class ConsoleUserInput implements UserInput {
    private final UserOutput output = new ConsoleUserOutput();
    @Override
    public int getNumber(int maxValue) {
        Scanner in = new Scanner(System.in);
        int userAnswer = 0;
        while (in.hasNext()) {
            if (in.hasNextInt()) {
                userAnswer = in.nextInt();
                if (userAnswer <= 0 || userAnswer > maxValue) {
                    output.printConsole("Number must be more than 0, choose one of answers above");}
                else break;
            } else {
                System.out.println("Not a number! Enter once again");
                in.next();
            }
        }
        return userAnswer;
    }

}
