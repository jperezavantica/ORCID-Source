//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.26 at 11:29:18 AM GMT 
//


package xmlns.org.eurocris.cerif_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cfClassScheme__Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cfClassScheme__Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cfClassSchemeId" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
 *         &lt;element name="cfURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="cfDescr" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfMLangString__Type"/>
 *           &lt;element name="cfDescrSrc" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfMLangString__Type"/>
 *           &lt;element name="cfName" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfMLangString__Type"/>
 *           &lt;element name="cfNameSrc" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfMLangString__Type"/>
 *           &lt;element name="cfClassScheme_ClassScheme">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;choice>
 *                       &lt;element name="cfClassSchemeId2" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
 *                       &lt;element name="cfClassSchemeId1" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
 *                     &lt;/choice>
 *                     &lt;group ref="{urn:xmlns:org:eurocris:cerif-1.6-2}cfCoreClassWithFraction__Group"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="cfFedId" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfFedId__EmbType"/>
 *           &lt;element name="cfClass">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="cfClassId" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
 *                     &lt;element name="cfStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                     &lt;element name="cfEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                     &lt;element name="cfURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                       &lt;element name="cfDescr" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfMLangString__Type"/>
 *                       &lt;element name="cfDescrSrc" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfMLangString__Type"/>
 *                       &lt;element name="cfTerm" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfMLangString__Type"/>
 *                       &lt;element name="cfTermSrc" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfMLangString__Type"/>
 *                       &lt;element name="cfRoleExpr" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfMLangString__Type"/>
 *                       &lt;element name="cfRoleExprOpp" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfMLangString__Type"/>
 *                       &lt;element name="cfDef" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfMLangString__Type"/>
 *                       &lt;element name="cfDefSrc" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfMLangString__Type"/>
 *                       &lt;element name="cfEx" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfMLangString__Type"/>
 *                       &lt;element name="cfExSrc" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfMLangString__Type"/>
 *                       &lt;element name="cfClass_Class">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;choice>
 *                                   &lt;sequence>
 *                                     &lt;element name="cfClassId2" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
 *                                     &lt;element name="cfClassSchemeId2" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
 *                                   &lt;/sequence>
 *                                   &lt;sequence>
 *                                     &lt;element name="cfClassId1" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
 *                                     &lt;element name="cfClassSchemeId1" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
 *                                   &lt;/sequence>
 *                                 &lt;/choice>
 *                                 &lt;group ref="{urn:xmlns:org:eurocris:cerif-1.6-2}cfCoreClassWithFraction__Group"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                       &lt;element name="cfFedId" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfFedId__EmbType"/>
 *                     &lt;/choice>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cfClassScheme__Type", propOrder = {
    "cfClassSchemeId",
    "cfURI",
    "cfDescrOrCfDescrSrcOrCfName"
})
public class CfClassSchemeType {

