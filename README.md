##AlvmCyber

This is a composite service used as a running example for the following paper.

Publication:
```
@Article{EndoSimao17STVR,
    author = "Andre Takeshi Endo and Adenilso Simao",
    title = "Event tree algorithms to generate test sequences for composite web services",
    Journal = "Software Testing, Verification and Reliability (STVR)",
    year = "2017", 
} 
```

##Installation

Execution:
- Class "br.usp.icmc.labes.alvmcyber.Main" starts all servers.

Dependencies:
- JUnit 4
- Apache CXF 2.2.5 (tested - include all jar files in /lib)

Folders:
- src: services classes.
- test: test classes.
- clients: stub classes generated to access the services. 
           I created a different folder to avoid mixing up the classes.
