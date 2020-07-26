package com.liuwen.effectivejava.Test001_Test010;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * ----------------------------------------------------------------------
 *
 * @description: （第11个建议）：使用try-with-resources 语句替代try-finally 语句
 * @author: Create by Liu Wen at  2020/7/26 15:30
 * ----------------------------------------------------------------------
 **/
public class Test004 {
  private static final String FileName = "file.txt";

  public static void main(String[] args) throws IOException {
    FileInputStream inputStream = null;

    try {
      inputStream = new FileInputStream(FileName);
      char c1 = (char) inputStream.read();
      System.out.println("c1=" + c1);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (inputStream != null) {
        inputStream.close();
      }
    }
  }

}
