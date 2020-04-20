# Narrative API for Apache Camel

This project demonstrates narrative API examples for Apache Camel.

Simple single route (Flash Fiction):

```java
Caravan.go(
    Camel.from("file:input").to("file:output"));
```

Route with bean binding (Short Story):

```java
Caravan.load("bale", new Bale())
    .go(Camel.from("timer:start").to("bean:bale"));
```

Multiple routes (Novellette):

```java
Caravan.go(
    Camel.from("file:input").to("file:output"),
    Camel.from("file:output").to("log:output"));
```
