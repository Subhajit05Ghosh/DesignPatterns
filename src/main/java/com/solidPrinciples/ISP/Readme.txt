##Clients should not be forced to depend on interfaces they do not use.
This principle, known as the Interface Segregation Principle (ISP), suggests that larger interfaces should be split
into smaller, more specific ones. By doing so, clients will only need to know about the methods that are relevant to
them, reducing unnecessary dependencies and improving code maintainability. This leads to a more modular design where
changes in one part of the system have minimal impact on others.