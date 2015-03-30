package task4;

import java.io.*;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/26/15.
 */
public class TransferObjectDemo {
  public static void main(String[] args) {

    //InputStream in=new BufferedInputStream(System.in);
    //OutputStream out=new BufferedOutputStream(System.out);
    try {
      InputStream in = new FileInputStream("task4a.txt");
      OutputStream out = new FileOutputStream("task4b.txt");
      TransferObject to = new TransferObject();

      System.out.println(to.transfer(in, out, 5, 40));
      // System.out.println(out.toString());
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
  }
}
