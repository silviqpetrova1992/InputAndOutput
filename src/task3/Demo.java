package task3;

import java.io.IOException;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/25/15.
 */
public class Demo {
  public static void main(String[] args) {
    try {
      FileHelper file = new FileHelper("task3.txt");
      file.reverse();
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
  }
}
