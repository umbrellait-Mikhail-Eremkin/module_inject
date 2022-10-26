plugins {
    id("java-library")
    id("maven-publish")
}

group = "com.umbrellait.android.vanilla"
version = "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

publishing {
    repositories {
        mavenLocal()
    }
}