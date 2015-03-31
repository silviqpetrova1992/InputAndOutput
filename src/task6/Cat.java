package task6;

import java.io.Serializable;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 3/26/15.
 */
public class Cat implements Serializable {
  private String name;
  private int age;
  private double weight;
  private  String color;

  public Cat(String name, int age, double weight) {
    this.name = name;
    this.age = age;
    this.weight = weight;
  }

  /**
   * Get the name of an instance of the class.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Get the age of an instance ot the class.
   *
   * @return the age
   */
  public int getAge() {

    return age;
  }

  /**
   * Get the weight ot an instance of the class.
   *
   * @return the weight
   */
  public double getWeight() {
    return weight;
  }
}
