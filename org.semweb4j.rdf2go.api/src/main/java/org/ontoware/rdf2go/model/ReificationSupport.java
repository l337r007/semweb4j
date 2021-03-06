/**
 * LICENSE INFORMATION
 * 
 * Copyright 2005-2008 by FZI (http://www.fzi.de). Licensed under a BSD license
 * (http://www.opensource.org/licenses/bsd-license.php) <OWNER> = Max Völkel
 * <ORGANIZATION> = FZI Forschungszentrum Informatik Karlsruhe, Karlsruhe,
 * Germany <YEAR> = 2010
 * 
 * Further project information at http://semanticweb.org/wiki/RDF2Go
 */

package org.ontoware.rdf2go.model;

import java.util.Collection;

import org.ontoware.rdf2go.model.node.BlankNode;
import org.ontoware.rdf2go.model.node.Resource;


/**
 * Support for reification, as defined in @see http://www.w3.org/TR/rdf-mt/#Reif
 * 
 * @author voelkel
 * 
 */
public interface ReificationSupport {
	
	/**
	 * A convenience function for addReficationOf( createBlankNode(), statement
	 * );
	 * 
	 * @param statement
	 * @return a new BlankNode which holds the reification of the given
	 *         statement.
	 */
	BlankNode addReificationOf(Statement statement);
	
	/**
	 * Reifies the statement, whether the statement was present in the model or
	 * not. The statement itself is never added to the model, but it might have
	 * been in the model before this method call. This method creates only
	 * triples like (resource )rdf:subject s; rdf:predicate p; rdf:object o.
	 * Where s,p, and o are taken from the given statement.
	 * 
	 * Adds the following statements, as defined in @see
	 * http://www.w3.org/TR/rdf-mt/#Reif
	 * 
	 * <code><pre>
	 * (resource) rdf:type       rdf:Statement .
	 * (resource) rdf:subject   (statement.getSubject()) .
	 * (resource) rdf:predicate (statement.getPredicate()) .
	 * (resource) rdf:object    (statement.getObject()) .
	 * </pre></code>
	 * 
	 * @param statement which will be reified
	 * @param resource used to represent the reified statement
	 * @return the given resource
	 */
	Resource addReificationOf(Statement statement, Resource resource);
	
	/**
	 * Delete reifications made by this resource. More technically, this method
	 * will remove the following patterns: <code><pre>
	 * (reificationResource) rdf:type      rdf:Statement . 
	 * (reificationResource) rdf:subject   * .
	 * (reificationResource) rdf:predicate * .
	 * (reificationResource) rdf:object    * .
	 * </pre></code> Note that one resource might have been used in several
	 * reifications. Although semantic nonsense, this can happen. This method
	 * cleans up also these cases.
	 * 
	 * Note that this method deletes the reification <em>from all contexts</em>.
	 * 
	 * @param reificationResource
	 */
	void deleteReification(Resource reificationResource);
	
	/**
	 * @param statement
	 * @return a collection which contains all resources that are a reification
	 *         of the given statement.
	 */
	Collection<Resource> getAllReificationsOf(Statement statement);
	
	/**
	 * @param stmt
	 * @return true if the model contains results to the query <code><pre>
	 * ?reificationResource rdf:type      rdf:Statement . 
	 * ?reificationResource rdf:subject   ?s .
	 * ?reificationResource rdf:predicate ?p .
	 * ?reificationResource rdf:object    ?o .
	 * </pre></code>
	 */
	boolean hasReifications(Statement stmt);
	
}
