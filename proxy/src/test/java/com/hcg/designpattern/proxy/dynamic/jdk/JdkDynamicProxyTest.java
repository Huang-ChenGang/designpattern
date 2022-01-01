package com.hcg.designpattern.proxy.dynamic.jdk;

import org.junit.Test;

import java.lang.reflect.UndeclaredThrowableException;
import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class JdkDynamicProxyTest {

    @Test
    public void testGeneralSetName() {
        StaffInterface staff = new Staff("Jason", BigDecimal.ONE);
        StaffInterface generalProxy = StaffFactory.getGeneralStaff(staff);
        assertEquals("Jason", generalProxy.getName());
        generalProxy.setName("Jr Jason");
        assertEquals("Jr Jason", generalProxy.getName());
    }

    @Test(expected = UndeclaredThrowableException.class)
    public void testGeneralSetSalary() {
        StaffInterface staff = new Staff("Jason", BigDecimal.ONE);
        StaffInterface generalProxy = StaffFactory.getGeneralStaff(staff);
        assertEquals(BigDecimal.ONE, generalProxy.getSalary());
        generalProxy.setSalary(BigDecimal.TEN);
        assertEquals(BigDecimal.ONE, generalProxy.getSalary());
    }

    @Test(expected = UndeclaredThrowableException.class)
    public void testManagerSetName() {
        StaffInterface staff = new Staff("Jason", BigDecimal.ONE);
        StaffInterface managerProxy = StaffFactory.getManagerStaff(staff);
        assertEquals("Jason", managerProxy.getName());
        managerProxy.setName("Jr Jason");
        assertEquals("Jr Jason", managerProxy.getName());
    }

    @Test
    public void testManagerSetSalary() {
        StaffInterface staff = new Staff("Jason", BigDecimal.ONE);
        StaffInterface managerProxy = StaffFactory.getManagerStaff(staff);
        assertEquals(BigDecimal.ONE, managerProxy.getSalary());
        managerProxy.setSalary(BigDecimal.TEN);
        assertEquals(BigDecimal.TEN, managerProxy.getSalary());
    }
}
