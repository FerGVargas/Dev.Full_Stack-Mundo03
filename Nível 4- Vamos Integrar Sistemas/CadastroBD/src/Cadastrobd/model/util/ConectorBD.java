package cadastrobd.model.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConectorBD {

    private Connection conexao;
    private PreparedStatement ps;
    private ResultSet rs;

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://localhost\\DESKTOP-8PQGG84:1433;databaseName=SistemadaLoja;user=loja;password=loja;trustServerCertificate=true";
        if (conexao == null || conexao.isClosed()) {
            conexao = DriverManager.getConnection(connectionUrl);
        }
        return conexao;
    }

    public PreparedStatement getPrepared(String sql) throws ClassNotFoundException, SQLException {
        if (conexao == null || conexao.isClosed()) {
            getConnection();
        }

        ps = conexao.prepareStatement(sql);
        return ps;
    }

    public ResultSet getSelect(String sql) throws ClassNotFoundException, SQLException {
        conexao = getConnection();
        ps = getPrepared(sql);
        rs = ps.executeQuery();
        return rs;
    }

    public void Close() throws SQLException {
        if (rs != null && !rs.isClosed()) {
            rs.close();
        }
        if (ps != null && !ps.isClosed()) {
            ps.close();
        }
        if (conexao != null && !conexao.isClosed()) {
            conexao.close();
        }
    }
}