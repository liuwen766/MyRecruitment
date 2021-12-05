package com.liuwen.JavaNIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * ----------------------------------------------------------------------
 * <p>File name: SocketChannelDemo
 * <p>Desc:
 * <p>
 *
 * @author Create by liu wen at 2021.12.5 17:52
 * <p>
 * ----------------------------------------------------------------------
 */
public class SocketChannelDemo {
    public static final String GREETING = "Hello java nio.\r\n";

    public static void main(String[] argv) throws IOException, InterruptedException {
        int port = 1234; // default
        if (argv.length > 0) {
            port = Integer.parseInt(argv[0]);
        }
        ByteBuffer buffer = ByteBuffer.wrap(GREETING.getBytes());
        ServerSocketChannel ssc = ServerSocketChannel.open();
        ssc.socket().bind(new InetSocketAddress(port));
        ssc.configureBlocking(false);
        while (true) {
            System.out.println("Waiting for connections");
            //accept()
            SocketChannel sc = ssc.accept();
            if (sc == null) {
                System.out.println("null");
                Thread.sleep(2000);
            } else {
                System.out.println("Incoming connection from: " + sc.socket().getRemoteSocketAddress());
                buffer.rewind();
                sc.write(buffer);
                sc.close();
            }
        }
    }
}
