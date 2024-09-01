plugins {
    kotlin("jvm") version "2.0.0"
}

group = "com.github.alexandernc0043"
version = "1.0"

repositories {
    mavenCentral()
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}