/**
 * WorldSoccerChampionsSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.wlopera.WorldSoccerChampions;

import org.wlopera.client.ClientWSCApi;
import org.wlopera.client.ClientWSCService;

public class WorldSoccerChampionsSOAPImpl implements org.wlopera.WorldSoccerChampions.WorldSoccerChampions_PortType{
    public org.wlopera.WorldSoccerChampions.Team worldSoccerChampions(java.lang.String year) throws java.rmi.RemoteException {
    	ClientWSCApi clientWSCApi = new ClientWSCService();
    	return clientWSCApi.getTeamWSCByYear(year);
    }

}
