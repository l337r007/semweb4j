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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import junit.framework.TestCase;


/**
 * @author sauermann
 */
public class SyntaxTest extends TestCase {
	
	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		Syntax.resetFactoryDefaults();
	}
	
	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	/**
	 * Test method for
	 * {@link org.ontoware.rdf2go.model.Syntax#register(org.ontoware.rdf2go.model.Syntax)}
	 * .
	 */
	public void testRegister() {
    	int numSyntaxes = Syntax.collection().size();
        Syntax s = new Syntax("spargel", "application/spargel", ".spargel");
        Syntax.register(s);
        Syntax s1 = Syntax.forMimeType("application/spargel");
        assertEquals("Check if the newly registered sytax can be properly retrieved.", s, s1);
        assertEquals("After registering a new syntax, check the overall number again.", numSyntaxes + 1,  Syntax.collection().size());
	}
	
	/**
	 * Test method for
	 * {@link org.ontoware.rdf2go.model.Syntax#forName(java.lang.String)}.
	 */
	public void testForName() {
		Syntax s = Syntax.forName("rdfxml");
		assertNotNull(s);
		assertEquals("rdfxml", s.getName());
	}
	
	/**
	 * Test method for
	 * {@link org.ontoware.rdf2go.model.Syntax#forMimeType(java.lang.String)}.
	 */
	public void testForMimeType() {
		Syntax s = Syntax.forMimeType("text/turtle");
		assertNotNull(s);
		assertEquals("text/turtle", s.getMimeType());
		
		// Check if a syntax can be retrieved with an alternative (old) mime type:
		Syntax t = Syntax.forMimeType("application/x-turtle");
		assertNotNull(t);
		
		assertEquals(s, t);
	}

	/**
	 * Test method for
	 * {@link org.ontoware.rdf2go.model.Syntax#forFileName(String)}.
	 */
	public void testForFileName() {
		Syntax s = Syntax.forFileName("something.xml");
		assertNotNull(s);
		assertEquals(s, Syntax.RdfXml);

		Syntax t = Syntax.forFileName("something.rdf");
		assertNotNull(t);
		assertEquals(s, t);

	}
	
	/**
	 * Test method for
	 * {@link org.ontoware.rdf2go.model.Syntax#equals(Object)}.
	 */
	public void testEquals() {
		Syntax s = Syntax.forMimeType("text/turtle");
		assertNotNull(s);

		Syntax t = Syntax.forMimeType("text/turtle");
		assertNotNull(t);
				
		assertEquals(s, t);
		
		Syntax u = Syntax.forMimeType("application/n-quads");
		assertNotNull(u);
		
		assertFalse(s.equals(u));

	}
	
	/**
	 * Test method for
	 * {@link org.ontoware.rdf2go.model.Syntax#unregister(org.ontoware.rdf2go.model.Syntax)}
	 * .
	 */
	public void testUnregister() {
		Syntax.unregister(Syntax.Ntriples);
		Syntax s = Syntax.forName("ntriples");
		assertNull(s);
	}
	
	/**
	 * Test method for {@link org.ontoware.rdf2go.model.Syntax#list()}.
	 */
	public void testList() {
		Collection<Syntax> list = Syntax.collection();
		// check overall number
		assertEquals("Check for the expected number of syntaxes", 8, list.size());
        int numSyntaxes = list.size();
        ArrayList<Syntax> l = new ArrayList<Syntax>(list);
        // remove just a few
        l.remove(Syntax.RdfXml);
        l.remove(Syntax.Nquads);
        assertEquals("After removing a number of syntaxes, check the overall number again.", numSyntaxes - 2,  l.size());

	}
	
	public void testCreateList() {
		List<Syntax> SYNTAXES = new ArrayList<Syntax>();
		SYNTAXES.size();
	}
	
}
