package com.atguigu.springboot;

import java.io.*;

public class MavenExecEncrypt {
    public MavenExecEncrypt() {
    }

    public static void main(String[] args) throws FileNotFoundException {
        String classFilePath = MavenExecEncrypt.class.getResource("/").getPath();
        (new MavenExecEncrypt()).encryption(classFilePath);
    }

    public void encryption(String path) throws FileNotFoundException {
        File file = new File(path);
        int i;
        if (file.isDirectory()) {
            String[] paths = file.list();
            String[] var4 = paths;
            i = paths.length;

            for(int var6 = 0; var6 < i; ++var6) {
                String s = var4[var6];
                this.encryption(path + "/" + s);
            }
        } else if (path.contains("ServiceImpl.class") || path.contains("Controller.class")) {
            FileInputStream fileInputStream = new FileInputStream(path);

            try {
                byte[] data = new byte[fileInputStream.available()];
                fileInputStream.read(data);
                fileInputStream.close();

                for(i = 0; i < data.length; ++i) {
                    if (i < 15) {
                        data[i] = data[i];
                    } else {
                        data[i] = (byte)(data[i] ^ 255);
                    }
                }

                FileOutputStream fileOutputStream = new FileOutputStream(path);
                fileOutputStream.write(data);
                fileOutputStream.flush();
                fileInputStream.close();
            } catch (IOException var8) {
                var8.printStackTrace();
            }
        }

    }
}
