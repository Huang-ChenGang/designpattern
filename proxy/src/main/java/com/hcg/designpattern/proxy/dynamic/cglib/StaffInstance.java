package com.hcg.designpattern.proxy.dynamic.cglib;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StaffInstance {
    private String name;
    private BigDecimal salary;
}
