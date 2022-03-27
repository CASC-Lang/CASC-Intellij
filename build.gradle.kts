plugins {
    id("org.jetbrains.intellij") version "1.4.0"
    kotlin("jvm") version "1.6.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

sourceSets["main"].java.srcDirs("src/main/gen")

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
    version.set("2021.3.2")
    plugins.add("PsiViewer:213-SNAPSHOT")
}
tasks {
    patchPluginXml {
        changeNotes.set("""
            Add change notes here.<br>
            <em>most HTML tags may be used</em>        """.trimIndent())
    }
}