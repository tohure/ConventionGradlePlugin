package org.thr.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class LibraryConventionPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        with(project) {

            //Plugins del proyecto
            pluginManager.applyPlugins()

            //Configuración del proyecto
            this.applyProjectConfig(libs)

            //Dependencias del proyecto
            dependencies.applyDependencies(libs)
        }
    }
}