package task2;

import java.io.IOException;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/24/15.
 */
public class FileDemo {
  public static void main(String[] args) {
    try {
      FileHelper file=new FileHelper("a.txt");
      file.readFromConsole();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
