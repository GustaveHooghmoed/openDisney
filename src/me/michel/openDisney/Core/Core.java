package me.michel.openDisney.Core;

import me.michel.openDisney.Module.ModuleManager;
import me.michel.openDisney.mySQL.MySQLManager;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {

    public static Plugin plugin = null;
    public static World world = null;
    public static ModuleManager moduleMan = null;
    public static MySQLManager mySQLMan = null;

    public static Plugin getPlugin() {
        return plugin;
    }

    public static World getWorld() {
        return world;
    }

    public static ModuleManager getModuleMan() {
        return moduleMan;
    }

    public static MySQLManager getMySQLMan() {
        return mySQLMan;
    }

    @Override
    public void onEnable() {
        plugin = this;
        world = Bukkit.getWorld("world");
        mySQLMan = new MySQLManager();
        moduleMan = new ModuleManager();
    }

    @Override
    public void onDisable() {
        moduleMan.unloadModules();
        mySQLMan.closeDataSource();
        mySQLMan = null;
        moduleMan = null;
        world = null;
        plugin = null;
    }

}
