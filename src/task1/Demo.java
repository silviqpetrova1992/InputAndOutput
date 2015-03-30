package task1;


import java.io.IOException;
import java.util.InputMismatchException;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/24/15.
 */
public class Demo {
  public static void main(String[] args) throws IOException {

    ConsoleReading cr = new ConsoleReading();
    try {
      System.out.println(cr.readChar());
      System.out.println(cr.readInt());
      System.out.println(cr.readString());
      System.out.println(cr.readFloat());
    } catch (InputMismatchException e) {
      System.err.println(e.getMessage());
    } catch (NumberFormatException ex) {
      System.err.println("Incorrect input! " + ex.getMessage());
    } catch (IOException e) {
      System.err.println(e.toString());
    }
  }
}
