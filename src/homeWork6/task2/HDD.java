package homeWork6.task2;

public class HDD {
    private String name;
    private int volume;
    private String type;

    public HDD() {
        this.name = "Default";
        this.volume = 128;
        this.type = "Internal";
    }

    public HDD(String name, int volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
