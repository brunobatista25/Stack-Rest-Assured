package {{package_name}};

import {{package_name}}.tests.CreateUserTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CreateUserTests.class
})
public class SuiteTest {

}
