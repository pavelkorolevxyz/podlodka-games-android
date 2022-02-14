plugins {
    id("com.android.application") version "7.2.0-beta02" apply false
    id("com.android.library") version "7.2.0-beta02" apply false
    id("org.jetbrains.kotlin.android") version "1.5.31" apply false
    id("io.gitlab.arturbosch.detekt") version "1.19.0" apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
