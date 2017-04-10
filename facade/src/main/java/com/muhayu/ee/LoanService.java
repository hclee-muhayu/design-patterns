package com.muhayu.ee;

import javax.ejb.Stateless;

/**
 * Created by hyecheon on 2017. 4. 11..
 */
@Stateless
public class LoanService {
    public boolean checkCreditRating(long id, double amount) {
        return true;
    }
}
