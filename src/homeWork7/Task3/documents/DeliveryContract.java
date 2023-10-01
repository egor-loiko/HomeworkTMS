package homeWork7.Task3.documents;

import java.util.Date;

public class DeliveryContract extends Document{
    private String type;
    private int itemQty;

    public DeliveryContract() {
    }

    @Override
    public void getFullDocumentInfo() {
        System.out.println("Document No: " + getDocumentNo());
        System.out.println("Item type: " + getType());
        System.out.println("Item quantity: " + getItemQty());
        System.out.println("Document date: " + getDocumentDate());
    }

    public DeliveryContract(String documentNo, Date documentDate, String type, int itemQty) {
        super(documentNo, documentDate);
        this.type = type;
        this.itemQty = itemQty;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getItemQty() {
        return itemQty;
    }

    public void setItemQty(int itemQty) {
        this.itemQty = itemQty;
    }
}
