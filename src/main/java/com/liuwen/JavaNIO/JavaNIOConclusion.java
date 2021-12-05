package com.liuwen.JavaNIO;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * ----------------------------------------------------------------------
 * <p>File name: JavaNIOConclusion
 * <p>Desc: todo
 * <p>
 *
 * @author Create by liu wen at 2021.12.5 18:10
 * <p>
 * ----------------------------------------------------------------------
 */
public class JavaNIOConclusion {
    /**
     * NIO编程步骤总结:
     * 第一步：创建Selector选择器
     * 第二步：创建ServerSocketChannel通道，并绑定监听端口
     * 第三步：设置Channel通道是非阻塞模式
     * 第四步：把Channel注册到Socketor选择器上，监听连接事件
     * 第五步：调用Selector的select方法（循环调用），监测通道的就绪状况
     * 第六步：调用selectKeys方法获取就绪channel集合
     * 第七步：遍历就绪channel集合，判断就绪事件类型，实现具体的业务操作
     * 第八步：根据业务，决定是否需要再次注册监听事件，重复执行第三步操作
     */
    public static void main(String[] args) {
        //服务端代码
        ServerDemo();
        //客户端代码
        ClientDemo();
    }

    /**
     * @desc: 服务端代码
     * @data: 2021.12.5 18:17
     */
    private static void ServerDemo() {
        try {
            ServerSocketChannel ssc = ServerSocketChannel.open();
            ssc.socket().bind(new InetSocketAddress("127.0.0.1", 8000));
            ssc.configureBlocking(false);
            Selector selector = Selector.open(); // 注册 channel，并且指定感兴趣的事件是 Accept
            ssc.register(selector, SelectionKey.OP_ACCEPT);
            ByteBuffer readBuff = ByteBuffer.allocate(1024);
            ByteBuffer writeBuff = ByteBuffer.allocate(128);
            writeBuff.put("received".getBytes());
            writeBuff.flip();
            while (true) {
                int nReady = selector.select();
                Set<SelectionKey> keys = selector.selectedKeys();
                Iterator<SelectionKey> it = keys.iterator();
                while (it.hasNext()) {
                    SelectionKey key = it.next();
                    it.remove();
                    if (key.isAcceptable()) {
                        SocketChannel socketChannel = ssc.accept();
                        socketChannel.configureBlocking(false);
                        socketChannel.register(selector, SelectionKey.OP_READ);
                    } else if (key.isReadable()) {
                        SocketChannel socketChannel = (SocketChannel) key.channel();
                        readBuff.clear();
                        socketChannel.read(readBuff);
                        readBuff.flip();
                        System.out.println("received : " + new String(readBuff.array()));
                        key.interestOps(SelectionKey.OP_WRITE);
                    } else if (key.isWritable()) {
                        writeBuff.rewind();
                        SocketChannel socketChannel = (SocketChannel) key.channel();
                        socketChannel.write(writeBuff);
                        key.interestOps(SelectionKey.OP_READ);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * @desc: 客户端代码
     * @data: 2021.12.5 18:17
     */
    private static void ClientDemo() {
        try {
            SocketChannel socketChannel = SocketChannel.open();
            socketChannel.connect(new InetSocketAddress("127.0.0.1", 8000));
            ByteBuffer writeBuffer = ByteBuffer.allocate(32);
            ByteBuffer readBuffer = ByteBuffer.allocate(32);
            writeBuffer.put("hello".getBytes());
            writeBuffer.flip();
            while (true) {
                writeBuffer.rewind();
                socketChannel.write(writeBuffer);
                readBuffer.clear();
                socketChannel.read(readBuffer);
            }
        } catch (IOException e) {
        }
    }

}
