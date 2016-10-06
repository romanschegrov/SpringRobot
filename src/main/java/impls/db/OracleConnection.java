package impls.db;

import interfaces.Connection;

/**
 * Created by ramon on 06.10.2016.
 */
public class OracleConnection implements Connection {

    @Override
    public void connect() {
        System.out.println("Oracle connected");
    }
}
