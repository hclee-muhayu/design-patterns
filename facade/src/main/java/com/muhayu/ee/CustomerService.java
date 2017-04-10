package com.muhayu.ee;

import javax.ejb.Stateless;

/**
 * Created by hyecheon on 2017. 4. 11..
 */
@Stateless
public class CustomerService {
    public long getCustomer(int sessionID) {
        return 100005L;
    }

    public boolean checkId(long x) {
        return true;
    }
}
