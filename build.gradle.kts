plugins {
    id("java")
    id("application")
}
/*
application {
    mainClass.set("org.example.Main")
}


 */


group = "org.example"
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
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(19))
    }
}


