package com.i034114.taller2.Parser;

import com.i034114.taller2.Models.Country;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aula7 on 26/09/17.
 */

public class JsonCountry {

    public static List<Country> getData(String content) throws JSONException {
        JSONArray jsonArray = new JSONArray(content);
        List<Country> countryList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++){
            JSONObject item = jsonArray.getJSONObject(i);
            Country country = new Country();
            country.setName(item.getString("name"));
            country.setDominio(item.getString("topLevelDomain"));
            country.setAlphacode(item.getString("alpha3Code"));
            country.setCodigo(item.getString("callingCodes"));
            country.setCapital(item.getString("capital"));
            country.setNameA(item.getString("altSpellings"));
            country.setRegion(item.getString("region"));
            country.setSubregion(item.getString("subregion"));
            country.setFronteras(item.getString("borders"));
            //country.setPoblacion(item.getInt("population"));
            countryList.add(country);
        }
        return countryList;
    }
}
