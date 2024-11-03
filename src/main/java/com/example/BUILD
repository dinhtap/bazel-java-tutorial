java_library(
    name = "example",
    srcs = glob(["*.java"]),
)

java_binary(
    name = "ProjectRunner",
    srcs = ["ProjectRunner.java"],
    main_class = "src.main.java.com.example.ProjectRunner",
    deps = [":greeter"],
)

java_library(
    name = "greeter",
    srcs = ["Greeting.java"],
    visibility = ["//src/main/java/com/example/cmdline:__pkg__",
                    "//src/test/java/com/example/cmdline:__pkg__"
                    ],

)