# Observer Design Pattern

1. Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified, its depenedent objects are to be notified automatically. Observer pattern falls under behavioral pattern category.
2. It is a publish/subscribe pattern which allows a number of observer objects to see an event.


## Implementation

Observer pattern uses three actor classes. Subject, Observer and Client. Subject is an object having methods to attach and detach observers to a client object


1. Observable will have a list of observers each time its state got updated it'll notify all the observers
2. Each observer will have a copy of observable. Once it gets the notification from the observable it'll perform its task.

## Use case
1. Flipkart, Amazon -> Notify me button -- Asked in Walmart
2. Weather station -> Temperature being observer by different kind of devices -> TV, Phone, Computer