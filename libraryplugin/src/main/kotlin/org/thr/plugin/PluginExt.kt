package org.thr.plugin

import com.android.build.gradle.LibraryExtension
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.getByType

//Extension function para reconocer android() config en proyecto gradle
fun Project.android() = extensions.getByType<LibraryExtension>()

//Extension function para traer el versión catalog del proyecto
val Project.libs: VersionCatalog
    get() = extensions.getByType<VersionCatalogsExtension>().named("libs")