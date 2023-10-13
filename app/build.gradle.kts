plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.cristianjb"
    compileSdk = 33

    buildFeatures{
        viewBinding = true
    }
    dataBinding{
        enable = true
    }

    defaultConfig {
        applicationId = "com.example.cristianjb"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.android.gms:play-services-maps:18.1.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation(platform("com.google.firebase:firebase-bom:32.3.1"))
    implementation("com.google.firebase:firebase-auth-ktx")
    implementation("com.google.firebase:firebase-auth:22.1.2")
    implementation("com.google.firebase:firebase-database:20.2.2")
    implementation("com.google.firebase:firebase-firestore:24.8.1")
    implementation("com.google.android.gms:play-services-auth:20.7.0")

    implementation("com.facebook.android:facebook-login:latest.release")
    implementation("com.facebook.android:facebook-android-sdk:9.1.1")
    implementation("com.facebook.android:facebook-android-sdk:[8,9)")
    implementation("com.facebook.android:facebook-android-sdk:[4,5)")

    implementation("androidx.drawerlayout:drawerlayout:1.2.0")
    implementation("androidx.coordinatorlayout:coordinatorlayout:1.2.0")

    //seekbar circle, doc oficial https://github.com/tankery/CircularSeekBar
    implementation("me.tankery.lib:circularSeekBar:1.3.2")

    implementation("com.google.android.gms:play-services-location:17.0.0")

    //camara
    implementation ("androidx.camera:camera-view:1.0.0-alpha23")
    implementation("androidx.camera:camera-core:1.0.1")
    implementation("androidx.camera:camera-camera2:1.0.1")
    // If you want to additionally use the CameraX Lifecycle library
    implementation("androidx.camera:camera-lifecycle:1.0.1")
    // If you want to additionally use the CameraX View class
    implementation("androidx.camera:camera-view:1.0.0-alpha27")
    // If you want to additionally use the CameraX Extensions library
    implementation("androidx.camera:camera-extensions:1.0.0-alpha27")


    implementation ("com.github.bumptech.glide:glide:4.12.0")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.12.0")
    //storage firestore

    implementation ("com.google.firebase:firebase-firestore-ktx:23.0.3")
    implementation ("com.google.firebase:firebase-firestore:21.4.0")
    implementation ("com.google.firebase:firebase-storage-ktx:20.0.0")
    implementation ("com.google.firebase:firebase-database-ktx:20.0.2")
}