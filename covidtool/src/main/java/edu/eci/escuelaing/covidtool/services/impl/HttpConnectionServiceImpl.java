/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.escuelaing.covidtool.services.impl;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import org.json.JSONObject;
import org.springframework.stereotype.Service;
import edu.eci.escuelaing.covidtool.services.HttpConnectionService;

@Service
public class HttpConnectionServiceImpl implements HttpConnectionService {
    public HttpConnectionServiceImpl() {
        
    }

    @Override
    public JSONObject getCovidByCountry(String country) throws UnirestException {
        HttpResponse<String> response = Unirest.get("https://covid-19-coronavirus-statistics.p.rapidapi.com/v1/stats?country="+country)
	.header("x-rapidapi-host", "covid-19-coronavirus-statistics.p.rapidapi.com")
	.header("x-rapidapi-key", "52a5470288msh608474db8e4d433p1f3cb4jsncba2b4bc2581")
	.asString();
        return new JSONObject(response.getBody());
    }

    @Override
    public JSONObject getAllCovid() throws UnirestException {
        HttpResponse<String> response = Unirest.get("https://covid-19-coronavirus-statistics.p.rapidapi.com/v1/stats")
	.header("x-rapidapi-host", "covid-19-coronavirus-statistics.p.rapidapi.com")
	.header("x-rapidapi-key", "52a5470288msh608474db8e4d433p1f3cb4jsncba2b4bc2581")
	.asString();
        return new JSONObject(response.getBody());    }
}
