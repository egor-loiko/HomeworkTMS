package homeWork6.task2;

public class DemoComputer {
    public static void main(String[] args) {
        Computer computer1 = new Computer(1101.34, "Asus-3452");

        System.out.println("Computer model: " + computer1.getModel());
        System.out.println("Computer price: " + computer1.getPrice());
        System.out.println("RAM name: " + computer1.getRam().getName());
        System.out.println("RAM volume: " + computer1.getRam().getVolume());
        System.out.println("HDD name: " + computer1.getHdd().getName());
        System.out.println("HDD volume: " + computer1.getHdd().getVolume());
        System.out.println("HDD type: " + computer1.getHdd().getType());

        Computer computer2 = new Computer(111, "Lenovo-E15", new RAM("Hynix", 512), new HDD("Seagate", 1024, "Internal"));

        System.out.println("Computer model: " + computer2.getModel());
        System.out.println("Computer price: " + computer2.getPrice());
        System.out.println("RAM name: " + computer2.getRam().getName());
        System.out.println("RAM volume: " + computer2.getRam().getVolume());
        System.out.println("HDD name: " + computer2.getHdd().getName());
        System.out.println("HDD volume: " + computer2.getHdd().getVolume());
        System.out.println("HDD type: " + computer2.getHdd().getType());
    }

}
