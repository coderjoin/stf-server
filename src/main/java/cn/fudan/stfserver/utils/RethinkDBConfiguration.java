package cn.fudan.stfserver.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author qiaoying
 * @date 2019/11/22 17:06
 */

@Configuration
public class RethinkDBConfiguration {

    public static final String DBHOST = "127.0.0.1";

    public static final int DBPORT = 28015;

    @Bean
    public RethinkDBConnectionFactory connectionFactory() {
        return  new RethinkDBConnectionFactory(DBHOST, DBPORT);
    }

    @Bean
    DBInitializer dbInitializer() {
        return new DBInitializer();
    }
 }
