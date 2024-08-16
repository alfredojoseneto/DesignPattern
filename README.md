# DESIGN PATTERNS

---

The main objective of this repository is to practice the principles design
patterns that has been exploited in [Head First Design Pattern
Book](https://www.amazon.com/Head-First-Design-Patterns-Object-Oriented/dp/149207800X/ref=sr_1_1?crid=3M5OT62K3ZAU2&dib=eyJ2IjoiMSJ9.KueZMlNMlxnKpiJVz_jRt4V6hzrk0qD8tiUpkGp0oOepC8UiFExddPMdiImj4r9p3As1azxJAcmqu2ECKNhZFMf3JTcqDr_PeFiMXw9bYV_PiXNV4spFcMez7eDJJPMB6tW_l47m2cSXpONDJnA87qlzbrx9XQHQwPkkqyRxkVtkuL99Qmxhm3w-PNH1okW7P2XqD-CRFTSR8P8HS-MyJPMXfIlkYEpHGZ77Iw_7LBA.ji55X5HdY8kC291WMAUZHZtUOjM_SG5gYgelSIn9Z84&dib_tag=se&keywords=head+first+design&qid=1723805433&sprefix=head+first+de%2Caps%2C228&sr=8-1).
So, across the book examples and some other contents, this repository will be a
kind of documentation and source when some example are nedded.

### SINGLETON

The **Singleton** is a CREATIONAL PATTERN. So, it's a manner how we **control
the creation of an object instance**. Some characteristics are fundamentals to this pattern:

- Approach:
  - **The constructor is private**. So, the class itself handle the object
    instatiation because we want only one (and just only one) of that object kind.
    An example is a database connection. So, it is some interesting that exists
    only one connector to be used accross all program classes.
  - **Beware with multithread**. When a Singleton class is crafted, the
    multithread must by taked in consideration if the application will use this
    funcionality. So, there are some approach to avoid multiple instances one for
    each thread. Below are some approaches:
    - Public Field: there is an example in **SingletonPublicField.java** that show how
      to build a class using this approach. By this strategy, the
      instatiation of a class e made by the JVM before each thread be able to use the
      class. So, the JVM handle the existence of a single and unique object instance.
    - Lazy Init: there is an example in **SingletonLazyInit.java** that verify
      if an instance is null. If true, synchronize the class, verify again if an
      instance is indeed null and than an instance is created and returned.
      The unique field "uniqueInstance" require the use of **volatile** keyword.
    - Synchronized Factory: there is an example in
      **SingletonSynchronized.java**. In the "getInstance()" method is required the
      use of **synchronized** keyword and the other parts method remain the same as
      Singleton.java class.
    - Enum: all the previous approaches has its owns pros and cons. The
      Serialization/Deserialization/Reflection of an object is not handle by other
      approaches without more code adjusts. So, using "ENUM" we can handle
      all this details because the Enum is already serializable and unique.
      The class **SingletonEnum.java** has an example how to implement this.

The **SingletonEnumChocolateFactory.java** solving the challange suggest in
Head First Design Pattern Book using the Enum solution to crete the Singleton
design pattern.

More examples can by learned by Dulaj Atapatty post in this
[link](https://dzone.com/articles/java-singletons-using-enum).
