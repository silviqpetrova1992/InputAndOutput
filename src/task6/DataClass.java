package task6;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/26/15.
 */
public class DataClass {
  /**
   * Serialize the object "obj" in output stream "out"
   *
   * @param out Where we will serialize it.
   * @param obj Which object exactly we want to serialize.
   * @throws IOException If there is a problem with the output stream.
   */
  public void saveObject(ObjectOutputStream out, Object obj) throws IOException {
    out.writeObject(obj);
  }

  /**
   * Get the serialized object from the input stream.
   *
   * @param in The input stream from which we will get the object.
   * @return the object
   * @throws IOException            If there is a problem with the input stream.
   * @throws ClassNotFoundException If there is a problem with the object.
   */
  public Object getObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
    return in.readObject();
  }
}
