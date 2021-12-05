package com.liuwen.JavaNIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * ----------------------------------------------------------------------
 * NIO
 *
 * @author Create by liu wen at 2021.12.5 17:25
 * <p>
 * ----------------------------------------------------------------------
 */
public class FileChannelDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile aFile = new RandomAccessFile("D:\\MyGitHub\\MyRecruitment" +
                "\\src\\main\\java\\com\\liuwen\\JavaNIO\\01.txt", "rw");
        FileChannel inChannel = aFile.getChannel();
        String newDate = "New String to write....." + System.currentTimeMillis();

        ByteBuffer buff = ByteBuffer.allocate(48);
        buff.clear();
        buff.put(newDate.getBytes());
        buff.flip();

        while (buff.hasRemaining()) {
//            long position = inChannel.position();
//            long size = inChannel.size();
//            FileChannel fileChannel = inChannel.truncate(1024);
//            inChannel.force(true);
            inChannel.write(buff);
        }
        inChannel.close();

    }
}
