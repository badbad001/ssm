package cn.itcast;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.itcast.mapper")
public class MtabtisPlusSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MtabtisPlusSpringbootApplication.class, args);
    }

}
