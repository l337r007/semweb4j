/**
 * generated by http://RDFReactor.semweb4j.org ($Id: CodeGenerator.java 785 2007-05-31 15:47:01Z voelkel $) on 16.10.07 16:48
 */
package org.ontoware.semversion.impl.generated;

import org.ontoware.rdf2go.model.Model;
import org.ontoware.rdf2go.model.node.BlankNode;
import org.ontoware.rdf2go.model.node.URI;
import org.ontoware.rdf2go.model.node.impl.URIImpl;
import org.ontoware.rdf2go.exception.ModelRuntimeException;

import org.ontoware.rdfreactor.runtime.RDFDataException;
import org.ontoware.rdfreactor.runtime.CardinalityException;


/**
 * A SemVersion User
 *  
 * This class manages access to these properties:
 * <ul>
 *   <li> Name </li>
 *   <li> Password </li>
 * </ul>
 *
 * This class was generated by <a href="http://RDFReactor.semweb4j.org">RDFReactor</a> on 16.10.07 16:48
 */
public class User extends Thing {

    /** http://purl.org/net/semversion#User */
	public static final URI RDFS_CLASS = new URIImpl("http://purl.org/net/semversion#User", false);

    /** http://purl.org/net/semversion#hasName */
	public static final URI NAME = new URIImpl("http://purl.org/net/semversion#hasName",false);

    /** http://purl.org/net/semversion#hasPassword */
	public static final URI PASSWORD = new URIImpl("http://purl.org/net/semversion#hasPassword",false);

    /** all property-URIs with this class as domain */
    public static final URI[] MANAGED_URIS = {
      new URIImpl("http://purl.org/net/semversion#hasName",false),
      new URIImpl("http://purl.org/net/semversion#hasPassword",false) 
    };

	
	// protected constructors needed for inheritance
	
	/**
	 * Returns a Java wrapper over an RDF object, identified by URI.
	 * Creating two wrappers for the same instanceURI is legal.
	 * @param model RDF2GO Model implementation, see http://rdf2go.semweb4j.org
	 * @param classURI URI of RDFS class
	 * @param instanceIdentifier Resource that identifies this instance
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 */
	protected User ( Model model, URI classURI, org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write ) {
		super(model, classURI, instanceIdentifier, write);
	}

	// public constructors

