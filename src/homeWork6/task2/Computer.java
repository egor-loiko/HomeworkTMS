package homeWork6.task2;

public class Computer {
    private double price;
    private String model;
    private RAM ram;
    private HDD hdd;

    public Computer(double price, String model) {
        this.price = price;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(double price, String model, RAM ram, HDD hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Computer information: " +
                "\nComputer model: " + model +
                "\nComputer price: " + price +
                "\nRam name: " + ram.getName() +
                "\nRam volume: " + ram.getVolume() +
                "\nHDD volume: " + hdd.getName() +
                "\nHDD volume: " + hdd.getVolume() +
                "\nHDD volume: " + hdd.getType();
    }

    public void displayComputerInfo() {
        System.out.println("Computer information: " +
                "\nComputer model: " + model +
                "\nComputer price: " + price +
                "\nRam name: " + ram.getName() +
                "\nRam volume: " + ram.getVolume() +
                "\nHDD volume: " + hdd.getName() +
                "\nHDD volume: " + hdd.getVolume() +
                "\nHDD volume: " + hdd.getType());
    }
}
