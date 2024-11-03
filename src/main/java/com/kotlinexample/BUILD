load("@rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library")

kt_jvm_library(
    name = "kotlinexample",
    srcs = glob(["*.kt"]),
)

kt_jvm_library(
    name = "greeterkotlin",
    srcs = ["GreetingKotlin.kt"],
    visibility = ["//src/main/java/com/kotlinexample/kotlinrunner:__pkg__"],
)