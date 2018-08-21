package com.cwoongc.study.design_pattern.decorator;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class DecoratorMain {
    public static void main(String[] args) throws IOException {

        AlphabetComponent component = new CDecorator(new BDecorator(new AComponent()));

        DecoratorClient decoratorClient = new DecoratorClient(component);

        decoratorClient.doWhatClientWants();


        inOutputStream();
    }

    private static void inOutputStream() throws IOException {
        String abc1 = "abc";


        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        OutputStream os = new BufferedOutputStream(baos);
        os.write(abc1.getBytes());
        os.flush();

        byte[] buf = baos.toByteArray();


        InputStream is = new BufferedInputStream(new ByteArrayInputStream(buf));

        byte[] readBuf = new byte[buf.length];

        int read = 0;
        while( (read = is.read(readBuf,read,readBuf.length - read)) != -1 ) {

        }
        String abc4 = new String(readBuf);

        System.out.println(abc4);
    }
}
