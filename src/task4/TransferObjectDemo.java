package task4;

import java.io.*;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/26/15.
 */
public class TransferObjectDemo {
  public static void main(String[] args) throws IOException {
    InputStream in=null;
    OutputStream out=null;
    try {
      in = new FileInputStream("task4a.txt");
      out = new FileOutputStream("task4b.txt");
      TransferObject to = new TransferObject();

      System.out.println(to.transfer(in, out, -1, 0));
      // System.out.println(out.toString());
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
    finally {
      if(in!=null){
      in.close();
      }
      if(out!=null){
        out.close();
      }
    }
  }
}
