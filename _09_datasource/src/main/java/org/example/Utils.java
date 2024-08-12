package org.example;

import java.util.HashMap;

public class Utils {
    private HashMap<String,String> map;

    public HashMap<String, String> getMap() {
        return map;
    }

    public void setMap(HashMap<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Utils{" +
                "map=" + map +
                '}';
    }
}
