package task6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/26/15.
 */
public class Demo {
  public static void main(String[] args) {
     Cat cat1=new Cat("Pesho",5,3.5);
    DataClass dc = new DataClass();
    try {
     /*  ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("task6a.txt"));
      dc.saveObject(out,cat1);
      out.close();*/
      ObjectInputStream in = new ObjectInputStream(new FileInputStream("task6a.txt"));
      Cat copyCat = (Cat) dc.getObject(in);
      System.out.println(copyCat.getName() + " - " + copyCat.getAge() + " - " + copyCat.getWeight());
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
