plugins {
    application
    kotlin("jvm")
}

application {
    mainClass.set("toolbox.AppKt")
}

dependencies {
    implementation(project(":core"))

    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    api(KotlinX.coroutines.core)

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
    testImplementation("com.google.truth:truth:_")
}
