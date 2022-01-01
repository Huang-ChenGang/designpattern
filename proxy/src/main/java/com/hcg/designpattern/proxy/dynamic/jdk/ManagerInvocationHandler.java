package com.hcg.designpattern.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ManagerInvocationHandler implements InvocationHandler {
    private final StaffInterface manager;

    public ManagerInvocationHandler(StaffInterface manager) {
        this.manager = manager;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.getName().equals("setName")) {
            throw new IllegalAccessException();
        }

        return method.invoke(manager, args);
    }
}
