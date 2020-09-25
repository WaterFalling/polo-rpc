package com.polo.polorpc.server;

import com.polo.polorpc.codec.Decoder;
import com.polo.polorpc.codec.Encoder;
import com.polo.polorpc.codec.JSONDecoder;
import com.polo.polorpc.codec.JSONEncoder;
import com.polo.polorpc.transport.HttpTransportServer;
import com.polo.polorpc.transport.TransportServer;
import lombok.Data;

/**
 * server 配置
 *
 * @author polo
 */
@Data
public class RpcServerConfig {
    private Class<? extends TransportServer> transportClass = HttpTransportServer.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private int port = 3000;

}
