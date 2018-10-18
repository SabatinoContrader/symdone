package main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import main.ConnectionSingleton;
import main.controller.GestoreEccezioni;
import main.controller.Request;
import main.model.Sintomo;



public class SintomoDAO {
	
	String campo = "";
	
	private final String QUERY_ALL = "SELECT * FROM sympthom_type";
	private final String QUERY_INSERT = "INSERT INTO sympthom_type (idSympthom_type,sympthom_name) VALUES (?,?)";
	public SintomoDAO() {		
	}
	
	public List<Sintomo> getAllSympthom(){		
		List<Sintomo> allSintomi = new ArrayList<Sintomo>();
		Connection connection = ConnectionSingleton.getInstance();
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_ALL);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Sintomo newSintomo = new Sintomo();
				newSintomo.setIdSintomo(resultSet.getInt("idSympthom_type"));
				newSintomo.setTipoSintomo(resultSet.getString("sympthom_name"));
				allSintomi.add(newSintomo);
				
			}
				
		}catch (SQLException e){
			GestoreEccezioni.getInstance().gestisciEccezione(e);
            //System.out.println("Errore nella ricerca dei prodotti!!");
			}
			
	    return allSintomi;
	    
	}
	
	public boolean insertSypthom(Sintomo sintomo) {
		Connection connection = ConnectionSingleton.getInstance();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_INSERT);
            preparedStatement.setInt(1, sintomo.getIdSintomo());
            preparedStatement.setString(2, sintomo.getTipoSintomo());
            preparedStatement.execute();
            return true;
		}
		catch (SQLException e){
			GestoreEccezioni.getInstance().gestisciEccezione(e);
			return false;
		}		
		
	}

	public boolean updateSypthom(Request request) {
		Connection connection = ConnectionSingleton.getInstance();
		try {
			campo=(String)request.get("campo");
        	PreparedStatement preparedStatement = connection.prepareStatement("update sympthom_type set " + campo + "=? where idsympthom_type=?");
            preparedStatement.setString(1, (String)request.get("newCampo"));
            preparedStatement.setInt(2, (Integer)request.get("idSintomo"));
            preparedStatement.execute();
            return true;
		}
		catch(SQLException e){
			GestoreEccezioni.getInstance().gestisciEccezione(e);
			return false;
		}	
	}
	
}
