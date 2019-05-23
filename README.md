## AlvmCyber

This is a composite service used as a running example for the following paper.

Publication:
```
@Article{EndoSimao19STVR,
	author = {Endo, Andre Takeshi and Simao, Adenilso},
	title = {Event tree algorithms to generate test sequences for composite Web services},
	journal = {Software Testing, Verification and Reliability},
	volume = {29},
	number = {3},
	pages = {e1637},
	keywords = {event sequence graphs, model-based testing, service composition, service-oriented architecture, test case generation, web services},
	doi = {10.1002/stvr.1637},
	url = {https://onlinelibrary.wiley.com/doi/abs/10.1002/stvr.1637},
	eprint = {https://onlinelibrary.wiley.com/doi/pdf/10.1002/stvr.1637},
	note = {e1637 stvr.1637},
	year = {2019}
} 
```

## Installation

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
