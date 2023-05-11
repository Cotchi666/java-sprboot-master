IOC - Inverted of Control

In the normal way to run an object, it might be struggled with tightly dependency( the one declared dependency objects, create it in which recent object as the container)
If the dependency object has issued or been changed, the container object's to be changed as well.

To fix that: we just need to use IOC desire pattern.
Inject the Interface into container object, do what we're supposed to do...
The dependency object've to implement that interface.
When creating the container obj, pour any dependency obj we want to into the container obj.
