/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.escuelaing.covidtool.services;

/**
 *
 * @author batti
 */
import com.mashape.unirest.http.exceptions.UnirestException;

import org.json.JSONObject;

public interface HttpConnectionService {
    JSONObject getAllCovid() throws UnirestException;
    JSONObject getCovidByCountry(String city) throws UnirestException;
}
