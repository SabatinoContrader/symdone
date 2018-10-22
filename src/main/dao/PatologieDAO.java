package main.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import main.ConnectionSingleton;
import main.controller.GestoreEccezioni;
import main.controller.Request;
import main.model.Patologie;
import java.sql.*;


public class PatologieDAO {
	 private final String QUERY_ALL="SELECT * FROM disease";
	 private final String QUERY_INSERT = "insert into disease (disease_name,disease_desc) values (?,?)";
	 private final String QUERY_DELETE="DELETE from disease where iddisease = ?";
	 private final String QUERY_SEARCH = "SELECT disease.* FROM disease, diseasesympthom WHERE disease.iddisease=diseasesympthom.iddisease AND diseasesympthom.idsympthom=?";
	 
	 public PatologieDAO() {
		 
	 }
public List<Patologie> getAllPatologie(){
	 List<Patologie> allPatologie = new ArrayList <Patologie>();
	 Connection connection = ConnectionSingleton.getInstance();
	
	try {
		PreparedStatement preparedStatement = connection.prepareStatement(QUERY_ALL);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			Patologie newPatologie = new Patologie();
			newPatologie.setIdPatologia(resultSet.getInt("iddisease"));
			newPatologie.setDescPatologia(resultSet.getString("disease_desc"));
			newPatologie.setNomePatologia(resultSet.getString("disease_name"));
			allPatologie.add(newPatologie);
				
		}
	}
	catch (SQLException e){
		GestoreEccezioni.getInstance().gestisciEccezione(e);
		return null;
	}
    return allPatologie;
}

public boolean insertPatologie(Patologie patologie){
	 
	 Connection connection = ConnectionSingleton.getInstance();
	
	try {
		PreparedStatement preparedStatement = connection.prepareStatement(QUERY_INSERT);
		preparedStatement.setString(1,patologie.getNomePatologia());
		preparedStatement.setString(2,patologie.getDescPatologia());
		preparedStatement.execute();
		return true;
	}
	catch (SQLException e){
		GestoreEccezioni.getInstance().gestisciEccezione(e);
		return false;
		}
	
  
}


public boolean updatePatologie(Request request) {
	 Connection connection = ConnectionSingleton.getInstance();
		
	try {
		String param=(String)request.get("campo");
    	PreparedStatement preparedStatement = connection.prepareStatement("update disease set "+param+"=? where iddisease=?");
        preparedStatement.setString(1, (String)request.get("newData"));
        preparedStatement.setInt(2, (Integer)request.get("idPatologia"));
        preparedStatement.execute();
        return true;
	}
	catch (SQLException e){
		GestoreEccezioni.getInstance().gestisciEccezione(e);
		return false;
		}
		}
	
	public boolean deletePatologie (int idPatologia) {
		Connection connection = ConnectionSingleton.getInstance();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_DELETE);
			preparedStatement.setInt(1,idPatologia);
			preparedStatement.execute();
			return true;
		}
			catch (SQLException e){
			GestoreEccezioni.getInstance().gestisciEccezione(e);
			return false;
			}
	}

	public List<Patologie> SearchPatologie (int idPatologia) {
		 List<Patologie> allPatologie = new ArrayList<>();
		Connection connection = ConnectionSingleton.getInstance();
		try {
			Statement statement = connection.createStatement();
			//preparedStatement.setInt(1,idPatologia);
			ResultSet resultSet = statement.executeQuery("SELECT disease.* FROM disease, diseasesympthom WHERE disease.iddisease=diseasesympthom.iddisease AND diseasesympthom.idsympthom="+ idPatologia);
			while(resultSet.next()) {
				int iddisease = resultSet.getInt("iddisease");
				String diseaseName = resultSet.getString("disease_name");
				String diseaseDesc = resultSet.getString("disease_desc");
				allPatologie.add(new Patologie(iddisease,diseaseName,diseaseDesc));
					
			}
		}
		catch (SQLException e){
			GestoreEccezioni.getInstance().gestisciEccezione(e);
			return null;
		}
	    return allPatologie;
	}
}
	
