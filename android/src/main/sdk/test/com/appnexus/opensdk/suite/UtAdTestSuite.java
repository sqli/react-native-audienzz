package com.appnexus.opensdk.suite;


import com.appnexus.opensdk.ResultCodeTest;
import com.appnexus.opensdk.TestANClickThroughAction;
import com.appnexus.opensdk.UTAdResponseTest;
import com.appnexus.opensdk.VideoImplementationTest;
import com.appnexus.opensdk.WebviewUtilTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        VideoImplementationTest.class,
        ResultCodeTest.class,
        WebviewUtilTest.class,
        UTAdResponseTest.class,
        TestANClickThroughAction.class,
})
public class UtAdTestSuite {
}
