class VehicleFactory {
  public static Vehicle getInstance(String type, int wheel) {
    if("Car".equals(type)) {
      return new Car(wheel);
    } else if("Bike".equals(type)) {
      return new Bike(wheel);
    }

    return null;
  }
}