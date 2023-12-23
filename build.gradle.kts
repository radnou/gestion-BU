plugins {
    id("java")
}

group = "rmoss.gestionBibliotheque"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.hamcrest:hamcrest:2.2") // Hamcrest pour les matchers

    // SLF4J API
    implementation("org.slf4j:slf4j-api:1.7.30")

    // Logback Classic Implementation
    implementation("ch.qos.logback:logback-classic:1.2.3")

}

tasks.test {
    useJUnitPlatform()
}
