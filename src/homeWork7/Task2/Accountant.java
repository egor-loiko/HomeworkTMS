package homeWork7.Task2;

public class Accountant implements TitlePrintable {
    private final String title = "Accountant";

    @Override
    public void printTitle() {
        System.out.println("Job Title = " + title);
    }
}
