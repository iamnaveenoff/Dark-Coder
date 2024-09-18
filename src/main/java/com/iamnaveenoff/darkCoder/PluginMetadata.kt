package com.iamnaveenoff.darkCoder

import com.intellij.ide.plugins.PluginManagerCore
import com.intellij.openapi.extensions.PluginId

object PluginMetadata {
    private const val PLUGIN_ID = "com.ahmed3elshaer.true-black"
    fun currentVersion(): String? {
        return PluginManagerCore.getPlugin(PluginId.getId(PLUGIN_ID))?.version
    }
}
