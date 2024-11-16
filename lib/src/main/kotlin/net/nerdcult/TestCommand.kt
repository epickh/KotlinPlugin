package net.nerdcult.kotlinplugin;

import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.command.Command;
import org.bukkit.plugin.java.JavaPlugin

class TestCommand(plugin: JavaPlugin) : CommandExecutor {
    var plugin: JavaPlugin = plugin
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<String>): Boolean {
        sender.sendMessage("You invoked the /test command!");
        return true;
    }
}