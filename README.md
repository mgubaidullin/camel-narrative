# Narrative API for Apache Camel

This project demonstrates narrative API examples for Apache Camel.

Simple single route (Flash Fiction):

```java
Camel.go(route ->
        route.from("file:input")
             .to("file:output"));
```

Route with bean binding (Short Story):

```java
Camel.load("bale", new Bale())
      .go(route ->
          route.from("timer:start")
               .to("bean:bale"));
```

Multiple routes (Novellette):

```java
Camel.go(route ->
        route.from("file:input")
                .to("file:output"),
        route ->
        route.from("file:output")
                .to("log:output"));
```
