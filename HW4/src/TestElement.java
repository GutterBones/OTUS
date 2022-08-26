public class TestElement {
    private final String question;
    private final Answer[] answers;
    private final int rightAnswer;
    private final UserInput input = new ConsoleUserInput();
    private final UserOutput output = new ConsoleUserOutput();

    public TestElement(String q, Answer[] a, int r) {
        question = q;
        answers = a;
        rightAnswer = r;
    }

    public boolean askQuestion(){
        printAll();
        output.printConsole("Enter number: ");
        int number = input.getNumber(answers.length);
        setAnswer(number);
            if (hasRightAnswer()) {
                output.printConsole("You are right!");
                return true;
            } else {
                output.printConsole("You are wrong! Right answer is: " + getRightAnswer());
                return false;
            }
    }

    public int getRightAnswer() {
        return rightAnswer;
    }

    public boolean hasRightAnswer(){
        for (Answer answer : answers) {
            return answer.getUserAnswer();
        }
        return false;
    }

    public void printAll() {
        output.printConsole(question);
        for (Answer answer : answers) {
            output.printConsole(answer.getAnswer());
        }
    }

    public void setAnswer(int answerNumber) {
         answers[answerNumber-1].setUserAnswer();
        }

        @Override
        public String toString () {
            return question;
        }
    }

