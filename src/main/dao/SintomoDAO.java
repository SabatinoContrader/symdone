package main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import main.ConnectionSingleton;
import main.controller.GestoreEccezioni;
import main.controller.Request;
import main.model.Patologie;
import main.model.Sintomo;



public class SintomoDAO {
	
	String campo = "";
	
	private final String QUERY_ALL = "SELECT * FROM sympthom";
	private final String QUERY_INSERT = "INSERT INTO sympthom (idSympthom,sympthom_name,sympthom_desc) VALUES (?,?,?)";
	private final String QUERY_DELETE = "delete from sympthom where idSympthom = ?";
	
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
				newSintomo.setIdSintomo(resultSet.getInt("idSympthom"));
				newSintomo.setTipoSintomo(resultSet.getString("sympthom_name"));
				newSintomo.setDescrizione(resultSet.getString("sympthom_desc"));
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
            preparedStatement.setString(3, sintomo.getDescrizione());
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
        	PreparedStatement preparedStatement = connection.prepareStatement("update sympthom set " + campo + "=? where idsympthom =?");
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
	
	public boolean DeleteSintomo(int idSintomo) {
    	Connection connection = ConnectionSingleton.getInstance();
    	try {
    		PreparedStatement preparedStatement = connection.prepareStatement(QUERY_DELETE);
            preparedStatement.setInt(1,idSintomo);
            preparedStatement.execute();
            return true;
    }
        catch (SQLException e) {
            GestoreEccezioni.getInstance().gestisciEccezione(e);
            return false;
        }	
    }
	
	
				
	}

