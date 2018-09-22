package com.jasongrutherford.homework.vistair.airlinelist.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jasongrutherford.homework.vistair.airlinelist.model.Aircraft;

/**
 * JPA Repository to retrieve the data model entities from the data source.
 * 
 * @author Jason Rutherford
 */
@Repository("aircraftRepository")
public interface AircraftRepository extends JpaRepository<Aircraft, Integer> {

  /**
   * Return a list of all the aircraft stored in the data source.
   * 
   * @return A list of all the aircraft stored in the data source.
   */
  @Query("select a from Aircraft a")
  List<Aircraft> listAllAircraft();
  
}
