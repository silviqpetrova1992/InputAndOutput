package task2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/24/15.
 */
public class FileHelper {
  // FileHelper file;
  Scanner sc;
  FileWriter out;

  /**
   * This is a constructor with one parameter.
   * @param f The name of the file, from which we want to read.
   * @throws IOException If there is a problem with the reading.
   */
  public FileHelper(String f) throws IOException {
    // this.file=new FileHelper(f);
    sc = new Scanner(System.in);
    out = new FileWriter(f);

  }

  /**
   * Reads from console while the enter is single ".".
   * @return a The StringBuilder that we want to write in the file.
   * @throws IOException If there is a problem when we try to read next line.
   */
  private String readFromConsole() throws IOException {
    StringBuilder a=new StringBuilder();
    String b;
    do {
      b=sc.nextLine();
    if (b.compareTo(".") != 0){
      a.append(b).append("\n");
    }      // System.out.println(a);
    } while (b.compareTo(".") != 0);
     return a.toString();
  }

  /**
   *
   * @throws IOException
   */
  public void writeToFile() throws IOException {
   String a=readFromConsole();
   out.write(a);
    out.close();
  }
}
