package cn.zybcn.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author 程序员小张
 * @Date 2022-11-19 23:14
 */
public interface Resource {
    InputStream getInputStream() throws IOException;
}
