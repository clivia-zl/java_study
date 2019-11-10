package com.zhl.chapter2;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Test {
    public static void main(String[] args) throws IOException {

        /*------------------------------------------
        jdk8以前的方法，效率较低，以后会取消
         */
        BASE64Encoder encoder = new BASE64Encoder();
        BASE64Decoder decoder = new BASE64Decoder();
        String name = "郑磊";
        byte[] nameByte = name.getBytes(StandardCharsets.UTF_8);
        //Base64编码
        String encodeName = encoder.encode(nameByte);
        System.out.println(name + " 的Base64编码为: " + encodeName);
        //Base64解码
        byte[] decodeNameByte = decoder.decodeBuffer(encodeName);
        String decodeName = new String(decodeNameByte, StandardCharsets.UTF_8);
        System.out.println(encodeName + " 的Base64解码结果为: " + decodeName);

        /*-----------------------------------------
        jdk8之后的实现方法
         */
        Base64.Encoder newEncode = Base64.getEncoder();
        Base64.Decoder newDecode = Base64.getDecoder();
        String password = "Qershdju14524556RY";
        byte[] passwordByte = password.getBytes(StandardCharsets.UTF_8);
        //Base64编码
        String encodePassword = newEncode.encodeToString(passwordByte);
        System.out.println(password + " 的Base64编码为: " + encodePassword);
        //Base64解码
        byte[] decodePasswordByte = newDecode.decode(encodePassword);
        String decodePassword = new String(decodePasswordByte, StandardCharsets.UTF_8);
        System.out.println(encodePassword + " 的Base64解码结果为: " + decodePassword);

    }
}
