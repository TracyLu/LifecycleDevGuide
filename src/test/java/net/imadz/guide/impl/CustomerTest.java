package net.imadz.guide.impl;

import net.imadz.verification.VerificationException;
import org.junit.Test;

/**
 * Created by Tracy on 8/25/15.
 */
public class CustomerTest{
    @Test
    public void should_support_standalone_object_without_relation_lifecycle() throws VerificationException {
        Customer customer = new Customer();
        //TODO STEP 9.当实现了CustomerLifecycleMeta和Customer类之后，取消下列代码的注释，在命令行执行mvn clean test即可运行测试。
//        customer.activate();
//        assertEquals(CustomerLifecycleMeta.States.Active.class.getSimpleName(), customer.getState());
//        customer.suspend();
//        assertEquals(CustomerLifecycleMeta.States.Suspended.class.getSimpleName(), customer.getState());
//        customer.resume();
//        assertEquals(CustomerLifecycleMeta.States.Active.class.getSimpleName(), customer.getState());
//        customer.cancel();
//        assertEquals(CustomerLifecycleMeta.States.Canceled.class.getSimpleName(), customer.getState());
    }
}
