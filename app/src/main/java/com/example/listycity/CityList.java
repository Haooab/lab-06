package com.example.listycity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/**
 * This is a class that keeps a ist of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city the city to be added
     * @throws IllegalArgumentException if cities already existed
     */
    public void add(City city){
        if(cities.contains(city)){
            throw new IllegalArgumentException("City already exists");
        }
        cities.add(city);

    }

    /**
     * This returns a sorted list of cities
     * @return Return the sorted list
     */
    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return cities;
    }

    /**
     * This returns a boolean if a city exists
     * @param c the city to be checked
     * @return Return the boolean indicates if c is in the cityList
     */
    public boolean hasCity(City c) {
        for (City city : cities) {
            if (city.getCityName().equals(c.getCityName())) {
                return true;
            }
        }
        return false;
    }

    /**
     * This deletes a city from the list and returns the number of cities
     * @param c the city to be deleted
     * @return Return the number of remaining cities in the list
     */
    public int deleteCity(City c) {
        for (City city : cities) {
            if (city.getCityName().equals(c.getCityName())) {
                cities.remove(city);
            } else if (!hasCity(c)) {
                throw new IllegalArgumentException("City does not exist");
            }
        }
        return cities.size();
    }
}

