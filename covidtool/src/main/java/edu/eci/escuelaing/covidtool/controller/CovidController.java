/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.escuelaing.covidtool.controller;

import edu.eci.escuelaing.covidtool.services.CovidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
public class CovidController {
    @Autowired
    CovidService covidservice;

    @RequestMapping(value = "covid/{country}", method = RequestMethod.GET)
    public ResponseEntity<?> getCovidByCountry(@PathVariable(name="city") String city) {
        try {
            return new ResponseEntity<>(covidservice.getCovidByCountry(city), HttpStatus.ACCEPTED);
        } catch(Exception e) {
            return new ResponseEntity<>("Error al buscar ciudad", HttpStatus.BAD_REQUEST);
        }
        
    }
    @RequestMapping(value = "covidall", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCovid() {
        try {
            return new ResponseEntity<>(covidservice.getAllCovid(), HttpStatus.ACCEPTED);
        } catch(Exception e) {
            return new ResponseEntity<>("Error al buscar ciudad", HttpStatus.BAD_REQUEST);
        }
        
    }
}
