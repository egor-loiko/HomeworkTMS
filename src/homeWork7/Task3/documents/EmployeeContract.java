package homeWork7.Task3.documents;

import java.util.Date;

public class EmployeeContract extends Document {

    private Date finishDate;
    private String employeeName;

    public EmployeeContract() {
    }

    public EmployeeContract(String documentNo, Date documentDate, Date finishDate, String employeeName) {
        super(documentNo, documentDate);
        this.finishDate = finishDate;
        this.employeeName = employeeName;
    }

    @Override
    public void getFullDocumentInfo() {
        System.out.println("Document No: " + getDocumentNo());
        System.out.println("Item type: " + getFinishDate());
        System.out.println("Item quantity: " + getEmployeeName());
        System.out.println("Document date: " + getDocumentDate());
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
