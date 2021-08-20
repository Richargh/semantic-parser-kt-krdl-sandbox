group = "de.richargh.sandbox.semantic.parser"
version = "0.1-SNAPSHOT"

val junit5_version: String by project
val assertj_version: String by project

plugins {
    kotlin("jvm") version "1.5.21"

    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("reflect"))

    testImplementation("org.junit.jupiter:junit-jupiter-api:$junit5_version")
    testImplementation("org.junit.jupiter:junit-jupiter-params:$junit5_version")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:$junit5_version")
    testImplementation("org.assertj:assertj-core:$assertj_version")
}

// more settings online: https://docs.gradle.org/current/userguide/java_testing.html
tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}

application {
    mainClass.set("de.richargh.sandbox.semantic.parser.MainKt")
}
