package com.muhayu.normal;

/**
 * Created by hyecheon on 2017. 4. 11..
 */
public class MySingleton02 {
    private static final MySingleton02 ourInstance = new MySingleton02();

    public static MySingleton02 getInstance() {
        return ourInstance;
    }

    private MySingleton02() {
    }
}
