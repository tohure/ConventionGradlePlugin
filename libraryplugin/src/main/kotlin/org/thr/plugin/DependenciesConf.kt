package org.thr.plugin

import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.dsl.DependencyHandler

internal fun DependencyHandler.applyDependencies(libs: VersionCatalog) {
    add("implementation", libs.findLibrary("kotlin-stdlib").get().get())
    add("testImplementation", libs.findLibrary("junit").get().get())
}