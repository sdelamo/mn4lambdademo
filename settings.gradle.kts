pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://s01.oss.sonatype.org/content/repositories/snapshots/") {
            mavenContent { snapshotsOnly() }
        }
    }
}
rootProject.name="temp"

include("app")
include("infra")
