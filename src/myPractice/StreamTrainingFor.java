package myPractice;

import java.util.stream.Stream;

public class StreamTrainingFor {

  public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {
      System.out.println("Print = %d".formatted(i));
    }

    int start = 6;
    int finish = 13;

    Stream.iterate(0,i -> i < finish-start, i -> i+1).forEach(num -> {
      System.out.println("Hello");
      System.out.println("One more");
    });
  }
}
