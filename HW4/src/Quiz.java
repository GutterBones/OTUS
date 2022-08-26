public class Quiz {
    private final TestElement[] testElements;
    private int rightQuestCount;
    private int wrongQuestCount;
    public Quiz(TestElement[] testElements) {
        this.testElements = testElements;
    }
    public void runQuiz () {
        for (int i = 0; i < testElements.length; i++) {
            final boolean result = testElements[i].askQuestion();
            if (result) {
                rightQuestCount++;
            }
            else {
                wrongQuestCount++;
            }
        }
        System.out.println("Right answers:"+rightQuestCount+"  " +"Wrong answers:"+wrongQuestCount);
    }
}
