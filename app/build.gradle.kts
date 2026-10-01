plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("androidx.room")
}

android {
    namespace = "com.samsung.notes.clone"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.samsung.notes.clone"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.8"
    }
}

dependencies {
    implementation(platform("androidx.compose:compose-bom:2024.02.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.activity:activity-compose:1.8.2")

    implementation("androidx.room:room-runtime:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")
    annotationProcessor("androidx.room:room-compiler:2.6.1")

    implementation("androidx.work:work-runtime-ktx:2.9.0")
    implementation("com.tom-roush:pdfbox-android:2.0.27.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0")
}
