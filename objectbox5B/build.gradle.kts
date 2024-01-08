plugins {
    id("java")
}

group = "mx.edu.utez"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.objectbox:objectbox-java:3.7.1")
    annotationProcessor("io.objectbox:objectbox-processor:3.7.1")
    implementation("io.objectbox:objectbox-windows:3.7.1")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}