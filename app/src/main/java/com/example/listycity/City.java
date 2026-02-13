package com.example.listycity;

/**
 *This is a class that defines a City.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    /**
     * this method creates a new city
     * @param city  name of the city
     * @param province  name of the province
     */
    City (String city, String province){
        this.city=city;
        this.province=province;
    }

    /**
     * this method returns the name of the city
     * @return
     *      Return the name of city.
     */
    String getCityName(){
        return this.city;
    }

    /**
     * this method returns the name of the province
     * @return
     *      Return the name of province of the city.
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * this method compares two cities
     * @param o the city to be compared
     * @return
     *      Return 0 if the cities are equal.
     *      Return 1 if the first city is greater than the second city.
     *      Return -1 if the first city is less than the second city.
     */
    @Override
    public int compareTo(City o) {
        City c= o;
        return this.city.compareTo(c.getCityName());
    }
}
