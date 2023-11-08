# monitor-test

Testing monitoring

See example
at https://levelup.gitconnected.com/spring-boot-distributed-tracing-using-open-telemetry-and-jaeger-8d16c81a6ca8

# Startup Jaeger

See https://www.jaegertracing.io/docs/1.47/getting-started/

# Look at jaeger

open http://localhost:16686/search

# Url's

| service           | use                         | url                            |
|-------------------|-----------------------------|--------------------------------|
| customer service  | make client request         | http://localhost:8085          |
| customer service  | actuator                    | http://localhost:8086/actuator |
| inform service    | inform client about request | http://localhost:8087/inform   |
| inform service    | actuator                    | http://localhost:8088/actuator |
| insurance service | request clains/policies     | http://localhost:8090          |
| insurance service | actuator                    | http://localhost:8091          |
| jaeger            | search traces               | http://localhost:16686/search  |