/*
 * Copyright 2004-2005 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.codehaus.groovy.grails.commons.test;

import groovy.lang.GroovyClassLoader;
import junit.framework.TestCase;

import org.codehaus.groovy.grails.commons.DefaultGrailsApplication;
import org.codehaus.groovy.grails.commons.GrailsApplication;
/**
 * Abstract simple test harness for testing Grails Applications that just loads
 * the parsed classes into the GrailsApplication instance
 *
 * @author Graeme Rocher
 *
 */
public abstract class AbstractGrailsMockTests extends TestCase {
    /**
     * A GroovyClassLoader instance
     */
    public GroovyClassLoader gcl = new GroovyClassLoader();
    /**
     * The GrailsApplication instance created during setup
     */
    public GrailsApplication ga;

    protected final void setUp() throws Exception {
        super.setUp();

        onSetUp();

        ga = new DefaultGrailsApplication(gcl.getLoadedClasses(),gcl);
    }
    

	protected void onSetUp() {
		
	}

}
