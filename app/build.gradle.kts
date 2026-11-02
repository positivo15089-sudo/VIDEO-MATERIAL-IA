plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "br.com.videomaterialia.app"
    compileSdk = 34

    defaultConfig {
        applicationId = "br.com.videomaterialia.app"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0.0-LOCAL"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("debug")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.webkit:webkit:1.10.0")
    // FFmpegKit Android para renderização local H.264/MP4 e mixagem de áudio sem nuvem
    implementation("com.arthenica:ffmpeg-kit-full-gpl:6.0-2")
    // ONNX Runtime Mobile (NNAPI / XNNPACK / Vulkan) para modelos locais INT4/FP16 no Android
    implementation("com.microsoft.onnxruntime:onnxruntime-android:1.17.1")
}
