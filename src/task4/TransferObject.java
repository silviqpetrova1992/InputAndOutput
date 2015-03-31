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
    if (numberOfBytes < -1 || offset < 0) {
      throw new IOException("You can't put negative numbers!");
    }
    if (in.available() < offset || in.available() < numberOfBytes) {
      throw new IOException("The file is not big enought!");
    }
    if (numberOfBytes == -1) {
      numberOfBytes = in.available()-offset;
     // offset = 0;
    }
      in.skip(offset);
    int br = 0;
    for (int i = 0; i < numberOfBytes; i++, br++) {
      int c = in.read();
      out.write(c);
    }
    return br;
  }
}
