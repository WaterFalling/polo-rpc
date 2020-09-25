package com.polo.polorpc.client;

import com.polo.polorpc.Peer;
import com.polo.polorpc.codec.Decoder;
import com.polo.polorpc.codec.Encoder;
import com.polo.polorpc.codec.JSONDecoder;
import com.polo.polorpc.codec.JSONEncoder;
import com.polo.polorpc.transport.HttpTransportClient;
import com.polo.polorpc.transport.TransportClient;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

/**
 * @author polo
 */
@Data
public class RpcClientConfig {
    private Class<? extends TransportClient> transportClass
            = HttpTransportClient.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private Class<? extends TransportSelector> selectorClass
            = RandomTransportSelector.class;
    private int connectCount = 1;
    private List<Peer> servers = Arrays.asList(
            new Peer("127.0.0.1", 3000)
    );
}
