package homeWork7.Task3.documents;

import java.util.Date;

public abstract class Document {
    private String documentNo;
    private Date documentDate;

    public Document() {
    }

    public Document(String documentNo, Date documentDate) {
        this.documentNo = documentNo;
        this.documentDate = documentDate;
    }

    public abstract void getFullDocumentInfo();

    public String getDocumentNo() {
        return documentNo;
    }

    public void setDocumentNo(String documentNo) {
        this.documentNo = documentNo;
    }

    public Date getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(Date documentDate) {
        this.documentDate = documentDate;
    }
}
