package org.example;

public class Rooms {

  private String name;
  private String description;
  private Rooms south;
  private Rooms east;
  private Rooms north;
  private Rooms west;
  private Rooms currentPosition;

  public Rooms(String name, String description) {
    this.name = name;
    this.description = description;
    this.south = null;
    this.east = null;
    this.north = null;
    this.west = null;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public Rooms getSouth() {
    return south;
  }

  public Rooms getEast() {
    return east;
  }

  public Rooms getNorth() {
    return north;
  }

  public Rooms getWest() {
    return west;
  }

  public void setSouth(Rooms south) {
    this.south = south;
  }

  public void setEast(Rooms east) {
    this.east = east;
  }

  public void setNorth(Rooms north) {
    this.north = north;
  }

  public void setWest(Rooms west) {
    this.west = west;
  }

  public Rooms getCurrentPosition() {
    return currentPosition;
  }

  public void setCurrentPosition(Rooms currentPosition) {
    this.currentPosition = currentPosition;
  }

  @Override
  public String toString() {
    return "Rooms{" +
        "name='" + name + '\'' +
        ", description='" + description + '\'' +
        '}';
  }
}
