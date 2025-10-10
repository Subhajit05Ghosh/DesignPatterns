✅ Definition (SRP – Single Responsibility Principle):

"A class should have only one reason to change."

Benefits of SRP:
SRP leads to cleaner, modular, testable, and maintainable code — which is easier to work with, grow, and scale over time.

✅ Goal:

We’ll create a simple program that:

Stores a message

Prints the message

Saves the message to a file

Instead of putting all responsibilities in one class, we’ll separate them according to SRP.

##-------------------------------------------------------------------------------------------
The MessageManager class has multiple responsibilities:

Storing the message

Printing the message

Saving the message to a file

So it violates SRP because any change in how we print or save the message would require modifying this class.
----------------------------------------------------------------------------------------------------------
🎯 Why This Follows SRP:

Each class has one responsibility only

Changes in one area (e.g., saving logic) don't affect the others

Code is modular, clean, and easier to test or extend