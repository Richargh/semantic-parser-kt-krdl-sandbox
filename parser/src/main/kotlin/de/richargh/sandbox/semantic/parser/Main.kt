package de.richargh.sandbox.semantic.parser

import java.io.File

fun main(args: Array<String>){
    println(args.joinToString())
    val arguments = MainArguments(args)
    val astFile = arguments.astFile()

    printMetrics(astFile)
}

private fun printMetrics(astFile: File){
    val complexityCounter = ComplexityCounter()
    astFile.bufferedReader().lines().forEach(complexityCounter::inspect)
    println("McCabe Complexity for AST is: ${complexityCounter.complexity}")
}