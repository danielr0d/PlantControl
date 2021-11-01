package com.example.plantcontrol;

public class Plant {
    private String plantName;
    private String plantType;
    private String plantSoil;
    private String plantAbout;

    public Plant(String plantName, String plantType, String plantSoil, String plantAbout){
        setPlantName(plantName);
        setPlantType(plantType);
        setPlantSoil(plantSoil);
        setPlantAbout(plantAbout);
    }

    public String getPlantName(){
        return plantName;
    }

    public void setPlantName(String plantName){
        this.plantName = plantName;
    }

    public String getPlantType(){
        return plantType;
    }

    public void setPlantType(String plantType){
        this.plantType = plantType;
    }

    public String getPlantSoil(){
        return plantSoil;
    }

    public void setPlantSoil(String plantSoil){
        this.plantSoil = plantSoil;
    }

    public String getPlantAbout(){
        return plantAbout;
    }

    public void setPlantAbout(String plantAbout){
        this.plantAbout = plantAbout;
    }

    @Override
    public String toString(){
        return getPlantName() + " - " + getPlantAbout() + " - " + getPlantSoil() + " - " + getPlantType()
    }
}
