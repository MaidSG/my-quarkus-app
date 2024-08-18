package org.acme;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

/*******************************************************************
 * <pre></pre>
 * @文件名称： QuarkusApplication.java
 * @包 路  径： org.acme
 * @Copyright：wy (C) 2024 *
 * @Description: 以启动类启动
 * @Version: V1.0
 * @Author： wy
 * @Date： 2024/8/18 12:53
 * @Modify：
 */
@QuarkusMain
public class QuarkusTemplateApplication implements QuarkusApplication {
    @Override
    public int run(String... args) throws Exception {
        Quarkus.waitForExit();
        return 0;
    }

    public static void main(String[] args) {
        Quarkus.run(QuarkusTemplateApplication.class, args);
    }
}
