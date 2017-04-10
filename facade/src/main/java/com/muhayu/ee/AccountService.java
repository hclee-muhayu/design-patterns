package com.muhayu.ee;

import javax.ejb.Stateless;

/**
 * Created by hyecheon on 2017. 4. 11..
 */
@Stateless
public class AccountService {
    public boolean getLoan(double amount) {
        return true;
    }

    public boolean setCustomerBalance(long id, double amount) {
        return true;
    }
}