    @XmlElement(required = true)
    protected String cfClassSchemeId;
    protected String cfURI;
    @XmlElementRefs({
        @XmlElementRef(name = "cfFedId", namespace = "urn:xmlns:org:eurocris:cerif-1.6-2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cfDescr", namespace = "urn:xmlns:org:eurocris:cerif-1.6-2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cfNameSrc", namespace = "urn:xmlns:org:eurocris:cerif-1.6-2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cfDescrSrc", namespace = "urn:xmlns:org:eurocris:cerif-1.6-2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cfClass", namespace = "urn:xmlns:org:eurocris:cerif-1.6-2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cfClassScheme_ClassScheme", namespace = "urn:xmlns:org:eurocris:cerif-1.6-2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cfName", namespace = "urn:xmlns:org:eurocris:cerif-1.6-2", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> cfDescrOrCfDescrSrcOrCfName;

    /**
     * Gets the value of the cfClassSchemeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfClassSchemeId() {
        return cfClassSchemeId;
    }

    /**
     * Sets the value of the cfClassSchemeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfClassSchemeId(String value) {
        this.cfClassSchemeId = value;
    }

    /**
     * Gets the value of the cfURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfURI() {
        return cfURI;
    }

    /**
     * Sets the value of the cfURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfURI(String value) {
        this.cfURI = value;
    }

    /**
     * Gets the value of the cfDescrOrCfDescrSrcOrCfName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cfDescrOrCfDescrSrcOrCfName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCfDescrOrCfDescrSrcOrCfName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CfFedIdEmbType }{@code >}
     * {@link JAXBElement }{@code <}{@link CfMLangStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link CfMLangStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link CfMLangStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link CfClassSchemeType.CfClass }{@code >}
     * {@link JAXBElement }{@code <}{@link CfClassSchemeType.CfClassSchemeClassScheme }{@code >}
     * {@link JAXBElement }{@code <}{@link CfMLangStringType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getCfDescrOrCfDescrSrcOrCfName() {
        if (cfDescrOrCfDescrSrcOrCfName == null) {
            cfDescrOrCfDescrSrcOrCfName = new ArrayList<JAXBElement<?>>();
        }
        return this.cfDescrOrCfDescrSrcOrCfName;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="cfClassId" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
     *         &lt;element name="cfStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="cfEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="cfURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element name="cfDescr" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfMLangString__Type"/>
     *           &lt;element name="cfDescrSrc" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfMLangString__Type"/>
     *           &lt;element name="cfTerm" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfMLangString__Type"/>
     *           &lt;element name="cfTermSrc" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfMLangString__Type"/>
     *           &lt;element name="cfRoleExpr" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfMLangString__Type"/>
     *           &lt;element name="cfRoleExprOpp" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfMLangString__Type"/>
     *           &lt;element name="cfDef" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfMLangString__Type"/>
     *           &lt;element name="cfDefSrc" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfMLangString__Type"/>
     *           &lt;element name="cfEx" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfMLangString__Type"/>
     *           &lt;element name="cfExSrc" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfMLangString__Type"/>
     *           &lt;element name="cfClass_Class">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;choice>
     *                       &lt;sequence>
     *                         &lt;element name="cfClassId2" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
     *                         &lt;element name="cfClassSchemeId2" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
     *                       &lt;/sequence>
     *                       &lt;sequence>
     *                         &lt;element name="cfClassId1" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
     *                         &lt;element name="cfClassSchemeId1" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
     *                       &lt;/sequence>
     *                     &lt;/choice>
     *                     &lt;group ref="{urn:xmlns:org:eurocris:cerif-1.6-2}cfCoreClassWithFraction__Group"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="cfFedId" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfFedId__EmbType"/>
     *         &lt;/choice>
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
        "cfClassId",
        "cfStartDate",
        "cfEndDate",
        "cfURI",
        "cfDescrOrCfDescrSrcOrCfTerm"
    })
    public static class CfClass {

        @XmlElement(required = true)
        protected String cfClassId;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar cfStartDate;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar cfEndDate;
        protected String cfURI;
        @XmlElementRefs({
            @XmlElementRef(name = "cfRoleExprOpp", namespace = "urn:xmlns:org:eurocris:cerif-1.6-2", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "cfTerm", namespace = "urn:xmlns:org:eurocris:cerif-1.6-2", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "cfClass_Class", namespace = "urn:xmlns:org:eurocris:cerif-1.6-2", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "cfEx", namespace = "urn:xmlns:org:eurocris:cerif-1.6-2", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "cfDefSrc", namespace = "urn:xmlns:org:eurocris:cerif-1.6-2", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "cfFedId", namespace = "urn:xmlns:org:eurocris:cerif-1.6-2", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "cfDescr", namespace = "urn:xmlns:org:eurocris:cerif-1.6-2", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "cfDescrSrc", namespace = "urn:xmlns:org:eurocris:cerif-1.6-2", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "cfDef", namespace = "urn:xmlns:org:eurocris:cerif-1.6-2", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "cfRoleExpr", namespace = "urn:xmlns:org:eurocris:cerif-1.6-2", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "cfTermSrc", namespace = "urn:xmlns:org:eurocris:cerif-1.6-2", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "cfExSrc", namespace = "urn:xmlns:org:eurocris:cerif-1.6-2", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<?>> cfDescrOrCfDescrSrcOrCfTerm;

        /**
         * Gets the value of the cfClassId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCfClassId() {
            return cfClassId;
        }

        /**
         * Sets the value of the cfClassId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCfClassId(String value) {
            this.cfClassId = value;
        }

        /**
         * Gets the value of the cfStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCfStartDate() {
            return cfStartDate;
        }

        /**
         * Sets the value of the cfStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCfStartDate(XMLGregorianCalendar value) {
            this.cfStartDate = value;
        }

        /**
         * Gets the value of the cfEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCfEndDate() {
            return cfEndDate;
        }

        /**
         * Sets the value of the cfEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCfEndDate(XMLGregorianCalendar value) {
            this.cfEndDate = value;
        }

        /**
         * Gets the value of the cfURI property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCfURI() {
            return cfURI;
        }

        /**
         * Sets the value of the cfURI property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCfURI(String value) {
            this.cfURI = value;
        }

        /**
         * Gets the value of the cfDescrOrCfDescrSrcOrCfTerm property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cfDescrOrCfDescrSrcOrCfTerm property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCfDescrOrCfDescrSrcOrCfTerm().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link CfMLangStringType }{@code >}
         * {@link JAXBElement }{@code <}{@link CfMLangStringType }{@code >}
         * {@link JAXBElement }{@code <}{@link CfClassSchemeType.CfClass.CfClassClass }{@code >}
         * {@link JAXBElement }{@code <}{@link CfMLangStringType }{@code >}
         * {@link JAXBElement }{@code <}{@link CfMLangStringType }{@code >}
         * {@link JAXBElement }{@code <}{@link CfMLangStringType }{@code >}
         * {@link JAXBElement }{@code <}{@link CfFedIdEmbType }{@code >}
         * {@link JAXBElement }{@code <}{@link CfMLangStringType }{@code >}
         * {@link JAXBElement }{@code <}{@link CfMLangStringType }{@code >}
         * {@link JAXBElement }{@code <}{@link CfMLangStringType }{@code >}
         * {@link JAXBElement }{@code <}{@link CfMLangStringType }{@code >}
         * {@link JAXBElement }{@code <}{@link CfMLangStringType }{@code >}
         * 
         * 
         */
        public List<JAXBElement<?>> getCfDescrOrCfDescrSrcOrCfTerm() {
            if (cfDescrOrCfDescrSrcOrCfTerm == null) {
                cfDescrOrCfDescrSrcOrCfTerm = new ArrayList<JAXBElement<?>>();
            }
            return this.cfDescrOrCfDescrSrcOrCfTerm;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;choice>
         *           &lt;sequence>
         *             &lt;element name="cfClassId2" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
         *             &lt;element name="cfClassSchemeId2" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
         *           &lt;/sequence>
         *           &lt;sequence>
         *             &lt;element name="cfClassId1" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
         *             &lt;element name="cfClassSchemeId1" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
         *           &lt;/sequence>
         *         &lt;/choice>
         *         &lt;group ref="{urn:xmlns:org:eurocris:cerif-1.6-2}cfCoreClassWithFraction__Group"/>
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
            "cfClassId2",
            "cfClassSchemeId2",
            "cfClassId1",
            "cfClassSchemeId1",
            "cfClassId",
            "cfClassSchemeId",
            "cfStartDate",
            "cfEndDate",
            "cfFraction"
        })
        public static class CfClassClass {

            protected String cfClassId2;
            protected String cfClassSchemeId2;
            protected String cfClassId1;
            protected String cfClassSchemeId1;
            @XmlElement(required = true)
            protected String cfClassId;
            @XmlElement(required = true)
            protected String cfClassSchemeId;
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar cfStartDate;
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar cfEndDate;
            protected Float cfFraction;

            /**
             * Gets the value of the cfClassId2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCfClassId2() {
                return cfClassId2;
            }

            /**
             * Sets the value of the cfClassId2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCfClassId2(String value) {
                this.cfClassId2 = value;
            }

            /**
             * Gets the value of the cfClassSchemeId2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCfClassSchemeId2() {
                return cfClassSchemeId2;
            }

            /**
             * Sets the value of the cfClassSchemeId2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCfClassSchemeId2(String value) {
                this.cfClassSchemeId2 = value;
            }

            /**
             * Gets the value of the cfClassId1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCfClassId1() {
                return cfClassId1;
            }

            /**
             * Sets the value of the cfClassId1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCfClassId1(String value) {
                this.cfClassId1 = value;
            }

            /**
             * Gets the value of the cfClassSchemeId1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCfClassSchemeId1() {
                return cfClassSchemeId1;
            }

            /**
             * Sets the value of the cfClassSchemeId1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCfClassSchemeId1(String value) {
                this.cfClassSchemeId1 = value;
            }

            /**
             * Gets the value of the cfClassId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCfClassId() {
                return cfClassId;
            }

            /**
             * Sets the value of the cfClassId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCfClassId(String value) {
                this.cfClassId = value;
            }

            /**
             * Gets the value of the cfClassSchemeId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCfClassSchemeId() {
                return cfClassSchemeId;
            }

            /**
             * Sets the value of the cfClassSchemeId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCfClassSchemeId(String value) {
                this.cfClassSchemeId = value;
            }

            /**
             * Gets the value of the cfStartDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCfStartDate() {
                return cfStartDate;
            }

            /**
             * Sets the value of the cfStartDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCfStartDate(XMLGregorianCalendar value) {
                this.cfStartDate = value;
            }

            /**
             * Gets the value of the cfEndDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCfEndDate() {
                return cfEndDate;
            }

            /**
             * Sets the value of the cfEndDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCfEndDate(XMLGregorianCalendar value) {
                this.cfEndDate = value;
            }

            /**
             * Gets the value of the cfFraction property.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getCfFraction() {
                return cfFraction;
            }

            /**
             * Sets the value of the cfFraction property.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setCfFraction(Float value) {
                this.cfFraction = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice>
     *           &lt;element name="cfClassSchemeId2" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
     *           &lt;element name="cfClassSchemeId1" type="{urn:xmlns:org:eurocris:cerif-1.6-2}cfId__Type"/>
     *         &lt;/choice>
     *         &lt;group ref="{urn:xmlns:org:eurocris:cerif-1.6-2}cfCoreClassWithFraction__Group"/>
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
        "cfClassSchemeId2",
        "cfClassSchemeId1",
        "cfClassId",
        "cfClassSchemeId",
        "cfStartDate",
        "cfEndDate",
        "cfFraction"
    })
    public static class CfClassSchemeClassScheme {

        protected String cfClassSchemeId2;
        protected String cfClassSchemeId1;
        @XmlElement(required = true)
        protected String cfClassId;
        @XmlElement(required = true)
        protected String cfClassSchemeId;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar cfStartDate;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar cfEndDate;
        protected Float cfFraction;

        /**
         * Gets the value of the cfClassSchemeId2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCfClassSchemeId2() {
            return cfClassSchemeId2;
        }

        /**
         * Sets the value of the cfClassSchemeId2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCfClassSchemeId2(String value) {
            this.cfClassSchemeId2 = value;
        }

        /**
         * Gets the value of the cfClassSchemeId1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCfClassSchemeId1() {
            return cfClassSchemeId1;
        }

        /**
         * Sets the value of the cfClassSchemeId1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCfClassSchemeId1(String value) {
            this.cfClassSchemeId1 = value;
        }

        /**
         * Gets the value of the cfClassId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCfClassId() {
            return cfClassId;
        }

        /**
         * Sets the value of the cfClassId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCfClassId(String value) {
            this.cfClassId = value;
        }

        /**
         * Gets the value of the cfClassSchemeId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCfClassSchemeId() {
            return cfClassSchemeId;
        }

        /**
         * Sets the value of the cfClassSchemeId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCfClassSchemeId(String value) {
            this.cfClassSchemeId = value;
        }

        /**
         * Gets the value of the cfStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCfStartDate() {
            return cfStartDate;
        }

        /**
         * Sets the value of the cfStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCfStartDate(XMLGregorianCalendar value) {
            this.cfStartDate = value;
        }

        /**
         * Gets the value of the cfEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCfEndDate() {
            return cfEndDate;
        }

        /**
         * Sets the value of the cfEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCfEndDate(XMLGregorianCalendar value) {
            this.cfEndDate = value;
        }

        /**
         * Gets the value of the cfFraction property.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getCfFraction() {
            return cfFraction;
        }

        /**
         * Sets the value of the cfFraction property.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setCfFraction(Float value) {
            this.cfFraction = value;
        }

    }

}
