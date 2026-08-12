Definition

The Bridge Design Pattern is a structural design pattern that separates an abstraction from its implementation,
allowing both to evolve independently.

In simple words:

Bridge Pattern = Separate “what an object does” from “how it does it.”

This helps avoid creating a large number of subclasses when both the abstraction and implementation can vary independently.

Real-life example

Consider a Remote Control and different Devices.

Abstraction: Remote Control
Implementation: TV, Radio, etc.

Instead of creating classes like SonyRemote, SamsungRemote, SonyAdvancedRemote, etc., we separate the remote from the device.