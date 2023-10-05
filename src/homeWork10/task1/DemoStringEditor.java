package homeWork10.task1;

public class DemoStringEditor {
    public static void main(String[] args) {
        String docNo = "5551-Abc-1273-ABC-1a2b";

        System.out.println("Initial string: " + docNo);
        System.out.println("Only digit blocks: " + StringEditor.digitsBlock(docNo));
        System.out.println("Replace letter blocks by '***': " + StringEditor.replaceByStars(docNo));
        System.out.println("Only characters lowerCase: " + StringEditor.onlyCharacters(docNo));
        System.out.println("Only characters upperCase (StringBuilder): " + StringEditor.onlyCharactersBulder(docNo));
        System.out.println("Doc contains 'ABC' or 'abc': " + StringEditor.isContainABC(docNo));
        System.out.println("Doc starts from '555': " + StringEditor.isStartsFrom555(docNo));
        System.out.println("Doc ends with '1a2b': " + StringEditor.isEndsWith(docNo));
    }
}
