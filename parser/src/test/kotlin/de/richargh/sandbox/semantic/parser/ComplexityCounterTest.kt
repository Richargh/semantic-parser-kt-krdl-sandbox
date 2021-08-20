package de.richargh.sandbox.semantic.parser

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class ComplexityCounterTest {

    @ParameterizedTest
    @ValueSource(strings = [
    " (Method ",
    " (Function ",

    " (If ",
    " (Pattern ", // switch case for example (default case is also a pattern unfortunately)

    " (While ",
    " (DoWhile ",
    " (For", // for(int i = 0; ...)
    " (ForEach ", // for(int i : numbers)

    " (Catch "
    ])
    fun `these symbols should increment complexity because they create a branch in the control flow`(line: String){
        // given
        val counter = ComplexityCounter()
        // when
        counter.inspect(line)
        // then
        assertThat(counter.complexity).isEqualTo(1)
    }

    @ParameterizedTest
    @ValueSource(strings = [
    "(VariableDeclaration",
    "(Try",
    "(Match",

    "(Import)",
    "(DefaultExport"])
    fun `these symbols should not increment complexity because they create no branch in the control flow`(line: String){
        // given
        val counter = ComplexityCounter()
        // when
        counter.inspect(line)
        // then
        assertThat(counter.complexity).isEqualTo(0)
    }
}