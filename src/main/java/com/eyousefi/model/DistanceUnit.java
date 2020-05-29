package com.eyousefi.model;

public enum DistanceUnit {
  INCH(0.0254, "in", "inch"),
  YARD(0.9144, "yd", "yards"),
  FEET(0.3048, "ft", "feet"),
  KILOMETERS(1000.0, "km", "kilometers"),
  NAUTICALMILES(1852.0, "NM", "nmi", "nauticalmiles"),
  MILLIMETERS(0.001, "mm", "millimeters"),
  CENTIMETERS(0.01, "cm", "centimeters"),
  MILES(1609.344, "mi", "miles"),
  METERS(1, "m", "meters");

  public static final DistanceUnit DEFAULT = METERS;
  private final String[] names;
  private double meters;

  DistanceUnit(double meters, String... names) {
    this.meters = meters;
    this.names = names;
  }

  /**
   * Converts the given distance from the given DistanceUnit, to the given DistanceUnit
   *
   * @param distance Distance to convert
   * @param from     Unit to convert the distance from
   * @param to       Unit of distance to convert to
   * @return Given distance converted to the distance in the given unit
   */
  public static double convert(double distance, DistanceUnit from, DistanceUnit to) {
    if (from == to) {
      return distance;
    } else {
      return distance * from.meters / to.meters;
    }
  }

  /**
   * Convert a value into meters
   *
   * @param distance distance in this unit
   * @return value in meters
   */
  public double toMeters(double distance) {
    return convert(distance, this, DistanceUnit.METERS);
  }

  /**
   * Convert a value given in meters to a value of this unit
   *
   * @param distance distance in meters
   * @return value in this unit
   */
  public double fromMeters(double distance) {
    return convert(distance, DistanceUnit.METERS, this);
  }

  /**
   * Convert a value to a distance string
   *
   * @param distance value to convert
   * @return String representation of the distance
   */
  public String toString(double distance) {
    return distance + toString();
  }

  @Override
  public String toString() {
    return names[0];
  }

}
