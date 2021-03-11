package com.kosta.day16.chatting;

import java.net.*;
class ClientExample {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println(
                "Usage: java ClientExample4 <user-name>");
            return;
        }
        try {
            Socket socket = new Socket("192.168.0.124", 9002);
            Thread thread1 = new SenderThread(socket);
            Thread thread2 = new ReceiverThread(socket);
            thread1.start();
            thread2.start();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
