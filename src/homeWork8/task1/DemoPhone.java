package homeWork8.task1;

public class DemoPhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone("12345678", "Samsung", 233);
        Phone phone2 = new Phone("87654321", "Huawei", 180);
        Phone phone3 = new Phone("43218765", "Xiaomi", 161);
        Phone phone4 = new Phone();

        System.out.println("Model: " + phone1.getModel() + ", Phone number: " + phone1.getNumber() + ", Phone weight " + phone1.getWeight());
        System.out.println("Model: " + phone2.getModel() + ", Phone number: " + phone2.getNumber() + ", Phone weight " + phone2.getWeight());
        System.out.println("Model: " + phone3.getModel() + ", Phone number: " + phone3.getNumber() + ", Phone weight " + phone3.getWeight());
        System.out.println("Model: " + phone4.getModel() + ", Phone number: " + phone4.getNumber() + ", Phone weight " + phone4.getWeight());
        phone4.receiveCall("Vasya");
        phone4.receiveCall("Vasya", "8897711");

        phone4.sendMessage("234", "543", "234", "2322", "22222", "234445555");
        phone1.sendMessage("1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "300050", "53", "23422", "232111", "234", "234", "213", "325435");
    }
}
