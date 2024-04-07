package myPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamTraining {
  public static void main(String[] args) {
    int[] a = {2, 5, 6, 3, 9};

    Arrays.stream(a).filter(x -> x % 2 == 0).forEach(System.out::println);

    String text = "Hello world!";
    String txt = Stream.of(text.split("")).map(str -> str.equals("o") ? "m" : str).collect(Collectors.joining());
    System.out.println(txt);
    //Stream.of(text).map(t -> t.split("")).limit(3).collect(Collectors.joining(""));

    System.out.println(Stream.of(text).map(t -> t.split("")).limit(4).collect(Collectors.toList()));

    ArrayList<String> list = new ArrayList<>();
    list.add("One");
    list.add("Two");
    list.add("Tree");
    list.add("Four");
    list.add("Five");
    list.add("Six");
    list.add("tr");

    Updator upd = (str) -> str + "Hel";

    list.stream().map(str -> str + " Help").collect(Collectors.toList()).forEach(System.out::println);

    list.stream().filter(x -> x.length() <= 3).limit(3).forEach(System.out::println);

    System.out.println(list.stream().collect(Collectors.joining(", ")));

    Summator xyz = CalcTest::summ;
    System.out.println(xyz.summing(3, 4));
  }
}

class CalcTest {

  public static int summ(int a, int b) {
    return a + b;
  }

}

interface Summator {
  int summing(int t1, int t2);
}

interface Updator {
  String update(String str);
}