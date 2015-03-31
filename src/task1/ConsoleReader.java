package task1;


import java.io.IOException;
import java.util.InputMismatchException;


/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/24/15.
 */
public class ConsoleReader {


  /**
   * Read String from the input stream
   *
   * @return String
   * @throws java.io.IOException If the reading is unsuccessfully.
   */
  public String readString() throws IOException {
    return this.read();
  }

  /**
   * Read int from the input stream
   *
   * @return int
   * @throws java.io.IOException           If there is a problem with the reading.
   * @throws NumberFormatException If is not entered an integer number.
   */
  public int readInt() throws IOException, NumberFormatException {
    String s = this.read();

    return Integer.parseInt(s);
  }

  /**
   * Read char from the input stream.
   *
   * @return char
   * @throws java.io.IOException            If there is a problem with the reading.
   * @throws java.util.InputMismatchException If is not entered an integer number.
   */
  public char readChar() throws IOException, InputMismatchException {
    String s = this.read();
    if (s.length() == 1) {
      return s.charAt(0);
    }

    throw new InputMismatchException("You didn't enter char!");

  }

  /**
   * Read float number from the input stream.
   *
   * @return The float number.
   * @throws java.io.IOException           If there is a problem with the reading.
   * @throws NumberFormatException If is not entered an integer number.
   */
  public float readFloat() throws IOException, NumberFormatException {
    String s = this.read();
    return Float.parseFloat(s);
  }

  /**
   * This method allow us to read byte after byte while the enter is " ".
   *
   * @return String with all read characters.
   * @throws java.io.IOException Ifthe reading is unsuccessfully.
   */
  private String read() throws IOException {
    StringBuilder s = new StringBuilder();
    int i;
    i = System.in.read();
    while (i != 10) {
      s.append(Character.toChars(i));
      i = System.in.read();
    }
    return s.toString();
  }
}
