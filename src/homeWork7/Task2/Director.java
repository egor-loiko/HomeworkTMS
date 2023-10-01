package homeWork7.Task2;

public class Director implements TitlePrintable {
    private final String title = "Director";

    @Override
    public void printTitle() {
        System.out.println("Job Title = " + title);
    }
}
