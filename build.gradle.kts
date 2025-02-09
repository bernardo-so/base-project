plugins {
    kotlin("jvm") version "2.1.0"
}

allprojects {
    group = "com.baseproject"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "kotlin")

    dependencies {
        implementation(kotlin("stdlib"))
        testImplementation(kotlin("test"))
    }
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}