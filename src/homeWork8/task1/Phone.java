package homeWork8.task1;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void receiveCall(String callerName) {
        System.out.println("Calling '" + callerName + "'");
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Calling '" + callerName + "' from Phone Number : " + callerNumber);
    }

    public void sendMessage(String... phoneNumber) {
        System.out.println("--- Start message sending ---");
        for (String element : phoneNumber) {
            System.out.println("Message is sent to Phone number: " + element);
        }
        System.out.println("--- Finish message sending ---");
    }
}
