package com.hcg.designpattern.proxy.dynamic.jdk;

import java.lang.reflect.Proxy;

public class StaffFactory {

    public static StaffInterface getGeneralStaff(StaffInterface staff) {
        return (StaffInterface) Proxy.newProxyInstance(
                staff.getClass().getClassLoader(),
                staff.getClass().getInterfaces(),
                new GeneralInvocationHandler(staff));
    }

    public static StaffInterface getManagerStaff(StaffInterface staff) {
        return (StaffInterface) Proxy.newProxyInstance(
                staff.getClass().getClassLoader(),
                staff.getClass().getInterfaces(),
                new ManagerInvocationHandler(staff));
    }
}
