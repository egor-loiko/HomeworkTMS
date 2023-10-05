package homeWork10.task1;

public class StringEditor {

    public static String digitsBlock(String str) {
        return str.substring(0, 4) + str.substring(9, 13);
    }

    public static String replaceByStars(String str) {
        return str.replace(str.substring(5, 8), "***").replace(str.substring(14, 17), "***");
    }

    public static String onlyCharacters(String str) {
        return str.substring(5, 8).toLowerCase() + "/" + str.substring(14, 17).toLowerCase() + "/" + String.valueOf(str.charAt(19)).toLowerCase() + "/" + String.valueOf(str.charAt(21)).toLowerCase();
    }

    public static String onlyCharactersBulder(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return "Letters:" + stringBuilder.substring(5, 8).toUpperCase() + "/" + stringBuilder.substring(14, 17).toUpperCase() + "/" + String.valueOf(stringBuilder.charAt(19)).toUpperCase() + "/" + String.valueOf(stringBuilder.charAt(21)).toUpperCase();
    }

    public static boolean isContainABC(String str) {
        return str.contains("abc") || str.contains("ABC");
    }

    public static boolean isStartsFrom555(String str) {
        return str.startsWith("555");
    }

    public static boolean isEndsWith(String str) {
        return str.endsWith("1a2b");
    }
}
