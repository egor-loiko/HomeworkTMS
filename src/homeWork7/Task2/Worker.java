package homeWork7.Task2;

public class Worker implements TitlePrintable {
    private final static String TITLE = "Worker";

    @Override
    public void printTitle() {
        System.out.println("Job Title = " + TITLE);
    }
}
