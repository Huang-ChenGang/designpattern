package com.hcg.designpattern.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GeneralInvocationHandler implements InvocationHandler {
    private final StaffInterface generalStaff;

    public GeneralInvocationHandler(StaffInterface generalStaff) {
        this.generalStaff = generalStaff;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.getName().equals("setSalary")) {
            throw new IllegalAccessException();
        }

        return method.invoke(generalStaff, args);
    }
}
