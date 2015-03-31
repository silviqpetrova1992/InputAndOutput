package task3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/25/15.
 */
public class FileHelper {

  java.io.File file;

  public FileHelper(String file) {
    this.file = new java.io.File(file);
  }

  /**
   * Reverse the stringBuilder and  write to the file.
   *
   * @throws IOException If there is a problem with the reading.
   */
  public void reverse() throws IOException {
    StringBuilder stringBuilder = read();
    System.out.println(stringBuilder);
    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
    bw.write(stringBuilder.reverse().toString());
   // bw.newLine();
    bw.close();
  }

  /**
   * Reads from file and append everything to StringBuilder variable.
   *
   * @return StringBuffer variable
   * @throws IOException If there is a problem with the reading.
   */
  private StringBuilder read() throws IOException {
    StringBuilder stringBuilder = new StringBuilder();
    Scanner br = new Scanner(new FileReader(file));
    String a;
    while (br.hasNext()) {
      a = br.nextLine();
      //System.out.println(a);

      stringBuilder.append(a).append("\n");
    }
    //There is a problem with the nextLine and the symbol "\n"
    // can't be read ! So i will remove the last new line.
    stringBuilder.deleteCharAt(stringBuilder.length()-1);
    br.close();
    return stringBuilder;
  }
}