___ 
<p align="right">
  <a href="https://github.com/ight-io/catalog/actions/workflows/publish.yml">
    <img src="https://github.com/ight-io/catalog/actions/workflows/publish.yml/badge.svg" alt="Release CI">
  </a>
  <a href="https://github.com/ight-io/catalog/releases">
    <img src="https://img.shields.io/github/v/release/ight-io/catalog?logo=github&style=flat" alt="GitHub release (latest by date)">
  </a>
  <a href="https://opensource.org/licenses/MIT">
    <img src="https://img.shields.io/badge/License-MIT-yellow.svg" alt="GitHub license: MIT">
  </a>
</p>

___

# Version catalog

all ight.io jvm projects should rely on this artesano if something is out of date please create an issue or a pull request.

## catalog shared

```toml
[versions]
kotlin = "2.0.21"

agp = "8.7.3"
android-compileSdk = "35"
android-minSdk = "24"
android-targetSdk = "35"
androidx-activityCompose = "1.9.3"
androidx-appcompat = "1.7.0"
androidx-constraintlayout = "2.2.0"
androidx-core-ktx = "1.15.0"
androidx-espresso-core = "3.6.1"
androidx-material = "1.12.0"
androidx-test-junit = "1.2.1"
compose = "1.7.6"
compose-plugin = "1.7.3"
junit = "4.13.2"
ktor = "3.0.2"
logback = "1.5.12"
serialization = "1.7.3"
coroutines = "1.9.0"
kotlinx-rpc = "0.4.0"
kotlinx-datetime = "0.6.1"

material-kolor = "2.0.0"
ben-manes = "0.51.0"
vanniktech = "0.30.0"
clikt = "5.0.2"
mosaic = "0.14.0"

ight-annotation = "0.0.2"

[libraries]
# kotlin
kotlin-stdlib = { module = "org.jetbrains.kotlin:kotlin-stdlib", version.ref = "kotlin" }
kotlin-test = { module = "org.jetbrains.kotlin:kotlin-test", version.ref = "kotlin" }
kotlin-test-junit = { module = "org.jetbrains.kotlin:kotlin-test-junit", version.ref = "kotlin" }

# android
androidx-core-ktx = { group = "androidx.core", name = "core-ktx", version.ref = "androidx-core-ktx" }
androidx-test-junit = { group = "androidx.test.ext", name = "junit", version.ref = "androidx-test-junit" }
androidx-espresso-core = { group = "androidx.test.espresso", name = "espresso-core", version.ref = "androidx-espresso-core" }
androidx-appcompat = { group = "androidx.appcompat", name = "appcompat", version.ref = "androidx-appcompat" }
androidx-material = { group = "com.google.android.material", name = "material", version.ref = "androidx-material" }
androidx-constraintlayout = { group = "androidx.constraintlayout", name = "constraintlayout", version.ref = "androidx-constraintlayout" }
androidx-activity-compose = { module = "androidx.activity:activity-compose", version.ref = "androidx-activityCompose" }

# compose
compose-ui-tooling = { module = "androidx.compose.ui:ui-tooling", version.ref = "compose" }
compose-ui-tooling-preview = { module = "androidx.compose.ui:ui-tooling-preview", version.ref = "compose" }

# kotlinx
kotlinx-serialization-json = { module = "org.jetbrains.kotlinx:kotlinx-serialization-json", version.ref = "serialization" }
kotlinx-serialization-core = { module = "org.jetbrains.kotlinx:kotlinx-serialization-core", version.ref = "serialization" }
kotlinx-coroutines-core = { module = "org.jetbrains.kotlinx:kotlinx-coroutines-core", version.ref = "coroutines" }
kotlinx-datetime = { module = "org.jetbrains.kotlinx:kotlinx-datetime", version.ref = "kotlinx-datetime" }

# ktor
ktor-server-core = { module = "io.ktor:ktor-server-core-jvm", version.ref = "ktor" }
ktor-server-netty = { module = "io.ktor:ktor-server-netty-jvm", version.ref = "ktor" }
ktor-server-cors-jvm = { module = "io.ktor:ktor-server-cors-jvm", version.ref = "ktor" }
ktor-server-websockets-jvm = { module = "io.ktor:ktor-server-websockets-jvm", version.ref = "ktor" }
ktor-server-host-common-jvm = { module = "io.ktor:ktor-server-host-common-jvm", version.ref = "ktor" }
ktor-server-test-host = { module = "io.ktor:ktor-server-test-host", version.ref = "ktor" }
ktor-client-core = { module = "io.ktor:ktor-client-core", version.ref = "ktor" }
ktor-client-websockets = { module = "io.ktor:ktor-client-websockets", version.ref = "ktor" }
ktor-serialization-json = { module = "io.ktor:ktor-serialization-kotlinx-json", version.ref = "ktor" }
ktor-client-cio = { module = "io.ktor:ktor-client-cio", version.ref = "ktor" }
ktor-client-js = { module = "io.ktor:ktor-client-js", version.ref = "ktor" }

# kotlinx-rpc
kotlinx-rpc-core = { module = "org.jetbrains.kotlinx:kotlinx-rpc-core", version.ref = "kotlinx-rpc" }
kotlinx-rpc-krpc-client = { module = "org.jetbrains.kotlinx:kotlinx-rpc-krpc-client", version.ref = "kotlinx-rpc" }
kotlinx-rpc-krpc-server = { module = "org.jetbrains.kotlinx:kotlinx-rpc-krpc-server", version.ref = "kotlinx-rpc" }
kotlinx-rpc-krpc-ktor-client = { module = "org.jetbrains.kotlinx:kotlinx-rpc-krpc-ktor-client", version.ref = "kotlinx-rpc" }
kotlinx-rpc-krpc-ktor-server = { module = "org.jetbrains.kotlinx:kotlinx-rpc-krpc-ktor-server", version.ref = "kotlinx-rpc" }
kotlinx-rpc-krpc-serialization-json = { module = "org.jetbrains.kotlinx:kotlinx-rpc-krpc-serialization-json", version.ref = "kotlinx-rpc" }

# ight
ight-annotation = { module = "io.ight:annotation", version.ref = "ight-annotation" }
ight-annotation-wasm-js = { module = "io.ight:annotation-wasm-js", version.ref = "ight-annotation" }
ight-annotation-linuxx64 = { module = "io.ight:annotation-linuxx64", version.ref = "ight-annotation" }
ight-annotation-iosarm64 = { module = "io.ight:annotation-iosarm64", version.ref = "ight-annotation" }
ight-annotation-iossimulatorarm64 = { module = "io.ight:annotation-iossimulatorarm64", version.ref = "ight-annotation" }
ight-annotation-jvm = { module = "io.ight:annotation-jvm", version.ref = "ight-annotation" }
ight-annotation-android = { module = "io.ight:annotation-android", version.ref = "ight-annotation" }
ight-annotation-macosarm64 = { module = "io.ight:annotation-macosarm64", version.ref = "ight-annotation" }

# other
logback = { module = "ch.qos.logback:logback-classic", version.ref = "logback" }
material-kolor = { module = "com.materialkolor:material-kolor", version.ref = "material-kolor" }

# testing
junit = { group = "junit", name = "junit", version.ref = "junit" }

# cli
clikt = { module = "com.github.ajalt.clikt:clikt", version.ref = "clikt" }
clikt-markdown = { module = "com.github.ajalt.clikt:clikt-markdown", version.ref = "clikt" }
mosaic = { module = "com.jakewharton.mosaic:mosaic-runtime", version.ref = "mosaic" }

[plugins]
# android
androidApplication = { id = "com.android.application", version.ref = "agp" }
androidLibrary = { id = "com.android.library", version.ref = "agp" }

# compose
jetbrainsCompose = { id = "org.jetbrains.compose", version.ref = "compose-plugin" }
compose-compiler = { id = "org.jetbrains.kotlin.plugin.compose", version.ref = "kotlin" }

# kotlin
kotlinJvm = { id = "org.jetbrains.kotlin.jvm", version.ref = "kotlin" }
kotlinMultiplatform = { id = "org.jetbrains.kotlin.multiplatform", version.ref = "kotlin" }

# kotlinx
kotlinPluginSerialization = { id = "org.jetbrains.kotlin.plugin.serialization", version.ref = "kotlin" }
kotlinx-rpc = { id = "org.jetbrains.kotlinx.rpc.plugin", version.ref = "kotlinx-rpc" }

# ktor
ktor = { id = "io.ktor.plugin", version.ref = "ktor" }

# other
ben-manes-versions = { id = "com.github.ben-manes.versions", version.ref = "ben-manes" }
vanniktech-maven-publish = { id = "com.vanniktech.maven.publish", version.ref = "vanniktech" }




```