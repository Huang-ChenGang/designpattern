package com.hcg.designpattern.observer;

import com.hcg.designpattern.observer.impl.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ObserverTest {

    @Test
    public void testOrder() {
        Order order = new Order();
        PaymentObserver paymentObserver = new PaymentObserver(order);
        Assertions.assertEquals(1, order.getObserverNumber());
        Assertions.assertNull(order.getSubjectState());
        Assertions.assertNull(paymentObserver.getObserverState());

        order.notifyObserver();
        Assertions.assertEquals("ORDERED", order.getSubjectState());
        Assertions.assertEquals("PAID", paymentObserver.getObserverState());

        PaymentSubject paymentSubject = new PaymentSubject();
        Stock stock = new Stock(paymentSubject);
        Goods goods = new Goods(paymentSubject);
        Assertions.assertEquals(2, paymentSubject.getObserverNumber());
        Assertions.assertNull(paymentSubject.getSubjectState());
        Assertions.assertNull(stock.getObserverState());
        Assertions.assertNull(goods.getObserverState());

        paymentSubject.notifyObserver();
        Assertions.assertEquals("PAID", paymentSubject.getSubjectState());
        Assertions.assertEquals("SEND", goods.getObserverState());
        Assertions.assertEquals("UPDATE", stock.getObserverState());
    }
}
