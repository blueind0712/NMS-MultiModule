package dev.blueind.project

import dev.blueind.features.Features
import io.papermc.paper.plugin.bootstrap.BootstrapContext
import io.papermc.paper.plugin.bootstrap.PluginBootstrap

class ProjectBootstrap : PluginBootstrap {

    override fun bootstrap(context: BootstrapContext) {
        Features.register(context)
    }
}