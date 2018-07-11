package com.jiyongjun.tao.common.controller;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * description:
 *
 * @author yongjun.ji
 * @date 2018/7/11 14:31
 */
public class MyClassLoader extends URLClassLoader {

    public MyClassLoader(URL[] urls) {
        super(urls);
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        URL resource = this.findResource(name);
        try {
            InputStream is = resource.openStream();
            byte[] bytes = new byte[2048];
            int read = is.read(bytes);
            Class<?> aClass = defineClass(name, bytes, 0, bytes.length);
            return aClass;
        } catch (IOException e) {
            e.printStackTrace();
        }
        // defineClass
        return null;
    }
    
}
