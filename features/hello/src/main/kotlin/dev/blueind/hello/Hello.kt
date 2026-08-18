package dev.blueind.hello

import com.mojang.brigadier.Command
import com.mojang.brigadier.tree.LiteralCommandNode
import io.papermc.paper.command.brigadier.CommandSourceStack
import io.papermc.paper.command.brigadier.Commands
import io.papermc.paper.plugin.bootstrap.BootstrapContext
import io.papermc.paper.plugin.lifecycle.event.types.LifecycleEvents
import net.kyori.adventure.text.Component

class Hello {
    fun create(): LiteralCommandNode<CommandSourceStack> {
        return Commands.literal("인사")
            .executes { ctx ->
                ctx.source.sender.sendMessage(Component.text("안녕!"))
                Command.SINGLE_SUCCESS
            }
            .build()
    }

    fun register(context: BootstrapContext) {
        context.lifecycleManager.registerEventHandler(LifecycleEvents.COMMANDS) { event ->
            event.registrar().register(
                this.create(),
                "인사하면 안녕! 이라고 인사해줍니다."
            )
        }
    }


}