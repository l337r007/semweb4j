/**
 * generated by http://RDFReactor.semweb4j.org ($Id: CodeGenerator.java 870 2007-11-07 17:30:59Z max.at.xam.de $) on 25.01.08 23:14
 */
package org.ontoware.rdfreactor.schema.bootstrap;

import java.util.List;

import org.ontoware.aifbcommons.collection.ClosableIterator;
import org.ontoware.rdf2go.exception.ModelRuntimeException;
import org.ontoware.rdf2go.model.Model;
import org.ontoware.rdf2go.model.node.BlankNode;
import org.ontoware.rdf2go.model.node.URI;
import org.ontoware.rdf2go.model.node.impl.URIImpl;
import org.ontoware.rdfreactor.runtime.Base;
import org.ontoware.rdfreactor.runtime.ReactorResult;





/**
 * This class manages access to these properties:
 * <ul>
 *   <li> Domain </li>
 *   <li> Range </li>
 *   <li> SubPropertyOf </li>
 * </ul>
 *
 * This class was generated by <a href="http://RDFReactor.semweb4j.org">RDFReactor</a> on 25.01.08 23:14
 */
public class Property extends Resource {

    /** http://www.w3.org/1999/02/22-rdf-syntax-ns#Property */
	public static final URI RDFS_CLASS = new URIImpl("http://www.w3.org/1999/02/22-rdf-syntax-ns#Property", false);

    /** http://www.w3.org/2000/01/rdf-schema#domain */
	public static final URI DOMAIN = new URIImpl("http://www.w3.org/2000/01/rdf-schema#domain",false);

    /** http://www.w3.org/2000/01/rdf-schema#range */
	public static final URI RANGE = new URIImpl("http://www.w3.org/2000/01/rdf-schema#range",false);

    /** http://www.w3.org/2000/01/rdf-schema#subPropertyOf */
	public static final URI SUBPROPERTYOF = new URIImpl("http://www.w3.org/2000/01/rdf-schema#subPropertyOf",false);

    /** all property-URIs with this class as domain */
    public static final URI[] MANAGED_URIS = {
      new URIImpl("http://www.w3.org/2000/01/rdf-schema#domain",false),
      new URIImpl("http://www.w3.org/2000/01/rdf-schema#range",false),
      new URIImpl("http://www.w3.org/2000/01/rdf-schema#subPropertyOf",false) 
    };


	// protected constructors needed for inheritance
	
	/**
	 * Returns a Java wrapper over an RDF object, identified by URI.
	 * Creating two wrappers for the same instanceURI is legal.
	 * @param model RDF2GO Model implementation, see http://rdf2go.semweb4j.org
	 * @param classURI URI of RDFS class
	 * @param instanceIdentifier Resource that identifies this instance
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 *
	 * [Generated from RDFReactor template rule #c1] 
	 */
	protected Property ( Model model, URI classURI, org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write ) {
		super(model, classURI, instanceIdentifier, write);
	}

	// public constructors

	/**
	 * Returns a Java wrapper over an RDF object, identified by URI.
	 * Creating two wrappers for the same instanceURI is legal.
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param instanceIdentifier an RDF2Go Resource identifying this instance
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 *
	 * [Generated from RDFReactor template rule #c2] 
	 */
	public Property ( Model model, org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write ) {
		super(model, RDFS_CLASS, instanceIdentifier, write);
	}


