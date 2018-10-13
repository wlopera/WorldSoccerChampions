/**
 * 
 */
package org.wlopera.client;

import java.util.List;

import org.wlopera.WorldSoccerChampions.Team;

/**
 * @author wlopera
 *
 */
public class ClientWSCService implements ClientWSCApi {
	
	@Override
	public List<Team> getListWSCByChampionWin(String wonChampionships) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Team> getListWSCAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Team getTeamWSCByYear(String year) {
		DataTeams data = new DataTeams();
		
		for(Integer key : data.getYears().keySet()){
	        if(data.getYears().get(key).equals(year)){
	            System.out.println(key); 
	            System.out.println(data.getHeadquarters().get(key));
	            System.out.println(data.getYears().get(key));
	            System.out.println(data.getChampions().get(key));
	            System.out.println(data.getScores().get(key));
	            System.out.println(data.getSubChampions().get(key));
	            
	            return new Team(data.getHeadquarters().get(key), 
	            		Integer.parseInt(data.getYears().get(key)), 
	            		data.getChampions().get(key),
	            		data.getScores().get(key),
	            		data.getHeadquarters().get(key));
	        }
	     }
		
		
		return null;
	}
	/**
	 * Main solo para prueba de la data 
	 * 
	 * @param arg
	 */
	public static void main(String[] arg) {
		new ClientWSCService().getTeamWSCByYear("2018");
	}

	
}
