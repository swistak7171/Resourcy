plugins {
    id(Plugins.ANDROID_APPLICATION)
    id(Plugins.KOTLIN_ANDROID)
    id(Plugins.DOKKA)
}

android {
    compileSdk = Configuration.COMPILE_SDK_VERSION
    buildToolsVersion = Configuration.BUILD_TOOLS_VERSION

    defaultConfig {
        applicationId = Configuration.APPLICATION_ID
        minSdk = Configuration.MIN_SDK_VERSION
        targetSdk = Configuration.TARGET_SDK_VERSION
        versionCode = Configuration.VERSION_CODE
        versionName = Configuration.VERSION_NAME
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("debug")
        }

        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    testOptions {
        tasks.withType<Test>().configureEach {
            useJUnitPlatform()
        }
    }
}

repositories {
    google()
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    // AndroidX AppCompat
    implementation(Dependencies.AndroidX.AppCompat.APP_COMPAT_RESOURCES)

    // AndroidX Core
    implementation(Dependencies.AndroidX.Core.CORE_KTX)

    // AndroidX ConstraintLayout
    implementation(Dependencies.AndroidX.ConstraintLayout.CONSTRAINT_LAYOUT)

    // Material Components
    implementation(Dependencies.Google.Material.MATERIAL_COMPONENTS)
}