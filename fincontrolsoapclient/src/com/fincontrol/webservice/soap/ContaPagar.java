/**
 * ContaPagar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fincontrol.webservice.soap;

public class ContaPagar  extends com.fincontrol.webservice.soap.Conta  implements java.io.Serializable {
    private java.lang.String codCategoria;

    private java.lang.String codContaPagar;

    private java.lang.String codFornecedor;

    private java.lang.String dataVencimento;

    private java.lang.String descricao;

    private com.fincontrol.webservice.soap.SituacaoConta situacao;

    private double valor;

    public ContaPagar() {
    }

    public ContaPagar(
           java.lang.String codCategoria,
           java.lang.String codContaPagar,
           java.lang.String codFornecedor,
           java.lang.String dataVencimento,
           java.lang.String descricao,
           com.fincontrol.webservice.soap.SituacaoConta situacao,
           double valor) {
        this.codCategoria = codCategoria;
        this.codContaPagar = codContaPagar;
        this.codFornecedor = codFornecedor;
        this.dataVencimento = dataVencimento;
        this.descricao = descricao;
        this.situacao = situacao;
        this.valor = valor;
    }


    /**
     * Gets the codCategoria value for this ContaPagar.
     * 
     * @return codCategoria
     */
    public java.lang.String getCodCategoria() {
        return codCategoria;
    }


    /**
     * Sets the codCategoria value for this ContaPagar.
     * 
     * @param codCategoria
     */
    public void setCodCategoria(java.lang.String codCategoria) {
        this.codCategoria = codCategoria;
    }


    /**
     * Gets the codContaPagar value for this ContaPagar.
     * 
     * @return codContaPagar
     */
    public java.lang.String getCodContaPagar() {
        return codContaPagar;
    }


    /**
     * Sets the codContaPagar value for this ContaPagar.
     * 
     * @param codContaPagar
     */
    public void setCodContaPagar(java.lang.String codContaPagar) {
        this.codContaPagar = codContaPagar;
    }


    /**
     * Gets the codFornecedor value for this ContaPagar.
     * 
     * @return codFornecedor
     */
    public java.lang.String getCodFornecedor() {
        return codFornecedor;
    }


    /**
     * Sets the codFornecedor value for this ContaPagar.
     * 
     * @param codFornecedor
     */
    public void setCodFornecedor(java.lang.String codFornecedor) {
        this.codFornecedor = codFornecedor;
    }


    /**
     * Gets the dataVencimento value for this ContaPagar.
     * 
     * @return dataVencimento
     */
    public java.lang.String getDataVencimento() {
        return dataVencimento;
    }


    /**
     * Sets the dataVencimento value for this ContaPagar.
     * 
     * @param dataVencimento
     */
    public void setDataVencimento(java.lang.String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }


    /**
     * Gets the descricao value for this ContaPagar.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this ContaPagar.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the situacao value for this ContaPagar.
     * 
     * @return situacao
     */
    public com.fincontrol.webservice.soap.SituacaoConta getSituacao() {
        return situacao;
    }


    /**
     * Sets the situacao value for this ContaPagar.
     * 
     * @param situacao
     */
    public void setSituacao(com.fincontrol.webservice.soap.SituacaoConta situacao) {
        this.situacao = situacao;
    }


    /**
     * Gets the valor value for this ContaPagar.
     * 
     * @return valor
     */
    public double getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this ContaPagar.
     * 
     * @param valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContaPagar)) return false;
        ContaPagar other = (ContaPagar) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.codCategoria==null && other.getCodCategoria()==null) || 
             (this.codCategoria!=null &&
              this.codCategoria.equals(other.getCodCategoria()))) &&
            ((this.codContaPagar==null && other.getCodContaPagar()==null) || 
             (this.codContaPagar!=null &&
              this.codContaPagar.equals(other.getCodContaPagar()))) &&
            ((this.codFornecedor==null && other.getCodFornecedor()==null) || 
             (this.codFornecedor!=null &&
              this.codFornecedor.equals(other.getCodFornecedor()))) &&
            ((this.dataVencimento==null && other.getDataVencimento()==null) || 
             (this.dataVencimento!=null &&
              this.dataVencimento.equals(other.getDataVencimento()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            ((this.situacao==null && other.getSituacao()==null) || 
             (this.situacao!=null &&
              this.situacao.equals(other.getSituacao()))) &&
            this.valor == other.getValor();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCodCategoria() != null) {
            _hashCode += getCodCategoria().hashCode();
        }
        if (getCodContaPagar() != null) {
            _hashCode += getCodContaPagar().hashCode();
        }
        if (getCodFornecedor() != null) {
            _hashCode += getCodFornecedor().hashCode();
        }
        if (getDataVencimento() != null) {
            _hashCode += getDataVencimento().hashCode();
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        if (getSituacao() != null) {
            _hashCode += getSituacao().hashCode();
        }
        _hashCode += new Double(getValor()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContaPagar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.webservice.fincontrol.com/", "contaPagar"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codCategoria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codCategoria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codContaPagar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codContaPagar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codFornecedor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codFornecedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataVencimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataVencimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("situacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "situacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.webservice.fincontrol.com/", "situacaoConta"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
