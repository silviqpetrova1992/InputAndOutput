package task2;

import java.io.IOException;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/24/15.
 */
public class FileDemo {
  public static void main(String[] args) {
    try {
      FileHelper file=new FileHelper("a.txt");
      file.writeToFile();
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
    catch(NullPointerException e){
      System.err.println("The file can't be NULL!");
    }
  }
}
