package cadastrobd.model.util;

import java.sql.SQLException;
import java.sql.ResultSet;

public class SequenceManager {

    public int getValue(ConectorBD bd) throws ClassNotFoundException, SQLException {
        try (ResultSet result = bd.getSelect("SELECT NEXT VALUE FOR idPessoa")) {
            if (result.next()) {
                return result.getInt(1);
            }
        }
        return 0;
    }
}