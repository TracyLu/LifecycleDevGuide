package net.imadz.guide.impl;

/**
 * Created by Tracy on 8/25/15.
 */
//TODO STEP 6. 添加@LifecycleMeta标识来指明使用的是哪个生命周期类
/**
 * @LifecycleMeta(value = 定义的生命周期类)
 */
public class Customer extends ReactiveObject{
    protected Customer() {
        //TODO STEP 7. 初始化新建Customer的状态,调用ReactiveObject中的initialState方法。
    }

    //TODO STEP 8. 定义所有事件对应的方法
    /***
     * 使用@Event标注方法
     */
}
