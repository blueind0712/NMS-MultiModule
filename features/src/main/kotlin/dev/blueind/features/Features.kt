package dev.blueind.features

import dev.blueind.hello.Hello
import io.papermc.paper.plugin.bootstrap.BootstrapContext

object Features {

    fun register(context: BootstrapContext) {
        Hello().register(context)
    }
}