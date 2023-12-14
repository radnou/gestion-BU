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

}

tasks.test {
    useJUnitPlatform()
}
