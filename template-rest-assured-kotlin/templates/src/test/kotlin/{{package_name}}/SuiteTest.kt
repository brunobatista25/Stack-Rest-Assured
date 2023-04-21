package {{package_name}}

import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses
import {{package_name}}.tests.CreateUserTests

@RunWith(Suite::class)
@SuiteClasses(CreateUserTests::class)
class SuiteTest 