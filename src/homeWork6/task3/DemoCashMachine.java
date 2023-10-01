package homeWork6.task3;

public class DemoCashMachine {
    public static void main(String[] args) {
        CashMachine cashMachine = new CashMachine(14, 3, 1);
        System.out.println("Exist banknotes | 100x" + cashMachine.getNumberBanknotes100() + " | 50x" + cashMachine.getNumberBanknotes50() + " | 20x" + cashMachine.getNumberBanknotes20() + " |");

        System.out.println(cashMachine.withdrawalMoney(201) ? "Transaction successful" : "Transaction UNsuccessful");
        System.out.println("Exist banknotes | 100x" + cashMachine.getNumberBanknotes100() + " | 50x" + cashMachine.getNumberBanknotes50() + " | 20x" + cashMachine.getNumberBanknotes20() + " |");

        System.out.println(cashMachine.withdrawalMoney(200) ? "Transaction successful" : "Transaction UNsuccessful");
        System.out.println("Exist banknotes | 100x" + cashMachine.getNumberBanknotes100() + " | 50x" + cashMachine.getNumberBanknotes50() + " | 20x" + cashMachine.getNumberBanknotes20() + " |");

        System.out.println(cashMachine.withdrawalMoney(260) ? "Transaction successful" : "Transaction UNsuccessful");
        System.out.println("Exist banknotes | 100x" + cashMachine.getNumberBanknotes100() + " | 50x" + cashMachine.getNumberBanknotes50() + " | 20x" + cashMachine.getNumberBanknotes20() + " |");

        cashMachine.addBanknotes100(1);
        cashMachine.addBanknotes50(1);
        cashMachine.addBanknotes20(2);
        System.out.println("Exist banknotes | 100x" + cashMachine.getNumberBanknotes100() + " | 50x" + cashMachine.getNumberBanknotes50() + " | 20x" + cashMachine.getNumberBanknotes20() + " |");
        System.out.println(cashMachine.withdrawalMoney(260) ? "Transaction successful" : "Transaction UNsuccessful");
        System.out.println("Exist banknotes | 100x" + cashMachine.getNumberBanknotes100() + " | 50x" + cashMachine.getNumberBanknotes50() + " | 20x" + cashMachine.getNumberBanknotes20() + " |");

    }
}
