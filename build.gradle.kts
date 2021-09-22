plugins {
    id(Plugins.MAVEN_PUBLISH)
    id(Plugins.DOKKA) version (Versions.DOKKA)
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(Dependencies.ANDROID_GRADLE_BUILD_TOOLS)
        classpath(Dependencies.Kotlin.KOTLIN_GRADLE_PLUGIN)
        classpath(Dependencies.KTLINT)
    }
}

allprojects {
    group = Configuration.GROUP
    version = Configuration.VERSION_NAME

    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}