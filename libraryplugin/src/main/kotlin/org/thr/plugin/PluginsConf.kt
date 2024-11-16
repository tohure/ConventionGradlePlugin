package org.thr.plugin

import org.gradle.api.plugins.PluginManager

internal fun PluginManager.applyPlugins() {
    apply("android-library")
    apply("kotlin-android")
}