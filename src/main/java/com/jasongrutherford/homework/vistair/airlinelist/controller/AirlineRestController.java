package com.jasongrutherford.homework.vistair.airlinelist.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jasongrutherford.homework.vistair.airlinelist.service.AircraftService;

/**
 * The REST Controller Entry Points.
 * 
 * @author Jason Rutherford
 *
 */
@RestController
public class AirlineRestController {

  /**
   * The aircraft service layer which contains the business logic of the application.
   */
  @Autowired
  private AircraftService aircraftService;
  
  /**
   * Returns List of Maps which gets converted into JSON Array of Objects.
   * @return List of Maps.
   */
  @RequestMapping(value = "/api/1.0/aircraft", method = RequestMethod.GET)
  public @ResponseBody List<Map<String, String>> listAllAircraft() {
    return aircraftService.listAllAircraft();
  }
  
}
