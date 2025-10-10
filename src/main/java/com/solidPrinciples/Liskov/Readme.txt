✅ Definition – Liskov Substitution Principle (LSP)

"Objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program."

"A subclass should behave like its parent class without breaking the program."

Why This Violates LSP:

The Bird class promises that all birds can fly.

Code using Bird objects expects them to safely call .fly().

Ostrich breaks this contract by throwing an exception, violating LSP.