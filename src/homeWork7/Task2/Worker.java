package homeWork7.Task2;

public class Worker implements TitlePrintable {
    private final String title = "Worker";

    @Override
    public void printTitle() {
        System.out.println("Job Title = " + title);
    }
}
