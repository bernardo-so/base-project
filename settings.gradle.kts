plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "base-project"
include("domain")
include("application")
include("infrastructure")
include("entrypoint")
