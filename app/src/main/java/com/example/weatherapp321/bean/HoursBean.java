package com.example.weatherapp321.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * @Description: 查看天气情况
 * @Author: 旷智仁
 * @Email: 1318040970@qq.com
 * @Date: 2022/12/24 9:20
 */
public class HoursBean implements Serializable {
    @SerializedName("hours")
     private String hours;

    @SerializedName("wea")
    private String wea;

    @SerializedName("tem")
    private String tem;

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getWea() {
        return wea;
    }

    public void setWea(String wea) {
        this.wea = wea;
    }

    public String getTem() {
        return tem;
    }

    public void setTem(String tem) {
        this.tem = tem;
    }

    @Override
    public String toString() {
        return "HoursBean{" +
                "hours='" + hours + '\'' +
                ", wea='" + wea + '\'' +
                ", tem='" + tem + '\'' +
                '}';
    }
}
