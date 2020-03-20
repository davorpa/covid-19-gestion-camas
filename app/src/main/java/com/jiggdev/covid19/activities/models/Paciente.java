package com.jiggdev.covid19.activities.models;

public class Paciente {
    private String key;
    private String ubicacion;
    private boolean isCovid19;

    private boolean intubado;
    private boolean pronacion;
    private boolean ecmo; //oxigenación por membrana extracorpórea
    private boolean hfnc; //cánula nasal
    private boolean emni; //ventilación mecánica no invasiva.

    public Paciente(){

    }
}
