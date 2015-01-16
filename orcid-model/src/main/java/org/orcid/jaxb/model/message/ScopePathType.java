/**
 * =============================================================================
 *
 * ORCID (R) Open Source
 * http://orcid.org
 *
 * Copyright (c) 2012-2014 ORCID, Inc.
 * Licensed under an MIT-Style License (MIT)
 * http://orcid.org/open-source-license
 *
 * This copyright and license information (including a link to the full license)
 * shall be included in its entirety in all copies or substantial portion of
 * the software.
 *
 * =============================================================================
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.09 at 01:52:56 PM BST 
//

package org.orcid.jaxb.model.message;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for scope-path-type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="scope-path-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="/authorize"/>
 *     &lt;enumeration value="/authenticate"/>
 *     &lt;enumeration value="/read-public"/>
 *     &lt;enumeration value="/webhook"/>
 *     &lt;enumeration value="/orcid-bio/read-limited"/>
 *     &lt;enumeration value="/orcid-profile/read-limited"/>
 *     &lt;enumeration value="/orcid-works/read-limited"/>
 *     &lt;enumeration value="/funding/read-limited"/>
 *     &lt;enumeration value="/orcid-patents/read-limited"/>
 *     &lt;enumeration value="/orcid-works/update"/>
 *     &lt;enumeration value="/funding/update"/>
 *     &lt;enumeration value="/orcid-patents/update"/>
 *     &lt;enumeration value="/orcid-bio/external-identifiers/create"/>
 *     &lt;enumeration value="/orcid-bio/update"/>
 *     &lt;enumeration value="/orcid-works/create"/>
 *     &lt;enumeration value="/funding/create"/>
 *     &lt;enumeration value="/orcid-patents/create"/>
 *     &lt;enumeration value="/orcid-profile/create"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "scope-path-type")
@XmlEnum
public enum ScopePathType implements Serializable {

    //@formatter:off
    @XmlEnumValue("/authenticate") AUTHENTICATE("/authenticate"),
    @XmlEnumValue("/read-public") READ_PUBLIC("/read-public"),
    @XmlEnumValue("/webhook") WEBHOOK("/webhook"),
    @XmlEnumValue("/orcid-bio/read-limited") ORCID_BIO_READ_LIMITED("/orcid-bio/read-limited", READ_PUBLIC),
    @XmlEnumValue("/orcid-profile/read-limited") ORCID_PROFILE_READ_LIMITED("/orcid-profile/read-limited", READ_PUBLIC),
    @XmlEnumValue("/affiliations/read-limited") AFFILIATIONS_READ_LIMITED("/affiliations/read-limited", READ_PUBLIC),
    @XmlEnumValue("/orcid-works/read-limited") ORCID_WORKS_READ_LIMITED("/orcid-works/read-limited", READ_PUBLIC),
    @XmlEnumValue("/funding/read-limited") FUNDING_READ_LIMITED("/funding/read-limited", READ_PUBLIC),
    @XmlEnumValue("/orcid-patents/read-limited") ORCID_PATENTS_READ_LIMITED("/orcid-patents/read-limited", READ_PUBLIC),
    @XmlEnumValue("/affiliations/update") AFFILIATIONS_UPDATE("/affiliations/update", AFFILIATIONS_READ_LIMITED, READ_PUBLIC),
    @XmlEnumValue("/orcid-works/update") ORCID_WORKS_UPDATE("/orcid-works/update", ORCID_WORKS_READ_LIMITED, READ_PUBLIC),
    @XmlEnumValue("/funding/update") FUNDING_UPDATE("/funding/update", FUNDING_READ_LIMITED, READ_PUBLIC),
    @XmlEnumValue("/orcid-patents/update") ORCID_PATENTS_UPDATE("/orcid-patents/update", ORCID_PATENTS_READ_LIMITED, READ_PUBLIC),
    @XmlEnumValue("/orcid-bio/external-identifiers/create") ORCID_BIO_EXTERNAL_IDENTIFIERS_CREATE("/orcid-bio/external-identifiers/create", READ_PUBLIC),
    @XmlEnumValue("/orcid-bio/update") ORCID_BIO_UPDATE("/orcid-bio/update", ORCID_BIO_READ_LIMITED, ORCID_BIO_EXTERNAL_IDENTIFIERS_CREATE, READ_PUBLIC),
    @XmlEnumValue("/affiliations/create") AFFILIATIONS_CREATE("/affiliations/create", AFFILIATIONS_READ_LIMITED, READ_PUBLIC),
    @XmlEnumValue("/orcid-works/create") ORCID_WORKS_CREATE("/orcid-works/create", ORCID_WORKS_READ_LIMITED, READ_PUBLIC),
    @XmlEnumValue("/funding/create") FUNDING_CREATE("/funding/create", FUNDING_READ_LIMITED, READ_PUBLIC),
    @XmlEnumValue("/orcid-patents/create") ORCID_PATENTS_CREATE("/orcid-patents/create", ORCID_PATENTS_UPDATE, READ_PUBLIC),    
    @XmlEnumValue("/notification") NOTIFICATION("/notification"),
    
    //XXX: Per activity API
    @XmlEnumValue("/activities/update") ACTIVITIES_UPDATE ("/activities/update", ORCID_WORKS_CREATE, ORCID_WORKS_UPDATE, AFFILIATIONS_CREATE, AFFILIATIONS_UPDATE, FUNDING_CREATE, FUNDING_UPDATE),
    @XmlEnumValue("/orcid-profile/create") ORCID_PROFILE_CREATE("/orcid-profile/create", ORCID_BIO_READ_LIMITED, ORCID_WORKS_READ_LIMITED, ORCID_PROFILE_READ_LIMITED, ORCID_WORKS_UPDATE, ORCID_BIO_UPDATE,
            FUNDING_UPDATE, AFFILIATIONS_UPDATE, ORCID_PATENTS_UPDATE, ORCID_BIO_EXTERNAL_IDENTIFIERS_CREATE, ORCID_WORKS_CREATE, FUNDING_CREATE, AFFILIATIONS_CREATE, ORCID_PATENTS_CREATE, AUTHENTICATE, READ_PUBLIC, ACTIVITIES_UPDATE);
    //@formatter:on

    private final String value;

    Set<ScopePathType> combined;

    static Map<String, ScopePathType> mapByValue = new HashMap<String, ScopePathType>();
    static {
        for (ScopePathType scope : values()) {
            mapByValue.put(scope.value(), scope);
        }
    }

    ScopePathType(String value, ScopePathType... inherited) {
        this.value = value;
        this.combined = new HashSet<ScopePathType>(Arrays.asList(inherited));
        this.combined.add(this);
    }

    public String value() {
        return value;
    }
    
    public String getContent() {
        return value;
    }

    public static ScopePathType fromValue(String scopeString) {
        if (mapByValue.containsKey(scopeString)) {
            return mapByValue.get(scopeString);
        }
        throw new IllegalArgumentException(scopeString);
    }

    /**
     * @return A set containing this scope and all its inherited scopes
     */
    public Set<ScopePathType> combined() {
        return combined;
    }

    /*
     * These types are issued by the user and last a long time
     */
    public boolean isReadOnlyScope() {
        switch (this) {
        case ORCID_BIO_READ_LIMITED:
            return true;
        case ORCID_PROFILE_READ_LIMITED:
            return true;
        case ORCID_WORKS_READ_LIMITED:
            return true;
        case FUNDING_READ_LIMITED:
            return true;
        case ORCID_PATENTS_READ_LIMITED:
            return true;
        default:
            return false;
        }
    }
    
    /* 
     * http://support.orcid.org/knowledgebase/articles/119656
     * These types are issues by ORCID and don't expire for
     * at long time.
     */
    public boolean isClientCreditalScope() {
        switch (this) {
            case ORCID_PROFILE_CREATE:
                return true;
            case READ_PUBLIC:
                return true;
            case WEBHOOK:
                return true;
            case NOTIFICATION:
                return true;
            default:
                return false;
        }
    }

    /*
     * These scopes are granted by the user and 
     * currently only last an hour.
     */
    public boolean isUserGrantWriteScope() {
        switch (this) {
        case AFFILIATIONS_UPDATE:
            return true;
        case AFFILIATIONS_CREATE:
            return true;
        case ORCID_WORKS_UPDATE:
            return true;
        case ORCID_WORKS_CREATE:
            return true;
        case ORCID_BIO_EXTERNAL_IDENTIFIERS_CREATE:
            return true;
        case ORCID_BIO_UPDATE:
            return true;
        case ORCID_PROFILE_CREATE:
            // this is tricky, this scope doesn't follow all the rules of 
            // of the other scopes, it is allow to have a longer expiration date
            // and only works on unclaimed records
            return false; 
        case FUNDING_CREATE:
            return true;
        case FUNDING_UPDATE:
            return true;
        case ORCID_PATENTS_CREATE:
            return true;
        case ORCID_PATENTS_UPDATE:
            return true;
        case ACTIVITIES_UPDATE:
            return true;
        default:
            return false;
        }
    }
    
    /**
     * @return A set containing the external identifiers for this scope and all
     *         its inherited scopes
     */
    public Set<String> getCombinedAsStrings() {
        return getScopesAsStrings(combined());
    }

    public boolean hasScope(ScopePathType scope) {
        return combined.contains(scope);
    }

    public boolean hasScope(String scope) {
        return hasScope(fromValue(scope));
    }

    public static boolean hasStringScope(String scope, ScopePathType required) {
        return fromValue(scope).combined().contains(required);
    }

    public static Set<ScopePathType> getScopesFromStrings(Collection<String> scopes) {
        Set<ScopePathType> newScopes = new HashSet<ScopePathType>();
        for (String scopeString : scopes) {
            ScopePathType scope = mapByValue.get(scopeString);
            if (scope != null) {
                newScopes.add(scope);
            }
        }
        return newScopes;
    }

    public static Set<ScopePathType> getScopesFromSpaceSeparatedString(String scopesString) {
        if (scopesString == null) {
            return null;
        }
        return getScopesFromStrings(Arrays.asList(scopesString.split("\\s")));
    }

    public static Set<String> getScopesAsStrings(Collection<ScopePathType> scopes) {
        Set<String> scopeStrings = new HashSet<String>();
        for (ScopePathType scope : scopes) {
            scopeStrings.add(scope.value());
        }
        return scopeStrings;
    }

    public static String getScopesAsSingleString(Collection<ScopePathType> scopes) {
        StringBuilder sb = new StringBuilder();

        for (ScopePathType scope : scopes) {
            sb.append(scope.value() + " ");
        }
        return sb.toString().trim();
    }

    public static Set<String> getScopesAsStrings(ScopePathType... scopes) {
        return getScopesAsStrings(Arrays.asList(scopes));
    }
    
    public static void main(String []a) {
        System.out.println(ScopePathType.ORCID_PROFILE_CREATE.getCombinedAsStrings());
    }

}
