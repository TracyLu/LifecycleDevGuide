package net.imadz.guide.impl;

import net.imadz.guide.lifecycle.CustomerLifecycleMeta;
import net.imadz.lifecycle.annotations.LifecycleMeta;
import net.imadz.lifecycle.annotations.StateIndicator;

/**
 * Created by Tracy on 8/25/15.
 */
@LifecycleMeta(value = CustomerLifecycleMeta.class)
public class Customer {
    public Customer() {
        state = CustomerLifecycleMeta.States.Draft.class.getSimpleName();
    }
    @StateIndicator
    private String state = null;
}
