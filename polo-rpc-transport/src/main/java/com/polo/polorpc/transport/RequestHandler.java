package com.polo.polorpc.transport;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * 处理网络请求的 handler
 *
 * @author polo
 */
public interface RequestHandler {
    void onRequest(InputStream receive, OutputStream toResp);
}
