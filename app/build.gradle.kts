import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("io.gitlab.arturbosch.detekt")
}

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "xyz.pavelkorolevxyz.podlodka.games"

        minSdk = 21
        targetSdk = 31

        versionCode = 1
        versionName = "1.0"
    }

    signingConfigs {
        getByName("debug")
        create("release") {
            storeFile = rootDir.resolve("keystore.jks")
            storePassword = "podlodka"
            keyAlias = "podlodka-games-android"
            keyPassword = "podlodka"
        }
    }

    buildTypes {
        debug {
            applicationIdSuffix = ".debug"
            versionNameSuffix = "-debug"

            isShrinkResources = false
            isMinifyEnabled = false
        }
        release {
            isShrinkResources = true
            isMinifyEnabled = true

            signingConfig = signingConfigs.getByName("release")

            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }

    buildFeatures {
        buildConfig = false
        compose = true
    }

    lint {
        isCheckReleaseBuilds = false
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.androidx.compose.get()
    }
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.freeCompilerArgs += listOf(
        "-Xopt-in=androidx.compose.material3.ExperimentalMaterial3Api",
    )
}

detekt {
    ignoreFailures = false
    config = files("$rootDir/config/detekt.yml")
    buildUponDefaultConfig = true
}

dependencies {
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.material)
    implementation(libs.androidx.compose.uiToolingPreview)
    debugImplementation(libs.androidx.compose.uiTooling)
    implementation(libs.androidx.activity.compose)
    implementation(libs.accompanist.systemUiController)
    implementation(libs.accompanist.insets)
    implementation(libs.accompanist.flowLayout)

    detektPlugins(libs.detekt.formatting)
}
