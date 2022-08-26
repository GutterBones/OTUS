public class ConsoleUserOutput implements UserOutput{

    @Override
    public void printConsole(String text) {
        System.out.println(text);
    }
}
