## Zipkin Setup With Load Time Weaving of AspectJ

### Steps:

Main purpose of this example is to use Zipkin with AspectJ LTW to analyze time taken by each method execution.
Spring AOP has limitations such as not capturing inner methods and non-public methods. Hence LTW of AspectJ is used with
a separate java agent.

1. Run the docker-compose file to start the Zipkin server.
2. Use both below agents when starting the application
3. Search traces on Zipkin based on the tags sent in the header. For now only can_id is set as a tag.

`-javaagent:/Users/kusalkankanamge/.m2/repository/org/springframework/spring-instrument/6.2.6/spring-instrument-6.2.6.jar`

`-javaagent:/Users/kusalkankanamge/.m2/repository/org/aspectj/aspectjweaver/1.9.24/aspectjweaver-1.9.24.jar`

Note: Zipkin is not the best tool to capture method execution time as it is a distributed tracing tool. For profiling, a dedicated
profiler such as YourKit should be used.

