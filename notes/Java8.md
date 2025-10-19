[Interview Questions](README.md)

# Java 8


- [What innovations have appeared in Java 8 and JDK 8?](#what-innovations-have-appeared-in-java-8-and-jdk-8)
- [What's happened_"lambda"_? What is the structure and usage features of a lambda expression?](#whats-happened_lambda_-what-is-the-structure-and-usage-features-of-a-lambda-expression)
- [What variables can lambda expressions access?](#what-variables-can-lambda-expressions-access)
- [How to sort a list of strings using a lambda expression?](#how-to-sort-a-list-of-strings-using-a-lambda-expression)
- [What is a "method reference"?](#what-is-a-method-reference)
- [What types of method references do you know?](#what-types-of-method-references-do-you-know)
- [Explain the expression`System.out::println`.](#explain-the-expressionsystemoutprintln)
- [What are "functional interfaces"?](#what-are-functional-interfaces)
- [What are functional interfaces for?`Function<T,R>`,`DoubleFunction<R>`,`IntFunction<R>`And`LongFunction<R>`?](#what-are-functional-interfaces-for-functiontr-doublefunctionr-intfunctionr-and-longfunctionr)
- [What are functional interfaces for?`UnaryOperator<T>`,`DoubleUnaryOperator`,`IntUnaryOperator`And`LongUnaryOperator`?](#what-are-functional-interfaces-for-unaryoperatort-doubleunaryoperator-intunaryoperator-and-longunaryoperator)
- [What are functional interfaces for?`BinaryOperator<T>`,`DoubleBinaryOperator`,`IntBinaryOperator`And`LongBinaryOperator`?](#what-are-functional-interfaces-for-binaryoperatort-doublebinaryoperator-intbinaryoperator-and-longbinaryoperator)
- [What are functional interfaces for?`Predicate<T>`,`DoublePredicate`,`IntPredicate`And`LongPredicate`?](#what-are-functional-interfaces-for-predicatet-doublepredicate-intpredicate-and-longpredicate)
- [What are functional interfaces for?`Consumer<T>`,`DoubleConsumer`,`IntConsumer`And`LongConsumer`?](#what-are-functional-interfaces-for-consumert-doubleconsumer-intconsumer-and-longconsumer)
- [What are functional interfaces for?`Supplier<T>`,`BooleanSupplier`,`DoubleSupplier`,`IntSupplier`And`LongSupplier`?](#what-are-functional-interfaces-for-suppliert-booleansupplier-doublesupplier-intsupplier-and-longsupplier)
- [Why do we need a functional interface?`BiConsumer<T,U>`?](#why-do-we-need-a-functional-interface-biconsumertu)
- [Why do we need a functional interface?`BiFunction<T,U,R>`?](#why-do-we-need-a-functional-interface-bifunctiontur)
- [Why do we need a functional interface?`BiPredicate<T,U>`?](#why-do-we-need-a-functional-interface-bipredicatetu)
- [Why do we need functional interfaces like`_To_Function`?](#why-do-we-need-functional-interfaces-like_to_function)
- [What are functional interfaces for?`ToDoubleBiFunction<T,U>`,`ToIntBiFunction<T,U>`And`ToLongBiFunction<T,U>`?](#what-are-functional-interfaces-for-todoublebifunctiontu-tointbifunctiontu-and-tolongbifunctiontu)
- [What are functional interfaces for?`ToDoubleFunction<T>`,`ToIntFunction<T>`And`ToLongFunction<T>`?](#what-are-functional-interfaces-for-todoublefunctiont-tointfunctiont-and-tolongfunctiont)
- [What are functional interfaces for?`ObjDoubleConsumer<T>`,`ObjIntConsumer<T>`And`ObjLongConsumer<T>`?](#what-are-functional-interfaces-for-objdoubleconsumert-objintconsumert-and-objlongconsumert)
- [What's happened`StringJoiner`?](#whats-happenedstringjoiner)
- [What's happened`default`interface methods?](#whats-happeneddefaultinterface-methods)
- [How to call`default`interface method in the class that implements this interface?](#how-to-calldefaultinterface-method-in-the-class-that-implements-this-interface)
- [What's happened`static`interface method?](#whats-happenedstaticinterface-method)
- [How to call`static`interface method?](#how-to-callstaticinterface-method)
- [What's happened`Optional`?](#whats-happenedoptional)
- [What's happened`Stream`?](#whats-happenedstream)
- [What are the different ways to create a stream?](#what-are-the-different-ways-to-create-a-stream)
- [What is the difference between`Collection`And`Stream`?](#what-is-the-difference-betweencollectionandstream)
- [What is the method for?`collect()`in restraints?](#what-is-the-method-for-collectin-restraints)
- [Why are methods used in streams?`forEach()`And`forEachOrdered()`?](#why-are-methods-used-in-streams-foreachandforeachordered)
- [What are the methods used in streams?`map()`And`mapToInt()`,`mapToDouble()`,`mapToLong()`?](#what-are-the-methods-used-in-streams-mapandmaptoint-maptodouble-maptolong)
- [What is the purpose of the method`filter()`in restraints?](#what-is-the-purpose-of-the-methodfilterin-restraints)
- [What is the method used for in streams?`limit()`?](#what-is-the-method-used-for-in-streamslimit)
- [What is the method used for in streams?`sorted()`?](#what-is-the-method-used-for-in-streamssorted)
- [What are the methods used in streams?`flatMap()`,`flatMapToInt()`,`flatMapToDouble()`,`flatMapToLong()`?](#what-are-the-methods-used-in-streams-flatmap-flatmaptoint-flatmaptodouble-flatmaptolong)
- [Explain about parallel processing in Java 8.](#explain-about-parallel-processing-in-java-8)
- [What ultimate methods of working with streams do you know?](#what-ultimate-methods-of-working-with-streams-do-you-know)
- [What intermediate methods of working with streams do you know?](#what-intermediate-methods-of-working-with-streams-do-you-know)
- [How to display 10 random numbers using`forEach()`?](#how-to-display-10-random-numbers-usingforeach)
- [How can you display unique squares of numbers using the method`map()`?](#how-can-you-display-unique-squares-of-numbers-using-the-methodmap)
- [How to display the number of empty lines using the method`filter()`?](#how-to-display-the-number-of-empty-lines-using-the-methodfilter)
- [How to display 10 random numbers in ascending order?](#how-to-display-10-random-numbers-in-ascending-order)
- [How to find the maximum number in a set?](#how-to-find-the-maximum-number-in-a-set)
- [How to find the minimum number in a set?](#how-to-find-the-minimum-number-in-a-set)
- [How to get the sum of all numbers in a set?](#how-to-get-the-sum-of-all-numbers-in-a-set)
- [How to get the average of all numbers?](#how-to-get-the-average-of-all-numbers)
- [What additional methods for working with associative arrays (maps) appeared in Java 8?](#what-additional-methods-for-working-with-associative-arrays-maps-appeared-in-java-8)
- [What's happened`LocalDateTime`?](#whats-happenedlocaldatetime)
- [What's happened`ZonedDateTime`?](#whats-happenedzoneddatetime)
- [How to get current date using Date Time API from Java 8?](#how-to-get-current-date-using-date-time-api-from-java-8)
- [How to add 1 week, 1 month, 1 year, 10 years to current date using Date Time API?](#how-to-add-1-week-1-month-1-year-10-years-to-current-date-using-date-time-api)
- [How to get next Tuesday using Date Time API?](#how-to-get-next-tuesday-using-date-time-api)
- [How to get the second Saturday of the current month using the Date Time API?](#how-to-get-the-second-saturday-of-the-current-month-using-the-date-time-api)
- [How to get the current time accurate to milliseconds using the Date Time API?](#how-to-get-the-current-time-accurate-to-milliseconds-using-the-date-time-api)
- [How to get the current local time accurate to milliseconds using the Date Time API?](#how-to-get-the-current-local-time-accurate-to-milliseconds-using-the-date-time-api)
- [How to define a repeatable annotation?](#how-to-define-a-repeatable-annotation)
- [What's happened`Nashorn`?](#whats-happenednashorn)
- [What's happened`jjs`?](#whats-happenedjjs)
- [What class appeared in Java 8 for encoding/decoding data?](#what-class-appeared-in-java-8-for-encodingdecoding-data)
- [How to create a Base64 encoder and decoder?](#how-to-create-a-base64-encoder-and-decoder)

## What innovations have appeared in Java 8 and JDK 8?

-   Default interface methods;
-   Lambda expressions;
-   Functional interfaces;
-   Links to methods and constructors;
-   Repeatable annotations;
-   Annotations on data types;
-   Reflection for method parameters;
-   _Stream API_for working with collections;
-   Parallel sorting of arrays;
-   New API for working with dates and times;
-   New JavaScript engine_rhino_;
-   Added several new classes for thread-safe operation;
-   Added new API for`Calendar`And`Locale`;
-   Added support_Unicode 6.2.0_;
-   Added a standard class for working with_Base64_;
-   Added support for unsigned arithmetic;
-   Improved designer performance`java.lang.String(byte[], *)`and method`java.lang.String.getBytes()`;
-   New implementation`AccessController.doPrivileged`, which allows you to set a subset of privileges without having to check all other access levels;
-   _Password-based_algorithms have become more stable;
-   Added support_SSL/TLS Server Name Indication (NSI)_V_JSSE Server_;
-   Improved key storage (KeyStore);
-   Added algorithm_SHA-224_;
-   Bridge removed_JDBC - ODBC_;
-   Deleted_PermGen_, the way of storing class metadata has been changed;
-   The ability to create profiles for the Java SE platform, which include not the entire platform, but some part of it;
-   Tools
    -   Added utility`jjs`for use_JavaScript Rhino_;
    -   Team`java`can run_JavaFX_applications;
    -   Added utility`jdeps`for analysis_.class_-files.

[to contents](#java-8)

## What's happened_"lambda"_? What is the structure and usage features of a lambda expression?

**Lambda**is a set of instructions that can be isolated into a separate variable and then called repeatedly at different places in the program.

The basis of a lambda expression is_lambda operator_, which represents the arrow`->`. This operator splits the lambda expression into two parts: the left part contains the list of parameters of the expression, and the right part, in fact, represents the body of the lambda expression, where all the actions are performed.

A lambda expression does not execute on its own, but forms an implementation of a method defined in a functional interface. It is important that a functional interface should contain only one single method without an implementation.

```java
interface Operationable {
    int calculate(int x, int y);
}

public static void main(String[] args) {
    Operationable operation = (x, y) -> x + y;     
    int result = operation.calculate(10, 20);
    System.out.println(result); //30
}
```

In fact, lambda expressions are in some way a shortened form of internal anonymous classes that were previously used in Java.

-   _Deferred execution of lambda expressions_- defined once in one place in the program, called if necessary, any number of times and in an arbitrary place in the program.

-   _Lambda Expression Parameters_must correspond in type to the parameters of the functional interface method:

```java
operation = (int x, int y) -> x + y;
//При написании самого лямбда-выражения тип параметров разрешается не указывать:
(x, y) -> x + y;
//Если метод не принимает никаких параметров, то пишутся пустые скобки, например,
() -> 30 + 20;
//Если метод принимает только один параметр, то скобки можно опустить:
n -> n * n;
```

-   _Final lambda expressions_are not required to return any value.

```java
interface Printable {
    void print(String s);
}
 
public static void main(String[] args) {
    Printable printer = s -> System.out.println(s);
    printer.print("Hello, world");
}
```

-   _Block Lambda Expressions_are surrounded by curly braces. In block lambda expressions you can use internal nested blocks, loops, constructs`if`,`switch`, create variables, etc. If a block lambda expression must return a value, then the operator is explicitly used`return`:

```java
Operationable operation = (int x, int y) -> {       
    if (y == 0) {
        return 0;
    }
    else {
        return x / y;
    }
};
```

-   _Passing a lambda expression as a method parameter_:

```java
interface Condition {
    boolean isAppropriate(int n);
}

private static int sum(int[] numbers, Condition condition) {
    int result = 0;
    for (int i : numbers) {
        if (condition.isAppropriate(i)) {
            result += i;
        }
    }
    return result;
}

public static void main(String[] args) {
    System.out.println(sum(new int[] {0, 1, 0, 3, 0, 5, 0, 7, 0, 9}, (n) -> n != 0));
} 
```

[to contents](#java-8)

## What variables can lambda expressions access?

Accessing outer scope variables from a lambda expression is very similar to accessing from anonymous objects. You can refer to:

-   immutable (_effectively final_- not necessarily marked as`final`) local variables;
-   class fields;
-   static variables.

The default methods of an implemented functional interface cannot be accessed inside a lambda expression.

[to contents](#java-8)

## How to sort a list of strings using a lambda expression?

```java
public static List<String> sort(List<String> list){
    Collections.sort(list, (a, b) -> a.compareTo(b));
    return list;
}
```

[to contents](#java-8)

## What is a "method reference"?

If an existing method in the class already does everything that is needed, then you can use the mechanism**method reference**to pass this method directly. This link is sent in the form:

-   `имя_класса::имя_статического_метода`for a static method;
-   `объект_класса::имя_метода`for an instance method;
-   `название_класса::new`for the designer.

The result will be exactly the same as if you defined a lambda expression that calls this method.

```java
private interface Measurable {
    public int length(String string);
}

public static void main(String[] args) {
    Measurable a = String::length;
    System.out.println(a.length("abc"));
}
```

Method references are potentially more efficient than using lambda expressions. They also provide better type information to the compiler, and when given the choice between using an existing method reference and using a lambda expression, using a method reference should always be preferred.

[to contents](#java-8)

## What types of method references do you know?

-   to a static method;
-   to the instance method;
-   to the constructor.

[to contents](#java-8)

## Explain the expression`System.out::println`.

This expression illustrates the mechanism_instance method reference_: translators`println()`static field`out`class`System`.

[to contents](#java-8)

## What are "functional interfaces"?

**Functional interface**is an interface that defines only one abstract method.

To accurately identify an interface as functional, the annotation has been added`@FunctionalInterface`, working on the principle`@Override`. It will indicate the intent and will not allow you to define a second abstract method in the interface.

The interface can include as many`default`methods and still remain functional, because`default`methods are not abstract.

[to contents](#java-8)

## What are functional interfaces for?`Function<T,R>`,`DoubleFunction<R>`,`IntFunction<R>`And`LongFunction<R>`?

**`Function<T, R>`**- an interface with which a function is implemented that receives an instance of a class as input`T`and returning an instance of the class as output`R`.

Default methods can be used to build call chains (`compose`,`andThen`).

```java
Function<String, Integer> toInteger = Integer::valueOf;
Function<String, String> backToString = toInteger.andThen(String::valueOf);
backToString.apply("123");     // "123"
```

-   `DoubleFunction<R>`- function that receives input`Double`and returning an instance of the class as output`R`;
-   `IntFunction<R>`- function that receives input`Integer`and returning an instance of the class as output`R`;
-   `LongFunction<R>`- function that receives input`Long`and returning an instance of the class as output`R`.

[to contents](#java-8)

## What are functional interfaces for?`UnaryOperator<T>`,`DoubleUnaryOperator`,`IntUnaryOperator`And`LongUnaryOperator`?

**`UnaryOperator<T>`(unary operator)**takes an object of type as a parameter`T`, performs operations on them and returns the result of the operations in the form of an object of type`T`:

```java
UnaryOperator<Integer> operator = x -> x * x;
System.out.println(operator.apply(5)); // 25
```

-   `DoubleUnaryOperator`- unary operator receiving as input`Double`;
-   `IntUnaryOperator`- unary operator receiving as input`Integer`;
-   `LongUnaryOperator`- unary operator receiving as input`Long`.

[to contents](#java-8)

## What are functional interfaces for?`BinaryOperator<T>`,`DoubleBinaryOperator`,`IntBinaryOperator`And`LongBinaryOperator`?

**`BinaryOperator<T>`(binary operator)**- an interface with which a function is implemented that receives two instances of a class as input`T`and returning an instance of the class as output`T`.

```java
BinaryOperator<Integer> operator = (a, b) -> a + b;
System.out.println(operator.apply(1, 2)); // 3
```

-   `DoubleBinaryOperator`- binary operator receiving as input`Double`;
-   `IntBinaryOperator`- binary operator receiving as input`Integer`;
-   `LongBinaryOperator`- binary operator receiving as input`Long`.

[to contents](#java-8)

## What are functional interfaces for?`Predicate<T>`,`DoublePredicate`,`IntPredicate`And`LongPredicate`?

**`Predicate<T>`(predicate)**- an interface with which a function is implemented that receives an instance of a class as input`T`and returning a value like`boolean`.

The interface contains various default methods that allow you to build complex conditions (`and`,`or`,`negate`).

```java
Predicate<String> predicate = (s) -> s.length() > 0;
predicate.test("foo"); // true
predicate.negate().test("foo"); // false
```

-   `DoublePredicate`- predicate receiving as input`Double`;
-   `IntPredicate`- predicate receiving as input`Integer`;
-   `LongPredicate`- predicate receiving as input`Long`.

[to contents](#java-8)

## What are functional interfaces for?`Consumer<T>`,`DoubleConsumer`,`IntConsumer`And`LongConsumer`?

**`Consumer<T>`(consumer)**- an interface with which a function is implemented that receives an instance of a class as input`T`, performs some action on it and returns nothing.

```java
Consumer<String> hello = (name) -> System.out.println("Hello, " + name);
hello.accept("world");
```

-   `DoubleConsumer`- consumer receiving input`Double`;
-   `IntConsumer`- consumer receiving input`Integer`;
-   `LongConsumer`- consumer receiving input`Long`.

[to contents](#java-8)

## What are functional interfaces for?`Supplier<T>`,`BooleanSupplier`,`DoubleSupplier`,`IntSupplier`And`LongSupplier`?

**`Supplier<T>`(supplier)**- an interface with the help of which a function is implemented that does not accept anything as input, but returns the result of the class as output`T`;

```java
Supplier<LocalDateTime> now = LocalDateTime::now;
now.get();
```

-   `DoubleSupplier`- supplier returning`Double`;
-   `IntSupplier`- supplier returning`Integer`;
-   `LongSupplier`- supplier returning`Long`.

[to contents](#java-8)

## Why do we need a functional interface?`BiConsumer<T,U>`?

**`BiConsumer<T,U>`**is an operation that takes two class arguments`T`And`U`performs some action on them and returns nothing.

[to contents](#java-8)

## Why do we need a functional interface?`BiFunction<T,U,R>`?

**`BiFunction<T,U,R>`**is an operation that takes two class arguments`T`And`U`and returning the result of the class`R`.

[to contents](#java-8)

## Why do we need a functional interface?`BiPredicate<T,U>`?

**`BiPredicate<T,U>`**is an operation that takes two class arguments`T`And`U`and returning a result like`boolean`.

[to contents](#java-8)

## Why do we need functional interfaces like`_To_Function`?

-   `DoubleToIntFunction`- an operation that takes a class argument`Double`and returning a result like`Integer`;
-   `DoubleToLongFunction`- an operation that takes a class argument`Double`and returning a result like`Long`;
-   `IntToDoubleFunction`- an operation that takes a class argument`Integer`and returning a result like`Double`;
-   `IntToLongFunction`- an operation that takes a class argument`Integer`and returning a result like`Long`;
-   `LongToDoubleFunction`- an operation that takes a class argument`Long`and returning a result like`Double`;
-   `LongToIntFunction`- an operation that takes a class argument`Long`and returning a result like`Integer`.

[to contents](#java-8)

## What are functional interfaces for?`ToDoubleBiFunction<T,U>`,`ToIntBiFunction<T,U>`And`ToLongBiFunction<T,U>`?

-   `ToDoubleBiFunction<T,U>`- an operation that takes two class arguments`T`And`U`and returning a result like`Double`;
-   `ToLongBiFunction<T,U>`- an operation that takes two class arguments`T`And`U`and returning a result like`Long`;
-   `ToIntBiFunction<T,U>`- an operation that takes two class arguments`T`And`U`and returning a result like`Integer`.

[to contents](#java-8)

## What are functional interfaces for?`ToDoubleFunction<T>`,`ToIntFunction<T>`And`ToLongFunction<T>`?

-   `ToDoubleFunction<T>`- an operation that takes a class argument`T`and returning a result like`Double`;
-   `ToLongFunction<T>`- an operation that takes a class argument`T`and returning a result like`Long`;
-   `ToIntFunction<T>`- an operation that takes a class argument`T`and returning a result like`Integer`.

[to contents](#java-8)

## What are functional interfaces for?`ObjDoubleConsumer<T>`,`ObjIntConsumer<T>`And`ObjLongConsumer<T>`?

-   `ObjDoubleConsumer<T>`- an operation that takes two class arguments`T`And`Double`, performs some action on them and returns nothing;
-   `ObjLongConsumer<T>`- an operation that takes two class arguments`T`And`Long`, performs some action on them and returns nothing;
-   `ObjIntConsumer<T>`- an operation that takes two class arguments`T`And`Integer`, performs some action on them and returns nothing.

[to contents](#java-8)

## What's happened`StringJoiner`?

Class`StringJoiner`is used to create a sequence of strings separated by a delimiter with the ability to append a prefix and suffix to the resulting string:

```java
StringJoiner joiner = new StringJoiner(".", "prefix-", "-suffix");
for (String s : "Hello the brave world".split(" ")) {
    joiner.add(s);
}
System.out.println(joiner); //prefix-Hello.the.brave.world-suffix
```

[to contents](#java-8)

## What's happened`default`interface methods?

Java 8 allows you to add non-abstract method implementations to an interface using the keyword`default`:

```java
interface Example {
    int process(int a);
    default void show() {
        System.out.println("default show()");
    }
}
```

-   If a class implements an interface, it can, but is not required to, implement default methods already implemented in the interface. The class inherits the default implementation.
-   If a class implements multiple interfaces that have the same default method, then the class must implement a method with the same signature itself. The situation is similar if one interface has a default method, and in another the same method is abstract - no default implementation is inherited by the class.
-   A default method cannot override a class method`java.lang.Object`.
-   They help implement interfaces without fear of disrupting the work of other classes.
-   They allow you to avoid creating utility classes, since all the necessary methods can be represented in the interfaces themselves.
-   Give classes freedom to choose the method they want to override.
-   One of the main reasons for introducing default methods is the ability of collections in Java 8 to use lambda expressions.

[to contents](#java-8)

## How to call`default`interface method in the class that implements this interface?

Using keyword`super`along with the interface name:

```java
interface Paper {
    default void show() {
        System.out.println("default show()");
    }
}

class Licence implements Paper {
    public void show() {
        Paper.super.show();
    }
}
```

[to contents](#java-8)

## What's happened`static`interface method?

Static interface methods are similar to default methods, except that they cannot be overridden by classes that implement the interface.

-   Static methods in an interface are part of the interface without the ability to override them for objects of the implementing class;
-   Class Methods`java.lang.Object`cannot be overridden as static;
-   Static methods in an interface are used to provide utility methods such as checking for null, sorting collections, etc.

[to contents](#java-8)

## How to call`static`interface method?

Using the interface name:

```java
interface Paper {
    static void show() {
        System.out.println("static show()");
    }
}

class Licence {
    public void showPaper() {
        Paper.show();
    }
}
```

[to contents](#java-8)

## What's happened`Optional`?

Optional value`Optional`is a container for an object that may or may not contain a value`null`. This wrapper is a convenient means of preventing`NullPointerException`, because
has some higher order functions that eliminate the need to add duplicates`if null/notNull`checks:

```java
Optional<String> optional = Optional.of("hello");

optional.isPresent(); // true
optional.ifPresent(s -> System.out.println(s.length())); // 5
optional.get(); // "hello"
optional.orElse("ops..."); // "hello"
```

[to contents](#java-8)

## What's happened`Stream`?

Interface`java.util.Stream`is a sequence of elements on which various operations can be performed.

Operations on streams can be either_intermediate_or_terminal_. Final operations return a result of a certain type, and intermediate operations return the same stream. This way you can build chains of several operations on the same stream.

A stream can have any number of calls to intermediate operations and the last call to the final operation. In this case, all intermediate operations are performed lazily and until the final operation is called, no action actually occurs (similar to the creation of an object`Thread`or`Runnable`, no call`start()`).

Streams are created based on some sources, for example classes from`java.util.Collection`.

Associative arrays (maps), for example,`HashMap`, are not supported.

Operations on streams can be performed either sequentially or in parallel.

Streams cannot be reused. As soon as any final operation has been called, the stream is closed.

In addition to universal object streams, there are special types of streams for working with primitive data types`int`,`long`And`double`:`IntStream`,`LongStream`And`DoubleStream`. These primitive streams work in the same way as regular object streams, but with the following differences:

-   use specialized lambda expressions, for example,`IntFunction`or`IntPredicate`instead of`Function`And`Predicate`;
-   support additional end operations`sum()`,`average()`,`mapToObj()`.

[to contents](#java-8)

## What are the different ways to create a stream?

1.  From the collection:

```java
Stream<String> fromCollection = Arrays.asList("x", "y", "z").stream();
```

2.  From the value set:

```java
Stream<String> fromValues = Stream.of("x", "y", "z");
```

3.  From the array:

```java
Stream<String> fromArray = Arrays.stream(new String[]{"x", "y", "z"});
```

4.  From a file (each line in the file will be a separate element in the stream):

```java
Stream<String> fromFile = Files.lines(Paths.get("input.txt"));
```

5.  From the line:

```java
IntStream fromString = "0123456789".chars();
```

6.  By using`Stream.builder()`:

```java
Stream<String> fromBuilder = Stream.builder().add("z").add("y").add("z").build();
```

7.  By using`Stream.iterate()`(endless):

```java
Stream<Integer> fromIterate = Stream.iterate(1, n -> n + 1);
```

8.  By using`Stream.generate()`(endless):

```java
Stream<String> fromGenerate = Stream.generate(() -> "0");
```

[to contents](#java-8)

## What is the difference between`Collection`And`Stream`?

Collections allow you to work with elements individually, while streams do not allow you to do this, but instead provide the ability to perform functions on the data as a whole.

It is also worth noting the importance of the concept of entities itself:`Collection`- this is primarily an embodiment_Data Structures_. For example,`Set`not only stores elements, it implements the idea of ​​a set with unique elements,
while`Stream`, this is primarily an abstraction necessary for implementation_calculation pipeline_, in fact, therefore, the result of the work of the conveyor is one or another_Data Structures_or the results of checks/searches, etc.

[to contents](#java-8)

## What is the method for?`collect()`in restraints?

Method`collect()`is a final operation that is used to represent the result as a collection or some other data structure.

`collect()`accepts entry`Collector<Тип_источника, Тип_аккумулятора, Тип_результата>`, which contains four stages:_supplier_- battery initialization,_accumulator_- processing of each element,_combiner_- connection of two batteries in parallel execution,_[finisher]_- optional method of final battery processing. In Java 8 in a class`Collectors`Several common collectors have been implemented:

-   `toList()`,`toCollection()`,`toSet()`- present the stream as a list, collection or set;
-   `toConcurrentMap()`,`toMap()`- allow you to convert the stream to`Map`;
-   `averagingInt()`,`averagingDouble()`,`averagingLong()`- return the average value;
-   `summingInt()`,`summingDouble()`,`summingLong()`- returns the amount;
-   `summarizingInt()`,`summarizingDouble()`,`summarizingLong()`- return`SummaryStatistics`with different aggregate values;
-   `partitioningBy()`- divides the collection into two parts according to the condition and returns them as`Map<Boolean, List>`;
-   `groupingBy()`- splits the collection into several parts and returns`Map<N, List<T>>`;
-   `mapping()`- additional value conversions for complex`Collector`-ov.

It is also possible to create your own collector via`Collector.of()`:

```java
Collector<String, List<String>, List<String>> toList = Collector.of(
    ArrayList::new,
    List::add,
    (l1, l2) -> { l1.addAll(l2); return l1; }
);
```

[to contents](#java-8)

## Why are methods used in streams?`forEach()`And`forEachOrdered()`?

-   `forEach()`applies a function to each stream object, order is not guaranteed during parallel execution;
-   `forEachOrdered()`applies the function to each stream object while preserving the order of the elements.

[to contents](#java-8)

## What are the methods used in streams?`map()`And`mapToInt()`,`mapToDouble()`,`mapToLong()`?

Method`map()`is an intermediate operation that transforms each element of the stream in a given way.

`mapToInt()`,`mapToDouble()`,`mapToLong()`- analogues`map()`, returning the corresponding numeric stream (that is, a stream of numeric primitives):

```java
Stream
    .of("12", "22", "4", "444", "123")
    .mapToInt(Integer::parseInt)
    .toArray(); //[12, 22, 4, 444, 123]
```

[to contents](#java-8)

## What is the purpose of the method`filter()`in restraints?

Method`filter()`is an intermediate operation that accepts a predicate that filters all elements, returning only those that match the condition.

[to contents](#java-8)

## What is the method used for in streams?`limit()`?

Method`limit()`is an intermediate operation that allows you to limit the selection to a certain number of first elements.

[to contents](#java-8)

## What is the method used for in streams?`sorted()`?

Method`sorted()`is an intermediate operation that allows you to sort values ​​either in natural order or by specifying`Comparator`.

The order of elements in the original collection remains intact -`sorted()`it just creates a sorted representation of it.

[to contents](#java-8)

## What are the methods used in streams?`flatMap()`,`flatMapToInt()`,`flatMapToDouble()`,`flatMapToLong()`?

Method`flatMap()`similar to map, but can create several elements from one element. So each object will be converted to zero, one or more other objects backed by the thread.  The most obvious use of this operation is to transform container elements using functions that return containers.

```java
Stream
    .of("H e l l o", "w o r l d !")
    .flatMap((p) -> Arrays.stream(p.split(" ")))
    .toArray(String[]::new);//["H", "e", "l", "l", "o", "w", "o", "r", "l", "d", "!"]
```

`flatMapToInt()`,`flatMapToDouble()`,`flatMapToLong()`- these are analogues`flatMap()`, returning the corresponding numeric stream.

[to contents](#java-8)

## Explain about parallel processing in Java 8.

Streams can be sequential or parallel. Operations on sequential streams are performed in one processor thread, while operations on parallel streams are performed using several processor threads. Parallel streams use a common`ForkJoinPool`accessible via static`ForkJoinPool.commonPool()`method. Moreover, if the environment is not multi-core, then the thread will be executed as sequential. In fact, the use of parallel streams comes down to the fact that the data in the streams will be divided into parts, each part is processed on a separate processor core, and at the end these parts are connected, and final operations are performed on them.

You can also use the method to create a parallel stream from a collection`parallelStream()`interface`Collection`.

To make a regular sequential stream parallel, you need to call the object`Stream`method`parallel()`. Method`isParallel()`allows you to find out whether the stream is parallel.

Using methods`parallel()`And`sequential()`you can determine which operations can be parallel and which only sequential. You can also make a parallel stream from any sequential stream and vice versa:

```java
collection
.stream()
.peek(...) // операция последовательна
.parallel()
.map(...) // операция может выполняться параллельно,
.sequential()
.reduce(...) // операция снова последовательна 
```

Typically, elements are sent to the stream in the same order in which they are defined in the data source. When working with parallel streams, the system maintains the order of elements. The exception is the method`forEach()`, which can output elements in any order. And in order to maintain the order, it is necessary to use the method`forEachOrdered()`.

Criteria that can affect performance in parallel streams:

-   Data size - the larger the data, the more difficult it is to first separate the data and then join it.
-   Number of processor cores. Theoretically, the more cores a computer has, the faster the program will run. If the machine has one core, there is no point in using parallel threads.
-   The simpler the data structure that a thread operates on, the faster the operations will occur. For example, data from`ArrayList`easy to use because the structure of this collection assumes a sequence of unrelated data. And here is a collection like`LinkedList`- not the best option, since in a sequential list all elements are related to previous/following ones. And such data is difficult to parallelize.
-   Operations on data of primitive types will be performed faster than on objects of classes.
-   It is highly not recommended to use parallel streams for any long operations (for example, network connections), since all parallel streams work with one ForkJoinPool, then such long operations can stop the work of all parallel streams in the JVM due to the lack of available threads in the pool, i.e. parallel streams should be used only for short operations where the count is in milliseconds, but not for those where the count can be in seconds and minutes;
-   Preserving order in parallel streams increases execution costs, and if the order is not important, then it is possible to disable its preservation and thereby increase performance by using an intermediate operation`unordered()`:

```java
collection.parallelStream()
    .sorted()
    .unordered()
    .collect(Collectors.toList());
```

[to contents](#java-8)

## What ultimate methods of working with streams do you know?

-   `findFirst()`returns the first element;
-   `findAny()`returns any matching element;
-   `collect()`presenting results in the form of collections and other data structures;
-   `count()`returns the number of elements;
-   `anyMatch()`returns`true`, if the condition is satisfied for at least one element;
-   `noneMatch()`returns`true`, if the condition is not satisfied for any element;
-   `allMatch()`returns`true`, if the condition is satisfied for all elements;
-   `min()`returns the minimum element using as a condition`Comparator`;
-   `max()`returns the maximum element using as a condition`Comparator`;
-   `forEach()`applies a function to each object (order is not guaranteed when executed in parallel);
-   `forEachOrdered()`applies a function to each object while preserving the order of the elements;
-   `toArray()`returns an array of values;
-   `reduce()`allows you to execute aggregate functions and return a single result.

For numerical streams the following are additionally available:

-   `sum()`returns the sum of all numbers;
-   `average()`returns the arithmetic mean of all numbers.

[to contents](#java-8)

## What intermediate methods of working with streams do you know?

-   `filter()`filters records, returning only records that match a condition;
-   `skip()`allows you to skip a certain number of elements at the beginning;
-   `distinct()`returns a stream without duplicates (for the method`equals()`);
-   `map()`transforms each element;
-   `peek()`returns the same stream, applying a function to each element;
-   `limit()`allows you to limit the selection to a certain number of first elements;
-   `sorted()`allows you to sort values ​​either in natural order or by specifying`Comparator`;
-   `mapToInt()`,`mapToDouble()`,`mapToLong()`- analogues`map()`returning a stream of numeric primitives;
-   `flatMap()`,`flatMapToInt()`,`flatMapToDouble()`,`flatMapToLong()`- similar to`map()`, but can create several from one element.

An additional method is available for numerical streams`mapToObj()`, which converts a numeric stream back to an object stream.

[to contents](#java-8)

## How to display 10 random numbers using`forEach()`?

```java
(new Random())
    .ints()
    .limit(10)
    .forEach(System.out::println);
```

[to contents](#java-8)

## How can you display unique squares of numbers using the method`map()`?

```java
Stream
    .of(1, 2, 3, 2, 1)
    .map(s -> s * s)
    .distinct()
    .forEach(System.out::println);
```

[to contents](#java-8)

## How to display the number of empty lines using the method`filter()`?

```java
System.out.println(
    Stream
        .of("Hello", "", ", ", "world", "!")
        .filter(String::isEmpty)
        .count());
```

[to contents](#java-8)

## How to display 10 random numbers in ascending order?

```java
(new Random())
    .ints()
    .limit(10)
    .sorted()
    .forEach(System.out::println);
```

[to contents](#java-8)

## How to find the maximum number in a set?

```java
Stream
    .of(5, 3, 4, 55, 2)
    .mapToInt(a -> a)
    .max()
    .getAsInt(); //55
```

[to contents](#java-8)

## How to find the minimum number in a set?

```java
Stream
    .of(5, 3, 4, 55, 2)
    .mapToInt(a -> a)
    .min()
    .getAsInt(); //2
```

[to contents](#java-8)

## How to get the sum of all numbers in a set?

```java
Stream
    .of(5, 3, 4, 55, 2)
    .mapToInt()
    .sum(); //69
```

[to contents](#java-8)

## How to get the average of all numbers?

```java
Stream
    .of(5, 3, 4, 55, 2)
    .mapToInt(a -> a)
    .average()
    .getAsDouble(); //13.8
```

[to contents](#java-8)

## What additional methods for working with associative arrays (maps) appeared in Java 8?

-   `putIfAbsent()`adds a key-value pair only if the key was missing:

`map.putIfAbsent("a", "Aa");`

-   `forEach()`takes a function that performs an operation on each element:

`map.forEach((k, v) -> System.out.println(v));`

-   `compute()`creates or updates the current value with the one obtained as a result of the calculation (it is possible to use a key and the current value):

`map.compute("a", (k, v) -> String.valueOf(k).concat(v)); //["a", "aAa"]`

-   `computeIfPresent()`if the key exists, updates the current value to the one obtained as a result of the calculation (it is possible to use the key and the current value):

`map.computeIfPresent("a", (k, v) -> k.concat(v));`

-   `computeIfAbsent()`if the key is missing, creates it with a value that is calculated (it is possible to use the key):

`map.computeIfAbsent("a", k -> "A".concat(k)); //["a","Aa"]`

-   `getOrDefault()`if the key is missing, it returns the passed value by default:

`map.getOrDefault("a", "not found");`

-   `merge()`takes a key, a value, and a function that combines the passed value and the current value. If there is no value under the given key, it writes the passed value there.

`map.merge("a", "z", (value, newValue) -> value.concat(newValue)); //["a","Aaz"]`

[to contents](#java-8)

## What's happened`LocalDateTime`?

`LocalDateTime`brings together`LocaleDate`And`LocalTime`, contains the date and time in the ISO-8601 calendar system without reference to a time zone. Time is stored with nanosecond accuracy. Contains many convenient methods such as plusMinutes, plusHours, isAfter, toSecondOfDay, etc.

[to contents](#java-8)

## What's happened`ZonedDateTime`?

`java.time.ZonedDateTime`- analog`java.util.Calendar`, the class with the most comprehensive time context information in the ISO-8601 calendar system. Includes a time zone, so this class carries out all operations with time shifts taking it into account.

[to contents](#java-8)

## How to get current date using Date Time API from Java 8?

```java
LocalDate.now();
```

[to contents](#java-8)

## How to add 1 week, 1 month, 1 year, 10 years to current date using Date Time API?

```java
LocalDate.now().plusWeeks(1);
LocalDate.now().plusMonths(1);
LocalDate.now().plusYears(1);
LocalDate.now().plus(1, ChronoUnit.DECADES);
```

[to contents](#java-8)

## How to get next Tuesday using Date Time API?

```java
LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
```

[to contents](#java-8)

## How to get the second Saturday of the current month using the Date Time API?

```java
LocalDate
    .of(LocalDate.now().getYear(), LocalDate.now().getMonth(), 1)
    .with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY))
    .with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
```

[to contents](#java-8)

## How to get the current time accurate to milliseconds using the Date Time API?

```java
new Date().toInstant();
```

[to contents](#java-8)

## How to get the current local time accurate to milliseconds using the Date Time API?

```java
LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault());
```

[to contents](#java-8)

## How to define a repeatable annotation?

To define a repeatable annotation, you must create a container annotation for the list of repeatable annotations and identify the repeatable annotation with a meta annotation`@Repeatable`:

```java
@interface Schedulers
{
    Scheduler[] value();
}

@Repeatable(Schedulers.class)
@interface Scheduler
{
    String birthday() default "Jan 8 1935";
}
```

[to contents](#java-8)

## What's happened`Nashorn`?

**rhino**is a JavaScript engine developed in Java by Oracle. Designed to provide the ability to embed JavaScript code in Java applications. Compared to_Rhino_, which is supported by the Mozilla Foundation, Nashorn provides 2 to 10 times faster performance because it compiles code and feeds the bytecode to the Java virtual machine directly in memory. Nashorn can compile JavaScript code and generate Java classes that are loaded with a special loader. It is also possible to call Java code directly from JavaScript.

[to contents](#java-8)

## What's happened`jjs`?

`jjs`is a command line utility that allows you to run JavaScript programs directly from the console.

[to contents](#java-8)

## What class appeared in Java 8 for encoding/decoding data?

`Base64`is a thread-safe class that implements a data encoder and decoder using the base64 encoding scheme according to_RFC 4648_And_RFC 2045_.

Base64 contains 6 main methods:

`getEncoder()`/`getDecoder()`- returns a base64 encoder/decoder that conforms to the standard_RFC 4648_;`getUrlEncoder()`/`getUrlDecoder()`- returns a URL-safe base64 encoder/decoder that complies with the standard_RFC 4648_;`getMimeEncoder()`/`getMimeDecoder()`- returns a MIME encoder/decoder that conforms to the standard_RFC 2045_.

[to contents](#java-8)

## How to create a Base64 encoder and decoder?

```java
// Encode
String b64 = Base64.getEncoder().encodeToString("input".getBytes("utf-8")); //aW5wdXQ==
// Decode
new String(Base64.getDecoder().decode("aW5wdXQ=="), "utf-8"); //input
```

[to contents](#java-8)

# Sources

-   [Habrahabr - New in Java 8](https://habrahabr.ru/post/216431/)
-   [Habrahabr - Java programmer's cheat sheet 4. Java Stream API](https://habrahabr.ru/company/luxoft/blog/270383/)
-   [METANIT.COM](http://metanit.com/java/tutorial/9.1.php)
-   [javadevblog.com](http://javadevblog.com/interfejsy-v-java-8-staticheskie-metody-metody-po-umolchaniyu-funktsional-ny-e-interfejsy.html)

[Interview Questions](README.md)
