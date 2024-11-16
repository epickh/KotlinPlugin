
package net.nerdcult.kotlinplugin

import org.bukkit.plugin.java.JavaPlugin
import net.nerdcult.kotlinplugin.TestCommand

class KotlinPlugin : JavaPlugin {
    var testCommand: TestCommand
    constructor() {
        testCommand = TestCommand(this)
    }
    override fun onEnable() {
        var testCommandReference = this.getCommand("test")
        if(testCommandReference != null) {
            testCommandReference.setExecutor(this.testCommand)
        } else {
            print("Failed setting the executor of the command: 'test'!")
        }
    }
    override fun onDisable() {

    }
}
