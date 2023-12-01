package homeWork7.Task2;

public class Accountant implements TitlePrintable {
    private final static String TITLE = "Accountant";

    @Override
    public void printTitle() {
        System.out.println("Job Title = " + TITLE);
    }
}
