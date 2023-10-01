package homeWork6.task3;

import java.util.ArrayList;

public class CashMachine {
    private int numberBanknotes20;
    private int numberBanknotes50;
    private int numberBanknotes100;

    private ArrayList<String> banknotesOptionsList = new ArrayList<>();

    public CashMachine(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }

    public ArrayList<String> getBanknotesOptionsList() {
        return banknotesOptionsList;
    }

    public int addBanknotes20(int number) {
        return numberBanknotes20 += number;
    }

    public int addBanknotes50(int number) {
        return numberBanknotes50 += number;
    }

    public int addBanknotes100(int number) {
        return numberBanknotes100 += number;
    }

    public int getNumberBanknotes20() {
        return numberBanknotes20;
    }

    public int getNumberBanknotes50() {
        return numberBanknotes50;
    }

    public int getNumberBanknotes100() {
        return numberBanknotes100;
    }

    void possibleOptions(int sum, int minvalue, String valueList) {

        if (sum == 0) {
            banknotesOptionsList.add(valueList);
        }
        if (minvalue >= 100 && sum >= 100) {
            possibleOptions(sum - 100, 100, valueList + "100 ");
        }
        if (minvalue >= 50 && sum >= 50) {
            possibleOptions(sum - 50, 50, valueList + "50 ");
        }
        if (sum >= 20) {
            possibleOptions(sum - 20, 20, valueList + "20 ");
        }
    }

    boolean isWithdrawalPossibleWithExistingBanknotes(int sum, int minvalue) {
        banknotesOptionsList.clear();
        possibleOptions(sum, minvalue, "");
        return !banknotesOptionsList.isEmpty();
    }

    boolean withdrawalMoney(int sum) {
        if (isWithdrawalPossibleWithExistingBanknotes(sum, 100)) {
            for (int i = 0; i < banknotesOptionsList.size(); i++) {
                String[] test = banknotesOptionsList.get(i).split(" ");
                int counterForWithdrawalBanknote100 = 0;
                int counterForWithdrawalBanknote50 = 0;
                int counterForWithdrawalBanknote20 = 0;
                for (int j = 0; j < test.length; j++) {
                    switch (test[j]) {
                        case "100":
                            counterForWithdrawalBanknote100++;
                            break;
                        case "50":
                            counterForWithdrawalBanknote50++;
                            break;
                        case "20":
                            counterForWithdrawalBanknote20++;
                            break;
                    }

                }
                if (numberBanknotes100 >= counterForWithdrawalBanknote100 && numberBanknotes50 >= counterForWithdrawalBanknote50 && numberBanknotes20 >= counterForWithdrawalBanknote20) {
                    numberBanknotes100 -= counterForWithdrawalBanknote100;
                    numberBanknotes50 -= counterForWithdrawalBanknote50;
                    numberBanknotes20 -= counterForWithdrawalBanknote20;
                    System.out.println("Amount of " + sum + " will be withdrawal by banknotes\n" +
                            (counterForWithdrawalBanknote100 == 0 ? "" : "| 100x" + counterForWithdrawalBanknote100) +
                            (counterForWithdrawalBanknote50 == 0 ? "" : " | 50x" + counterForWithdrawalBanknote50 + " |") +
                            (counterForWithdrawalBanknote20 == 0 ? "" : " | 20x" + counterForWithdrawalBanknote20 + " |"));
                    return true;
                }
            }
        }
        System.out.println("Not possible to withdrawal Amount of " + sum + " with existing banknotes");
        return false;

    }
}
