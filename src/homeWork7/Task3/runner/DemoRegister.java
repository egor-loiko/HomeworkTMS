package homeWork7.Task3.runner;

import homeWork7.Task3.regiestr.Registr;
import homeWork7.Task3.documents.DeliveryContract;
import homeWork7.Task3.documents.Document;
import homeWork7.Task3.documents.EmployeeContract;
import homeWork7.Task3.documents.FinancialInvoice;

import java.util.Date;

public class DemoRegister {
    public static void main(String[] args) {

        Document doc1 = new DeliveryContract("1233", new Date(1212121212121L), "delivery", 2);
        Document doc2 = new EmployeeContract("123", new Date("18/05/2022"), new Date("15/08/2023"), "Vasya");
        Document doc3 = new FinancialInvoice("ttt", new Date(), 1551, "969");
        Document doc4 = new FinancialInvoice("ttt", new Date(), 1551, "969");
        Document doc5 = new FinancialInvoice("ttt", new Date(), 1551, "969");
        Document doc6 = new FinancialInvoice("ttt", new Date(), 1551, "969");
        Document doc7 = new FinancialInvoice("ttt", new Date(), 1551, "969");
        Document doc8 = new FinancialInvoice("ttt", new Date(), 1551, "969");
        Document doc9 = new FinancialInvoice("ttt", new Date(), 1551, "969");
        Document doc10 = new FinancialInvoice("ttt", new Date(), 1551, "969");
        Registr registr = new Registr();
        registr.saveDocument(doc1);
        registr.saveDocument(doc2);
        registr.saveDocument(doc3);
        registr.saveDocument(doc4);
        registr.saveDocument(doc5);
        registr.saveDocument(doc6);
        registr.saveDocument(doc7);
        registr.saveDocument(doc8);
        registr.saveDocument(doc9);
        registr.saveDocument(doc10);
        registr.saveDocument(doc10);
        registr.getDocumentInfo("1232");
        registr.getDocumentInfo("ttt");
    }
}
