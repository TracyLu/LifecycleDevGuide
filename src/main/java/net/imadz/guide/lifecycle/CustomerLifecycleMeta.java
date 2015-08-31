package net.imadz.guide.lifecycle;

import net.imadz.lifecycle.annotations.*;
import net.imadz.lifecycle.annotations.state.Final;
import net.imadz.lifecycle.annotations.state.Initial;

/**
 * Created by Tracy on 8/25/15.
 */
@StateMachine
public interface CustomerLifecycleMeta {
    @StateSet
    static interface States {
        @Initial
        @Transition(event = Events.Activate.class, value = Active.class)
        static interface Draft {}

        @Final
        static interface Cancelled {}

        @Transitions({@Transition(event = Events.Suspend.class, value = Suspended.class), @Transition(event = Events.Cancel.class, value = Cancelled.class)})
        static interface Active {}
        
        static interface Suspended {}
    }

    @EventSet
    static interface Events {
        static interface Activate {}

        static interface Suspend {}

        static interface Resume {}
        
        static interface Cancel {}
    }

}
