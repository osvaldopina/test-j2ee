package com.test.j2ee;

import org.springframework.stereotype.Component;

@Component
public class AnyBean {

    public boolean isAlwaysTrue() {
        return true;
    }

    public boolean isAlwaysFalse() {
        return false;
    }
}
