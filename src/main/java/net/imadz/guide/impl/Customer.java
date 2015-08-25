package net.imadz.guide.impl;

/**
 * Created by Tracy on 8/25/15.
 */
//TODO STEP 5: 添加@LifecycleMeta标识来指明使用的是哪个状态机
/**
 * @Lifecycle(value = 定义的状态机类)
 */
public class Customer extends ReactiveObject{
    protected Customer() {
        //TODO STEP 6: 初始化新建Customer的状态,调用ReactiveObject中的initialState方法。
    }

    //TODO STEP 7: 定义所有事件对应的方法
    /***
     * 使用@Event标注方法
     */
}
