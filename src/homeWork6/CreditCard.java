package homeWork6;

public class CreditCard {
    private int cardNumber;
    private float cardAmount;

    public CreditCard(int cardNumber, float cardAmount) {
        this.cardNumber = cardNumber;
        this.cardAmount = cardAmount;
    }

    public void addAmountToCreditCard( float amountToAdd){
        cardAmount = cardAmount + amountToAdd;
    }

    public void removeAmountFromCard(float amountToRemove){
        cardAmount = cardAmount - amountToRemove;
    }

    public void getCreditCardInfo(){
        System.out.println("Credit Card Number: " + cardNumber);
        System.out.println("Credit Card Amoutn: " + cardAmount);
    }
}
