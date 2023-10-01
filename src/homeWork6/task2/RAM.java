package homeWork6.task2;

public class RAM {
    private String name;
    private int volume;

    public RAM() {
        this.name = "Default";
        this.volume = 128;
    }

    public RAM(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
