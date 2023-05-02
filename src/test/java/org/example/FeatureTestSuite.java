package org.example;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CalculatorTest.class,
        MyCalculatorTest.class
})

public class FeatureTestSuite{
      // the class remains empty,
     // used only as a holder for the above annotations
}
