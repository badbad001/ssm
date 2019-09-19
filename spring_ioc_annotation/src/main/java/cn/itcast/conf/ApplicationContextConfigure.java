package cn.itcast.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: badbad
 * @Date: 2019/9/11 14:42
 * @Version 1.0
 */
@Configuration
@ComponentScan("cn.itcast")
@PropertySource("classpath:jdbc.properties")
public class ApplicationContextConfigure {


}
