package com.liuwen.JavaNIO;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ----------------------------------------------------------------------
 *#IO的技术发展
 * BIO→NIO→select→poll→epoll
 *
 * ## 同样是epoll，nginx阻塞，redis一直在轮询，查看pid文件大小一直在变大。
 * # redis是单线程，它需要fork子线程去进行LRU、LFU、RDB、AOF等操作
 * # nginx有专门的work线程，可以阻塞等待连接。
 *
 *
 * ## IO是个细活。
 * #redis虽然是单线程但还很快的原因之一：采用epoll的IO多路复用技术【来再多客户端连接，我都不怕，epoll只处理哪些有事件驱动的连接】
 * #因为redis是单线程的，所有它始终是串行化的、原子操作【处理每个连接的流程都是：读取、计算、写，这是一个原子操作】
 * #redis6.x发布IO threads功能，为了充分开发多cpu的性能，让读可以多线程并发执行，计算依旧串行执行【谁先读完，谁先计算】，计算完后，写也可以多线程执行。
 *
 *
 * ## 零拷贝[以kafka为例,kafka也用到了epoll技术]。nginx也用到了零拷贝技术。
 * # 时时考虑kernel
 * # 写：通过mmap打通部分用户空间、内核空间、磁盘，减少写数据时的系统调用【读不可避免syscall】
 * #     写流程：客户端socket→内核空间→用户空间[数据在这里进行了加工：加了头部]→内核空间→磁盘
 * # 读：如果没有零拷贝，则数据读取的流程：磁盘→内核空间→用户空间→内核空间→客户端socket
 * #     如果有零拷贝，则直接在内核空间通过sendfile将数据文件输入，然后输出到客户的socket，所以流程：磁盘→内核空间→客户端，减少了向用户空间的拷贝。
 * # 零拷贝前提：数据不需要在用户空间进行加工。
 *
 * @author Create by liu wen at 2022.1.4 14:10
 * 抓取程序对内核的系统调用命令：【linux下执行】
 * strace -ff -o ./ooxx java TestSocket
 *
 * ----------------------------------------------------------------------
 */
public class TestSocket {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8090);
        System.out.println("step1: new ServerSocket(8090)");
        while (true) {
            Socket client = serverSocket.accept();
            System.out.println("step2: client\t" + client.getPort());
            new Thread(() -> {
                try {
                    InputStream in = client.getInputStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                    while (true) {
                        System.out.println(reader.readLine());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
