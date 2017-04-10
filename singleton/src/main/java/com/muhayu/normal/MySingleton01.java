package com.muhayu.normal;

/**
 * Created by hyecheon on 2017. 4. 11..
 */
public class MySingleton01 {
    private static MySingleton01 ourInstance;

    public static synchronized MySingleton01 getInstance() {
        if (ourInstance == null) {
            ourInstance = new MySingleton01();
        }
        return ourInstance;
    }

    private MySingleton01() {
    }
}
