object Dependencies {
    object Kotlin {
        const val KOTLIN_GRADLE_PLUGIN: String = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}"
    }

    object Google {
        object Material {
            const val MATERIAL_COMPONENTS: String = "com.google.android.material:material:${Versions.MATERIAL_COMPONENTS}"
        }
    }

    object AndroidX {
        object Compose {
            const val COMPOSE_UI: String = "androidx.compose.ui:ui:${Versions.COMPOSE}"
            const val COMPOSE_RUNTIME: String = "androidx.compose.runtime:runtime:${Versions.COMPOSE}"
        }

        object AppCompat {
            const val APP_COMPAT: String = "androidx.appcompat:appcompat:${Versions.APP_COMPAT}"
            const val APP_COMPAT_RESOURCES: String = "androidx.appcompat:appcompat-resources:${Versions.APP_COMPAT}"
        }

        object Annotation {
            const val ANNOTATION: String = "androidx.annotation:annotation:${Versions.ANNOTATION}"
        }

        object Core {
            const val CORE_KTX: String = "androidx.core:core-ktx:${Versions.CORE}"
        }

        object Fragment {
            const val FRAGMENT_KTX: String = "androidx.fragment:fragment-ktx:${Versions.FRAGMENT}"
        }

        object ConstraintLayout {
            const val CONSTRAINT_LAYOUT: String = "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
        }
    }

    const val ANDROID_GRADLE_BUILD_TOOLS: String = "com.android.tools.build:gradle:${Versions.ANDROID_GRADLE_BUILD_TOOLS}"
    const val KTLINT: String = "com.pinterest:ktlint:${Versions.KTLINT}"
}