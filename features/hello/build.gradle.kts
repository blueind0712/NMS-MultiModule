plugins {
    kotlin("jvm")
}

dependencies {
    compileOnly(libs.paper.api)
    implementation(project(":core"))
}
