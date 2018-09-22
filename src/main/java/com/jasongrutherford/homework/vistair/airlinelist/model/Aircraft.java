package com.jasongrutherford.homework.vistair.airlinelist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Represents a single aircraft in the data model.
 * 
 * @author Jason Rutherford
 *
 */
@Entity
public class Aircraft {

  /**
   * The primary key of the aircraft table.
   */
  @Id
  @GeneratedValue
  @Column(name = "aircraft_id")
  private int aircraftId;
  
  /**
   * The aircraft type associated with the aircraft.
   */
  @ManyToOne
  @JoinColumn(name = "aircraft_type_id")
  private AircraftType aircraftType;
  
  /**
   * The airline associated with the aircraft.
   */
  @ManyToOne
  @JoinColumn(name = "airline_id")
  private Airline airline;
  
  /**
   * The registration number of the aircraft.
   */
  @Column(name = "reg_no")
  private String registrationNumber;

  /* Beginning of automatic generated code by Eclipse. */  
  
  public int getAircraftId() {
    return aircraftId;
  }

  public void setAircraftId(int aircraftId) {
    this.aircraftId = aircraftId;
  }

  public AircraftType getAircraftType() {
    return aircraftType;
  }

  public void setAircraftType(AircraftType aircraftType) {
    this.aircraftType = aircraftType;
  }

  public Airline getAirline() {
    return airline;
  }

  public void setAirline(Airline airline) {
    this.airline = airline;
  }

  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }
  
  /* End of automatic generated code by Eclipse. */  

  
}
