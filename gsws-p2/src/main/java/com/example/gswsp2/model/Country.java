package com.example.gswsp2.model;

public class Country {

    public String name;
    private int population;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }

    public static Country of(
        String name,
        int population
    ) {
        Country country = new Country();
        country.setName(name);
        country.setPopulation(population);

        return country;
    }
}
