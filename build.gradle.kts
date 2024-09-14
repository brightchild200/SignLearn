// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}
//buildscript {
//    repositories {
//        google()
//        mavenCentral()
//        // Update the Chaquopy Maven repository URL
//        maven { url = uri("https://chaquo.com/maven") }
//    }
//    dependencies {
//        classpath("com.android.tools.build:gradle:7.0.0")
//        classpath("com.chaquopy:chaquopy-plugin:11.0.0")
//    }
//}
