plugins {
    id(Plugins.ANDROID_LIBRARY)
    id(Plugins.DOKKA)
}

android {
    compileSdk = Configuration.COMPILE_SDK_VERSION
    buildToolsVersion = Configuration.BUILD_TOOLS_VERSION

    defaultConfig {
        minSdk = Configuration.MIN_SDK_VERSION
        targetSdk = Configuration.TARGET_SDK_VERSION
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(project(Modules.RESOURCY))

    // Jetpack Compose
    implementation(Dependencies.AndroidX.Compose.COMPOSE_UI)
    implementation(Dependencies.AndroidX.Compose.COMPOSE_RUNTIME)
}