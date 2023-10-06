/*
 * This item contains information that is the confidential, proprietary
 * and trade secret information of IGT or its affiliates and may be exempt from disclosure under applicable law.
 *
 * © 2023 IGT Global Solutions Corporation.
 *
 * @author <michal.taborowski@igt.com>
 */
package edu.technischools.java.vehicle;

public class VehicleTest {

  public static void main(String[] args) {
    Car car = new Car("My car", 20.0, 20.0, (byte) 2);
    SportCar sportCar = new SportCar("My car", 20.0, 120.0, (byte) 2);
    Plane plane = new Plane("Plane", 20.0, 20.0);
    JetPlane jetPlane = new JetPlane("Jet plane", 100.0, 200.0);

    Vehicle[] vehicles = new Vehicle[]{car, sportCar, plane, jetPlane};
    Flyable[] flyables = new Flyable[2];

    int index = 0;

    for (Vehicle vehicle : vehicles) {
      if (vehicle instanceof Flyable) {
        flyables[index++] = (Flyable) vehicle;
      }
    }

    index = 0;

    for (int i = 0; i < vehicles.length; i++) {
      if (vehicles[i] instanceof Flyable) {
        flyables[index++] = (Flyable) vehicles[i];
      }
    }

    for (Flyable flyable : flyables) {
      flyable.fly();
    }
  }
}
