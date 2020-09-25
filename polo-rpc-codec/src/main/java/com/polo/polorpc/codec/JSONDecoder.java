package com.polo.polorpc.codec;

import com.alibaba.fastjson.JSON;

/**
 * 基于 json 的反序列化实现
 *
 * @author polo
 */
public class JSONDecoder implements Decoder {
    @Override
    public <T> T decode(byte[] bytes, Class<T> clazz) {
        return JSON.parseObject(bytes, clazz);
    }
}
