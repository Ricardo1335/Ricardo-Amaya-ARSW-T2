/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.escuelaing.covidtool.services;

import java.io.IOException;

import com.mashape.unirest.http.exceptions.UnirestException;

import edu.eci.escuelaing.covidtool.model.CovidResult;

public interface CovidService {
    CovidResult getCovidByCountry(String country) throws UnirestException, IOException;
    CovidResult getAllCovid() throws UnirestException, IOException;
}
