/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.escuelaing.covidtool.services.impl;


import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.escuelaing.covidtool.model.CovidResult;
import edu.eci.escuelaing.covidtool.services.CovidService;

import org.json.JSONObject;
import org.springframework.stereotype.Service;
import edu.eci.escuelaing.covidtool.services.HttpConnectionService;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CovidServiceImpl implements CovidService{
    @Autowired
    HttpConnectionService httpConnectionService;
    public CovidServiceImpl() {

    }
    @Override
    public CovidResult getCovidByCountry(String country) throws UnirestException, IOException {
        JSONObject covidData = httpConnectionService.getCovidByCountry(country);
        
        String pais = covidData.getString("location");

        int confirmed = covidData.getInt("confirmed");

        int deaths = covidData.getInt("deaths");

        int recovered = covidData.getInt("recovered");

        return new CovidResult(pais, confirmed,deaths,recovered);
    }

    @Override
    public CovidResult getAllCovid() throws UnirestException, IOException {
        JSONObject covidData = httpConnectionService.getAllCovid();
        String pais = covidData.getString("location");

        int confirmed = covidData.getInt("confirmed");

        int deaths = covidData.getInt("deaths");

        int recovered = covidData.getInt("recovered");

        return new CovidResult(pais, confirmed,deaths,recovered);
 
    }
    
}
