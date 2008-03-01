package org.carrot2.core.test;

import org.junit.runner.RunWith;
import org.junitext.runners.AnnotationRunner;

/**
 * A base class for tests whose results depend on the correct functioning of some external
 * APIs. Such tests may be ignored e.g. during post-commit builds and executed only during
 * daily builds.
 */
@RunWith(AnnotationRunner.class)
public class ExternalApiTestBase
{
    /**
     * Allows to skip running tests that can fail because of a failure of some external
     * system, e.g. search engine API.
     */
    public boolean externalApiTestsEnabled()
    {
        return !Boolean.valueOf(System.getProperty("external.api.tests.disabled"))
            .booleanValue();
    }
}
