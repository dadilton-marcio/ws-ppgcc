/**
 * ParametroRelatorio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fincontrol.webservice.soap;

public class ParametroRelatorio  implements java.io.Serializable {
    private java.lang.String dataFinal;

    private java.lang.String dataInicial;

    public ParametroRelatorio() {
    }

    public ParametroRelatorio(
           java.lang.String dataFinal,
           java.lang.String dataInicial) {
           this.dataFinal = dataFinal;
           this.dataInicial = dataInicial;
    }


    /**
     * Gets the dataFinal value for this ParametroRelatorio.
     * 
     * @return dataFinal
     */
    public java.lang.String getDataFinal() {
        return dataFinal;
    }


    /**
     * Sets the dataFinal value for this ParametroRelatorio.
     * 
     * @param dataFinal
     */
    public void setDataFinal(java.lang.String dataFinal) {
        this.dataFinal = dataFinal;
    }


    /**
     * Gets the dataInicial value for this ParametroRelatorio.
     * 
     * @return dataInicial
     */
    public java.lang.String getDataInicial() {
        return dataInicial;
    }


    /**
     * Sets the dataInicial value for this ParametroRelatorio.
     * 
     * @param dataInicial
     */
    public void setDataInicial(java.lang.String dataInicial) {
        this.dataInicial = dataInicial;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParametroRelatorio)) return false;
        ParametroRelatorio other = (ParametroRelatorio) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataFinal==null && other.getDataFinal()==null) || 
             (this.dataFinal!=null &&
              this.dataFinal.equals(other.getDataFinal()))) &&
            ((this.dataInicial==null && other.getDataInicial()==null) || 
             (this.dataInicial!=null &&
              this.dataInicial.equals(other.getDataInicial())));
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
        if (getDataFinal() != null) {
            _hashCode += getDataFinal().hashCode();
        }
        if (getDataInicial() != null) {
            _hashCode += getDataInicial().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParametroRelatorio.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.webservice.fincontrol.com/", "parametroRelatorio"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFinal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataFinal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInicial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataInicial"));
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
