package com.liuwen.JavaNIO.chatServer;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * ----------------------------------------------------------------------
 * <p>File name: ChatServer
 * <p>Desc: 使用Java NIO 完成一个多人聊天室功能
 * <p>
 *
 * @author Create by liu wen at 2021.12.5 18:25
 * <p>
 * ----------------------------------------------------------------------
 */
public class ChatServer {
    public static void main(String[] args) {
        try {
            new ChatServer().startServer();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //服务器端启动的方法
    public void startServer() throws IOException {
    }

    //处理可读状态操作
    private void readOperator(Selector selector,
                              SelectionKey selectionKey) throws IOException {

    }

    //广播到其他客户端
    private void castOtherClient(String message,
                                 Selector selector,
                                 SocketChannel socketChannel) throws IOException {

    }

    //处理接入状态操作
    private void acceptOperator(ServerSocketChannel serverSocketChannel,
                                Selector selector) throws IOException {

    }
}
