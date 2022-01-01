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
        assertEquals(BigDecimal.ONE, generalProxy.getSalary());
        assertEquals("Jr Jason", staff.getName());
        assertEquals(BigDecimal.ONE, staff.getSalary());
    }

    @Test(expected = UndeclaredThrowableException.class)
    public void testGeneralSetSalary() {
        StaffInterface staff = new Staff("Jason", BigDecimal.ONE);
        StaffInterface generalProxy = StaffFactory.getGeneralStaff(staff);
        assertEquals(BigDecimal.ONE, generalProxy.getSalary());
        generalProxy.setSalary(BigDecimal.TEN);
    }

    @Test(expected = UndeclaredThrowableException.class)
    public void testManagerSetName() {
        StaffInterface staff = new Staff("Jason", BigDecimal.ONE);
        StaffInterface managerProxy = StaffFactory.getManagerStaff(staff);
        assertEquals("Jason", managerProxy.getName());
        managerProxy.setName("Jr Jason");
    }

    @Test
    public void testManagerSetSalary() {
        StaffInterface staff = new Staff("Jason", BigDecimal.ONE);
        StaffInterface managerProxy = StaffFactory.getManagerStaff(staff);
        assertEquals(BigDecimal.ONE, managerProxy.getSalary());
        managerProxy.setSalary(BigDecimal.TEN);

        assertEquals("Jason", managerProxy.getName());
        assertEquals(BigDecimal.TEN, managerProxy.getSalary());
        assertEquals("Jason", staff.getName());
        assertEquals(BigDecimal.TEN, staff.getSalary());
    }
}
