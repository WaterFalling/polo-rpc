package com.polo.polorpc.server;

import com.polo.polorpc.Request;
import com.polo.polorpc.common.utils.ReflectionUtils;

/**
 * 调用具体服务
 *
 * @author polo
 */
public class ServiceInvoker {
    public Object invoke(ServiceInstance service, Request request){
        return ReflectionUtils.invoke(
                service.getTarget(),
                service.getMethod(),
                request.getParameters()
        );
    }
}
