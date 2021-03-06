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

package org.ontoware.rdf2go.model.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Iterator;
import java.util.Map;

import org.ontoware.aifbcommons.collection.ClosableIterable;
import org.ontoware.aifbcommons.collection.ClosableIterator;
import org.ontoware.rdf2go.exception.LockException;
import org.ontoware.rdf2go.exception.ModelRuntimeException;
import org.ontoware.rdf2go.exception.QueryLanguageNotSupportedException;
import org.ontoware.rdf2go.model.Diff;
import org.ontoware.rdf2go.model.DiffReader;
import org.ontoware.rdf2go.model.Model;
import org.ontoware.rdf2go.model.QueryResultTable;
import org.ontoware.rdf2go.model.Statement;
import org.ontoware.rdf2go.model.Syntax;
import org.ontoware.rdf2go.model.TriplePattern;
import org.ontoware.rdf2go.model.node.BlankNode;
import org.ontoware.rdf2go.model.node.Node;
import org.ontoware.rdf2go.model.node.NodeOrVariable;
import org.ontoware.rdf2go.model.node.Resource;
import org.ontoware.rdf2go.model.node.ResourceOrVariable;
import org.ontoware.rdf2go.model.node.URI;
import org.ontoware.rdf2go.model.node.UriOrVariable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Delegates all calls to underlying model. This class is meant to be subclassed
 * and have some methods overriden. This was inspired by Sesame's SAIL API.
 * 
 * @author voelkel
 */
public class DelegatingModel extends AbstractModel implements Model {
	
	/**
     * 
     */
	private static final long serialVersionUID = 8030119548548555034L;
	
	private static final Logger log = LoggerFactory.getLogger(DelegatingModel.class);
	
	private Model delegatedModel;
	
	/**
	 * Please set model!
	 */
	protected DelegatingModel() {
		// use the setModel method
	}
	
	public DelegatingModel(Model model) {
		this.delegatedModel = model;
	}
	
	@Override
	public void addAll(Iterator<? extends Statement> other) throws ModelRuntimeException {
		this.delegatedModel.addAll(other);
	}
	
	@Override
	public void addStatement(Resource subject, URI predicate, Node object)
	        throws ModelRuntimeException {
		this.delegatedModel.addStatement(subject, predicate, object);
	}
	
	@Override
	public void addStatement(Resource subject, URI predicate, String literal)
	        throws ModelRuntimeException {
		this.delegatedModel.addStatement(subject, predicate, literal);
	}
	
	@Override
	public void addStatement(Resource subject, URI predicate, String literal, String languageTag)
	        throws ModelRuntimeException {
		this.delegatedModel.addStatement(subject, predicate, literal, languageTag);
	}
	
	@Override
	public void addStatement(Resource subject, URI predicate, String literal, URI datatypeURI)
	        throws ModelRuntimeException {
		this.delegatedModel.addStatement(subject, predicate, literal, datatypeURI);
	}
	
	@Override
	public void addStatement(Statement statement) throws ModelRuntimeException {
		this.delegatedModel.addStatement(statement);
	}
	
	@Override
	public void addStatement(String subjectURIString, URI predicate, String literal)
	        throws ModelRuntimeException {
		this.delegatedModel.addStatement(subjectURIString, predicate, literal);
	}
	
	@Override
	public void addStatement(String subjectURIString, URI predicate, String literal,
	        String languageTag) throws ModelRuntimeException {
		this.delegatedModel.addStatement(subjectURIString, predicate, literal, languageTag);
	}
	
	@Override
	public void addStatement(String subjectURIString, URI predicate, String literal, URI datatypeURI)
	        throws ModelRuntimeException {
		this.delegatedModel.addStatement(subjectURIString, predicate, literal, datatypeURI);
	}
	
	@Override
	public void close() {
		this.delegatedModel.close();
	}
	
	@Override
	@Deprecated
	public void commit() {
		this.delegatedModel.commit();
	}
	
	@Override
	public boolean contains(ResourceOrVariable subject, UriOrVariable predicate,
	        NodeOrVariable object) throws ModelRuntimeException {
		return this.delegatedModel.contains(subject, predicate, object);
	}
	
	@Override
	public BlankNode createBlankNode() {
		return this.delegatedModel.createBlankNode();
	}
	
	@Override
	public BlankNode createBlankNode(String internalID) {
		return this.delegatedModel.createBlankNode(internalID);
	}
	
