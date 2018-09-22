package com.jasongrutherford.homework.vistair.airlinelist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Class which represents the aircraft manufacturer in the data model.
 * 
 * @author Jason Rutherford
 */
@Entity
public class AircraftManufacturer {

  /**
   * The primary key of the aircraft manufacturer table.
   */
  @Id
  @GeneratedValue
  @Column(name = "aircraft_manuf_id")
  private int aircraftManufId;
  
  /**
   * String representation of the aircraft manufacturers name.
   */
  @Column(name = "aircraft_manuf_name")
  private String aircraftManufName;

  /* Beginning of automatic generated code by Eclipse. */  
  
  public int getAircraftManufId() {
    return aircraftManufId;
  }

  public void setAircraftManufId(int aircraftManufId) {
    this.aircraftManufId = aircraftManufId;
  }

  public String getAircraftManufName() {
    return aircraftManufName;
  }

  public void setAircraftManufName(String aircraftManufName) {
    this.aircraftManufName = aircraftManufName;
  }

  /* End of automatic generated code by Eclipse. */  
  
}
