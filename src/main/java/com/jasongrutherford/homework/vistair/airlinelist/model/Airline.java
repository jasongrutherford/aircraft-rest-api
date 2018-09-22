package com.jasongrutherford.homework.vistair.airlinelist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Class which represents the airline in the data model.  E.g Qantas, etc.
 * 
 * @author Jason Rutherford
 */

@Entity
public class Airline {

  /**
   * The primary key of the airline table.
   */
  @Id
  @GeneratedValue
  @Column(name = "airline_id")
  private int airlineId;
  
  /**
   * String representation of the airline.  E.g "QANTAS", etc.
   */
  @Column(name = "airline_name")
  private String airlineName;

  /* Beginning of automatic generated code by Eclipse. */
  
  public int getAirlineId() {
    return airlineId;
  }

  public void setAirlineId(int airlineId) {
    this.airlineId = airlineId;
  }

  public String getAirlineName() {
    return airlineName;
  }

  public void setAirlineName(String airlineName) {
    this.airlineName = airlineName;
  }
  
  /* End of automatic generated code by Eclipse. */

  
}
