package task5;

import java.io.IOException;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/26/15.
 */
public class DirectoryDemo {
  public static void main(String[] args) {
    Directory d = new Directory();
    try {
      d.list("/home/clouway");
    } catch (IOException x) {
      System.err.println("This  Directory doesn't exist! " + x.getMessage());
    } catch (NullPointerException e) {
      System.err.println("Please, enter a directory!");
    }
  }
}
