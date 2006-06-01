package org.apache.maven.plugin.idea.stubs;

/*
 *
 *  Copyright 2005-2006 The Apache Software Foundation.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

import org.apache.maven.artifact.Artifact;
import org.apache.maven.model.Dependency;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/**
 * @author Edwin Punzalan
 */
public class MavenProjectWithArtifactVersionRangeStub
    extends SimpleMavenProjectStub
{
    List testArtifacts;

    public List getDependencies()
    {
        Dependency dep = new Dependency();
        dep.setGroupId( "junit" );
        dep.setArtifactId( "junit" );
        dep.setVersion( "[3.8,)" );
        dep.setScope( Artifact.SCOPE_TEST );

        return Collections.singletonList( dep );
    }

    public List getTestArtifacts()
    {
        if ( testArtifacts == null )
        {
            testArtifacts = new ArrayList();

            testArtifacts.add( createArtifact( "junit", "junit", "4.0" ) );
        }

        return testArtifacts;
    }
}
