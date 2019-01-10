# The Airport

## Problem

We need to create a program to manage flights and passengers.

### Flight Types

* Economic.
* Business.

### Passenger Types

* VIP.
* Usual.

#### Economic Flight

* VIP and usual passengers can be added.
* Only usual passengers can be removed.


#### Business Flight

* Only VIP passengers can be added.
* VIP passengers can't be removed.

### Comments service
Additionally we must connect to this [comments REST service](https://jsonplaceholder.typicode.com/posts), assuming that
the userId of the service correspond to the Flight id. 


## How will we do it?

* We must applying TDD.
* We must create unit tests for the functionality.
* We must create integration tests for comments REST service.
* We must use the maven surefire and maven safefail plugins for unit and integration tests repectively.
