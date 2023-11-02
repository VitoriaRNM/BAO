/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bao.w;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

public class Conexao {
    private static Connection connection = null;
		//PreparedStatement sql = null;
		
		public static Connection getConnection() {
			if(connection!=null) 
				return connection;
			else {
				try {
					Properties prop = new Properties();
					String user = "root";
	                String password = "vitoria16";
	                Class.forName("com.mysql.cj.jdbc.Driver");
	                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bao?useTimezone=true&serverTimezone=UTC", user, password);
	                
				}
				catch (ClassNotFoundException e) {
	                e.printStackTrace();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	            return connection;
			}
			
			
		}

}
