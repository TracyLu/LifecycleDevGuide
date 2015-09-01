package net.imadz.guide.impl;

import net.imadz.guide.lifecycle.CustomerLifecycleMeta;
import net.imadz.lifecycle.annotations.Event;
import net.imadz.lifecycle.annotations.LifecycleMeta;
import net.imadz.lifecycle.annotations.StateIndicator;

/**
 * Created by Tracy on 8/25/15.
 */
@LifecycleMeta(value = CustomerLifecycleMeta.class)
public class Customer {
    @StateIndicator
    private String state = null;

    public String getState() {
        return state;
    }

    public Customer() {
        state = CustomerLifecycleMeta.States.Draft.class.getSimpleName();
    }

    @Event
    public void activate(){}

    @Event
    public void suspend(){}

    @Event
    public void resume(){}

    @Event
    public void cancel(){}
}
