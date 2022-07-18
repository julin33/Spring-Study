package com.julin.demo01;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
//        host.rent();
        //代理
        Proxy proxy = new Proxy();
        proxy.rent();
    }
}
