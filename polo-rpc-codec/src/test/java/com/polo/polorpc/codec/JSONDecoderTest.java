package com.polo.polorpc.codec;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author polo
 */
public class JSONDecoderTest {

    @Test
    public void decoder() {
        Encoder encoder = new JSONEncoder();

        TestBean bean = new TestBean();
        bean.setName("polo");
        bean.setAge(20);

        byte[] bytes = encoder.encode(bean);

        Decoder decoder = new JSONDecoder();
        TestBean bean1 = decoder.decode(bytes, TestBean.class);

        assertEquals(bean.getName(), bean1.getName());
        assertEquals(bean.getAge(), bean1.getAge());
    }
}