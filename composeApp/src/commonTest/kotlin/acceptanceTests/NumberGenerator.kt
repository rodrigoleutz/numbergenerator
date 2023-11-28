package acceptanceTests

import kotlin.test.Test

class NumberGenerator {

    private val generator: Generator = Generator()

    @Test
    fun checkGenerateInteger() {
        val number = generator.generateInteger()
    }
}