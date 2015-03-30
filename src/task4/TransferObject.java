package task4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/26/15.
 */
public class TransferObject {
  /**
   * Transfer from "in" input stream to "out" output stream ,"numberOfBytes" bytes starting from "offset" position.
   *
   * @param in            The input stream
   * @param out           The output stream
   * @param numberOfBytes How many bytes we want to write.
   * @param offset        From which byte we want to start.
   * @return Integer number which is how many bytes we successfully transferred.
   * @throws IOException If there is a problem with the streams.
   */
  public int transfer(InputStream in, OutputStream out, int numberOfBytes, int offset) throws IOException {
    if (in.available() < offset) {
      throw new IOException("The file is not big enought!");
    }
    for (int i = 0; i < offset; i++) {
      int c = in.read();
      System.out.println(in.read());
      // in.read();
    }
    int br = 0;
    for (int i = 0; i < numberOfBytes; i++, br++) {
      int c = in.read();
      if (c == -1) {
        throw new IOException("The file is not big enought!");
      }
      out.write(c);
      //   out.write(in.read());
    }
    out.close();
    in.close();
    return br;
  }
}
