package net.imadz.guide.lifecycle;

import net.imadz.lifecycle.annotations.EventSet;
import net.imadz.lifecycle.annotations.StateMachine;
import net.imadz.lifecycle.annotations.StateSet;

/**
 * Created by Tracy on 8/25/15.
 */
//TODO STEP 1.添加@StateMachine标识该接口定义的是状态机
public interface CustomerLifecycleMeta {

    //TODO STEP 2.添加@StateSet标识状态集
    static interface States {
        /***
         * 例子：添加初始状态Draft，customer在该状态被事件Activate激活后，迁移到Active状态。
         * @Initial
         * @Transition(event = CustomerLifecycleMeta.Events.Activate.class, value = {Active.class})
         * static interface Draft{}
         *
         * 使用@Initial标识初始状态，使用@Transition来添加转移
         * @Transition中的event表示事件，value表示目标状态。
         */
        //TODO STEP 2.1 添加初始状态

        //TODO STEP 2.2 添加其他状态

        /***
         * 使用@Final标识终结状态
         */
        //TODO STEP 2.3 添加终结状态

        //TODO STEP 4.在非终结状态上添加转移
    }

    //TODO STEP 3.添加@EventSet标识事件集
    static interface Events {
        //TODO STEP 3.1 添加各个事件
        /**
         例子：static interface Activate {}
         **/

    }

}
