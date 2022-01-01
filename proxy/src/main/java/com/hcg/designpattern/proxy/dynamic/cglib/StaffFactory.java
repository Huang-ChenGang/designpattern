package com.hcg.designpattern.proxy.dynamic.cglib;

import org.springframework.cglib.proxy.Enhancer;

public class StaffFactory {

    public static StaffInstance getGeneralStaff(StaffInstance staff) {
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(staff.getClass().getClassLoader());
        enhancer.setSuperclass(staff.getClass());
        enhancer.setCallback(new GeneralMethodInterceptor());
        return (StaffInstance) enhancer.create();
    }

    public static StaffInstance getManagerStaff(StaffInstance staff) {
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(staff.getClass().getClassLoader());
        enhancer.setSuperclass(staff.getClass());
        enhancer.setCallback(new ManagerMethodInterceptor());
        return (StaffInstance) enhancer.create();
    }
}
