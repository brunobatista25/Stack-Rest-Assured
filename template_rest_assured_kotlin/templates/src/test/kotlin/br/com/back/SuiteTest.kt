package br.com.back

import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses
import br.com.back.tests.CreateUserTests

@RunWith(Suite::class)
@SuiteClasses(CreateUserTests::class)
class SuiteTest 