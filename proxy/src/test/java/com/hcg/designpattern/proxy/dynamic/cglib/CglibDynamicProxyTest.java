package com.hcg.designpattern.proxy.dynamic.cglib;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CglibDynamicProxyTest {

    @Test
    public void testGeneralSetName() {
        StaffInstance staff = new StaffInstance("Jason", BigDecimal.ONE);
        StaffInstance generalInterceptor = StaffFactory.getGeneralStaff(staff);
        assertNull(generalInterceptor.getName());
        generalInterceptor.setName("Jr Jason");

        assertEquals("Jr Jason", generalInterceptor.getName());
        assertNull(generalInterceptor.getSalary());
        assertEquals("Jason", staff.getName());
        assertEquals(BigDecimal.ONE, staff.getSalary());
    }

    @Test(expected = IllegalAccessException.class)
    public void testGeneralSetSalary() {
        StaffInstance staff = new StaffInstance("Jason", BigDecimal.ONE);
        StaffInstance generalInterceptor = StaffFactory.getGeneralStaff(staff);
        assertNull(generalInterceptor.getSalary());
        generalInterceptor.setSalary(BigDecimal.TEN);
    }

    @Test(expected = IllegalAccessException.class)
    public void testManagerSetName() {
        StaffInstance staff = new StaffInstance("Jason", BigDecimal.ONE);
        StaffInstance managerInterceptor = StaffFactory.getManagerStaff(staff);
        assertNull(managerInterceptor.getName());
        managerInterceptor.setName("Jr Jason");
    }

    @Test
    public void testManageSetSalary() {
        StaffInstance staff = new StaffInstance("Jason", BigDecimal.ONE);
        StaffInstance managerInterceptor = StaffFactory.getManagerStaff(staff);
        assertNull(managerInterceptor.getSalary());
        managerInterceptor.setSalary(BigDecimal.TEN);

        assertNull(managerInterceptor.getName());
        assertEquals(BigDecimal.TEN, managerInterceptor.getSalary());
        assertEquals("Jason", staff.getName());
        assertEquals(BigDecimal.ONE, staff.getSalary());
    }
}
