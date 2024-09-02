import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
plugins {
    kotlin("jvm") version "2.0.0"
    application
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

repositories {
    mavenCentral()
}

group = "com.github.alexandernc0043"
version = "1.0"

application {
    mainClass.set("MainKt")
}

tasks.withType<ShadowJar> {
    include("resources/words.txt")
    archiveFileName.set("HangMan.jar")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}