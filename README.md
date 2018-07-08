#Circuit breaker using Spring Netflix Hystrix

This application demonstrate the circuit breaker concept using spring netflix hystrix lib.
It's spring boot project.
Here I demonstrate hystrix fallback method.


##Implementation steps
1. To register/enable hystrix circuit breaker add @EnableCircuitBreaker on Application class.
2. Add @HystrixCommand(fallbackMethod = "getStatusFallback") annotation on method.
3. Create fallbackmethod

##How to Test
This application has one rest endpoint with path param.
/status/{value}
to execute hystrix fallback method pass INACTIVE as a path param.



