/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.escuelaing.covidtool.model;

/**
 *
 * @author batti
 */
public class CovidResult {
    private String country;
    private int confirmed;
    private int deaths;
    private int recovered;
    public CovidResult( String country,int confirmed,int deaths,int recovered){

        this.SetCountry(country);
        this.SetConfirmed(confirmed);
        this.SetDeaths(deaths);
        this.SetRecovered(recovered);
    }
    public CovidResult(){
    };


    public void SetCountry(String c){
        this.country=c;
    }
    public String getCountry(String c){
        return this.country;
    }

    public void SetConfirmed(int c){
        this.confirmed=c;
    }
    public int getConfirmed(String c){
        return this.confirmed;
    }
    public void SetDeaths(int c){
        this.deaths=c;
    }
    public int getDeaths(String c){
        return this.deaths;
    }
    public void SetRecovered(int c){
        this.recovered=c;
    }
    public int getRecovered(String c){
        return this.recovered;
    }
}
