package homeWork7.Task3.documents;

import java.util.Date;

public class DeliveryContract extends Document{
    private String type;
    private int itemQuantity;

    public DeliveryContract() {
    }

    @Override
    public void getFullDocumentInfo() {
        System.out.println("Document No: " + getDocumentNo());
        System.out.println("Item type: " + getType());
        System.out.println("Item quantity: " + getItemQuantity());
        System.out.println("Document date: " + getDocumentDate());
    }

    public DeliveryContract(String documentNo, Date documentDate, String type, int itemQuantity) {
        super(documentNo, documentDate);
        this.type = type;
        this.itemQuantity = itemQuantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
}
