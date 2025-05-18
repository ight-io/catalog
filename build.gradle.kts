import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

plugins {
    alias(libs.plugins.vanniktech.maven.publish)
    `version-catalog`
}


catalog {
    versionCatalog {
        from(files("${rootDir}/gradle/libs.versions.toml"))
    }
}


tasks.clean {
    delete("${rootDir}/README.md")
}

val updateReadme by tasks.registering(Copy::class) {

    dependsOn(tasks.clean)

    val toml = projectDir.resolve("gradle/libs.versions.toml")
    val readme = projectDir.resolve("template/README.md.template")
    inputs.files(toml , readme)

    from(readme)
    into(layout.projectDirectory)

    expand(
        "tomlContent" to toml.readText() ,
        "timestamp" to LocalDateTime.now()
            .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) ,
    )

    rename { "README.md" }
}


tasks.build { dependsOn(updateReadme) }
