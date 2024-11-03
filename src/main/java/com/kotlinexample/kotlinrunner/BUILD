java_library(
    name = "kotlinexample",
    srcs = glob(["*.java"]),
)

java_binary(
    name = "RunnerKotlin",
    srcs = ["RunnerKotlin.java"],
    main_class = "com.kotlinexample.kotlinrunner.RunnerKotlin",
    deps = ["//src/main/java/com/kotlinexample:greeterkotlin"],
)