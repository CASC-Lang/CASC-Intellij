plugins {
    id("org.jetbrains.intellij") version "1.4.0"
    kotlin("jvm") version "1.6.10"
}

group = "org.casc.lang"
version = "0.1.0.0"

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
            <h1>0.1.0 Release</h1>
                <ul>
                <li> Support 0.1.0 keyword highlighting
                </ul>
        """.trimIndent())
    }
}