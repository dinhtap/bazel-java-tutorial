load("@rules_java//java:defs.bzl", "java_binary")
load("@rules_jvm_external//:defs.bzl", "artifact")

java_library(
    name = "cmdline",
    srcs = glob(["*.java"]),
    deps = ["//src/main/java/com/example:greeter",
            artifact("commons-cli:commons.cli"),
    ],
    visibility = ["//src/test/java/com/example/cmdline:__pkg__"],
)


java_binary(
    name = "runner",
    srcs = ["Runner.java"],
    main_class = "src.main.java.com.example.cmdline.Runner",
    deps = [
        "//src/main/java/com/example:greeter",
        artifact("commons-cli:commons.cli"),
    ],
)

