package com.muhayu.ee;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Created by hyecheon on 2017. 4. 11..
 */
@Stateless
public class BankServiceFacade {
    @Inject
    CustomerService customerService;
    @Inject
    LoanService loanService;
    @Inject
    AccountService accountService;

    public boolean getLoan(int sessionId, double amount) {
        boolean result = false;
        long id = customerService.getCustomer(sessionId);
        if (customerService.checkId(id) && loanService.checkCreditRating(id, amount) && accountService.getLoan(amount)) {
            result = accountService.setCustomerBalance(id, amount);
        }
        return result;
    }


}
