package {{packame_name}}

import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses
import {{packame_name}}.tests.CreateUserTests

@RunWith(Suite::class)
@SuiteClasses(CreateUserTests::class)
class SuiteTest 