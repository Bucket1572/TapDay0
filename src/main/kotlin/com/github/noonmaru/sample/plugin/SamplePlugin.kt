package com.github.noonmaru.sample.plugin

import org.bukkit.plugin.java.JavaPlugin

/**
 * @author Noonmaru
 */
class SamplePlugin : JavaPlugin() {
    override fun onEnable() {
        logger.warning("야~ 드디어 로딩~")
    }
}