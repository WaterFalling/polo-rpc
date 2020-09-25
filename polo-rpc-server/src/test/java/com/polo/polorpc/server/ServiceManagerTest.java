package com.polo.polorpc.server;

import com.polo.polorpc.Request;
import com.polo.polorpc.ServiceDescriptor;
import com.polo.polorpc.common.utils.ReflectionUtils;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

/**
 * @author polo
 */
public class ServiceManagerTest {
    ServiceManager sm;

    @Before
    public void init(){
        sm = new ServiceManager();
    }

    @Test
    public void register() {
        TestInterface bean = new TestClass();
        sm.register(TestInterface.class, bean);
    }

    @Test
    public void lookup() {
        Method method = ReflectionUtils.getPublicMethods(TestInterface.class)[0];
        ServiceDescriptor sdp = ServiceDescriptor.from(TestInterface.class, method);
        Request request = new Request();
        request.setService(sdp);

        register(); // 查找服务之前先将服务注册
        ServiceInstance instance = sm.lookup(request);
        assertNotNull(instance);
    }
}