package com.springnovel.payment.springxml;

import com.springnovel.dao.IOrderDao;
import com.springnovel.perfectlogger.ILogger;

import java.math.BigDecimal;

public class PaymentAction {

    private ILogger logger;
    private IOrderDao orderDao;

    public PaymentAction(ILogger logger) {
        super();
        this.logger = logger;
    }

    public PaymentAction(ILogger logger, IOrderDao orderDao) {
        super();
        this.logger = logger;
        this.orderDao = orderDao;
    }

    public void pay(BigDecimal payValue) {
        logger.log("pay begin, payValue is " + payValue);

        // do otherthing
        // ...

        logger.log("pay end");
    }

    public void updateOrderAfterPayment(String orderId) {
        orderDao.updateOrderAfterPayment(orderId);
    }

}