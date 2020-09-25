package com.polo.polorpc.example;

import com.polo.polorpc.client.RpcClient;

/**
 * @author polo
 */
public class Client {

    public static void main(String[] args) {
        RpcClient client = new RpcClient();
        CalcService service = client.getProxy(CalcService.class);

        int sum = service.add(1, 2);
        int min = service.minus(6, 2);

        System.out.println(sum);
        System.out.println(min);
    }
}
