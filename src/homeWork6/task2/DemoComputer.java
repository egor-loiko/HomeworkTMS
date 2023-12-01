package homeWork6.task2;

public class DemoComputer {
    public static void main(String[] args) {
        Computer computer1 = new Computer(1101.34, "Asus-3452");

        System.out.println("________________________________________________");
        System.out.println(computer1);
        System.out.println("________________________________________________");
        computer1.displayComputerInfo();

        Computer computer2 = new Computer(111, "Lenovo-E15", new RAM("Hynix", 512), new HDD("Seagate", 1024, "Internal"));

        System.out.println("________________________________________________");
        System.out.println(computer2);
        System.out.println("________________________________________________");
        computer2.displayComputerInfo();

    }

}
