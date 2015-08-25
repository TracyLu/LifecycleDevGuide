package net.imadz.guide.impl;

/**
 * Created by Tracy on 8/25/15.
 */
public abstract class ReactiveObject {
    //TODO STEP 4: 添加@StateIndicator标识，目的是为了框架自动给状态赋值。
    private String state = null;

    protected void initialState(String stateName) {
        if (null == state) {
            this.state = stateName;
        } else {
            throw new IllegalStateException("Cannot call initialState method after state had been initialized.");
        }
    }

    public String getState() {
        return state;
    }
}
