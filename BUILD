load("@rules_java//java:defs.bzl", "java_binary")
load("@rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library")

package(default_visibility = ["//visibility:public"])

kt_jvm_library(
    name = "greeterkotlin",
    srcs = ["src/main/java/com/example/GreetingKotlin.kt"],
    visibility = ["//src/main/java/com/example/cmdline:__pkg__", "//src/main/java/com/example/cmdline/tests:__pkg__"],
)

java_binary(
    name = "ProjectRunner",
    srcs = glob(["src/main/java/com/example/ProjectRunner.java"]),
    main_class = "com.example.ProjectRunner",
    deps = [":greeter"],
)

java_library(
    name = "greeter",
    srcs = ["src/main/java/com/example/Greeting.java"],
    visibility = ["//src/main/java/com/example/cmdline:__pkg__", "//src/main/java/com/example/cmdline/tests:__pkg__"],
)
