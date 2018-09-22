package com.jasongrutherford.homework.vistair.airlinelist.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jasongrutherford.homework.vistair.airlinelist.dao.AircraftRepository;
import com.jasongrutherford.homework.vistair.airlinelist.model.Aircraft;

/**
 * Implementation of the aircraft service interface.  Only supporting the ability
 * to return a list of aircrafts.
 * 
 * @author Jason Rutherford
 *
 */
@Service("aircraftService")
public class AircraftServiceImpl implements AircraftService {

  @Autowired
  private AircraftRepository aircraftDAO;
  
  /**
   * Business logic to go here.  Essentially we will extract from the Entities
   * the data we want to return to the client in a simple Map.
   * 
   * @return Returns a list of maps, each Map containing the required items from the data model.
   */
  public List<Map<String, String>> listAllAircraft() {
    
    
    List<Map<String, String>> aircraftList = new ArrayList();
    
    /* Flatten the Entities into a linked hash map. */        
    for (Aircraft a : aircraftDAO.listAllAircraft())
    {

      Map<String, String> row = new LinkedHashMap();
      row.put("airline", a.getAirline().getAirlineName());
      row.put("aircraft manufacturer", a.getAircraftType().getAircraftManufacturer().getAircraftManufName());
      row.put("aircraft type", a.getAircraftType().getAircraftTypeName());
      row.put("aircraft reg no;", a.getRegistrationNumber());
      aircraftList.add(row);
    }
        
    return aircraftList;
    
  }

}
