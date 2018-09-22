package com.jasongrutherford.homework.vistair.airlinelist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Class represents the aircraft type in the data model.
 * 
 * @author Jason Rutherford
 *
 */
@Entity
public class AircraftType {

  /** 
   * The primary key of the aircraft type.
   */
  @Id
  @GeneratedValue
  @Column(name = "aircraft_type_id")
  private int aircraftTypeId;
  
  /**
   * String representation of the aircraft type name, E.g 777, 747, etc.
   */
  @Column(name = "aircraft_type_name")
  private String aircraftTypeName;
  
  /**
   * The aircraft manufacturer this type is associated with.
   */
  @ManyToOne
  @JoinColumn(name = "aircraft_manuf_id")
  private AircraftManufacturer aircraftManufacturer;

  /* Beginning of automatic generated code by Eclipse. */  
  
  public int getAircraftTypeId() {
    return aircraftTypeId;
  }

  public void setAircraftTypeId(int aircraftTypeId) {
    this.aircraftTypeId = aircraftTypeId;
  }

  public String getAircraftTypeName() {
    return aircraftTypeName;
  }

  public void setAircraftTypeName(String aircraftTypeName) {
    this.aircraftTypeName = aircraftTypeName;
  }

  public AircraftManufacturer getAircraftManufacturer() {
    return aircraftManufacturer;
  }

  public void setAircraftManufacturer(AircraftManufacturer aircraftManufacturer) {
    this.aircraftManufacturer = aircraftManufacturer;
  }
  
  /* End of automatic generated code by Eclipse. */  

}
