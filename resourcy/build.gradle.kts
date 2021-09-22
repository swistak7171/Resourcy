plugins {
    id(Plugins.ANDROID_LIBRARY)
    id(Plugins.KOTLIN_ANDROID)
    id(Plugins.DOKKA)
}

android {
    compileSdk = Configuration.COMPILE_SDK_VERSION
    buildToolsVersion = Configuration.BUILD_TOOLS_VERSION

    defaultConfig {
        minSdk = Configuration.MIN_SDK_VERSION
        targetSdk = Configuration.TARGET_SDK_VERSION
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    // AndroidX AppCompat
    implementation(Dependencies.AndroidX.AppCompat.APP_COMPAT_RESOURCES)

    // AndroidX Annotations
    implementation(Dependencies.AndroidX.Annotation.ANNOTATION)

    // AndroidX Fragment
    implementation(Dependencies.AndroidX.Fragment.FRAGMENT_KTX)
}