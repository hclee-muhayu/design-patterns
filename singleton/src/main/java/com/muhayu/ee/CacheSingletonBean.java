package com.muhayu.ee;

import javax.annotation.PostConstruct;
import javax.ejb.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by hyecheon on 2017. 4. 11..
 */
@Startup
@DependsOn("MyLoggingBean")
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
@Singleton
@AccessTimeout(value = 120000)
public class CacheSingletonBean {
    private Map<Integer, String> myCache;

    @EJB
    private MyLoggingBean loggingBean;

    @PostConstruct
    public void start() {
        loggingBean.logInfo("시작합니다");
        myCache = new HashMap<>();
    }

    @AccessTimeout(value = 30, unit = TimeUnit.SECONDS)
    @Lock(LockType.WRITE)
    public void addUser(Integer id, String name) {
        myCache.put(id, name);
    }

    @Lock(LockType.READ)
    public String getName(Integer id) {
        return myCache.get(id);
    }
}
