package main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import main.ConnectionSingleton;
import main.model.Sintomo;



public class SintomoDAO {
	
	private final String QUERY_ALL = "SELECT * FROM sympthom_type";
	
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
				
		}catch (Exception e){
                e.printStackTrace();
            //System.out.println("Errore nella ricerca dei prodotti!!");
			}
			
	    return allSintomi;
	    
	}

}
