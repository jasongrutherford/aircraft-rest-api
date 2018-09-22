package com.jasongrutherford.homework.vistair.airlinelist.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

/**
 * The interface of the Aircraft Service.
 * 
 * @author Jason Rutherford
 *
 */
public interface AircraftService {

  List<Map<String, String>> listAllAircraft();
  
}
