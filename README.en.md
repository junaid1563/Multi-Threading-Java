[Interview Questions](README.md)

# YES

-   [What's happened_YES_?](#Что-такое-ООП)
-   [What are the basic principles?_YES_.](#Назовите-основные-принципы-ООП)
-   [What's happened_"encapsulation"_?](#Что-такое-инкапсуляция)
-   [What's happened_"inheritance"_?](#Что-такое-наследование)
-   [What's happened_"polymorphism"_?](#Что-такое-полиморфизм)
-   [What's happened_"abstraction"_?](#Что-такое-абстракция)
-   [What is_"messaging"_?](#Что-представляет-собой-обмен-сообщениями)
-   [Tell us about the basic concepts of OOP:_"Class"_,_"object"_,_"interface"_.](#Расскажите-про-основные-понятия-ООП-класс-объект-интерфейс)
-   [What are the advantages and disadvantages of the object-oriented approach to programming?](#В-чем-заключаются-преимущества-и-недостатки-объектно-ориентированного-подхода-в-программировании)
-   [What do expressions mean in terms of OOP principles?_"is"_And_"has"_?](#Что-подразумевают-в-плане-принципов-ООП-выражения-является-и-имеет)
-   [What is the difference between_composition_And_aggregation_?](#В-чем-разница-между-композицией-и-агрегацией)
-   [What's happened_static_And_dynamic linking_?](#Что-такое-статическое-и-динамическое-связывание)

## What's happened_YES_?

**Object-oriented programming (OOP)**is a programming methodology based on representing a program as a collection of objects, each of which is an instance of a specific class, and the classes form an inheritance hierarchy.

-   object-oriented programming uses objects rather than algorithms as the main logical building blocks;
-   every object is an instance of a specific class
-   classes form hierarchies.

A program is considered object-oriented only if all three of these requirements are met. In particular, programming that does not use inheritance is not called object-oriented, but programming using abstract data types.

According to the OOP paradigm, a program consists of objects that exchange messages. Objects can have state; the only way to change the state of an object is to send it a message, in response to which the object can change its own state.

[to contents](#ООП)

## What are the basic principles?_YES_.

-   _Encapsulation_- hiding the implementation.
-   _Inheritance_- creation of a new entity based on an existing one.
-   _Polymorphism_- the ability to have different forms for the same entity.
-   _Abstraction_- a set of general characteristics.
-   _Sending messages_- a form of communication, interaction between entities.
-   _Переиспользование_- everything listed above works for code reuse.

This is the only correct order of OOP paradigms, since each subsequent one uses the previous ones.

[to contents](#ООП)

## What's happened_"encapsulation"_?

**Encapsulation**is a system property that allows you to combine data and methods that work with them in a class and hide implementation details from the user, revealing only what is necessary for subsequent use.

The purpose of encapsulation is to avoid the dependency of a class's external interface (what other classes can use) on the implementation. So that the slightest change in the class does not entail a change in the external behavior of the class.

> Let's imagine for a moment that we find ourselves at the end of the century before last, when Henry Ford had not yet invented the assembly line, and the first attempts to create a car faced criticism from the authorities over the fact that these smoky monsters pollute the air and scare horses. Let’s imagine that in order to drive the first steam car, it was necessary to know how a steam boiler works, constantly add coal, monitor the temperature and water level. In this case, to turn the wheels, use two levers, each of which turns one wheel separately. I think we can agree that driving a car at that time was a very inconvenient and difficult experience.

> Now let's return to today to the modern wonders of the auto industry with an automatic transmission. In fact, essentially nothing has changed. The gasoline pump still supplies gasoline to the engine, the differentials ensure that the wheels rotate at different angles, and the crankshaft converts the translational movement of the piston into the rotational movement of the wheels. Progress is different. Now all these actions are hidden from the user and allow him to turn the steering wheel and press the gas pedal without thinking about what is happening with the injector, throttle valve and camshaft at this time. It is the concealment of the internal processes occurring in the car that allows it to be used effectively even by those who are not professional auto mechanics with twenty years of experience. This hiding in OOP is called encapsulation.

Example:

```java
public class AbstractPhone {

    private int year;
    private String company;
    public AbstractPhone (int year, String company) {
        this.year = year;
        this.company = company;
    }
    private void openConnection(){
        //findComutator
        //openNewConnection...
    }
    public void call() {
        openConnection();
        System.out.println("Вызываю номер");
    }

    public void ring() {
        System.out.println("Дзынь-дзынь");
    }

}
```

The private modifier makes the fields and methods of a class accessible only within that class. This means that it is impossible to access private fields from outside, and there is no way to call private methods.

Hiding access to the openConnection method also leaves us free to change the internal implementation of this method, since this method is guaranteed not to be used by other objects and will not disrupt their operation.

To work with our object, we leave the call and ring methods open using the public modifier. Providing public methods for working with an object is also part of the encapsulation mechanism, since if access to an object is completely denied, it will become useless.

[to contents](#ООП)

## What's happened_"inheritance"_?

**Inheritance**is a property of the system that allows you to describe a new class based on an existing one with partially or completely borrowed functionality.

The class from which inheritance is made is called_ancestor_,_basic_or_parental_. New class –_descendant_,_heir_or_derivative_class.

> Let's imagine ourselves, for a moment, as engineers at a car plant. Our task is to develop a modern car. We already have a previous model, which has proven itself over many years of use. Everything would be fine, but times and technologies change, and our modern plant must strive to improve the convenience and comfort of its products and meet modern standards.

> We need to release a whole range of cars: a sedan, a station wagon and a small hatchback. Obviously, we are not going to design a new car from scratch, but, taking the previous generation as a basis, we will make a number of design changes. For example, we’ll add power steering, reduce the gaps between the fenders and the hood, and install fog lights. In addition, each model will have a different body shape.

> Obviously, all three modifications will have most of the properties of the previous model (the good old engine from 1970, an impenetrable chassis that has proven itself excellent on domestic roads, a gearbox, etc.). Moreover, each of the models will implement some new functionality or design feature. In this case, we are dealing with inheritance.

Example:
Let's look at an example of creating a smartphone class using inheritance. All cordless phones are powered by rechargeable batteries, which have a certain operating life in hours. So let's add this property to the wireless phones class:

```java
public abstract class WirelessPhone extends AbstractPhone {

    private int hour;

    public WirelessPhone(int year, int hour) {
        super(year);
        this.hour = hour;
    }
}
```

Cell phones inherit the properties of a wireless phone, we also added an implementation of the call and ring methods to this class:

```java
public class CellPhone extends WirelessPhone {
    public CellPhone(int year, int hour) {
        super(year, hour);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Вызываю номер " + outputNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Вам звонит абонент " + inputNumber);
    }
}
```

And finally, the smartphone class, which, unlike classic cell phones, has a full-fledged operating system. You can add new programs supported by this operating system to your smartphone, thus expanding its functionality. Using code, the class can be described as follows:

```java
public class Smartphone extends CellPhone {

    private String operationSystem;

    public Smartphone(int year, int hour, String operationSystem) {
        super(year, hour);
        this.operationSystem = operationSystem;
    }
    
    public void install(String program){
        System.out.println("Устанавливаю " + program + "для" + operationSystem);
    }

}
```

As you can see, we created very little new code to describe the Smartphone class, but we got a new class with new functionality. Using this principle of OOP java can significantly reduce the amount of code, and therefore make the programmer’s work easier.

[to contents](#ООП)

## What's happened_"polymorphism"_?

**Polymorphism**– this is the property of the system to use objects with the same interface without information about the type and internal structure of the object.

The benefit of polymorphism is that it helps reduce program complexity by allowing the same interface to be used to specify a single set of actions. The choice of a specific action, depending on the situation, rests with the programming language compiler. This implies the key feature of polymorphism - the use of an object of a derived class, instead of a base object (children can change parent behavior, even if they are accessed by a reference of the parent type).

> Any driving training would not make sense if a person who learned to drive, say, a VAZ 2106 could not then drive a VAZ 2110 or BMW X3. On the other hand, it is difficult to imagine a person who could normally drive a car in which the gas pedal is to the left of the brake pedal and there is a joystick instead of a steering wheel.

> The thing is that the main control elements of the car have the same design and operating principle. The driver knows for sure that in order to turn left, he must turn the steering wheel, regardless of whether there is power steering or not. 
> If a person needs to get from work to home, then he will get behind the wheel of a car and will perform the same actions, regardless of what type of car he uses. In fact, we can say that all cars have the same interface, and the driver, abstracting from the essence of the car, works with this interface. If the driver has to drive on the German Autobahn, he will probably choose a fast car with a low seating position, and if he has to return from a remote marlin camp in the Altai Mountains after rain, he will most likely choose a UAZ with army axles. But, regardless of how the movement and internal functioning of the machine is implemented, the interface will remain the same.

_Polymorphic variable_, is a variable that can take values ​​of different types, and_polymorphic function_, this is a function in which at least one argument is a polymorphic variable.
There are two types of polymorphic functions:

-   _for this_, the function behaves differently for different types of arguments (for example, the function`draw()`- draws different types of figures in different ways);
-   _parametric_, the function behaves the same for arguments of different types (for example, the function`add()`— places elements of different types into the container in the same way).

The principle in OOP when a program can use objects with the same interface without information about the internal structure of the object is called polymorphism.

Example:

Let's imagine that in our program we need to describe a user who can use any phone model to call another user. Here's how to do it:

```java
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void callAnotherUser(int number, AbstractPhone phone) {
// вот он полиморфизм - использование в коде абстактного типа AbstractPhone phone!
        phone.call(number);
    }
}
```

Now let's describe the different phone models. One of the first phone models:

```java
public class ThomasEdisonPhone extends AbstractPhone {

    public ThomasEdisonPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Вращайте ручку");
        System.out.println("Сообщите номер абонента, сэр");
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Телефон звонит");
    }
}
```

Regular landline phone:

```java
public class Phone extends AbstractPhone {

    public Phone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Вызываю номер" + outputNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Телефон звонит");
    }
}
```

And finally, a cool video phone:

```java
public class VideoPhone extends AbstractPhone {

    public VideoPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Подключаю видеоканал для абонента " + outputNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("У вас входящий видеовызов..." + inputNumber);
    }
}
```

Let's create objects in the main() method and test the callAnotherUser method:

```java
AbstractPhone firstPhone = new ThomasEdisonPhone(1879);
AbstractPhone phone = new Phone(1984);
AbstractPhone videoPhone=new VideoPhone(2018);
User user = new User("Андрей");
user.callAnotherUser(224466,firstPhone);
// Вращайте ручку
//Сообщите номер абонента, сэр
user.callAnotherUser(224466,phone);
//Вызываю номер 224466
user.callAnotherUser(224466,videoPhone);
//Подключаю видеоканал для абонента 224466
```

By calling the same method on the user object, we got different results. The specific implementation of the call method within the callAnotherUser method was selected dynamically based on the specific type of the calling object during program execution. This is the main advantage of polymorphism - the choice of implementation during program execution.

In the phone class examples above, we used method overriding, a technique that changes the method implementation defined in the base class without changing the method signature. Essentially, it is a method replacement, and it is the new method defined in the subclass that is called when the program runs.

Typically, when overriding a method, the @Override annotation is used, which prompts the compiler to check the signatures of the overridden and overriding methods.

[to contents](#ООП)

## What's happened_"abstraction"_?

_Abstraction_is a way to highlight a set of general characteristics of an object, excluding private and insignificant ones from consideration. Respectively,**abstraction**is a set of all such characteristics.

> Imagine that a driver is driving a car along a busy road. It is clear that at this moment he will not think about the chemical composition of the car’s paint, the peculiarities of the interaction of gears in the gearbox, or the influence of the body shape on the speed (unless the car is in a dead traffic jam and the driver has absolutely nothing to do). However, he will use the steering wheel, pedals, and turn signal regularly.

Example:

```java
// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}

class MyMainClass {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
```

[to contents](#ООП)

## What is_"messaging"_?

Objects communicate by sending and receiving messages. A message is a request to perform an action, accompanied by a set of arguments that may be needed when performing the action. In OOP, sending a message (calling a method) is the only way to transfer control to an object. If an object must “respond” to this message, then it must have a method corresponding to this message. Also, objects, using their methods, can themselves send messages to other objects. Message exchange is implemented using dynamic calls, which results in extremely late binding.

> Suppose you want to create a physical model that describes colliding balls of different sizes. The traditional approach to solving this problem is something like this: a set of data is defined that describes each ball (for example, its coordinates, mass and acceleration); Each ball is assigned a unique identifier (for example, an array is organized, the index value of which corresponds to the ball number), which will allow each ball to be distinguished from all others. Finally, a subroutine is written with a name, say,`bounce`; this procedure must, based on the ball number and its initial parameters, change the data describing the ball accordingly. Unlike the traditional approach, the object-oriented version of the program models each of the balls using an object. In this case, the object corresponding to a specific ball contains not only its parameters, but also all the code that describes the behavior of the ball under various interactions. So, each ball will have its own method`bounce()`. Instead of calling the subroutine`bounce`with an argument specifying, say, ball #3, you would need to pass a message to the "ball #3" object instructing it to perform the collision.

[to contents](#ООП)

## Tell us about the basic concepts of OOP:_"Class"_,_"object"_,_"interface"_.

**Class**is a way of describing an entity that defines a state and behavior that depends on this state, as well as rules for interacting with this entity (contract).

From a programming point of view, a class can be considered as a set of data (fields, attributes, class members) and functions for working with them (methods).

From the point of view of program structure, a class is a complex data type.

**Object (instance)**is an individual representative of a class that has a specific state and behavior that is entirely determined by the class. Each object has specific attribute values ​​and methods that operate on those values ​​based on rules defined in the class.

**Interface**is a set of class methods available for use. The interface of a class will be the set of all its public methods together with a set of public attributes. Essentially, an interface specifies a class, clearly defining all possible actions on it.

[to contents](#ООП)

## What are the advantages and disadvantages of the object-oriented approach to programming?

Advantages:

-   The object model is quite natural, since it is primarily focused on the human perception of the world, and not on computer implementation.
-   Classes allow you to construct from useful components with simple tools that allow you to abstract away from implementation details.
-   Data and operations on them form a specific entity, and they are not distributed throughout the program, as is often the case in procedural programming, but are described together. Code and data localization improves the visibility and maintainability of software.
-   Encapsulation allows you to introduce the property of modularity, which makes it easier to parallelize the execution of a task between several executors and update versions of individual components.
-   Ability to create extensible systems.
-   The use of polymorphism is useful when:
    -   Processing of heterogeneous data structures. Programs can work without distinguishing between the types of objects, which greatly simplifies the code. New species can be added at any time.
    -   Changes in behavior during performance. At the execution stage, one object can be replaced by another, which makes it easy, without changing the code, to adapt the algorithm depending on which object is used.
    -   Implementation of work with heirs. Algorithms can be generalized so much that they can already work with more than one type of object.
    -   The ability to describe application-independent parts of a domain in the form of a set of universal classes, or a framework, which will later be expanded by adding parts specific to a particular application.
-   Code reuse:
    -   Development time is reduced, which can be devoted to other tasks.
    -   Reusable components typically contain far fewer errors than newly developed components because they have been tested many times before.
    -   When a component is used by several clients at once, improvements made to its code simultaneously have a positive impact on many programs that work with it.
    -   When a program relies on standard components, its structure and user interface become more uniform, making it easier to understand and easier to use.

Flaws:

-   In complex class hierarchies, fields and methods are usually inherited from different levels. And it's not always easy to determine which fields and methods actually belong to a given class.
-   The code for processing a message is sometimes “spread out” over many methods (in other words, processing a message requires not one, but many methods that can be described in different classes).
-   Documenting classes is a more difficult task than it was with procedures and modules. Because any method can be overridden, the documentation must say not only what the method does, but also the context in which it is called.
-   Inefficient and wasteful memory allocation at runtime (due to the overhead of dynamic binding and type checking at runtime).
-   Excessive versatility. Often there are more methods than are actually needed by the current program. And since unnecessary methods cannot be removed, they become dead weight.

[to contents](#ООП)

## What do expressions mean in terms of OOP principles?_"is"_And_"has"_?

**"is"**implies inheritance.**"has"**implies association (aggregation or composition).

[to contents](#ООП)

## What is the difference between_composition_And_aggregation_?

Association denotes a connection between objects. Composition and aggregation are special cases of the “part-whole” association.

Aggregation assumes that objects are related by a “part-of” relationship. Composition is a stricter version of aggregation. In addition to the “part-of” requirement, a condition is imposed that an instance of a “part” can only be included in one whole (or not included anywhere), while in the case of aggregation, an instance of a “part” can be included in several wholes.

> For example, a book consists of pages, and we cannot tear a page out of a book and put it in another book. The pages are clearly tied to a specific book, so it is a composition.
> At the same time, we can take and move a book from one library to another - this is already aggregation.

[to contents](#ООП)

## What's happened_static_And_dynamic linking_?

Attaching a method call to a method body is called binding. If linking is done by the compiler (linker) before running the program, it is called_static_or_early binding_.

In turn,_late binding_This is a binding carried out directly during program execution, depending on the type of object. Late binding is also called_dynamic_or_runtime binding_. In languages ​​that implement late binding, there must be a mechanism for determining the actual type of an object at runtime in order to call the appropriate method. In other words, the compiler does not know the type of the object, but the method call mechanism determines it and calls the corresponding method body. The mechanism for late binding depends on the specific language, but it is easy to imagine that in order to implement it, some additional information must be included in objects.

All Java methods use late (dynamic) binding unless the method has been declared as`final`,`static`or`private`(private methods are`final`by default).

[to contents](#ООП)

# Sources

-   [DevColibri](https://devcolibri.com/%d1%87%d1%82%d0%be-%d1%82%d0%b0%d0%ba%d0%be%d0%b5-%d0%be%d0%be%d0%bf-%d0%b8-%d1%81-%d1%87%d0%b5%d0%bc-%d0%b5%d0%b3%d0%be-%d0%b5%d0%b4%d1%8f%d1%82/)
-   [Habrakhabr](https://habrahabr.ru/post/87119/)
-   [Wikipedia](https://ru.wikipedia.org/wiki/Объектно-ориентированное_программирование)

[Interview Questions](README.md)
