package homeWork7.Task3.regiestr;

import homeWork7.Task3.documents.Document;

public interface DocumentWork {
    void saveDocument(Document document);

    void getDocumentInfo(String documentNo);
}
