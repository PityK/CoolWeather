package com.coolweather.android.db;

import org.litepal.crud.DataSupport;



/**
 * Created by admin on 2017/1/16.
 */

public class County extends DataSupport {
    private int id;
    private String CountyName;
    private String WeatherId;
    private int CityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return CountyName;
    }

    public void setCountyName(String countyName) {
        CountyName = countyName;
    }

    public String getWeatherId() {
        return WeatherId;
    }

    public void setWeatherId(String weatherId) {
        WeatherId = weatherId;
    }

    public int getCityId() {
        return CityId;
    }

    public void setCityId(int cityId) {
        CityId = cityId;
    }
}
