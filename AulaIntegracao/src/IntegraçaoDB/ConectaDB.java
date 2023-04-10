package IntegraçaoDB;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConectaDB {
			public static void main(String[] args) {
				
				try {
					Connection connection =null;
					
					connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/shopway","postgres","123456");
			
					String sql = "INSERT INTO clientes(nome_cliente, sobrenome_cliente)" +
							"VALUES ('Juliana', 'Federico')";
					
					if(connection !=null) {
					
						
						
						System.out.println("Conecta OK");
					}else{
						System.out.println("Conexao falhou!!!");
					}
					
				} catch (SQLException e) {
					System.out.println("erro ao conectar o banco");
					
					
				}

		
			}
		
}


