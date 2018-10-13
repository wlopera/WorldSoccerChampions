/**
 * WorldSoccerChampionsSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.wlopera.WorldSoccerChampions;

public class WorldSoccerChampionsSOAPSkeleton implements org.wlopera.WorldSoccerChampions.WorldSoccerChampions_PortType, org.apache.axis.wsdl.Skeleton {
    private org.wlopera.WorldSoccerChampions.WorldSoccerChampions_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "year"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("worldSoccerChampions", _params, new javax.xml.namespace.QName("", "team"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://wlopera.org/WorldSoccerChampions/", "Team"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://wlopera.org/WorldSoccerChampions/", "WorldSoccerChampions"));
        _oper.setSoapAction("http://wlopera.org/WorldSoccerChampions/WorldSoccerChampions");
        _myOperationsList.add(_oper);
        if (_myOperations.get("worldSoccerChampions") == null) {
            _myOperations.put("worldSoccerChampions", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("worldSoccerChampions")).add(_oper);
    }

    public WorldSoccerChampionsSOAPSkeleton() {
        this.impl = new org.wlopera.WorldSoccerChampions.WorldSoccerChampionsSOAPImpl();
    }

    public WorldSoccerChampionsSOAPSkeleton(org.wlopera.WorldSoccerChampions.WorldSoccerChampions_PortType impl) {
        this.impl = impl;
    }
    public org.wlopera.WorldSoccerChampions.Team worldSoccerChampions(java.lang.String year) throws java.rmi.RemoteException
    {
        org.wlopera.WorldSoccerChampions.Team ret = impl.worldSoccerChampions(year);
        return ret;
    }

}
