package cn.fudan.stfserver.utils;

import com.rethinkdb.RethinkDB;
import com.rethinkdb.net.Connection;

/**
 * @author qiaoying
 * @date 2019/11/22 16:58
 */
public class RethinkDBConnectionFactory {

    private String host;

    private int port;

    public RethinkDBConnectionFactory(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public Connection createConnection() {
        return RethinkDB.r.connection().hostname(host).port(port).connect();
    }
}
