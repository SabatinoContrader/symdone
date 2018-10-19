package main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import main.ConnectionSingleton;
import main.controller.GestoreEccezioni;
import main.controller.Request;
import main.model.Erba;

public class ErbaDAO {

	String campo = "";

	private final String QUERY_ALL = " select * from herbs ";
	private final String QUERY_INSERT = " insert into herbs (herb_name,herb_desc) values (?,?) ";
	private String QUERY_DELETE = " delete from herbs where idherbs = ?";

	public ErbaDAO() {

	}

	public List<Erba> getAllErba() {
		List<Erba> allErbe = new ArrayList<Erba>();
		Connection connection = ConnectionSingleton.getInstance();

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_ALL);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Erba newErba = new Erba();

				newErba.setIdErba(resultSet.getInt("idherbs"));
				newErba.setNomeErba(resultSet.getString("herb_name"));
				newErba.setDescErba(resultSet.getString("herb_desc"));
				allErbe.add(newErba);

			}

		} catch (Exception e) {
			e.printStackTrace();
			// System.out.println("Errore nella ricerca dei prodotti!!");
		}

		return allErbe;

	}

	public boolean insertErba(Erba herbs) {

		Connection connection = ConnectionSingleton.getInstance();

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_INSERT);
			preparedStatement.setString(1, herbs.getNomeErba());
			preparedStatement.setString(2, herbs.getDescErba());
			preparedStatement.execute();
			return true;

		}

		catch (SQLException e) {
			GestoreEccezioni.getInstance().gestisciEccezione(e);
			return false;

		}
	}

	public boolean updateErba(Request request) {
		Connection connection = ConnectionSingleton.getInstance();

		try {
			campo = (String) request.get("campo");
			PreparedStatement preparedStatement = connection
					.prepareStatement("update herbs set " + campo + "=? where idherbs =?");
			preparedStatement.setString(1, (String) request.get("newCampo"));
			preparedStatement.setInt(2, (Integer) request.get("idErba"));
			preparedStatement.execute();
			return true;

		}

		catch (SQLException e) {

			GestoreEccezioni.getInstance().gestisciEccezione(e);
			return false;
		}

	}

	public boolean deleteErba(int idErba) {
		Connection connection = ConnectionSingleton.getInstance();

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_DELETE);
			preparedStatement.setInt(1, idErba);
			preparedStatement.execute();
			return true;
		} catch (SQLException e) {

			GestoreEccezioni.getInstance().gestisciEccezione(e);
			return false;
		}
	}

}
