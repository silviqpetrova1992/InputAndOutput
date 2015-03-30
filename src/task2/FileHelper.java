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
   * @throws IOException If there is a problem when we try to read next line.
   */
  public void readFromConsole() throws IOException {
    String a;
    do {
      a = sc.nextLine();
      // System.out.println(a);
      if (a.compareTo(".") != 0) {
        out.write(a);
        out.write("\n");
        // out.close();
      } else {
        break;
      }
    } while (a.compareTo(".") != 0);
    out.close();
  }
}
