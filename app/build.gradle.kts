plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.mayinternship26"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.mayinternship26"
        minSdk = 27
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.activity.ktx)
    implementation(libs.appcompat)
    implementation(libs.constraintlayout)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(libs.ext.junit)


    implementation("com.github.bumptech.glide:glide:5.0.5")
    implementation("com.intuit.sdp:sdp-android:1.1.1")

    implementation("com.razorpay:checkout:1.6.41")
}