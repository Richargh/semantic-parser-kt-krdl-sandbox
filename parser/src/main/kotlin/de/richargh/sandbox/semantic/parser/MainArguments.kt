package de.richargh.sandbox.semantic.parser

import java.io.File

class MainArguments(private val args: Array<String>) {

    fun astFile(): File {
        checkArguments()
        var astFile = File(args[0])
        checkExists(astFile)
        return astFile
    }

    private fun checkArguments() {
        if (args.size != 1) {
            println("Please pass the AST file to parse as first and only argument")
            System.exit(1)
        }
    }

    private fun checkExists(file: File) {
        if (!file.exists()) {
            println("File ${file.path} does not exist. \n" +
                    "  If you passed in a relative path, make sure it's relative to this java program. The complete path is: \n" +
                    "  ${file.absolutePath}.")
            System.exit(1)
        }
    }

}