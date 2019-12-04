package cn.fudan.stfserver.utils;

import com.rethinkdb.RethinkDB;
import com.rethinkdb.net.Connection;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author qiaoying
 * @date 2019/11/22 19:08
 */
public class DBInitializer implements InitializingBean {

    @Autowired
    private RethinkDBConnectionFactory connectionFactory;

    private static final RethinkDB r = RethinkDB.r;

    @Override
    public void afterPropertiesSet() throws Exception {
        createDB();
    }

    private void createDB() {
        Connection connection = connectionFactory.createConnection();
    }
}
