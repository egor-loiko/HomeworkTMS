package homeWork7.Task3.regiestr;

import homeWork7.Task3.documents.Document;

public class Registr implements DocumentWork {
    private int documentCounter = 0;
    private Document[] documents = new Document[10];

    public void saveDocument(Document document) {
        if (documentCounter <= 9) {
            documents[documentCounter] = document;
            System.out.println("Document is added");
            documentCounter++;
        } else {
            System.out.println("Document cannot be added. Memory is full");
        }
    }

    public void getDocumentInfo(String documentNo) {
        boolean isDocumentFound = false;
        for (int i = 0; i < documentCounter; i++) {
            if (documents[i].getDocumentNo().equals(documentNo)) {
                System.out.println("Document with No \"" + documentNo + " is found!");
                documents[i].getFullDocumentInfo();
                isDocumentFound = true;
                break;
            }
        }
        if (!isDocumentFound) {
            System.out.println("Document with No \"" + documentNo + "\" is not found");
        }
    }
}
