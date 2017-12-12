package com.chenxianbao.coolweather.gson;

/**
 * Created by 24141 on 2017/12/12.
 */
import com.google.gson.annotations.SerializedName;

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}