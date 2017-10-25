package com.example.tong.bean;

/**
 * Created by tong on 2017/10/18.
 */

public class TodayWeather {
    private String city;
    private String updatetime;
    private String wendu;
    private String shidu;
    private String pm25;
    private String quality;
    private String fengxiang;
    private String fengli;
    private String date;
    private String high;
    private String low;
    private String type;

    public String getCity(){
        return city;
    }
    public String getUpdatetime(){
        return updatetime;
    }
    public String getWendu(){
        return wendu;
    }
    public String getShidu(){
        return shidu;
    }
    public String getPm25(){
        return pm25;
    }
    public String getDate(){
        return date;
    }
    public String getHigh(){
        return high;
    }
    public String getLow(){
        return low;
    }
    public String getType(){
        return type;
    }

    @Override
    public String toString(){
       return  "TodayWeather{" +
               "city= '" + city + '\'' +
               ",updatetime='" + updatetime + '\'' +
               ",wendu='" + wendu + '\'' +
               ",shidu='" + shidu + '\'' +
               ",pm2.5='" + pm25 + '\'' +
               ",quality='" + quality + '\'' +
               ",fengxiang='" + fengxiang + '\'' +
               ",fengli='" + fengli +'\'' +
               ",date='" + date + '\'' +
               ",high='" + high +'\'' +
               ",low=" + low + '\'
    }
}
