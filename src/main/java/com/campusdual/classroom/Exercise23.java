package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Exercise23 {

    public static Map<String, Person> createHashMap() { // Almacenamiento basado en clave-valor:
        Map<String, Person> customMap = new HashMap<>();

        customMap.put("person", new Person("John", "Smith"));
        customMap.put("teacher",new Teacher("María", "Montessori","Educación"));
        customMap.put("police" ,new PoliceOfficer("Jake","Peralta","B-99"));
        customMap.put("doctor", new Doctor("Gregory","House","Nefrología e infectología"));

        return customMap;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        return map.get(key);
    }


    public static void printMapValues(Map<String, Person> map) {
        for (Map.Entry<String, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": ");
            entry.getValue().getDetails();

        }
    }

    public static void main(String[] args) {
        Map<String, Person> map = createHashMap();
        addMapValue(map, "police", new PoliceOfficer("Charles", "Boyle", "B-99"));
        printMapValues(map);
    }
    
}
