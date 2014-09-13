//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.6 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: PM.09.13 às 01:18:15 PM BRT 
//


package br.com.pep.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Paciente">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Cpf" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Genero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CodigoRegistro" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="TipoSanguineo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "paciente"
})
@XmlRootElement(name = "Pacientes")
public class Pacientes {

    @XmlElement(name = "Paciente", required = true)
    protected Pacientes.Paciente paciente;

    /**
     * Obtém o valor da propriedade paciente.
     * 
     * @return
     *     possible object is
     *     {@link Pacientes.Paciente }
     *     
     */
    public Pacientes.Paciente getPaciente() {
        return paciente;
    }

    /**
     * Define o valor da propriedade paciente.
     * 
     * @param value
     *     allowed object is
     *     {@link Pacientes.Paciente }
     *     
     */
    public void setPaciente(Pacientes.Paciente value) {
        this.paciente = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Cpf" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Genero" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CodigoRegistro" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="TipoSanguineo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "cpf",
        "nome",
        "genero",
        "codigoRegistro",
        "tipoSanguineo"
    })
    public static class Paciente {

        @XmlElement(name = "Id")
        protected int id;
        @XmlElement(name = "Cpf")
        protected int cpf;
        @XmlElement(name = "Nome", required = true)
        protected String nome;
        @XmlElement(name = "Genero", required = true)
        protected String genero;
        @XmlElement(name = "CodigoRegistro")
        protected int codigoRegistro;
        @XmlElement(name = "TipoSanguineo", required = true)
        protected String tipoSanguineo;

        /**
         * Obtém o valor da propriedade id.
         * 
         */
        public int getId() {
            return id;
        }

        /**
         * Define o valor da propriedade id.
         * 
         */
        public void setId(int value) {
            this.id = value;
        }

        /**
         * Obtém o valor da propriedade cpf.
         * 
         */
        public int getCpf() {
            return cpf;
        }

        /**
         * Define o valor da propriedade cpf.
         * 
         */
        public void setCpf(int value) {
            this.cpf = value;
        }

        /**
         * Obtém o valor da propriedade nome.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNome() {
            return nome;
        }

        /**
         * Define o valor da propriedade nome.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNome(String value) {
            this.nome = value;
        }

        /**
         * Obtém o valor da propriedade genero.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGenero() {
            return genero;
        }

        /**
         * Define o valor da propriedade genero.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGenero(String value) {
            this.genero = value;
        }

        /**
         * Obtém o valor da propriedade codigoRegistro.
         * 
         */
        public int getCodigoRegistro() {
            return codigoRegistro;
        }

        /**
         * Define o valor da propriedade codigoRegistro.
         * 
         */
        public void setCodigoRegistro(int value) {
            this.codigoRegistro = value;
        }

        /**
         * Obtém o valor da propriedade tipoSanguineo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoSanguineo() {
            return tipoSanguineo;
        }

        /**
         * Define o valor da propriedade tipoSanguineo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoSanguineo(String value) {
            this.tipoSanguineo = value;
        }

    }

}
