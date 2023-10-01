package homeWork7.Task3.documents;

import java.util.Date;

public class FinancialInvoice extends Document {

    private int finalAmoutn;
    private String departmentCode;

    public FinancialInvoice() {
    }

    public FinancialInvoice(String documentNo, Date documentDate, int finalAmoutn, String departmentCode) {
        super(documentNo, documentDate);
        this.finalAmoutn = finalAmoutn;
        this.departmentCode = departmentCode;
    }

    @Override
    public void getFullDocumentInfo() {
        System.out.println("Document No: " + getDocumentNo());
        System.out.println("Item type: " + getFinalAmoutn());
        System.out.println("Item quantity: " + getDepartmentCode());
        System.out.println("Document date: " + getDocumentDate());
    }

    public int getFinalAmoutn() {
        return finalAmoutn;
    }

    public void setFinalAmoutn(int finalAmoutn) {
        this.finalAmoutn = finalAmoutn;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }
}
