/**
 * Team.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.wlopera.WorldSoccerChampions;

public class Team  implements java.io.Serializable {
    private java.lang.String nameHeadquarter;

    private int year;

    private java.lang.String nameChampion;

    private java.lang.String score;

    private java.lang.String nameSubChampion;

    public Team() {
    }

    public Team(
           java.lang.String nameHeadquarter,
           int year,
           java.lang.String nameChampion,
           java.lang.String score,
           java.lang.String nameSubChampion) {
           this.nameHeadquarter = nameHeadquarter;
           this.year = year;
           this.nameChampion = nameChampion;
           this.score = score;
           this.nameSubChampion = nameSubChampion;
    }


    /**
     * Gets the nameHeadquarter value for this Team.
     * 
     * @return nameHeadquarter
     */
    public java.lang.String getNameHeadquarter() {
        return nameHeadquarter;
    }


    /**
     * Sets the nameHeadquarter value for this Team.
     * 
     * @param nameHeadquarter
     */
    public void setNameHeadquarter(java.lang.String nameHeadquarter) {
        this.nameHeadquarter = nameHeadquarter;
    }


    /**
     * Gets the year value for this Team.
     * 
     * @return year
     */
    public int getYear() {
        return year;
    }


    /**
     * Sets the year value for this Team.
     * 
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }


    /**
     * Gets the nameChampion value for this Team.
     * 
     * @return nameChampion
     */
    public java.lang.String getNameChampion() {
        return nameChampion;
    }


    /**
     * Sets the nameChampion value for this Team.
     * 
     * @param nameChampion
     */
    public void setNameChampion(java.lang.String nameChampion) {
        this.nameChampion = nameChampion;
    }


    /**
     * Gets the score value for this Team.
     * 
     * @return score
     */
    public java.lang.String getScore() {
        return score;
    }


    /**
     * Sets the score value for this Team.
     * 
     * @param score
     */
    public void setScore(java.lang.String score) {
        this.score = score;
    }


    /**
     * Gets the nameSubChampion value for this Team.
     * 
     * @return nameSubChampion
     */
    public java.lang.String getNameSubChampion() {
        return nameSubChampion;
    }


    /**
     * Sets the nameSubChampion value for this Team.
     * 
     * @param nameSubChampion
     */
    public void setNameSubChampion(java.lang.String nameSubChampion) {
        this.nameSubChampion = nameSubChampion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Team)) return false;
        Team other = (Team) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nameHeadquarter==null && other.getNameHeadquarter()==null) || 
             (this.nameHeadquarter!=null &&
              this.nameHeadquarter.equals(other.getNameHeadquarter()))) &&
            this.year == other.getYear() &&
            ((this.nameChampion==null && other.getNameChampion()==null) || 
             (this.nameChampion!=null &&
              this.nameChampion.equals(other.getNameChampion()))) &&
            ((this.score==null && other.getScore()==null) || 
             (this.score!=null &&
              this.score.equals(other.getScore()))) &&
            ((this.nameSubChampion==null && other.getNameSubChampion()==null) || 
             (this.nameSubChampion!=null &&
              this.nameSubChampion.equals(other.getNameSubChampion())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getNameHeadquarter() != null) {
            _hashCode += getNameHeadquarter().hashCode();
        }
        _hashCode += getYear();
        if (getNameChampion() != null) {
            _hashCode += getNameChampion().hashCode();
        }
        if (getScore() != null) {
            _hashCode += getScore().hashCode();
        }
        if (getNameSubChampion() != null) {
            _hashCode += getNameSubChampion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Team.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wlopera.org/WorldSoccerChampions/", "Team"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameHeadquarter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nameHeadquarter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("", "year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameChampion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nameChampion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score");
        elemField.setXmlName(new javax.xml.namespace.QName("", "score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameSubChampion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nameSubChampion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
