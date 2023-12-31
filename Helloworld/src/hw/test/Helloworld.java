package hw.test;

import java.util.Scanner;

public class Helloworld {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int target = sc.nextInt();

    if (target < 2) {
      System.out.println(target + "は素数ではありません。");
      return;
    }

    for (int i = 2; i < Math.sqrt(target); i++) {
      if (target % i == 0) {
        System.out.println(target + "は素数ではありません。");
        return;
      }
    }

    System.out.println(target + "は素数です。");
  }
}