	@Override
	public URI createURI(String uriString) throws ModelRuntimeException {
		return this.delegatedModel.createURI(uriString);
	}
	
	@Override
	public void dump() {
		this.delegatedModel.dump();
	}
	
	@Override
	public ClosableIterator<Statement> findStatements(ResourceOrVariable subject,
	        UriOrVariable predicate, NodeOrVariable object) throws ModelRuntimeException {
		return this.delegatedModel.findStatements(subject, predicate, object);
	}
	
	@Override
	public ClosableIterator<Statement> findStatements(TriplePattern pattern)
	        throws ModelRuntimeException {
		return this.delegatedModel.findStatements(pattern);
	}
	
	@Override
	public URI getContextURI() {
		return this.delegatedModel.getContextURI();
	}
	
	public Model getDelegatedModel() {
		return this.delegatedModel;
	}
	
	@Override
	public Diff getDiff(Iterator<? extends Statement> other) throws ModelRuntimeException {
		return this.delegatedModel.getDiff(other);
	}
	
	@Override
	public Object getProperty(URI propertyURI) {
		return this.delegatedModel.getProperty(propertyURI);
	}
	
	@Override
	public Object getUnderlyingModelImplementation() {
		return this.delegatedModel.getUnderlyingModelImplementation();
	}
	
	@Override
	public boolean isEmpty() {
		return this.delegatedModel.isEmpty();
	}
	
	@Override
	public boolean isIsomorphicWith(Model other) {
		return this.delegatedModel.isIsomorphicWith(other);
	}
	
	@Override
	public boolean isLocked() {
		return this.delegatedModel.isLocked();
	}
	
	@Override
	public boolean isOpen() {
		return this.delegatedModel.isOpen();
	}
	
	@Override
	public boolean isValidURI(String uriString) {
		return this.delegatedModel.isValidURI(uriString);
	}
	
	@Override
	public ClosableIterator<Statement> iterator() {
		return this.delegatedModel.iterator();
	}
	
	@Override
	public void lock() throws LockException {
		this.delegatedModel.lock();
	}
	
	@Override
	public URI newRandomUniqueURI() {
		return this.delegatedModel.newRandomUniqueURI();
	}
	
	@Override
	public Model open() {
		return this.delegatedModel.open();
	}
	
	@Override
	public ClosableIterable<Statement> queryConstruct(String query, String querylanguage)
	        throws QueryLanguageNotSupportedException, ModelRuntimeException {
		return this.delegatedModel.queryConstruct(query, querylanguage);
	}
	
	@Override
	public QueryResultTable querySelect(String query, String querylanguage)
	        throws QueryLanguageNotSupportedException, ModelRuntimeException {
		return this.delegatedModel.querySelect(query, querylanguage);
	}
	
	@Override
	public void readFrom(InputStream in) throws IOException, ModelRuntimeException {
		this.delegatedModel.readFrom(in);
	}
	
	@Override
	public void readFrom(InputStream reader, Syntax syntax) throws IOException,
	        ModelRuntimeException {
		this.delegatedModel.readFrom(reader, syntax);
	}
	
	@Override
	public void readFrom(Reader r) throws IOException, ModelRuntimeException {
		this.delegatedModel.readFrom(r);
	}
	
	@Override
	public void readFrom(Reader reader, Syntax syntax) throws ModelRuntimeException, IOException {
		this.delegatedModel.readFrom(reader, syntax);
	}
	
	@Override
	public void removeAll() throws ModelRuntimeException {
		this.delegatedModel.removeAll();
	}
	
	@Override
	public void removeAll(Iterator<? extends Statement> other) throws ModelRuntimeException {
		this.delegatedModel.removeAll(other);
	}
	
	@Override
	public void removeStatement(Resource subject, URI predicate, Node object)
	        throws ModelRuntimeException {
		this.delegatedModel.removeStatement(subject, predicate, object);
	}
	
	@Override
	public void removeStatement(Resource subject, URI predicate, String literal)
	        throws ModelRuntimeException {
		this.delegatedModel.removeStatement(subject, predicate, literal);
	}
	
	@Override
	public void removeStatement(Resource subject, URI predicate, String literal, String languageTag)
	        throws ModelRuntimeException {
		this.delegatedModel.removeStatement(subject, predicate, literal, languageTag);
	}
	
	@Override
	public void removeStatement(Resource subject, URI predicate, String literal, URI datatypeURI)
	        throws ModelRuntimeException {
		this.delegatedModel.removeStatement(subject, predicate, literal, datatypeURI);
	}
	
