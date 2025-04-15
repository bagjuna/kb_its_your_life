plugins {
    id("java")
    kotlin("jvm") version "1.9.0"  // ← 이거 꼭 있어야 함
    java
}

group = "hello.world.tutorial"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}