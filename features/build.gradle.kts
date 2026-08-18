plugins {
    kotlin("jvm")
}

dependencies {
    api(project(":features:hello"))
    compileOnly(libs.paper.api)
}
