package com.hcg.designpattern.proxy.dynamic.jdk;

import java.math.BigDecimal;

public interface StaffInterface {
    String getName();
    void setName(String name);

    BigDecimal getSalary();
    void setSalary(BigDecimal salary);
}
