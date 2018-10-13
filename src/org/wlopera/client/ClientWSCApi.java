package org.wlopera.client;

import java.util.List;

import org.wlopera.WorldSoccerChampions.Team;

/**
 * @author wlopera
 *
 */
public interface ClientWSCApi {

	/**
	 * Simulador de Cliente que consultar la lista de paises ganadores de una
	 * cantidad especifica de mundiales de futbol
	 * 
	 * @param wonChampionships
	 *            Cantidad de campeonatos ganados
	 * 
	 * @return Listado de paises que solo han ganado esa cantidad exacta de
	 *         campeonatos
	 */
	List<Team> getListWSCByChampionWin(String wonChampionships);

	/**
	 * Simulador de Cliente que consulta todos los paises ganadores de campeones
	 * mundiales de futbol
	 * 
	 * @return Listado de paises gnadores de mundiales
	 */
	List<Team> getListWSCAll();

	/**
	 * Simulador de Cliente que consultar el pais ganador del mundial de un annio
	 * requerido
	 * 
	 * @param year
	 *            Annio del mundial
	 * 
	 * @return Pais que gano el campeonato ese annio
	 */
	Team getTeamWSCByYear(String year);

}
