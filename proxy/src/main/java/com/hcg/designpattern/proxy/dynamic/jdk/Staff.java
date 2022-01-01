package com.hcg.designpattern.proxy.dynamic.jdk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Staff implements StaffInterface {
    private String name;
    private BigDecimal salary;
}