	/**
	 * Returns a Java wrapper over an RDF object, identified by a URI, given as a String.
	 * Creating two wrappers for the same URI is legal.
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param uriString a URI given as a String
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 * @throws ModelRuntimeException if URI syntax is wrong
	 *
	 * [Generated from RDFReactor template rule #c7] 
	 */
	public Property ( Model model, String uriString, boolean write) throws ModelRuntimeException {
		super(model, RDFS_CLASS, new URIImpl(uriString,false), write);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by a blank node.
	 * Creating two wrappers for the same blank node is legal.
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param bnode BlankNode of this instance
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 *
	 * [Generated from RDFReactor template rule #c8] 
	 */
	public Property ( Model model, BlankNode bnode, boolean write ) {
		super(model, RDFS_CLASS, bnode, write);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by 
	 * a randomly generated URI.
	 * Creating two wrappers results in different URIs.
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 *
	 * [Generated from RDFReactor template rule #c9] 
	 */
	public Property ( Model model, boolean write ) {
		super(model, RDFS_CLASS, model.newRandomUniqueURI(), write);
	}

    ///////////////////////////////////////////////////////////////////
    // typing

	/**
	 * Create a new instance of this class in the model. 
	 * That is, create the statement (instanceResource, RDF.type, http://www.w3.org/1999/02/22-rdf-syntax-ns#Property).
	 * @param model an RDF2Go model
	 * @param instanceResource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #1] 
	 */
	public static void createInstance(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.createInstance(model, RDFS_CLASS, instanceResource);
	}

	/**
	 * @param model an RDF2Go model
	 * @param instanceResource an RDF2Go resource
	 * @return true if instanceResource is an instance of this class in the model
	 *
	 * [Generated from RDFReactor template rule #2] 
	 */
	public static boolean hasInstance(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.hasInstance(model, RDFS_CLASS, instanceResource);
	}

	/**
	 * @param model an RDF2Go model
	 * @return all instances of this class in Model 'model' as RDF resources
	 *
	 * [Generated from RDFReactor template rule #3] 
	 */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Resource> getAllInstancesAsRdf2GoResources(Model model) {
		return Base.getAllInstances(model, RDFS_CLASS,org.ontoware.rdf2go.model.node.Resource.class);
	}

	/**
	 * Delete all rdf:type from this instance. Other triples are not affected.
	 * @param model an RDF2Go model
	 * @param instanceResource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #4] 
	 */
	public static void deleteInstance(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.deleteInstance(model, RDFS_CLASS, instanceResource);
	}

    ///////////////////////////////////////////////////////////////////
    // property access methods

	/**
	 * @param model an RDF2Go model
	 * @param objectValue
	 * @return all A's as RDF resources, that have a relation 'SubPropertyOf' to this Property instance
	 *
	 * [Generated from RDFReactor template rule #getallinverse1static] 
	 */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Resource> getAllSubPropertyOf_Inverse( Model model, Object objectValue) {
		return Base.getAll_Inverse(model, Property.SUBPROPERTYOF, objectValue);
	}



     /**
     * Get all values of property Domain as an Iterator over RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static] 
     */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllDomain_asNode(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return (ClosableIterator<org.ontoware.rdf2go.model.node.Node>) Base.getAll_asNode(model, instanceResource, DOMAIN);
	}
	
    /**
     * Get all values of property Domain as a List of RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static-list] 
     */
	public static java.util.List<org.ontoware.rdf2go.model.node.Node> getAllDomain_asNodeList(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return (java.util.List<org.ontoware.rdf2go.model.node.Node>) Base.getAll_asNodeList(model, instanceResource, DOMAIN);
	}

    /**
     * Get all values of property Domain as an Iterator over RDF2Go nodes 
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic] 
     */
	public ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllDomain_asNode() {
		return (ClosableIterator<org.ontoware.rdf2go.model.node.Node>) Base.getAll_asNode(this.model, this.getResource(), DOMAIN);
	}

    /**
     * Get all values of property Domain as a List of RDF2Go nodes 
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic-list] 
     */
	public java.util.List<org.ontoware.rdf2go.model.node.Node> getAllDomain_asNodeList() {
		return (java.util.List<org.ontoware.rdf2go.model.node.Node>) Base.getAll_asNodeList(this.model, this.getResource(), DOMAIN);
	}
     /**
     * Get all values of property Domain     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get11static] 
     */
	public static ClosableIterator<Class> getAllDomain(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll(model, instanceResource, DOMAIN, Class.class);
	}
	
    /**
     * Get all values of property Domain as a List of Class 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get11static-list] 
     */
	public static java.util.List<Class> getAllDomain_asList(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_asList(model, instanceResource, DOMAIN, Class.class);
	}

    /**
     * Get all values of property Domain     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get12dynamic] 
     */
	public ClosableIterator<Class> getAllDomain() {
		return Base.getAll(this.model, this.getResource(), DOMAIN, Class.class);
	}

    /**
     * Get all values of property Domain as a List of Class 
     * @return a List of $type
	 *
	 * [Generated from RDFReactor template rule #get12dynamic-list] 
     */
	public java.util.List<Class> getAllDomain_asList() {
		return Base.getAll_asList(this.model, this.getResource(), DOMAIN, Class.class);
	}
 
    /**
     * Adds a value to property Domain as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1static] 
     */
	public static void addDomain( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.add(model, instanceResource, DOMAIN, value);
	}
	
    /**
     * Adds a value to property Domain as an RDF2Go node 
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1dynamic] 
     */
	public void addDomain( org.ontoware.rdf2go.model.node.Node value) {
		Base.add(this.model, this.getResource(), DOMAIN, value);
	}
    /**
     * Adds a value to property Domain from an instance of Class 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #add3static] 
     */
	public static void addDomain(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, Class value) {
		Base.add(model, instanceResource, DOMAIN, value);
	}
	
    /**
     * Adds a value to property Domain from an instance of Class 
	 *
	 * [Generated from RDFReactor template rule #add4dynamic] 
     */
	public void addDomain(Class value) {
		Base.add(this.model, this.getResource(), DOMAIN, value);
	}
  

    /**
     * Sets a value of property Domain from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be set
	 *
	 * [Generated from RDFReactor template rule #set1static] 
     */
	public static void setDomain( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.set(model, instanceResource, DOMAIN, value);
	}
	
    /**
     * Sets a value of property Domain from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set1dynamic] 
     */
	public void setDomain( org.ontoware.rdf2go.model.node.Node value) {
		Base.set(this.model, this.getResource(), DOMAIN, value);
	}
    /**
     * Sets a value of property Domain from an instance of Class 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set3static] 
     */
	public static void setDomain(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, Class value) {
		Base.set(model, instanceResource, DOMAIN, value);
	}
	
    /**
     * Sets a value of property Domain from an instance of Class 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set4dynamic] 
     */
	public void setDomain(Class value) {
		Base.set(this.model, this.getResource(), DOMAIN, value);
	}
  


    /**
     * Removes a value of property Domain as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1static] 
     */
	public static void removeDomain( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(model, instanceResource, DOMAIN, value);
	}
	
    /**
     * Removes a value of property Domain as an RDF2Go node
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1dynamic] 
     */
	public void removeDomain( org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(this.model, this.getResource(), DOMAIN, value);
	}
    /**
     * Removes a value of property Domain given as an instance of Class 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove3static] 
     */
	public static void removeDomain(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, Class value) {
		Base.remove(model, instanceResource, DOMAIN, value);
	}
	
    /**
     * Removes a value of property Domain given as an instance of Class 
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove4dynamic] 
     */
	public void removeDomain(Class value) {
		Base.remove(this.model, this.getResource(), DOMAIN, value);
	}
  
    /**
     * Removes all values of property Domain     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #removeall1static] 
     */
	public static void removeAllDomain( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.removeAll(model, instanceResource, DOMAIN);
	}
	
    /**
     * Removes all values of property Domain	 *
	 * [Generated from RDFReactor template rule #removeall1dynamic] 
     */
	public void addDomain() {
		Base.removeAll(this.model, this.getResource(), DOMAIN);
	}
      /**
     * Get all values of property Range as an Iterator over RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static] 
     */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllRange_asNode(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return (ClosableIterator<org.ontoware.rdf2go.model.node.Node>) Base.getAll_asNode(model, instanceResource, RANGE);
	}
	
    /**
     * Get all values of property Range as a List of RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static-list] 
     */
	public static java.util.List<org.ontoware.rdf2go.model.node.Node> getAllRange_asNodeList(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return (java.util.List<org.ontoware.rdf2go.model.node.Node>) Base.getAll_asNodeList(model, instanceResource, RANGE);
	}

    /**
     * Get all values of property Range as an Iterator over RDF2Go nodes 
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic] 
     */
	public ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllRange_asNode() {
		return (ClosableIterator<org.ontoware.rdf2go.model.node.Node>) Base.getAll_asNode(this.model, this.getResource(), RANGE);
	}

    /**
     * Get all values of property Range as a List of RDF2Go nodes 
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic-list] 
     */
	public java.util.List<org.ontoware.rdf2go.model.node.Node> getAllRange_asNodeList() {
		return (java.util.List<org.ontoware.rdf2go.model.node.Node>) Base.getAll_asNodeList(this.model, this.getResource(), RANGE);
	}
     /**
     * Get all values of property Range     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get11static] 
     */
	public static ClosableIterator<Class> getAllRange(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll(model, instanceResource, RANGE, Class.class);
	}
	
    /**
     * Get all values of property Range as a List of Class 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get11static-list] 
     */
	public static java.util.List<Class> getAllRange_asList(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_asList(model, instanceResource, RANGE, Class.class);
	}

    /**
     * Get all values of property Range     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get12dynamic] 
     */
	public ClosableIterator<Class> getAllRange() {
		return Base.getAll(this.model, this.getResource(), RANGE, Class.class);
	}

    /**
     * Get all values of property Range as a List of Class 
     * @return a List of $type
	 *
	 * [Generated from RDFReactor template rule #get12dynamic-list] 
     */
	public java.util.List<Class> getAllRange_asList() {
		return Base.getAll_asList(this.model, this.getResource(), RANGE, Class.class);
	}
 
    /**
     * Adds a value to property Range as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1static] 
     */
	public static void addRange( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.add(model, instanceResource, RANGE, value);
	}
	
    /**
     * Adds a value to property Range as an RDF2Go node 
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1dynamic] 
     */
	public void addRange( org.ontoware.rdf2go.model.node.Node value) {
		Base.add(this.model, this.getResource(), RANGE, value);
	}
    /**
     * Adds a value to property Range from an instance of Class 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #add3static] 
     */
	public static void addRange(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, Class value) {
		Base.add(model, instanceResource, RANGE, value);
	}
	
    /**
     * Adds a value to property Range from an instance of Class 
	 *
	 * [Generated from RDFReactor template rule #add4dynamic] 
     */
	public void addRange(Class value) {
		Base.add(this.model, this.getResource(), RANGE, value);
	}
  

    /**
     * Sets a value of property Range from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be set
	 *
	 * [Generated from RDFReactor template rule #set1static] 
     */
	public static void setRange( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.set(model, instanceResource, RANGE, value);
	}
	
    /**
     * Sets a value of property Range from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set1dynamic] 
     */
	public void setRange( org.ontoware.rdf2go.model.node.Node value) {
		Base.set(this.model, this.getResource(), RANGE, value);
	}
    /**
     * Sets a value of property Range from an instance of Class 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set3static] 
     */
	public static void setRange(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, Class value) {
		Base.set(model, instanceResource, RANGE, value);
	}
	
    /**
     * Sets a value of property Range from an instance of Class 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set4dynamic] 
     */
	public void setRange(Class value) {
		Base.set(this.model, this.getResource(), RANGE, value);
	}
  


    /**
     * Removes a value of property Range as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1static] 
     */
	public static void removeRange( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(model, instanceResource, RANGE, value);
	}
	
    /**
     * Removes a value of property Range as an RDF2Go node
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1dynamic] 
     */
	public void removeRange( org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(this.model, this.getResource(), RANGE, value);
	}
    /**
     * Removes a value of property Range given as an instance of Class 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove3static] 
     */
	public static void removeRange(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, Class value) {
		Base.remove(model, instanceResource, RANGE, value);
	}
	
    /**
     * Removes a value of property Range given as an instance of Class 
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove4dynamic] 
     */
	public void removeRange(Class value) {
		Base.remove(this.model, this.getResource(), RANGE, value);
	}
  
    /**
     * Removes all values of property Range     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #removeall1static] 
     */
	public static void removeAllRange( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.removeAll(model, instanceResource, RANGE);
	}
	
    /**
     * Removes all values of property Range	 *
	 * [Generated from RDFReactor template rule #removeall1dynamic] 
     */
	public void addRange() {
		Base.removeAll(this.model, this.getResource(), RANGE);
	}
      /**
     * Get all values of property SubPropertyOf as an Iterator over RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static] 
     */
	public static ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllSubPropertyOf_asNode(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return (ClosableIterator<org.ontoware.rdf2go.model.node.Node>) Base.getAll_asNode(model, instanceResource, SUBPROPERTYOF);
	}
	
    /**
     * Get all values of property SubPropertyOf as a List of RDF2Go nodes 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get7static-list] 
     */
	public static java.util.List<org.ontoware.rdf2go.model.node.Node> getAllSubPropertyOf_asNodeList(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return (java.util.List<org.ontoware.rdf2go.model.node.Node>) Base.getAll_asNodeList(model, instanceResource, SUBPROPERTYOF);
	}

    /**
     * Get all values of property SubPropertyOf as an Iterator over RDF2Go nodes 
     * @return a ClosableIterator of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic] 
     */
	public ClosableIterator<org.ontoware.rdf2go.model.node.Node> getAllSubPropertyOf_asNode() {
		return (ClosableIterator<org.ontoware.rdf2go.model.node.Node>) Base.getAll_asNode(this.model, this.getResource(), SUBPROPERTYOF);
	}

    /**
     * Get all values of property SubPropertyOf as a List of RDF2Go nodes 
     * @return a List of RDF2Go Nodes
	 *
	 * [Generated from RDFReactor template rule #get8dynamic-list] 
     */
	public java.util.List<org.ontoware.rdf2go.model.node.Node> getAllSubPropertyOf_asNodeList() {
		return (java.util.List<org.ontoware.rdf2go.model.node.Node>) Base.getAll_asNodeList(this.model, this.getResource(), SUBPROPERTYOF);
	}
     /**
     * Get all values of property SubPropertyOf     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get11static] 
     */
	public static ClosableIterator<Property> getAllSubPropertyOf(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll(model, instanceResource, SUBPROPERTYOF, Property.class);
	}
	
    /**
     * Get all values of property SubPropertyOf as a List of Property 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get11static-list] 
     */
	public static java.util.List<Property> getAllSubPropertyOf_asList(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		return Base.getAll_asList(model, instanceResource, SUBPROPERTYOF, Property.class);
	}

    /**
     * Get all values of property SubPropertyOf     * @return a ClosableIterator of $type
	 *
	 * [Generated from RDFReactor template rule #get12dynamic] 
     */
	public ClosableIterator<Property> getAllSubPropertyOf() {
		return Base.getAll(this.model, this.getResource(), SUBPROPERTYOF, Property.class);
	}

    /**
     * Get all values of property SubPropertyOf as a List of Property 
     * @return a List of $type
	 *
	 * [Generated from RDFReactor template rule #get12dynamic-list] 
     */
	public java.util.List<Property> getAllSubPropertyOf_asList() {
		return Base.getAll_asList(this.model, this.getResource(), SUBPROPERTYOF, Property.class);
	}
 
    /**
     * Adds a value to property SubPropertyOf as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1static] 
     */
	public static void addSubPropertyOf( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.add(model, instanceResource, SUBPROPERTYOF, value);
	}
	
    /**
     * Adds a value to property SubPropertyOf as an RDF2Go node 
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #add1dynamic] 
     */
	public void addSubPropertyOf( org.ontoware.rdf2go.model.node.Node value) {
		Base.add(this.model, this.getResource(), SUBPROPERTYOF, value);
	}
    /**
     * Adds a value to property SubPropertyOf from an instance of Property 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #add3static] 
     */
	public static void addSubPropertyOf(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, Property value) {
		Base.add(model, instanceResource, SUBPROPERTYOF, value);
	}
	
    /**
     * Adds a value to property SubPropertyOf from an instance of Property 
	 *
	 * [Generated from RDFReactor template rule #add4dynamic] 
     */
	public void addSubPropertyOf(Property value) {
		Base.add(this.model, this.getResource(), SUBPROPERTYOF, value);
	}
  

    /**
     * Sets a value of property SubPropertyOf from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be set
	 *
	 * [Generated from RDFReactor template rule #set1static] 
     */
	public static void setSubPropertyOf( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.set(model, instanceResource, SUBPROPERTYOF, value);
	}
	
    /**
     * Sets a value of property SubPropertyOf from an RDF2Go node.
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set1dynamic] 
     */
	public void setSubPropertyOf( org.ontoware.rdf2go.model.node.Node value) {
		Base.set(this.model, this.getResource(), SUBPROPERTYOF, value);
	}
    /**
     * Sets a value of property SubPropertyOf from an instance of Property 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set3static] 
     */
	public static void setSubPropertyOf(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, Property value) {
		Base.set(model, instanceResource, SUBPROPERTYOF, value);
	}
	
    /**
     * Sets a value of property SubPropertyOf from an instance of Property 
     * First, all existing values are removed, then this value is added.
     * Cardinality constraints are not checked, but this method exists only for properties with
     * no minCardinality or minCardinality == 1.
	 * @param value the value to be added
	 *
	 * [Generated from RDFReactor template rule #set4dynamic] 
     */
	public void setSubPropertyOf(Property value) {
		Base.set(this.model, this.getResource(), SUBPROPERTYOF, value);
	}
  


    /**
     * Removes a value of property SubPropertyOf as an RDF2Go node 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1static] 
     */
	public static void removeSubPropertyOf( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(model, instanceResource, SUBPROPERTYOF, value);
	}
	
    /**
     * Removes a value of property SubPropertyOf as an RDF2Go node
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove1dynamic] 
     */
	public void removeSubPropertyOf( org.ontoware.rdf2go.model.node.Node value) {
		Base.remove(this.model, this.getResource(), SUBPROPERTYOF, value);
	}
    /**
     * Removes a value of property SubPropertyOf given as an instance of Property 
     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove3static] 
     */
	public static void removeSubPropertyOf(Model model, org.ontoware.rdf2go.model.node.Resource instanceResource, Property value) {
		Base.remove(model, instanceResource, SUBPROPERTYOF, value);
	}
	
    /**
     * Removes a value of property SubPropertyOf given as an instance of Property 
	 * @param value the value to be removed
	 *
	 * [Generated from RDFReactor template rule #remove4dynamic] 
     */
	public void removeSubPropertyOf(Property value) {
		Base.remove(this.model, this.getResource(), SUBPROPERTYOF, value);
	}
  
    /**
     * Removes all values of property SubPropertyOf     * @param model an RDF2Go model
     * @param resource an RDF2Go resource
	 *
	 * [Generated from RDFReactor template rule #removeall1static] 
     */
	public static void removeAllSubPropertyOf( Model model, org.ontoware.rdf2go.model.node.Resource instanceResource) {
		Base.removeAll(model, instanceResource, SUBPROPERTYOF);
	}
	
    /**
     * Removes all values of property SubPropertyOf	 *
	 * [Generated from RDFReactor template rule #removeall1dynamic] 
     */
	public void addSubPropertyOf() {
		Base.removeAll(this.model, this.getResource(), SUBPROPERTYOF);
	}

	public static List<Property> getAllInstances_asList(Model m) {
		return Base.getAllInstances_asList(m, RDFS_CLASS, Property.class);
	}

	public static Property[] getAllInstances_asArray(Model m) {
		return Base.getAllInstances_asArray(m, RDFS_CLASS, Property.class);
	}

	public static ReactorResult<? extends Property> getAllInstance_as(Model model) {
		return Base.getAllInstances_as(model, RDFS_CLASS, Property.class );
	}


 }