	@Override
	public void removeStatement(Statement statement) throws ModelRuntimeException {
		this.delegatedModel.removeStatement(statement);
	}
	
	@Override
	public void removeStatement(String subjectURIString, URI predicate, String literal)
	        throws ModelRuntimeException {
		this.delegatedModel.removeStatement(subjectURIString, predicate, literal);
	}
	
	@Override
	public void removeStatement(String subjectURIString, URI predicate, String literal,
	        String languageTag) throws ModelRuntimeException {
		this.delegatedModel.removeStatement(subjectURIString, predicate, literal, languageTag);
	}
	
	@Override
	public void removeStatement(String subjectURIString, URI predicate, String literal,
	        URI datatypeURI) throws ModelRuntimeException {
		this.delegatedModel.removeStatement(subjectURIString, predicate, literal, datatypeURI);
	}
	
	@Override
	public void removeStatements(ResourceOrVariable subject, UriOrVariable predicate,
	        NodeOrVariable object) throws ModelRuntimeException {
		this.delegatedModel.removeStatements(subject, predicate, object);
	}
	
	@Override
	@Deprecated
	public void setAutocommit(boolean autocommit) {
		this.delegatedModel.setAutocommit(autocommit);
	}
	
	protected void setDelegatedModel(Model model) {
		this.delegatedModel = model;
	}
	
	@Override
	public void setProperty(URI propertyURI, Object value) {
		this.delegatedModel.setProperty(propertyURI, value);
	}
	
	@Override
	public long size() throws ModelRuntimeException {
		return this.delegatedModel.size();
	}
	
	@Override
	public boolean sparqlAsk(String query) throws ModelRuntimeException {
		boolean result = this.delegatedModel.sparqlAsk(query);
		return result;
	}
	
	@Override
	public ClosableIterable<Statement> sparqlConstruct(String query) throws ModelRuntimeException {
		return this.delegatedModel.sparqlConstruct(query);
	}
	
	@Override
	public ClosableIterable<Statement> sparqlDescribe(String query) throws ModelRuntimeException {
		return this.delegatedModel.sparqlDescribe(query);
	}
	
	@Override
	public QueryResultTable sparqlSelect(String queryString) throws ModelRuntimeException {
		log.trace("SPARQL query: " + queryString);
		return this.delegatedModel.sparqlSelect(queryString);
	}
	
	@Override
	public void unlock() {
		this.delegatedModel.unlock();
	}
	
	@Override
	public synchronized void update(DiffReader diff) throws ModelRuntimeException {
		this.delegatedModel.update(diff);
	}
	
	@Override
	public void writeTo(OutputStream out) throws IOException, ModelRuntimeException {
		this.delegatedModel.writeTo(out);
	}
	
	@Override
	public void writeTo(OutputStream out, Syntax syntax) throws IOException, ModelRuntimeException {
		this.delegatedModel.writeTo(out, syntax);
	}
	
	@Override
	public void writeTo(Writer w) throws IOException, ModelRuntimeException {
		this.delegatedModel.writeTo(w);
	}
	
	@Override
	public void writeTo(Writer writer, Syntax syntax) throws ModelRuntimeException, IOException {
		this.delegatedModel.writeTo(writer, syntax);
	}
	
	@Override
	public void readFrom(Reader in, Syntax syntax, String baseURI) throws IOException,
	        ModelRuntimeException {
		this.delegatedModel.readFrom(in, syntax, baseURI);
	}
	
	@Override
	public void readFrom(InputStream reader, Syntax syntax, String baseURI) throws IOException,
	        ModelRuntimeException {
		this.delegatedModel.readFrom(reader, syntax, baseURI);
	}
	
	@Override
	public String getNamespace(String prefix) {
		return this.delegatedModel.getNamespace(prefix);
	}
	
	@Override
	public Map<String,String> getNamespaces() {
		return this.delegatedModel.getNamespaces();
	}
	
	@Override
	public void removeNamespace(String prefix) {
		this.delegatedModel.removeNamespace(prefix);
	}
	
	@Override
	public void setNamespace(String prefix, String namespaceURI) throws IllegalArgumentException {
		this.delegatedModel.setNamespace(prefix, namespaceURI);
	}
	
	@Override
	public void addModel(Model model) throws ModelRuntimeException {
		this.delegatedModel.addModel(model);
	}
	
}
