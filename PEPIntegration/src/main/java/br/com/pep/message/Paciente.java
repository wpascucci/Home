//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.6 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: PM.09.07 às 10:38:51 PM BRT 
//


package br.com.pep.message;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cpf" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Genero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodigoRegistro" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TipoSanguineo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Enderecos" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Cep" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Cidade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Endereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Telefones" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Ddd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "id",
    "cpf",
    "nome",
    "genero",
    "codigoRegistro",
    "tipoSanguineo",
    "enderecos",
    "telefones"
})
@XmlRootElement(name = "Paciente")
public class Paciente {

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
    @XmlElement(name = "Enderecos", required = true)
    protected List<Paciente.Enderecos> enderecos;
    @XmlElement(name = "Telefones", required = true)
    protected List<Paciente.Telefones> telefones;

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

    /**
     * Gets the value of the enderecos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enderecos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnderecos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Paciente.Enderecos }
     * 
     * 
     */
    public List<Paciente.Enderecos> getEnderecos() {
        if (enderecos == null) {
            enderecos = new ArrayList<Paciente.Enderecos>();
        }
        return this.enderecos;
    }

    /**
     * Gets the value of the telefones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telefones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelefones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Paciente.Telefones }
     * 
     * 
     */
    public List<Paciente.Telefones> getTelefones() {
        if (telefones == null) {
            telefones = new ArrayList<Paciente.Telefones>();
        }
        return this.telefones;
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
     *         &lt;element name="Cep" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Cidade" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Endereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "cep",
        "cidade",
        "estado",
        "endereco"
    })
    public static class Enderecos {

        @XmlElement(name = "Id")
        protected int id;
        @XmlElement(name = "Cep", required = true)
        protected String cep;
        @XmlElement(name = "Cidade", required = true)
        protected String cidade;
        @XmlElement(name = "Estado", required = true)
        protected String estado;
        @XmlElement(name = "Endereco", required = true)
        protected String endereco;

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
         * Obtém o valor da propriedade cep.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCep() {
            return cep;
        }

        /**
         * Define o valor da propriedade cep.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCep(String value) {
            this.cep = value;
        }

        /**
         * Obtém o valor da propriedade cidade.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCidade() {
            return cidade;
        }

        /**
         * Define o valor da propriedade cidade.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCidade(String value) {
            this.cidade = value;
        }

        /**
         * Obtém o valor da propriedade estado.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEstado() {
            return estado;
        }

        /**
         * Define o valor da propriedade estado.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstado(String value) {
            this.estado = value;
        }

        /**
         * Obtém o valor da propriedade endereco.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndereco() {
            return endereco;
        }

        /**
         * Define o valor da propriedade endereco.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndereco(String value) {
            this.endereco = value;
        }

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
     *         &lt;element name="Ddd" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "ddd",
        "numero",
        "tipo"
    })
    public static class Telefones {

        @XmlElement(name = "Id")
        protected int id;
        @XmlElement(name = "Ddd")
        protected int ddd;
        @XmlElement(name = "Numero")
        protected int numero;
        @XmlElement(name = "Tipo", required = true)
        protected String tipo;

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
         * Obtém o valor da propriedade ddd.
         * 
         */
        public int getDdd() {
            return ddd;
        }

        /**
         * Define o valor da propriedade ddd.
         * 
         */
        public void setDdd(int value) {
            this.ddd = value;
        }

        /**
         * Obtém o valor da propriedade numero.
         * 
         */
        public int getNumero() {
            return numero;
        }

        /**
         * Define o valor da propriedade numero.
         * 
         */
        public void setNumero(int value) {
            this.numero = value;
        }

        /**
         * Obtém o valor da propriedade tipo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipo() {
            return tipo;
        }

        /**
         * Define o valor da propriedade tipo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipo(String value) {
            this.tipo = value;
        }

    }

}
