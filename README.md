# java-profiler-example

Code example for Async Java Profiler or JFR.

* Use the following IntelliJ Profiler (Settings/Preferences | Build, Execution, Deployment | Java Profiler Java Profiler):
```
event=cpu,alloc,interval=10us,jfrsync=profile
```

Links:

https://www.jetbrains.com/help/idea/async-profiler.html

https://github.com/jvm-profiling-tools/async-profiler

* You could also create a heap dump and open it with help of Intellij Idea or Visual VM.

```
jcmd 1 GC.heap_dump ./dump.hprof
```

Where 1 is the PID of a java process. You could use jps utility or Intellij Idea Profiler Tab to get it. 

You could run a visualvm with help of the following command:

```
./visualvm --jdkhome $PATH_TO_JAVA
```

Links:

https://visualvm.github.io/index.html

https://www.jetbrains.com/help/idea/analyze-hprof-memory-snapshots.html
