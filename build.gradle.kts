version = "1.0.0"

plugins {
    kotlin("jvm") version libs.versions.kotlin.get() apply false
    alias(libs.plugins.paperweight.userdev) apply false
    alias(libs.plugins.shadow) apply false
    alias(libs.plugins.run.paper) apply false
    alias(libs.plugins.resource.factory.paper) apply false
    alias(libs.plugins.gremlin.gradle) apply false
}
