plugins {
    kotlin("jvm")
    alias(libs.plugins.shadow)
    alias(libs.plugins.run.paper)
    alias(libs.plugins.resource.factory.paper)
    alias(libs.plugins.gremlin.gradle)
}

configurations.compileOnly {
    extendsFrom(configurations.runtimeDownload.get())
}

dependencies {
    compileOnly(libs.paper.api)

    implementation(project(":core"))
    implementation(project(":features"))

    runtimeDownload(libs.kotlin.stdlib)
}

paperPluginYaml {
    main = "dev.blueind.project.Project"
    bootstrapper = "dev.blueind.project.ProjectBootstrap"
    loader = "xyz.jpenilla.gremlin.runtime.platformsupport.DefaultsPaperPluginLoader"
    apiVersion = libs.versions.minecraft.get()
}

tasks {
    build {
        dependsOn(shadowJar)
    }

    runServer {
        minecraftVersion(libs.versions.minecraft.get())
        jvmArgs("-Xms2G", "-Xmx2G", "-Dcom.mojang.eula.agree=true")
    }
}
