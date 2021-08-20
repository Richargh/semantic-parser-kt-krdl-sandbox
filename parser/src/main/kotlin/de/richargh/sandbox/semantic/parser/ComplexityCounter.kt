package de.richargh.sandbox.semantic.parser

class ComplexityCounter {

    private val complexityIncreaser = setOf(
            "(Function",
            "(Method",

            "(If",
            "(Pattern",

            "(While",
            "(DoWhile",
            "(ForEach",
            "(For",

            "(Catch",
    )

    private var mcc = 0

    val complexity: Int
        get() = mcc

    fun inspect(astLine: String){
        if(complexityIncreaser.contains(astLine.trim()))
            mcc++
    }


}