	/**
	 * Returns a Java wrapper over an RDF object, identified by URI.
	 * Creating two wrappers for the same instanceURI is legal.
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param instanceIdentifier an RDF2Go Resource identifying this instance
	 * @param write if true, the statement (this, rdf:type, TYPE) is written to the model
	 */
	public User ( Model model, org.ontoware.rdf2go.model.node.Resource instanceIdentifier, boolean write ) {
		super(model, RDFS_CLASS, instanceIdentifier, write);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by URI.
	 * Creating two wrappers for the same instanceURI is legal.
	 * The statement (this, rdf:type, TYPE) is written to the model
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param uri URI of this instance
	 */
	public User ( Model model, URI uri ) {
		this(model, uri, true);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by URI.
	 * Creating two wrappers for the same instanceURI is legal.
	 * The statement (this, rdf:type, TYPE) is written to the model
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param uriString A URI of this instance, represented as a String
	 * @throws ModelRuntimeException if URI syntax is wrong
	 */
	public User ( Model model, String uriString ) throws ModelRuntimeException {
		this(model, new URIImpl(uriString), true);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by a blank node.
	 * Creating two wrappers for the same blank node is legal.
	 * The statement (this, rdf:type, TYPE) is written to the model
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 * @param bnode BlankNode of this instance
	 */
	public User ( Model model, BlankNode bnode ) {
		this(model, bnode, true);
	}

	/**
	 * Returns a Java wrapper over an RDF object, identified by 
	 * a randomly generated URI.
	 * Creating two wrappers results in different URIs.
	 * The statement (this, rdf:type, TYPE) is written to the model
	 * @param model RDF2GO Model implementation, see http://rdf2go.ontoware.org
	 */
	public User ( Model model ) {
		this(model, model.newRandomUniqueURI(), true);
	}


    ///////////////////////////////////////////////////////////////////
    // getters, setters, ...

	/**
	 * @param model RDF2Go model
	 * @param uri instance identifier
	 * @return an instance of User or null if none existst
	 * @throws Exception if Model causes problems
	 */
	public static User getInstance(Model model, URI uri) throws Exception {
		return (User) getInstance(model, uri, User.class);
	}

	/**
	 * @param model
	 * @param uri
	 * @return true if uri is an instance of this class in the model
	 */
	public static boolean hasInstance(Model model, URI uri) {
		return hasInstance(model, uri, RDFS_CLASS);
	}

	/**
	 * @return all instances of this class
	 */
	public User[] getAllInstances() {
		return (User[]) getAllInstances(super.model, User.class);
	}

	/**
	 * @return all instances of this class in the given Model
	 * @param model an RDF2Go model
	 */
	public static User[] getAllInstances(Model model) {
		return (User[]) getAllInstances(model, User.class);
	}

	/**
	 * @return all A's that have a relation 'Author' to this User instance
	 */
	public VersionedItem[] getAllAuthor_Inverse() {
		return (VersionedItem[]) getAll_Inverse(VersionedItem.AUTHOR, this.getResource(), VersionedItem.class);
	}

	/**
	 * add 'Author'-Inverse
	 * @param value
	 */
	public void addAuthor_Inverse(VersionedItem value) {
		value.add( VersionedItem.AUTHOR ,this);
	}



    /**
     * Schema Comment: 
     * @return the only value. null if none is found
     * @throws RDFDataException, if the property has multiple values
     */
	public java.lang.String getName() {
		return (java.lang.String) get(NAME, java.lang.String.class);
	}

	/**
	 * removes all values and sets this one
	 * @param value the value to be set
     * Schema Comment: 
	 */
	public void setName( java.lang.String value ) {
		set(NAME, value);
	}

	/**
	 * removes current value(s)
     * Schema Comment: 
	 */
	public void removeName() {
		removeAll(NAME);
	}
 	/**
	 * removes a value
	 * @param value the value to be removed
     * Schema Comment: 
	 * @throws CardinalityException if removing would change the number of
	 * values below the minimal cardinality 1
	 */
	public void removeName( java.lang.String value  )
	throws CardinalityException {
		remove(NAME, value, 1);
	}

 
	/**
	 * @param value
	 * @return true if the model contains a statement (this, NAME, value)
	 */
	public boolean hasName( java.lang.String value) {
		return hasValue(NAME, value);
	}

	/**
	 * @return true if the model contains a statement (this, NAME, *)
	 */
	public boolean hasName() {
		return hasValue(NAME);
	}

   

    /**
     * Schema Comment: 
     * @return the only value. null if none is found
     * @throws RDFDataException, if the property has multiple values
     */
	public java.lang.String getPassword() {
		return (java.lang.String) get(PASSWORD, java.lang.String.class);
	}

	/**
	 * removes all values and sets this one
	 * @param value the value to be set
     * Schema Comment: 
	 */
	public void setPassword( java.lang.String value ) {
		set(PASSWORD, value);
	}

	/**
	 * removes current value(s)
     * Schema Comment: 
	 */
	public void removePassword() {
		removeAll(PASSWORD);
	}
 	/**
	 * removes a value
	 * @param value the value to be removed
     * Schema Comment: 
	 * @throws CardinalityException if removing would change the number of
	 * values below the minimal cardinality 1
	 */
	public void removePassword( java.lang.String value  )
	throws CardinalityException {
		remove(PASSWORD, value, 1);
	}

 
	/**
	 * @param value
	 * @return true if the model contains a statement (this, PASSWORD, value)
	 */
	public boolean hasPassword( java.lang.String value) {
		return hasValue(PASSWORD, value);
	}

	/**
	 * @return true if the model contains a statement (this, PASSWORD, *)
	 */
	public boolean hasPassword() {
		return hasValue(PASSWORD);
	}

    
}

  
  