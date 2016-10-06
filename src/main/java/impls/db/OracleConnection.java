package impls.db;

import interfaces.DBConnection;

/**
 * Created by ramon on 06.10.2016.
 */
public class OracleConnection implements DBConnection {

    @Override
    public void connect() {
        System.out.println("Oracle connected");
    }
}
