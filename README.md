# Object-oriented-Software-Development-with-Design-Patterns
Lab assigmenets completed in the course Object-oriented Software Development with Design Patterns course code TOUK18, mostly focused on use cases, domain and design model  diagrams with UML notation. Additionally lab projects in java.

## Lab 1 Use-case diagram 
### Description
This laboratory task was composed of creating use-cases of a flighting booking system. Identifying the primary actors and their goals as well as offstage and supporting actors. 

## Lab 2 Domain Model 
### Description
This assingment consisted of creating a domain model. A domain model is the first sketch that foucuses on WHAT, what requirements are there what do we want to fulfill. The domain model only consist of attributes and associations and isused in the OO Analaysis. From the domain model we build upon this and creating the design model. Desing model is commonly used in the OO design phase. The design model focuses on HOW, and includes more techincal details and we use the Gang of four and GRASP pattern to guide us.

## Lab 3 Caesar Cipher Encryption, an MVC design Pattern
### Description 
This lab assignement was to create a ceasar ciphear encryption engine in the language java. The Caesar Cipher, one of the earliest forms of encryption, employs a simple yet effective method of securing messages. It operates by employing an encryption key and an input message, which is shifted a specified number of steps, as determined by the encryption engine. Notably, this encryption method accommodates both positive and negative shift values, making it a versatile and foundational technique in the realm of data security. The programme follows a classical Move Controller View. Invalid input was placed in a seperate class. As placing invalid input in any of other places would violate atleast one GRASP pattern and the essence of each and every one of the Move, View and Controllers parts. In this situation, when the 'Information Expert' does not provide an optimal solution, we can introduce a pure fabrication/indirection class that soley focuses on this task. This approach improves the overall cohesiveness and reduces coupling within our system, and additionally follows the SOLID pattern Single Responsibilty Principle. High cohesion and low coupling help our system follow the separation of concerns principle thus making it overall more robust. 

## Lab 4 TicTacToe Game + design model 
### Description
Created a simple Tic Tac Toe game in Java, implementing a clear design model that illustrates the hierarchy of classes and their interactions. The design model outlines how various classes collaborate to facilitate the game's functionality, indicating the roles and responsibilities of each class within the system. This design approach aids in understanding how the game components, such as the board, players, and game logic, work together to deliver the complete Tic Tac Toe experience.
