package ro.ase.acs.cts.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface valueInserter {
    void insertData(Connection connection) throws SQLException;
}
