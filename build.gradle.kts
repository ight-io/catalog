plugins {
    alias(libs.plugins.vanniktech.maven.publish)
    `version-catalog`
}


catalog {
    versionCatalog {
        from(files("${rootDir}/gradle/libs.versions.toml"))
    }
}
