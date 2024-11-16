import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
    `maven-publish`
}

publishing {
    repositories {
        maven {
            url = uri("$buildDir/repo-plugin")
        }
    }
}

group = "com.thr"

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = JavaVersion.VERSION_17.toString()
}

dependencies {
    compileOnly(libs.android.tools.build.gradle.plugin)
    compileOnly(libs.kotlin.gradle.plugin)
}

gradlePlugin {
    val libraryPlugin by plugins.creating {
        id = "com.thr.libraryPlugin"
        implementationClass = "org.thr.plugin.LibraryConventionPlugin"
        version = "1.0.1-SNAPSHOT"
        description = "Custom Plugin for Android Libraries"
        displayName = "Tohure Plugin"
    }
}