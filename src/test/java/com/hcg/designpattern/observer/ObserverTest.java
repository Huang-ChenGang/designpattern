package com.hcg.designpattern.observer;

import com.hcg.designpattern.observer.impl.Goods;
import com.hcg.designpattern.observer.impl.Order;
import com.hcg.designpattern.observer.impl.Payment;
import com.hcg.designpattern.observer.impl.Stock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ObserverTest {

    @Test
    public void testOrder() {
        Order order = new Order();
        Payment payment = new Payment();
        Stock stock = new Stock();
        Goods goods = new Goods();

        order.addObserver(payment);
        payment.addObserver(stock);
        payment.addObserver(goods);

        Assertions.assertEquals(1, order.getObserverNumber());
        Assertions.assertEquals(2, payment.getObserverNumber());

        order.notifyObserver();

        Assertions.assertEquals("订单已生成", order.getNotifyDesc());
        Assertions.assertEquals("已完成支付", payment.getUpdateDesc());
        Assertions.assertEquals("已完成支付，进行库存更新并送货", payment.getNotifyDesc());
        Assertions.assertEquals("库存已更新", stock.getUpdateDesc());
        Assertions.assertEquals("商品已发出", goods.getUpdateDesc());
    }
}
