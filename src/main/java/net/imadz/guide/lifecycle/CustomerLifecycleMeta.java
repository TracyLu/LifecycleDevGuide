package net.imadz.guide.lifecycle;

import net.imadz.lifecycle.annotations.EventSet;
import net.imadz.lifecycle.annotations.StateMachine;
import net.imadz.lifecycle.annotations.StateSet;
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
        static interface Draft {}

        @Final
        static interface Cancelled {}

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
