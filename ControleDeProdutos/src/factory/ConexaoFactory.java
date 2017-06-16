package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoFactory {

	private static final String USUARIO = "root";
	private static final String SENHA = "";
	private static final String URL = "jdbc:mysql://localhost:3306/produtopoo";

	public static Connection conectar() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
		}
		Connection conexao = null;
		try {
			conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Não foi possível estabelecer uma conexão com o banco de dados", "Erro",
					JOptionPane.ERROR_MESSAGE);
		}
		return conexao;
	}

}
