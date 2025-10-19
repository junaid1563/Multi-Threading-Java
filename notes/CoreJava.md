
[Interview Questions](README.md)

# Java Core

- [What is the difference between JRE, JVM and JDK?](#what-is-the-difference-between-jre-jvm-and-jdk)
- [What access modifiers are there?](#what-access-modifiers-are-there)
 - [What does the keyword mean? `final`?](#what-does-the-keyword-meanfinal)
 - [What values are default variables initialized to?](#what-values-%E2%80%8B%E2%80%8Bare-default-variables-initialized-to)
 - [What do you know about the function `main()`?](#what-do-you-know-about-the-functionmain)
- [What logical operations and operators do you know?](#what-logical-operations-and-operators-do-you-know)
- [What is the ternary select operator?](#what-is-the-ternary-select-operator)
- [What bitwise operations do you know?](#what-bitwise-operations-do-you-know)
- [Where and for what is the modifier used? `abstract`?](#where-and-for-what-is-the-modifier-usedabstract)
- [Define the concept "interface". What default modifiers do fields and interface methods have?](#define-the-concept_interface_-what-default-modifiers-do-fields-and-interface-methods-have)
- [How is an abstract class different from an interface? When should you use an abstract class and when should you use an interface?](#how-is-an-abstract-class-different-from-an-interface-when-should-you-use-an-abstract-class-and-when-should-you-use-an-interface)
- [Why do some interfaces not define methods at all?](#why-do-some-interfaces-not-define-methods-at-all)
- [Why can't you declare an interface method with a modifier? `final`?](#why-cant-you-declare-an-interface-method-with-a-modifierfinal)
- [Which has a higher level of abstraction - Class, abstract class or interface?](#which-has-a-higher-level-of-abstraction---class_abstract-class_or_interface_)
- [Can an object access a member of a class declared as `private`? If yes, then how?](#can-an-object-access-a-member-of-a-class-declared-asprivate-if-yes-then-how)
- [What is the order in which constructors and initialization blocks are called, taking into account the class hierarchy?](#what-is-the-order-in-which-constructors-and-initialization-blocks-are-called-taking-into-account-the-class-hierarchy)
- [Why are initialization blocks needed and what are they?](#why-are-initialization-blocks-needed-and-what-are-they)
- [Which Java constructs can the modifier apply to? `static`?](#which-java-constructs-can-the-modifier-apply-tostatic)
- [Why are static initialization blocks used in Java?](#why-are-static-initialization-blocks-used-in-java)
- [What happens if an exception occurs in the initialization block?](#what-happens-if-an-exception-occurs-in-the-initialization-block)
- [What exception is thrown when an error occurs in a class initialization block?](#what-exception-is-thrown-when-an-error-occurs-in-a-class-initialization-block)
- [Can a static method be overridden or overloaded?](#can-a-static-method-be-overridden-or-overloaded)
- [Can non-static methods overload static ones?](#can-non-static-methods-overload-static-ones)
- [Is it possible to narrow the access level/return type when overriding a method?](#is-it-possible-to-narrow-the-access-levelreturn-type-when-overriding-a-method)
- [When overriding a method, is it possible to change: the access modifier, the return type, the type of the argument or their number, the names of the arguments or their order; remove, add, change the order of section elements `throws`?](#when-overriding-a-method-is-it-possible-to-change-the-access-modifier-the-return-type-the-type-of-the-argument-or-their-number-the-names-of-the-arguments-or-their-order-remove-add-change-the-order-of-section-elementsthrows)
- [How to access overridden methods of a parent class?](#how-to-access-overridden-methods-of-a-parent-class)
- [Is it possible to declare a method abstract and static at the same time?](#is-it-possible-to-declare-a-method-abstract-and-static-at-the-same-time)
- [What is the difference between a class instance member and a static class member?](#what-is-the-difference-between-a-class-instance-member-and-a-static-class-member)
- [Where is initialization of static/non-static fields allowed?](#where-is-initialization-of-staticnon-static-fields-allowed)
- [What types of classes are there in java?](#what-types-of-classes-are-there-in-java)
- [Tell us about nested classes. In what cases are they used?](#tell-us-about-nested-classes-in-what-cases-are-they-used)
- [What's happened "static class"?](#whats-happened_static-class_)
- [What are the features of using nested classes: static and internal? What is the difference between them?](#what-are-the-features-of-using-nested-classes-static-and-internal-what-is-the-difference-between-them)
- [What's happened "local class"? What are its features?](#whats-happened_local-class_-what-are-its-features)
- [What's happened "anonymous classes"? Where are they used?](#whats-happened_anonymous-classes_-where-are-they-used)
- [How can I access a field in an outer class from a nested class?](#how-can-i-access-a-field-in-an-outer-class-from-a-nested-class)
- [What is the operator used for? `assert`?](#what-is-the-operator-used-forassert)
- [What's happened Heap And Stack memory in Java? What's the difference between them?](#whats-happened_heap_and_stack_memory-in-java-whats-the-difference-between-them)
- [Is it true that primitive data types are always stored on the stack, and instances of reference data types are always stored on the heap?](#is-it-true-that-primitive-data-types-are-always-stored-on-the-stack-and-instances-of-reference-data-types-are-always-stored-on-the-heap)
- [How are variables passed to methods, by value or by reference?](#how-are-variables-passed-to-methods-by-value-or-by-reference)
- [What is a garbage collector for?](#what-is-a-garbage-collector-for)
- [How does the garbage collector work?](#how-does-the-garbage-collector-work)
- [What types of garbage collectors are implemented in the HotSpot virtual machine?](#what-types-of-garbage-collectors-are-implemented-in-the-hotspot-virtual-machine)
- [Describe the algorithm of operation of a garbage collector implemented in the HotSpot virtual machine.](#describe-the-algorithm-of-operation-of-a-garbage-collector-implemented-in-the-hotspot-virtual-machine)
- [What is a "string pool"?](#what-is-a-string-pool)
- [What's happened `finalize()`? Why is it needed?](#whats-happenedfinalize-why-is-it-needed)
- [What happens to the garbage collector if the method is executed `finalize()` does it take a noticeably long time, or will an exception be thrown during execution?](#what-happens-to-the-garbage-collector-if-the-method-is-executedfinalize-does-it-take-a-noticeably-long-time-or-will-an-exception-be-thrown-during-execution)
- [How are they different? `final`, `finally` And `finalize()`?](#how-are-they-different-final-finally-and-finalize)
- [Tell us about type casting. What is type demotion and promotion?](#tell-us-about-type-casting-what-is-type-demotion-and-promotion)
- [When an application might throw an exception `ClassCastException`?](#when-an-application-might-throw-an-exceptionclasscastexception)
- [What are literals?](#what-are-literals)
- [What's happened autoboxing in Java and what are the rules for packing primitive types into wrapper classes?](#whats-happened_autoboxing_in-java-and-what-are-the-rules-for-packing-primitive-types-into-wrapper-classes)
- [What are the features of the class? `String`?](#what-are-the-features-of-the-classstring)
- [Why `String` immutable and finalized class?](#why-string-immutable-and-finalized-class)
- [Why `char[]` preferable `String` to store the password?](#why-char-preferable-string-to-store-the-password)
- [Why is string a popular key in `HashMap` in Java?](#why-is-string-a-popular-key-in-hashmap-in-java)
- [What does the method do? `intern()` in class `String`?.](#what-does-the-method-dointernin-classstring)
- [Is it possible to use strings in a design `switch`?](#is-it-possible-to-use-strings-in-a-designswitch)
- [What is the main difference between `String`, `StringBuffer`, `StringBuilder`?](#what-is-the-main-difference-between-stringstringbufferstringbuilder)
- [What is a class `Object`? What methods does it have?](#what-is-a-class-object-what-methods-does-it-have)
- [Define the concept of “constructor”.](#define-the-concept-of-constructor)
- [What's happened "default constructor"?](#whats-happened_default-constructor_)
- [What is the difference between a default constructor, a copy constructor, and a constructor with parameters?](#what-is-the-difference-between-a-default-constructor-a-copy-constructor-and-a-constructor-with-parameters)
- [Where and how can you use a private constructor?](#where-and-how-can-you-use-a-private-constructor)
- [Tell us about loader classes and dynamic class loading.](#tell-us-about-loader-classes-and-dynamic-class-loading)
- [What's happened Reflection?](#whats-happened_reflection_)
- [Why is it needed? `equals()`. How is it different from surgery? `==`?](#why-is-it-neededequals-how-is-it-different-from-surgery)
- [If you want to override `equals()`, what conditions must be met?](#if-you-want-to-override-equals-what-conditions-must-be-met)
- [What properties does the generated `equals()` equivalence relation?](#what-properties-does-the-generated-equals-equivalence-relation)
- [Method overriding rules `Object.equals()`.](#method-overriding-rules-objectequals)
- [What is the connection between `hashCode()` And `equals()`?](#what-is-the-connection-between-hashcode-and-equals)
- [If `equals()` overridden, are there any other methods that should be overridden?](#if-equals-overridden-are-there-any-other-methods-that-should-be-overridden)
- [What happens if you override `equals()` without overriding `hashCode()`? What problems might arise?](#what-happens-if-you-override-equals-without-overriding-hashcode-what-problems-might-arise)
- [How are the methods implemented? `hashCode()` And `equals()` in class `Object`?](#how-are-the-methods-implemented-hashcode-and-equals-in-classobject)
- [What is the method for? `hashCode()`?](#what-is-the-method-for-hashcode)
- [What are the rules for method overriding `Object.hashCode()`?](#what-are-the-rules-for-method-overriding-objecthashcode)
- [Are there any guidelines on what fields should be used when counting `hashCode()`?](#are-there-any-guidelines-on-what-fields-should-be-used-when-counting-hashcode)
- [Can different objects have the same `hashCode()`?](#can-different-objects-have-the-same-hashcode)
- [If the class `Point{int x, y;}` implement the method `equals(Object that) {(return this.x == that.x && this.y == that.y)}`, but make the hash code in the form `int hashCode() {return x;}`, then will such points be correctly placed and extracted from `HashSet`?](#if-the-class-pointint-x-y-implement-the-method-equalsobject-that-return-thisx--thatx--thisy--thaty-but-make-the-hash-code-in-the-form-int-hashcode-return-x-then-will-such-points-be-correctly-placed-and-extracted-from-hashset)
- [Can different objects `(ref0 != ref1)` be `ref0.equals(ref1) == true`?](#can-different-objects-ref0--ref1-be-ref0equalsref1--true)
- [Can different references to the same object `(ref0 == ref1)` be `ref0.equals(ref1) == false`?](#can-different-references-to-the-same-object-ref0--ref1-be-ref0equalsref1--false)
- [Is it possible to implement the method like this? `equals(Object that) {return this.hashCode() == that.hashCode()}`?](#is-it-possible-to-implement-the-method-like-this-equalsobject-that-return-thishashcode--thathashcode)
- [IN `equals()` you need to check that the argument `equals(Object that)` the same type as the object itself. What is the difference between `this.getClass() == that.getClass()` And `that instanceof MyClass`?](#in-equals-you-need-to-check-that-the-argument-equalsobject-that-the-same-type-as-the-object-itself-what-is-the-difference-between-thisgetclass--thatgetclass-and-that-instanceof-myclass)
- [Is it possible to implement the method `equals()` class `MyClass` like this: `class MyClass {public boolean equals(MyClass that) {return this == that;}}`?](#is-it-possible-to-implement-the-method-equals-class-myclass-like-this-class-myclass-public-boolean-equalsmyclass-that-return-this--that)
- [There is a class `Point{int x, y;}`. Why hash code in the form `31 * x + y` preferable to `x + y`?](#there-is-a-class-pointint-x-y-why-hash-code-in-the-form-31--x--y-preferable-to-x--y)
- [Tell us about cloning objects.](#tell-us-about-cloning-objects)
- [What is the difference between superficial And deep cloning?](#what-is-the-difference-between_superficial_and_deep_cloning)
- [Which cloning method is preferable?](#which-cloning-method-is-preferable)
- [Why method `clone()` declared in class `Object`, not in the interface `Cloneable`?](#why-method-clone-declared-in-class-object-not-in-the-interface-cloneable)
- [Describe the hierarchy of exceptions.](#describe-the-hierarchy-of-exceptions)
- [What types of exceptions in Java do you know, how do they differ?](#what-types-of-exceptions-in-java-do-you-know-how-do-they-differ)
- [What's happened checked And unchecked exception?](#whats-happened_checked_and_unchecked-exception_)
- [Which operator allows you to force an exception to be thrown?](#which-operator-allows-you-to-force-an-exception-to-be-thrown)
- [What does the keyword mean? `throws`?](#what-does-the-keyword-meanthrows)
- [How to write your own ("custom") exception?](#how-to-write-your-own-custom-exception)
- [Which ones exist? unchecked exception?](#which-ones-exist_unchecked-exception_)
- [What are class errors? `Error`?](#what-are-class-errors-error)
- [What do you know about `OutOfMemoryError`?](#what-do-you-know-about-outofmemoryerror)
- [Describe the operation of the block try-catch-finally.](#describe-the-operation-of-the-block_try-catch-finally_)
- [What is mechanism try-with-resources?](#what-is-mechanism_try-with-resources_)
- [Is it possible to use a block try-finally (without `catch`)?](#is-it-possible-to-use-a-block_try-finally-withoutcatch)
- [Can one block `catch` catch multiple exceptions at once?](#can-one-block-catch-catch-multiple-exceptions-at-once)
- [Is the block always executed? `finally`?](#is-the-block-always-executed-finally)
- [Are there situations where a block `finally` will not be fulfilled?](#are-there-situations-where-a-block-finally-will-not-be-fulfilled)
- [Can the method main() throw an exception externally and if so, where will this exception be processed?](#can-the-method_main_throw-an-exception-externally-and-if-so-where-will-this-exception-be-processed)
- [Suppose there is a method that can throw `IOException` And `FileNotFoundException` in what order should the blocks go? `catch`? How many blocks `catch` will it be done?](#suppose-there-is-a-method-that-can-throwioexception-andfilenotfoundexception-in-what-order-should-the-blocks-gocatch-how-many-blockscatch-will-it-be-done)
- [What's happened generics?](#whats-happened_generics_)
- [What's happened "internationalization", "localization"?](#whats-happened_internationalization_localization_)

## What is the difference between JRE, JVM and JDK?

**JVM**,The Java Virtual Machine is the core part of the Java ,Runtime Environment (JRE). The Java Virtual Machine executes Java bytecode that is pre-generated from the source code of a Java program by the Java compiler. The JVM can also be used to run programs written in other programming languages.

**JRE**,Java Runtime Environment is the minimum required virtual machine ,implementation for running Java applications. Consists of a JVM and a standard set of Java class libraries.

**JDK**, Java Development Kit (Java Development Kit) - JRE and a set of tools for application developer in the Java language, including a Java compiler, standard Java class libraries, examples, documentation, various utilities.

Short:**JDK**- an environment for developing programs in Java, including**JRE**- an environment for running Java programs, which in turn contains**JVM**- Java program code interpreter.

[to contents](#java-core)

## What access modifiers are there?

**private**(private): Class members are only accessible within the class. A service word is used to indicate`private`.

**default**, package-private, package level: Visibility of the class/class members only within the package. Is the default access modifier - special 
no designation required.

**protected**(protected): class members are accessible within the package and in descendants. A service word is used to indicate`protected`.

**public**(public): The class/class members are accessible to everyone. A service word is used to indicate`public`.

Sequence of modifiers in increasing order of privacy level: public, protected, default, private.

During inheritance, it is possible to change access modifiers towards greater visibility (to maintain compliance_Barbara Liskov's substitution principle_).

[to contents](#java-core)

## What does the keyword mean?`final`?

Modifier`final`can be applied to variables, method parameters, class fields and methods, or classes themselves.

-   A class cannot have heirs;
-   The method cannot be overridden in descendant classes;
-   A field cannot change its value after initialization;
-   Method parameters cannot change their value within the method;
-   Local variables cannot be modified once they have been assigned a value.

[to contents](#java-core)

## What values ​​are default variables initialized to?

-   `byte`—`(byte)0`;
-   `short`—`(short)0`;
-   `int`—`0`;
-   `long`—`0L`;
-   `floatg`—`0f`;
-   `double`—`0d`;
-   `char`—`\u0000`;
-   `boolean`—`false`;
-   Objects (including`String`) —`null`.

[to contents](#java-core)

## What do you know about the function`main()`?

Method`main()`— entry point into the program. An application may have several such methods. If the method is missing, compilation is possible, but an error will be received when running_\`Error: Main method not found\`_.

```java
public static void main(String[] args) {}
```

[to contents](#java-core)

## What logical operations and operators do you know?

-   `&`: Boolean_AND_(AND);
-   `&&`: Abbreviated_AND_;
-   `|`: Boolean_OR_(OR);
-   `||`: Abbreviated_OR_;
-   `^`: Boolean_XOR_(exclusive_OR_(OR));
-   `!`: Logical unary_NOT_(NOT);
-   `&=`:_AND_with assignment;
-   `|=`:_OR_with assignment;
-   `^=`:_XOR_with assignment;
-   `==`: Equals;
-   `!=`: Not equal;
-   `?:`: Ternary (ternary) conditional operator.

[to contents](#java-core)

## What is the ternary select operator?

Ternary conditional operator`?:`- an operator that can replace some operator constructions`if-then-else`.

The expression is written in the following form:

> condition ? expression1 : expression2

If`условие`is executed, then it is calculated`выражение1`and its result becomes the result of executing the entire statement. If`условие`equals`false`, then it is calculated`выражение2`and its value becomes the result of the operator. Both operands`выражение1`And`выражение2`must return a value of the same (or compatible) type.

[to contents](#java-core)

## What bitwise operations do you know?

-   `~`: Bitwise unary operator NOT;
-   `&`: Bitwise AND;
-   `&=`: Bitwise AND with assignment;
-   `|`: Bitwise OR;
-   `|=`: Bitwise OR with assignment;
-   `^`: Bitwise exclusive XOR;
-   `^=`: Bitwise XOR with assignment;
-   `>>`: Shift right (divide by 2 in the degree of shift);
-   `>>=`: Right shift with assignment;
-   `>>>`: Shift right without taking into account sign;
-   `>>>=`: Right shift without taking into account sign with assignment;
-   `<<`: Shift left (multiply by 2 to the shift power);
-   `<<=`: Left shift with assignment.

[to contents](#java-core)

## Where and for what is the modifier used?`abstract`?

Class marked with modifier`abstract`, is called an abstract class. Such classes can only act as ancestors for other classes. You are not allowed to create instances of the abstract class itself. In this case, the heirs of an abstract class can be both other abstract classes and classes that allow the creation of objects.

Method marked with keyword`abstract`- abstract method, i.e. a method that has no implementation. If a class has at least one abstract method, then the entire class must be declared abstract.

The use of abstract classes and methods allows you to describe a certain object template that must be implemented in other classes. They themselves describe only a certain behavior common to all descendants.

[to contents](#java-core)

## Define the concept_"interface"_. What default modifiers do fields and interface methods have?

Keyword`interface`used to create completely abstract classes. The main purpose of an interface is to define how we can use the class that implements it. The interface creator defines method names, argument lists, and return types, but does not implement their behavior. All methods are implicitly declared as`public`.

Since Java 8, interfaces are allowed to have default method implementations`default`and static`static`methods.

The interface can also contain fields. In this case they are automatically public`public`, static`static`and immutable`final`.

[to contents](#java-core)

## How is an abstract class different from an interface? When should you use an abstract class and when should you use an interface?

-   In Java, a class can simultaneously implement several interfaces, but inherit from only one class.
-   Abstract classes are only used when the "is a" relationship type is present. Interfaces can be implemented by classes that are not related to each other.
-   An abstract class is a tool for avoiding writing repetitive code, a tool for partially implementing behavior. An interface is a means of expressing the semantics of a class, a contract that describes capabilities. All interface methods are implicitly declared as`public abstract`or (since Java 8)`default`- methods with default implementation, and fields -`public static final`.
-   Interfaces allow you to create type structures without hierarchy.
-   By inheriting from the abstract, the class “dissolves” its own individuality. By implementing the interface, it extends its own functionality.

Abstract classes contain a partial implementation that is complemented or extended by subclasses. Moreover, all subclasses are similar to each other in terms of implementation inherited from the abstract class, and differ only in terms of their own implementation of abstract methods of the parent. Therefore, abstract classes are used in the case of constructing a hierarchy of classes of the same type, very similar to each other. In this case, inheriting from an abstract class that implements the object's default behavior can be useful because it avoids writing duplicate code. In all other cases, it is better to use interfaces.

[to contents](#java-core)

## Why do some interfaces not define methods at all?

These are the so-called_marker interfaces_. They simply indicate that the class is of a certain type. An example would be the interface`Clonable`, which indicates that the class supports a cloning mechanism.

[to contents](#java-core)

## Why can't you declare an interface method with a modifier?`final`?

In the case of interfaces, specifying the modifier`final`meaningless, because All interface methods are implicitly declared as abstract, i.e. they cannot be executed without being implemented somewhere else, and this cannot be done if the method has an identifier`final`.

[to contents](#java-core)

## Which has a higher level of abstraction -_Class_,_abstract class_or_interface_?

Interface.

[to contents](#java-core)

## Can an object access a member of a class declared as`private`? If yes, then how?

-   Inside the class, access to a private variable is open without restrictions;
-   A nested class has full access to all (including private) members of the containing class;
-   Access to private variables from outside can be organized through methods other than private ones provided by the class developer. For example:`getX()`And`setX()`.
-   Through the reflection mechanism (Reflection API):

```java
class Victim { 
    private int field = 42;
}
//...
Victim victim = new Victim(); 
Field field = Victim.class.getDeclaredField("field"); 
field.setAccessible(true); 
int fieldValue = (int) field.get(victim);
//...
```

[to contents](#java-core)

## What is the order in which constructors and initialization blocks are called, taking into account the class hierarchy?

First, all static blocks are called in order from the first static block of the root ancestor and higher in the hierarchy chain to the static blocks of the class itself.

Then the non-static initialization blocks of the root ancestor, the constructor of the root ancestor are called, and so on, up to the non-static blocks and the constructor of the class itself.

> Parent static block(s) → Child static block(s) → Grandchild static block(s)
>
> → Parent non-static block(s) → Parent constructor →
>
> → Child non-static block(s) → Child constructor →
>
> → Grandchild non-static block(s) → Grandchild constructor

Example 1:

```java
public class MainClass {

    public static void main(String args[]) {
        System.out.println(TestClass.v);
        new TestClass().a();
    }

}
```

```java
public class TestClass {

    public static String v = "Some val";

    {
        System.out.println("!!! Non-static initializer");
    }

    static {
        System.out.println("!!! Static initializer");
    }

    public void a() {
        System.out.println("!!! a() called");
    }

}
```

Execution result:

    !!! Static initializer
    Some val
    !!! Non-static initializer
    !!! a() called

Example 2:

```java
public class MainClass {

    public static void main(String args[]) {        
        new TestClass().a();
    }

}
```

```java
public class TestClass {

    public static String v = "Some val";

    {
        System.out.println("!!! Non-static initializer");
    }

    static {
        System.out.println("!!! Static initializer");
    }

    public void a() {
        System.out.println("!!! a() called");
    }

}
```

Execution result:

    !!! Static initializer
    !!! Non-static initializer
    !!! a() called

[to contents](#java-core)

## Why are initialization blocks needed and what are they?

Initialization blocks are code enclosed in curly braces and placed inside a class outside of the declaration of methods or constructors.

-   There are static and non-static initialization blocks.
-   The initialization block is executed before the class is initialized by the class loader or the class object is created by the constructor.
-   Several initialization blocks are executed in the order they appear in the class code.
-   The initialization block is capable of throwing exceptions if their declarations are listed in`throws`all class constructors.
-   It is also possible to create an initialization block in an anonymous class.

[to contents](#java-core)

## Which Java constructs can the modifier apply to?`static`?

-   fields;
-   methods;
-   nested classes;
-   initialization blocks;
-   section members`import`.

[to contents](#java-core)

## Why are static initialization blocks used in Java?

Static initialization blocks are used to execute code that must be executed once when a class is initialized by the class loader, before objects of that class are created using the constructor. Such a block (unlike non-static ones that belong to a specific class object) belongs only to the class itself (metaclass object`Class`).

[to contents](#java-core)

## What happens if an exception occurs in the initialization block?

For non-static initialization blocks, if an exception is thrown explicitly, it is required that the declarations of those exceptions be listed in`throws`all class constructors. Otherwise there will be a compilation error. For a static block, throwing an exception explicitly results in a compilation error.

In other cases, interaction with exceptions will proceed in the same way as in any other place. The class will not be initialized if the error occurs in a static block and the class object will not be created if the error occurs in a non-static block.

[to contents](#java-core)

## What exception is thrown when an error occurs in a class initialization block?

If the exception raised is the heir`RuntimeException`:

-   for static initialization blocks will be thrown`java.lang.ExceptionInInitializerError`;
-   for non-static ones, the source exception will be thrown.

If the exception raised is the heir`Error`, then in both cases it will be thrown`java.lang.Error`. Exception:`java.lang.ThreadDeath`- death of the stream. In this case, no exception will be thrown.

[to contents](#java-core)

## Can a static method be overridden or overloaded?

Overloaded - yes. Everything works exactly the same as with regular methods - 2 static methods can have the same name if the number of their parameters or types is different.

Overridden - no. The choice of which static method to call occurs during early binding (at compilation, not runtime) and the parent method will always be executed, although syntactically overriding a static method is a completely correct language construct.

In general, it is recommended that static fields and methods be accessed through the class name rather than the object.

[to contents](#java-core)

## Can non-static methods overload static ones?

Yes. The end result is two different methods. A static one will belong to a class and will be accessible through its name, while a non-static one will belong to a specific object and will be accessible through a method call on that object.

[to contents](#java-core)

## Is it possible to narrow the access level/return type when overriding a method?

-   When overriding a method, you cannot narrow the access modifier to the method (for example, from public in MainClass to private in Class extends MainClass).
-   You cannot change the return type when overriding a method; an error will occur attempting to use incompatible return type.
-   You can narrow the return value if they are compatible.

For example:

```java
public class Animal {

    public Animal eat() {
        System.out.println("animal eat");
        return null;
    }
    
    public Long calc() {
        return null;
    }

}
public class Dog extends Animal {

    public Dog eat() {
        return new Dog();
    }
/*attempting to use incompatible return type
    public Integer calc() {
        return null;
    }
*/
}
```

## When overriding a method, is it possible to change: the access modifier, the return type, the type of the argument or their number, the names of the arguments or their order; remove, add, change the order of section elements`throws`?

When overriding a method, narrowing the access modifier is not allowed, because this would lead to a violation of Barbara Liskov's substitution principle. Expansion of the access level is possible.

You can change anything that does not prevent the compiler from understanding which method of the parent class is meant:

-   Changing the type of the return value when overriding a method is allowed only in the direction of narrowing the type (instead of the parent class - the successor).
-   When changing the type, number, or order of arguments, instead of redefining, there will be_overloading_(overloading) a method.
-   Section`throws`The method may not be specified, but it is worth remembering that it remains valid if it is already defined in a method of the parent class. It is also possible to add new exceptions that are heirs of already declared ones or exceptions`RuntimeException`. The order of such elements does not matter when redefining.

[to contents](#java-core)

## How to access overridden methods of a parent class?

Using a keyword`super`we can access any member of the parent class - a method or field, if they are not defined with a modifier`private`.

```java
super.method();
```

[to contents](#java-core)

## Is it possible to declare a method abstract and static at the same time?

No. In this case, the compiler will throw an error:_"Illegal combination of modifiers: ‘abstract’ and ‘static’"_. Modifier`abstract`says that the method will be implemented in another class, and`static`on the contrary, it indicates that this method will be accessible by class name.

[to contents](#java-core)

## What is the difference between a class instance member and a static class member?

Modifier`static`indicates that this method or field belongs to the class itself and can be accessed even without creating an instance of the class. Fields marked`static`are initialized when the class is initialized. On methods declared as`static`, a number of restrictions are imposed:

-   They can only call other static methods.
-   They should only access static variables.
-   They cannot refer to members of type`this`or`super`.

Unlike static fields, class instance fields belong to a specific object and can have different values ​​for each. Calling an instance method is possible only after first creating a class object.

Example:

```java
public class MainClass {

	public static void main(String args[]) {
		System.out.println(TestClass.v);
		new TestClass().a();
		System.out.println(TestClass.v);
	}

}
```

```java
public class TestClass {

	public static String v = "Initial val";

	{
		System.out.println("!!! Non-static initializer");
		v = "Val from non-static";
	}

	static {
		System.out.println("!!! Static initializer");
		v = "Some val";
	}

	public void a() {
		System.out.println("!!! a() called");
	}

}
```

Result:

```
!!! Static initializer
Some val
!!! Non-static initializer
!!! a() called
Val from non-static

```

[to contents](#java-core)

## Where is initialization of static/non-static fields allowed?

-   Static fields can be initialized at declaration, in a static or non-static initialization block.
-   Non-static fields can be initialized at declaration, in a non-static initialization block, or in the constructor.

[to contents](#java-core)

## What types of classes are there in java?

-   _Top level class_(Regular class):
    -   _Abstract class_(Abstract class);
    -   _Final class_(Finalized class).
-   _Interfaces_(Interface).
-   _Enum_(Enumeration).
-   _Nested class_(Nested class):
    -   _Static nested class_(Static nested class);
    -   _Member inner class_(Simple inner class);
    -   _Local inner class_(Local class);
    -   _Anonymous inner class_(Anonymous class).

[to contents](#java-core)

## Tell us about nested classes. In what cases are they used?

The class is called nested (_Nested class_) if it is defined inside another class. A nested class should only be created to serve its enclosing class. If a nested class is useful in some other context, it should become a top-level class. Nested classes have access to all (including private) fields and methods of the outer class, but not vice versa. Because of this permission, using nested classes results in some kind of encapsulation violation.

There are four categories of nested classes:

-   _Static nested class_(Static nested class);
-   _Member inner class_(Simple inner class);
-   _Local inner class_(Local class);
-   _Anonymous inner class_(Anonymous class).

Such categories of classes, with the exception of the first, are also called internal (_Inner class_). Inner classes are not associated with an outer class, but with an instance of the outer one.

Each category has recommendations for its use. If a nested class must be visible outside of a single method or is too long to fit comfortably within the boundaries of a single method, and if each instance of that class needs a reference to its enclosing instance, then a non-static inner class is used. If a reference to the framing class is not required, it is better to make such a class static. If a class is needed only inside a method and you want to create instances of this class only in this method, then a local class is used. And, if, moreover, the use of a class is limited to use in only one place and there is already a type that characterizes this class, then it is recommended to make it an anonymous class.

[to contents](#java-core)

## What's happened_"static class"_?

This is a nested class declared using the keyword`static`. Modifier for top-level classes`static`unapplied.

[to contents](#java-core)

## What are the features of using nested classes: static and internal? What is the difference between them?

-   Nested classes can access all members of the enclosing class, including private ones.
-   To create an object of a static nested class, an object of the outer class is not required.
-   From an object of a static nested class, you cannot access non-static members of the enclosing class directly, but only through a reference to an instance of the outer class.
-   Regular nested classes cannot contain static methods, initialization blocks, or classes. Static nested classes can.
-   An object of a regular nested class stores a reference to an object of an outer class. There is no such link inside a static link. An instance of the framing class is accessed through the indication`.this`after his name. For example:`Outer.this`.

[to contents](#java-core)

## What's happened_"local class"_? What are its features?

**Local inner class**(Local class) is a nested class that can be declared in any block that allows variables to be declared. Just like simple inner classes (_Member inner class_) local classes have names and can be reused. Like anonymous classes, they only have an instance surrounding them when used in a non-static context.

Local classes have the following features:

-   Visible only within the block in which they are declared;
-   Cannot be declared as`private`/`public`/`protected`or`static`;
-   They cannot contain static declarations of methods and classes, but they can have final static fields initialized by a constant;
-   Have access to the fields and methods of the framing class;
-   Can access local variables and method parameters if they are declared with a modifier`final`.

[to contents](#java-core)

## What's happened_"anonymous classes"_? Where are they used?

This is a nested local class without a name, which can be declared anywhere in the enclosing class that allows expressions. An instance of an anonymous class is created simultaneously with its declaration. Depending on its location, an anonymous class behaves either as a static class or as a non-static nested class—the surrounding instance appears in the non-static context.

Anonymous classes have several limitations:

-   Their use is permitted only in one place in the program - the place where it was created;
-   Application is possible only if, after the instance is generated, there is no need to refer to it;
-   Implements only methods of its interface or superclass, i.e. cannot declare any new methods because there is no named type to access them.

Anonymous classes are usually used for:

-   creating a function object (_function object_), for example, interface implementation`Comparator`;
-   creating a process object (_process object_), such as class instances`Thread`,`Runnable`and similar;
-   in the static generation method;
-   initializing a public static field`final`, which corresponds to a complex type enumeration where each instance in the enumeration requires a separate subclass.

[to contents](#java-core)

## How can I access a field in an outer class from a nested class?

A static nested class has direct access only to the static fields of the enclosing class.

A simple inner class that can access any field of the outer class directly. If a nested class already has a field with the same literal, then such a field should be accessed through a link to its instance. For example:`Outer.this.field`.

[to contents](#java-core)

## What is the operator used for?`assert`?

**Assert**(Assertion) is a special construct that allows you to check assumptions about the values ​​of arbitrary data in an arbitrary place in the program. An assertion can automatically signal that bad data has been detected, which usually results in a program crash indicating where the bad data was found.

Assertions make it much easier to locate errors in your code. Even checking the results of executing obvious code can be useful during subsequent refactoring, after which the code may become less obvious and an error may creep into it.

Typically, assertions are left enabled during program development and testing, but are disabled in release versions of programs.

Because statements can be removed at compile time or during program execution; they should not change the behavior of the program. If the program's behavior may change as a result of removing a statement, then this is a clear sign of misuse._assert_. So inside_assert_You cannot call methods that change the state of the program or the external environment of the program.

In Java, assertion testing is implemented using the operator`assert`, which has the form:

`assert [Выражение типа boolean];`or`assert [Выражение типа boolean] : [Выражение любого типа, кроме void];`

During program execution, if assertion checking is enabled, the value of the Boolean expression is calculated, and if its result`false`, then an exception is thrown`java.lang.AssertionError`. In case of using the second form of the operator`assert`the expression after the colon specifies a detailed message about the error that occurred (the calculated expression will be converted to a string and passed to the constructor`AssertionError`).

[to contents](#java-core)

## What's happened_Heap_And_Stack_memory in Java? What's the difference between them?

**Heap**Java Runtime is used to allocate memory for objects and classes. Creation of a new object also occurs on the heap. This is also the scope of the garbage collector. Any object created on the heap has global access and can be referenced from anywhere in the application.

**stack**this is a data storage area also located in shared RAM (_RAM_). Whenever a method is called, a new block is created in stack memory that contains primitives and references to other objects in the method. Once a method finishes running, the block is also no longer used, thereby making it available to the next method.
The size of stack memory is much smaller than the amount of memory on the heap. The stack in Java works according to the following scheme:_LIFO_(Last-in-First-out)

Differences between_Heap_And_Stack_memory:

-   The heap is used by all parts of the application, while the stack is used by only one thread of execution of the program.
-   Whenever an object is created, it is always stored on the heap, and the stack memory only contains a reference to it. Stack memory contains only local variables of primitive types and references to objects on the heap.
-   Objects on the heap are accessible from anywhere in the program, while stack memory cannot be accessed by other threads.
-   Stack memory exists only for some time while the program is running, but memory on the heap lives from the very beginning until the end of the program.
-   If stack memory is completely occupied, then Java Runtime throws an exception`java.lang.StackOverflowError`. If heap memory is full, an exception is thrown`java.lang.OutOfMemoryError: Java Heap Space`.
-   Stack memory is much smaller than heap memory.
-   Due to the ease of memory allocation, stack memory is much faster than heap memory.

To determine the initial and maximum memory size of the heap, use`-Xms`And`-Xmx`JVM options. For a stack, you can determine the memory size using the option`-Xss`.

[to contents](#java-core)

## Is it true that primitive data types are always stored on the stack, and instances of reference data types are always stored on the heap?

Not really. A primitive field of a class instance is stored not on the stack, but on the heap. Any object (anything that is created explicitly or implicitly using the operator`new`) is stored on the heap.

[to contents](#java-core)

## How are variables passed to methods, by value or by reference?

In Java, parameters are always passed by value only, which is defined as "copy the value and pass a copy". With primitives this will be a copy of the content. With links - also a copy of the content, i.e. copy of the link. At the same time, it is possible to change the internal members of reference types through such a copy, but the link itself pointing to the instance is not.

[to contents](#java-core)

## What is a garbage collector for?

The Garbage Collector only needs to do two things:

-   Find garbage - unused objects. (An object is considered unused if none of the entities in the code currently executing contains references to it, or the chain of references that could connect the object with some application entity is broken);
-   Free memory from garbage.

There are two approaches to garbage detection:

-   _Reference counting_;
-   _Tracing_

**Reference counting**(link counting). The essence of this approach is that each object has a counter. The counter stores information about how many references point to an object. When the link is destroyed, the counter is decremented. If the counter value is zero, the object can be considered garbage. The main disadvantage of this approach is the difficulty of ensuring the accuracy of the counter. Also, with this approach, it is difficult to detect cyclic dependencies (when two objects point to each other, but no living object references them), which leads to memory leaks.

The main idea of ​​the approach**Tracing**(tracing) consists of the statement that only those objects can be considered alive that we can reach from the root points (_GC Root_) and those objects that are accessible from a living object. Everything else is garbage.

There are 4 types of root points:

-   Local variables and method parameters;
-   Streams;
-   Static variables;
-   Slice from JNI.

The simplest java application will have root points:

-   Local variables inside`main()`method and parameters`main()`method;
-   The thread that executes`main()`;
-   Static variables of the class within which it resides`main()`method.

Thus, if we imagine all the objects and the links between them as a tree, then we will need to go from the root nodes (points) along all the edges. At the same time, the nodes that we can reach are not garbage, all the rest are garbage. With this approach, cyclic dependencies are easily identified. HotSpot VM takes exactly this approach.

* * *

There are two main methods for cleaning memory from garbage:

-   _Copying collectors_
-   _Mark-and-sweep_

At**copying collectors**approach, memory is divided into two parts “from-space” and “to-space”, while the operating principle itself is as follows:

-   Objects are created in "from-space";
-   When the "from-space" is full, the application is paused;
-   The garbage collector starts. Living objects are found in “from-space” and copied to “to-space”;
-   When all objects have been copied, "from-space" is completely cleared;
-   "to-space" and "from-space" are swapped.

The main advantage of this approach is that objects occupy memory tightly. Disadvantages of the approach:

1.  The application must be stopped long enough to complete the garbage collection cycle;
2.  In the worst case (when all objects are alive), "form-space" and "to-space" will have to be the same size.

Work algorithm**mark-and-sweep**can be described like this:

-   Objects are created in memory;
-   At the moment when the garbage collector needs to be started, the application is suspended;
-   The collector walks through the object tree, marking living objects;
-   The collector walks through the entire memory, finding all unmarked pieces of memory and storing them in a “free list”;
-   When new objects begin to be created they are created in memory available in the "free list".

Disadvantages of this method:

1.  The application does not work while garbage collection is in progress;
2.  The stopping time directly depends on the memory size and the number of objects;
3.  If you do not use “compacting”, memory will not be used efficiently.

HotSpot VM garbage collectors use a combined approach**Generational Garbage Collection**, which allows different algorithms to be used for different stages of garbage collection. This approach is based on the fact that:

-   most created objects quickly become garbage;
-   there are few connections between objects that were created in the past and objects that have just been created.

[to contents](#java-core)

## How does the garbage collector work?

Garbage collection is the process of freeing up space on the heap so that new objects can be added.

Objects are created using the operator`new`, thereby assigning a reference to the object. To finish working with an object, simply stop referring to it, for example, by assigning a variable a reference to another object or a value`null`; stop executing a method so that its local variables end up naturally. Objects to which there are no references are usually called garbage (_garbage_), which will be deleted.

The Java Virtual Machine, using a garbage collection mechanism, ensures that any object with references remains in memory - all objects that are unreachable from the executable code, due to the absence of references to them, are deleted and the memory allocated for them is released. More precisely, an object is not subject to garbage collection if it is reachable through a chain of references starting at the root (_GC Root_) links, i.e. reference that directly exists in the executable code.

Memory is freed by the garbage collector at its own discretion. A program can exit successfully without running out of free memory, or even getting close to it, and therefore never need the “services” of a garbage collector.

Garbage is collected by the system automatically, without user or programmer intervention, but this does not mean that this process does not require attention at all. The need to create and delete large numbers of objects has a significant impact on application performance, and if program performance is an important factor, you should carefully consider decisions related to object creation - this, in turn, will reduce the amount of garbage that needs to be disposed of.

[to contents](#java-core)

## What types of garbage collectors are implemented in the HotSpot virtual machine?

Java HotSpot VM provides developers with four different garbage collectors to choose from:

-   **Serial**- the simplest option for applications with a small amount of data and not demanding on latency. At the moment it is used relatively rarely, but on weak computers it can be selected by the virtual machine as the default collector. The use of Serial GC is enabled by the option`-XX:+UseSerialGC`.
-   **Parallel**— inherits the assembly approaches from the sequential assembler, but adds parallelism to some operations, as well as the ability to automatically adjust to the required performance parameters. The parallel collector is enabled by the option`-XX:+UseParallelGC`.
-   **Concurrent Mark Sweep (CMS)**- aims to reduce maximum latency by performing part of the garbage collection work in parallel with the main application threads. Suitable for working with relatively large amounts of data in memory. The use of CMS GC is enabled by the option`-XX:+UseConcMarkSweepGC`.
-   **Garbage-First (G1)**- created to replace CMS, especially in server applications running on multiprocessor servers and handling large volumes of data._G1_enabled by Java option`-XX:+UseG1GC`.

[to contents](#java-core)

## Describe the algorithm of operation of a garbage collector implemented in the HotSpot virtual machine.

**Serial Garbage Collector**was one of the first garbage collectors in HotSpot VM. While this collector is running, the application is suspended and continues to run only after garbage collection stops.

Application memory is divided into three spaces:

-   _Young generation_. Objects are created in this memory location.
-   _Old generation_. Objects that survive the “minor garbage collection” are moved to this memory location.
-   _Permanent generation_. Metadata about objects is stored here,_Class data sharing (CDS)_,_string pool (String pool)_. The permanent area is divided into two: read-only and read-write. Obviously, in this case, the read-only area is never cleaned by the garbage collector.

The Young generation memory area consists of three areas:_Eden_and two smaller ones_Survivor spaces_-_To space_And_From space_. Most objects are created in the Eden area, with the exception of very large objects that cannot be placed in it and are therefore immediately placed in Old generation. Survivor spaces move objects that have survived at least one garbage collection, but have not yet reached the “old age” threshold (_tenuring threshold_) to be moved to Old generation.

When the Young generation is full, the light assembly process starts in this area (_minor collection_), as opposed to the assembly process performed on the entire heap (_full collection_). It happens as follows: at the beginning of work, one of the Survivor spaces - To space, is empty, and the other - From space, contains objects that survived previous assemblies. The garbage collector looks for living objects in Eden and copies them to To space, and then copies living “young” (that is, not yet survived a specified number of garbage collections) objects from From space there. Old objects from From space are moved to Old generation. After easy assembly, From space and To space change roles, the Eden area becomes empty, and the number of objects in the Old generation increases.

If the To space becomes full during the process of copying living objects, then the remaining living objects from Eden and From space that did not have enough space in the To space will be moved to the Old generation, regardless of how many garbage collections they have survived.

Since using this algorithm the garbage collector simply copies all living objects from one memory location to another, such a garbage collector is called_copying_(copying). Obviously, for a copying garbage collector to work, the application must always have a free memory area into which live objects will be copied, and such an algorithm can be used for memory areas that are relatively small in relation to the overall memory size of the application. Young generation just satisfies this condition (by default on client machines this area occupies about 10% of the heap (the value may vary depending on the platform)).

However, for garbage collection in Old generation, which occupies most of the total memory, a different algorithm is used.

In Old generation, garbage collection occurs using the algorithm_mark-sweep-compact_, which consists of three phases. In phase_Mark_(marking) the garbage collector marks all living objects, then, in the phase_Sweep_(cleaning) all unmarked objects are deleted, and in the phase_Compact_(compaction) all living objects are moved to the beginning of the Old generation, resulting in the free memory after clearing being a continuous area. The compaction phase is performed to avoid fragmentation and simplify the memory allocation process in the Old generation.

When free memory is a continuous area, then a very fast (about a dozen machine instructions) algorithm can be used to allocate memory for the object being created_bump-the-pointer_: The address of the start of free memory is stored in a special pointer, and when a request comes to create a new object, the code checks that there is enough space for the new object, and, if so, it simply increments the pointer by the size of the object.

The sequential garbage collector is well suited for most applications that use up to 200 megabytes of heap, run on client machines, and do not have strict requirements for the length of garbage collection pauses. At the same time, the stop-the-world model can cause long pauses in the application when using large amounts of memory. In addition, the sequential operating algorithm does not make optimal use of the computer's computing resources, and the sequential garbage collector can become a bottleneck when running the application on multiprocessor machines.

[to contents](#java-core)

## What is a "string pool"?

**Term pool**is a set of strings stored in_Heap_.

-   String pooling is made possible by Java's immutability of strings and the implementation of the idea of ​​string interning;
-   A string pool helps save memory, but it also takes longer to create a string;
-   When used to create strings`"`, then first a string is searched in the pool with the same value, if found, then a link is simply returned, otherwise a new string is created in the pool, and then a link to it is returned;
-   When using the operator`new`create a new facility`String`. Then using the method`intern()`this string can be placed in a pool or a reference to another object can be obtained from the pool`String`with the same meaning;
-   A string pool is an example of a pattern_"Adjuster" (Flyweight)_.

[to contents](#java-core)

## What's happened`finalize()`? Why is it needed?

Through a method call`finalize()`(which inherits from Java.lang.Object) The JVM implements functionality similar to that of C++ destructors, used to clean up memory before returning control to the operating system. This method is called when an object is destroyed by the garbage collector (_garbage collector_) and overriding`finalize()`you can program the actions necessary to correctly delete an instance of a class - for example, closing network connections, database connections, removing locks on files, etc.

After this method executes, the object must be recollected by the garbage collector (and this is considered a serious problem with the method`finalize()`because it prevents the garbage collector from freeing memory). Calling this method is not guaranteed because the application may be terminated before garbage collection is triggered.

The object will not necessarily be available for assembly immediately - method`finalize()`can save a reference to the object somewhere. This situation is called the “rebirth” of an object and is considered an antipattern. The main problem with this trick is that an object can only be “revived” once.

Example:

```java
public class MainClass {

	public static void main(String args[]) {
		TestClass a = new TestClass();
		a.a();
		a = null;
		a = new TestClass();
		a.a();
		System.out.println("!!! done");
	}
}
```

```java

public class TestClass {

	public void a() {
		System.out.println("!!! a() called");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("!!! finalize() called");
		super.finalize();
	}
}
```

Since in this case the garbage collector may not be called (due to the simplicity of the application), the result of program execution will most likely be the following:

    !!! a() called
    !!! a() called
    !!! done

Now let's complicate the program a little by adding a forced call to Garbage Collector:

```java
public class MainClass {

	public static void main(String args[]) {
		TestClass a = new TestClass();
		a.a();
		a = null;
		System.gc(); // Принудительно зовём сборщик мусора
		a = new TestClass();
		a.a();
		System.out.println("!!! done");
	}

}
```

As mentioned earlier, Garbage Collector can run at different times, so the execution result may vary from run to run:
Option a:

    !!! a() called
    !!! a() called
    !!! done
    !!! finalize() called

Option b:

    !!! a() called
    !!! a() called
    !!! finalize() called
    !!! done

[to contents](#java-core)

## What happens to the garbage collector if the method is executed`finalize()`does it take a noticeably long time, or will an exception be thrown during execution?

Direct call`finalize()`happens in a separate thread_Finalizer_(`java.lang.ref.Finalizer.FinalizerThread`), which is created when the virtual machine starts (in the static section when loading the class`Finalizer`). Methods`finalize()`are called sequentially in the order in which they were added to the list by the garbage collector. Accordingly, if some`finalize()`will hang, it will hang the thread_Finalizer_, but not a garbage collector. This means in particular that objects that do not have a method`finalize()`, will be regularly deleted, but those that exist will be added to the queue until the flow_Finalizer_will not be freed, the application will not terminate, or the memory will not run out.

The same applies to those thrown out in the process`finalize()`exceptions: method`runFinalizer()`at the stream_Finalizer_ignores all exceptions thrown at execution time`finalize()`. Thus, the occurrence of an exception will not affect the performance of the garbage collector in any way.

[to contents](#java-core)

## How are they different?`final`,`finally`And`finalize()`?

Modifier`final`:

-   A class cannot have heirs;
-   The method cannot be overridden in descendant classes;
-   A field cannot change its value after initialization;
-   Local variables cannot be modified once they have been assigned a value;
-   Method parameters cannot change their value inside the method.

Operator`finally`guarantees that the section of code defined in it will be executed regardless of what exceptions were raised and caught in the block`try-catch`.

Method`finalize()`Called before the garbage collector removes an object.

Example:

```java

public class MainClass {

	public static void main(String args[]) {
		TestClass a = new TestClass();
		System.out.println("result of a.a() is " + a.a());
		a = null;
		System.gc(); // Принудительно зовём сборщик мусора
		a = new TestClass();
		System.out.println("result of a.a() is " + a.a());
		System.out.println("!!! done");
	}

}
```

```java
public class TestClass {

	public int a() {
		try {
			System.out.println("!!! a() called");
			throw new Exception("");
		} catch (Exception e) {
			System.out.println("!!! Exception in a()");
			return 2;
		} finally {
			System.out.println("!!! finally in a() ");
		}
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("!!! finalize() called");
		super.finalize();
	}
}
```

Execution result:

    !!! a() called
    !!! Exception in a()
    !!! finally in a() 
    result of a.a() is 2
    !!! a() called
    !!! Exception in a()
    !!! finally in a() 
    !!! finalize() called
    result of a.a() is 2
    !!! done

[to contents](#java-core)

## Tell us about type casting. What is type demotion and promotion?

Java is a strongly typed programming language, which means that every expression and every variable has a strictly defined type at compile time. However, a mechanism has been identified_casting_- a method of converting the value of a variable of one type into a value of another type.

There are several types of casts in Java:

-   **Identical**. Converting an expression of any type to the exact same type is always valid and occurs automatically.
-   **Expansion (upcasting) of a primitive type (widening primitive)**. Means that a transition is taking place from a less capacious type to a more capacious one. For example, from type`byte`(length 1 byte) to type`int`(length 4 bytes). Such conversions are safe in the sense that the new type is always guaranteed to contain all the data that was stored in the old type and thus no data loss occurs. This type of cast is always valid and occurs automatically.
-   **Narrowing primitive**. Means that the transition is from a more capacious type to a less capacious one. With this conversion there is a risk of losing data. For example, if a number is like`int`there were more`127`, then when bringing it to`byte`bit values ​​higher than eighth will be lost. In Java, such a conversion must be performed explicitly, and all high-order bits that do not fit in the new type are simply discarded - no rounding or other actions are performed to obtain a more correct result.
-   **Widening reference**. Means an implicit upward casting of types or a transition from a more specific type to a less specific one, i.e. transition from descendant to ancestor. Always allowed and occurs automatically.
-   **Narrowing reference**. Means downward casting, that is, casting from an ancestor to a descendant (subtype). Only possible if the source variable is a subtype of the castable type. If there is a type mismatch, an exception is thrown at execution time`ClassCastException`. Requires an explicit type indication.
-   **Conversion to String**. Any type can be cast to a string, i.e. to an instance of a class`String`.
-   **Forbidden transformations (forbidden)**. Not all casts between arbitrary types are valid. For example, prohibited conversions include casts from any reference type to a primitive type and vice versa (except conversion to a string). In addition, it is impossible to bring classes that are on different branches of the inheritance tree, etc., to each other.

When casting reference types, nothing happens to the object itself; only the type of the reference through which the object is accessed changes.

To check the possibility of casting, you need to use the operator`instanceof`:

```java
Parent parent = new Child();
if (parent instanceof Child) {
    Child child = (Child) parent;
}
```

[to contents](#java-core)

## When an application might throw an exception`ClassCastException`?

`ClassCastException`(descendant`RuntimeException`) - an exception that will be thrown when a type conversion error occurs.

[to contents](#java-core)

## What are literals?

**Literals**- these are explicitly specified values ​​in the program code - constants of a certain type that are in the code at the time of launch.

```java
class Test {
   int a = 0b1101010110;
   public static void main(String[] args) {
       System.out.println("Hello world!");       
   }
}
```

In this class “Hello world!” - literal.

Variable`a`- also a literal.

Literals come in different types, determined by their purpose and how they are written.

[to contents](#java-core)

## What's happened_autoboxing_in Java and what are the rules for packing primitive types into wrapper classes?

**Autopacking**is a mechanism for implicit initialization of objects of wrapper classes (`Byte`,`Short`,`Integer`,`Long`,`Float`,`Double`,`Character`,`Boolean`) values ​​of the corresponding initial primitive types (`byte`,`short`,`int`...), without explicitly using the class constructor.

-   Autoboxing occurs when a primitive is directly assigned to a wrapper class (using the operator`=`), or when passing a primitive into method parameters (such as a wrapper class).

-   Both variables of primitive types and compile-time constants (literals and`final`-primitives). In this case, literals must be syntactically correct to initialize a variable of the original primitive type.

-   Autoboxing of variables of primitive types requires an exact match between the type of the original primitive and the type of the wrapper class. For example, trying to box a variable like`byte`V`Short`, without prior explicit casting`byte`V`short`will cause a compilation error.

-   Autoboxing of primitive type constants allows for wider matching boundaries. In this case, the compiler is able to perform implicit expansion/narrowing of primitive types in advance:
      1) implicit extension/narrowing of the original primitive type to the primitive type corresponding to the wrapper class (for conversion`int`V`Byte`, first the compiler itself implicitly narrows`int`To`byte`)
      2) auto-packing of the primitive into the appropriate wrapper class. However, in this case there are two additional restrictions:
          a) assignment of a primitive to a wrapper can only be done by the operator`=`(you cannot pass such a primitive to method parameters without explicit type casting)
          b) the type of the left operand must not be greater than`Character`, the type on the right should not be older than`int`: expansion/constriction allowed`byte`to/from`short`,`byte`to/from`char`,`short`to/from`char`and only narrowing`byte`from`int`,`short`from`int`,`char`from`int`. All other options require an explicit type cast).

An additional feature of integer wrapper classes created by autoboxing constants in a range`-128 ... +127`is that they are cached by the JVM. Therefore, such wrappers with the same values ​​will be references to the same object.

[to contents](#java-core)

## What are the features of the class?`String`?

-   It is an immutable and finalized data type;
-   String literals, interned class objects`String`The JVM stores in a string pool;
-   Class object`String`can be obtained using double quotes;
-   You can use the operator`+`for string concatenation;
-   Since Java 7, strings can be used in a construct`switch`.

[to contents](#java-core)

## Why`String`immutable and finalized class?

There are several advantages to string immutability:

-   String pooling is only possible because the string is immutable, thus the virtual machine saves more free space in_Heap_, because different string variables point to the same variable in the pool. If a string were mutable, then string interning would not be possible because changing the value of one variable would also affect the other variables that reference that string.
-   If the string is mutable, then it becomes a serious security risk for the application. For example, the database username and password are passed as a string to obtain a connection to the database and in socket programming the host and port details are passed as a string. Since the string is immutable, its value cannot be changed, otherwise an attacker could change the value of the link and cause problems in the application's security.
-   Immutability avoids synchronization: strings are thread-safe and a single instance of a string can be shared among different threads.
-   Strings are used_classloader_and immutability ensures that the class is loaded correctly.
-   Since the string is immutable, it`hashCode()`cached at the time of creation and there is no need to calculate it again. This makes the string an excellent candidate for the key in`HashMap`because its processing is faster.

[to contents](#java-core)

## Why`char[]`preferable`String`to store the password?

From the moment of creation, the row remains in the pool until it is deleted by the garbage collector. Therefore, even after you stop using the password, it continues to be available in memory for some time and there is no way to avoid this. This poses a security risk because anyone with access to the memory will be able to find the password in plain text.
If you use a character array to store the password, you can clear it immediately after you finish working with the password, avoiding the security risks inherent in a string.

[to contents](#java-core)

## Why is string a popular key in`HashMap`in Java?

Since strings are immutable, their hash code is calculated and cached at the time of creation, without requiring recalculation for further use. Therefore, as a key`HashMap`they will be processed faster.

[to contents](#java-core)

## What does the method do?`intern()`in class`String`?.

Method`intern()`used to store a string in a string pool or obtain a reference if such a string is already in the pool.

[to contents](#java-core)

## Is it possible to use strings in a design`switch`?

Yes, since Java 7 in operator`switch`You can use strings, earlier versions of Java do not support this. In this case:

-   participating strings are case sensitive;
-   method used`equals()`to compare the obtained value with the values`case`, so to avoid`NullPointerException`it is worth considering checking for`null`.
-   According to the documentation, Java 7 for strings in`switch`, the Java compiler generates more efficient bytecode for the strings in the construct`switch`than for linked conditions`if`-`else`.

[to contents](#java-core)

## What is the main difference between`String`,`StringBuffer`,`StringBuilder`?

Class`String`is immutable (_immutable_) - you cannot modify an object of this class; you can only replace it by creating a new instance.

Class`StringBuffer`mutable - use`StringBuffer`should be used when the content needs to be modified frequently.

Class`StringBuilder`was added in Java 5 and is identical in every way to the class`StringBuffer`except that it is not synchronized and therefore its methods execute much faster.

[to contents](#java-core)

## What is a class`Object`? What methods does it have?

`Object`it is the base class for all other objects in Java. Any class inherits from`Object`and, accordingly, inherit its methods:

`public boolean equals(Object obj)`– serves to compare objects by value;

`int hashCode()`– returns hash code for an object;

`String toString()`– returns a string representation of an object;

`Class getClass()`– returns the class of the object at run time;

`protected Object clone()`– creates and returns a copy of the object;

`void notify()`– resumes the thread waiting for the monitor;

`void notifyAll()`– resumes all threads waiting on the monitor;

`void wait()`– stopping the thread that called the method until another thread calls the method`notify()`or`notifyAll()`for this object;

`void wait(long timeout)`– stopping the thread that called the method for a certain time or until another thread calls the method`notify()`or`notifyAll()`for this object;

`void wait(long timeout, int nanos)`– stopping the thread that called the method for a certain time or until another thread calls the method`notify()`or`notifyAll()`for this object;

`protected void finalize()`– can be called by the garbage collector when an object is removed during garbage collection.

[to contents](#java-core)

## Define the concept of “constructor”.

**Constructor**is a special method that has no return type and has the same name as the class in which it is used. The constructor is called when a new class object is created and defines the actions necessary to initialize it.

[to contents](#java-core)

## What's happened_"default constructor"_?

If a class does not have a constructor defined, the compiler will generate a constructor without arguments - the so-called**"default constructor"**.

```java
public ClassName() {}
```

If a class already has a constructor defined, then a default constructor will not be created and, if necessary, it must be declared explicitly.

[to contents](#java-core)

## What is the difference between a default constructor, a copy constructor, and a constructor with parameters?

The default constructor does not have any arguments. The copy constructor takes as an argument an already existing class object to subsequently create a clone of it. A parameterized constructor has arguments in its signature (usually needed to initialize the fields of the class).

[to contents](#java-core)

## Where and how can you use a private constructor?

Private (marked with keyword`private`, hidden) constructor can be used by a public static method for generating objects of a given class. Also, access to it is allowed to nested classes and can be used for their needs.

[to contents](#java-core)

## Tell us about loader classes and dynamic class loading.

The basis for working with classes in Java is loader classes, ordinary Java objects that provide an interface for finding and creating a class object by its name while the application is running.

At the beginning of the program, 3 main class loaders are created:

-   **basic bootloader (bootstrap/primordial)**. Loads core JDK system and internal classes (_Core API_- packages`java.*`(`rt.jar`And`i18n.jar`) . It is important to note that the base bootloader is_"Primordial"_or_"Root"_and part of the JVM, as a result of which it cannot be created inside the program code.
-   **extension loader**. Loads various extension packages that are located in the directory`<JAVA_HOME>/lib/ext`or another directory described in the system parameter`java.ext.dirs`. This allows you to update and add new extensions without having to modify the settings of the applications you are using. The extension loader is implemented by the class`sun.misc.Launcher$ExtClassLoader`.
-   **system bootloader (system/application)**. Loads classes whose paths are specified in the environment variable`CLASSPATH`or the paths that are specified in the JVM startup command line after the keys`-classpath`or`-cp`. The system loader is implemented by the class`sun.misc.Launcher$AppClassLoader`.

Class loaders are hierarchical: each of them (except the base one) has a parent loader and in most cases, before trying to load a class on its own, it first sends a request to the parent loader to load the specified class. This delegation allows classes to be loaded by the loader that is closest to the base loader in the delegation hierarchy. As a result, the search for classes will occur in sources in the order of their trust: first in the library_Core API_, then in the extensions folder, then in local files`CLASSPATH`.

The class loading process consists of three parts:

-   _Loading_– at this phase, the class file is searched and physically loaded in a specific source (depending on the loader). This process determines the base representation of the class in memory. At this stage, concepts such as “methods”, “fields”, etc. not yet known.
-   _Linking_– a process that can be divided into 3 parts:
    -   _Bytecode verification_– checking the bytecode for compliance with the requirements defined in the JVM specification.
    -   _Class preparation_– creation and initialization of the necessary structures used to represent fields, methods, implemented interfaces, etc., defined in the loaded class.
    -   _Resolving_– loading a set of classes referenced by the loaded class.
-   _Initialization_– calling static initialization blocks and assigning default values ​​to class fields.

Dynamic class loading in Java has a number of features:

-   _Lazy loading and class binding_. Classes are loaded only when necessary, which saves resources and distributes the load.
-   _checking the correctness of the loaded code (type safety)_. All actions related to controlling the use of types are performed only during class loading, avoiding additional load during code execution.
-   _programmable boot_. The user loader has complete control over the process of obtaining the requested class - whether to look for bytecode and create the class itself or delegate the creation to another loader. Additionally, it is possible to set different security attributes for loaded classes, thus allowing you to work with code from untrusted sources.
-   _multiple namespaces_. Each loader has its own namespace for the classes it creates. Accordingly, classes loaded by two different loaders based on a common bytecode will differ in the system.

There are several ways to initiate loading of the required class:

-   explicit: call`ClassLoader.loadClass()`or`Class.forName()`(by default, the loader that created the current class is used, but it is possible to explicitly specify the loader);
-   implicit: when a previously unused class is required for further operation of the application, the JVM initiates its loading.

[to contents](#java-core)

## What's happened_Reflection_?

**Reflection** - это механизм получения данных о программе во время её выполнения (runtime). В Java _Reflection_carried out using_Java Reflection API_, consisting of package classes`java.lang`And`java.lang.reflect`.

Java Reflection API features:

-   Definition of the object class;
-   Obtaining information about class modifiers, fields, methods, constructors and superclasses;
-   Defining the interfaces implemented by the class;
-   Creating an instance of a class;
-   Getting and setting object field values;
-   Calling object methods;
-   Creating a new array.

[to contents](#java-core)

## Why is it needed?`equals()`. How is it different from surgery?`==`?

Method`equals()`- defines the equivalence relation of objects.

When comparing objects using`==`comparison occurs only between links. When compared against something redefined by the developer`equals()`- according to the internal state of objects.

[to contents](#java-core)

## If you want to override`equals()`, what conditions must be met?

## What properties does the generated`equals()`equivalence relation?

-   _Reflexivity_: for any reference to a value`x`,`x.equals(x)`will return`true`;
-   _Symmetry_: for any value references`x`And`y`,`x.equals(y)`should return`true`, if and only if`y.equals(x)`returns`true`.
-   _Transitivity_: for any value references`x`,`y`And`z`, If`x.equals(y)`And`y.equals(z)`return`true`, then`x.equals(z)`will return`true`;
-   _Non-contradiction_: for any value references`х`And`у`, if called several times`х.equals(y)`, the value will always be returned`true`or the value will be constantly returned`false`provided that no information used in comparing objects has changed.

For any non-null value reference`х`expression`х.equals(null)`should return`false`.

[to contents](#java-core)

## Method overriding rules`Object.equals()`.

1.  Using the operator`==`to check whether the argument is a reference to the specified object. If it is, it is returned`true`. If the object being compared`== null`, should come back`false`.
2.  Using a Method Call`getClass()`to check if the argument is of the correct type. If not, returns`false`.
3.  Casting the argument to the correct type. Since this operation follows the check`instanceof`it is guaranteed to be fulfilled.
4.  Iterates through all significant fields of a class and checks that the value of the field in the current object and the value of the same field in the argument being tested for equivalence match each other. If the checks for all fields are successful, the result is returned`true`, otherwise -`false`.

When the method override is complete`equals()`should be checked: is the generated equivalence relation reflexive, symmetric, transitive and consistent? If the answer is no, the method must be adjusted accordingly.

[to contents](#java-core)

## What is the connection between`hashCode()`And`equals()`?

## If`equals()`overridden, are there any other methods that should be overridden?

Equal objects must return the same hash codes. When overridden`equals()`it is necessary to override the method`hashCode()`.

[to contents](#java-core)

## What happens if you override`equals()`without overriding`hashCode()`? What problems might arise?

Classes and methods that use the rules of this contract may not work correctly. So for`HashMap`this may result in the key-value pair that was placed in it when using a new key instance not being found in it.

[to contents](#java-core)

## How are the methods implemented?`hashCode()`And`equals()`in class`Object`?

Implementation method`Object.equals()`comes down to checking for equality of two references:

```java
public boolean equals(Object obj) {
  return (this == obj);
}
```

Implementation method`Object.hashCode()`described as`native`, i.e. defined not by Java code and generally depends on the JVM implementation:

```java
public native int hashCode();
```

In HotSpot JVM, the default hash code is calculated using the prime number generation algorithm - Xorshift.

[to contents](#java-core)

## What is the method for?`hashCode()`?

Method`hashCode()`is necessary to calculate the hash code of the object passed as an input parameter. In Java, it is an integer, and by extension a fixed-length bit string derived from an arbitrary-length array. This method is implemented in such a way that for the same input object, the hash code will always be the same. It should be understood that in Java the set of possible hash codes is limited by the type`int`, and the set of objects is not limited by anything. Because of this, it is quite possible that the hash codes of different objects may coincide:

-   if the hash codes are different, then the objects are guaranteed to be different;
-   if hash codes are equal, then the objects are not necessarily equal (they can be different).

[to contents](#java-core)

## What are the rules for method overriding`Object.hashCode()`?

## Are there any guidelines on what fields should be used when counting`hashCode()`?

General advice: choose fields that are likely to vary. To do this, you need to use unique, preferably primitive fields, such as`id`,`uuid`. In this case, you need to follow the rule if the fields are involved in the calculation`hashCode()`, then they must be involved when executing`equals()`.

[to contents](#java-core)

## Can different objects have the same`hashCode()`?

Yes, they can. Method`hashCode()`does not guarantee the uniqueness of the return value. The situation when different objects have the same hash codes is called_collision_. The probability of a collision depends on the hash code generation algorithm used.

[to contents](#java-core)

## If the class`Point{int x, y;}`implement the method`equals(Object that) {(return this.x == that.x && this.y == that.y)}`, but make the hash code in the form`int hashCode() {return x;}`, then will such points be correctly placed and extracted from`HashSet`?

`HashSet`uses`HashMap`for storing elements. When adding an element to`HashMap`a hash code is calculated, which determines the position in the array where the new element will be inserted. For all instances of the class`Point`hash code will be the same for all objects with the same`x`, which will lead to the degeneration of the hash table into a list.

If a collision occurs in`HashMap`checks for the presence of an element in the list:`e.hash == hash && ((k = e.key) == key || key.equals(k))`. If the element is found, its value is overwritten. In our case, for different objects, the method`equals()`will return`false`. Accordingly, the new element will be successfully added to`HashSet`. The item will also be retrieved successfully. But the performance of such code will be low due to the inefficiency of the hash function, which can generate a large number of collisions.[to contents](#java-core)

## Can different objects`(ref0 != ref1)`be`ref0.equals(ref1) == true`?

Yes, they can. To do this, the method must be overridden in the class of these objects`equals()`.

If the method is used`Object.equals()`, the for two links`x`And`y`the method will return`true`if and only if both references point to the same object (i.e.`x == y`returns`true`).

[to contents](#java-core)

## Can different references to the same object`(ref0 == ref1)`be`ref0.equals(ref1) == false`?

In general, they can, if the method`equals()`implemented incorrectly and does not fulfill the reflexivity property: for any non-null references`x`method`x.equals(x)`must return`true`.

[to contents](#java-core)

## Is it possible to implement the method like this?`equals(Object that) {return this.hashCode() == that.hashCode()}`?

Strictly speaking, it is impossible, since the method`hashCode()`does not guarantee unique value for each object. However, to compare instances of the class`Object`This code is acceptable, because method`hashCode()`in class`Object`returns unique values ​​for different objects (its calculation is based on the use of a random number generation algorithm).

[to contents](#java-core)

## IN`equals()`you need to check that the argument`equals(Object that)`the same type as the object itself. What is the difference between`this.getClass() == that.getClass()`And`that instanceof MyClass`?

Operator`instanceof`compares an object and the specified type. It can be used to check whether a given object is an instance of a certain class, or an instance of its child class, or an instance of a class that implements a specified interface.

`this.getClass() == that.getClass()`checks two classes for identity, so for correct implementation of the method contract`equals()`it is necessary to use an exact comparison using the method`getClass()`.

[to contents](#java-core)

## Is it possible to implement the method`equals()`class`MyClass`like this:`class MyClass {public boolean equals(MyClass that) {return this == that;}}`?

Can be implemented, but this method does not override the method`equals()`class`Object`, but overloads it.

[to contents](#java-core)

## There is a class`Point{int x, y;}`. Why hash code in the form`31 * x + y`preferable to`x + y`?

The multiplier creates a dependence of the hash code value on the order in which the fields are processed, which ultimately generates a better hash function.

[to contents](#java-core)

## Tell us about cloning objects.

Using the assignment operator does not create a new object, but only copies a reference to the object. Thus, the two references point to the same memory location, to the same object. To create a new object with the same state, object cloning is used.

Class`Object`contains`protected`method`clone()`, which performs a bitwise copy of an object of a derived class. However, first you need to override the method`clone()`How`public`to make it possible to call it. In an overridden method, you should call the base version of the method`super.clone()`, which performs the actual cloning.

To finally make an object cloneable, the class must implement the interface`Cloneable`. Interface`Cloneable`does not contain methods, belongs to marker interfaces, and its implementation guarantees that the method`clone()`class`Object`will return an exact copy of the object that called it, reproducing the values ​​of all its fields. Otherwise the method throws an exception`CloneNotSupportedException`. It should be noted that when using this mechanism, an object is created without calling a constructor.

This solution is effective only if the fields of the cloned object are values ​​of base types and their wrappers or immutable object types. If the field of the cloned type is a mutable reference type, then a different approach is required for correct cloning. The reason is that when you create a copy of a field, the original and the copy are a reference to the same object. In this situation, you should also clone the class field object itself.

This cloning is only possible if the class attribute type also implements the interface`Cloneable`and overrides the method`clone()`. Since, if this is otherwise, calling the method is impossible due to its inaccessibility. It follows that if a class has a superclass, then to implement the mechanism for cloning the current descendant class, there must be a correct implementation of such a mechanism in the superclass. In this case, you should stop using advertisements`final`for fields of object types due to the impossibility of changing their values ​​when cloning is implemented.

In addition to the built-in cloning mechanism in Java, you can use the following to clone an object:

-   **Specialized copy constructor**- the class describes a constructor that accepts an object of the same class and initializes the fields of the created object with the values ​​of the fields of the passed one.
-   **Factory method**- (Factory method), which is a static method that returns an instance of its class.
-   **Serialization mechanism**- saving and subsequent restoration of an object to/from a byte stream.

[to contents](#java-core)

## What is the difference between_superficial_And_deep_cloning?

**Shallow copying**copies as little information about an object as possible. By default, cloning in Java is shallow, i.e. Class`Object`doesn't know about the structure of the class it's copying. This type of cloning is carried out by the JVM according to the following rules:

-   If a class only has members of primitive types, then an entirely new copy of the object will be created and a reference to that object will be returned.
-   If a class, in addition to members of primitive types, contains members of reference types, then references to objects of these classes are copied. Therefore, both objects will have the same references.

**Deep copy**duplicates absolutely all information of the object:

-   There is no need to copy primitive data separately;
-   All reference type members in the original class must support cloning. For each such member when overriding the method`clone()`should be called`super.clone()`;
-   If any member of a class does not support cloning, then in the clone method you need to create a new instance of that class and copy each of its members with all attributes to a new class object, one at a time.

[to contents](#java-core)

## Which cloning method is preferable?

The safest and therefore preferred way to clone is to use a specialized copy constructor:

-   No inheritance errors (no need to worry that heirs will have new fields that will not be cloned through the method`clone()`);
-   The cloning fields are specified explicitly;
-   Possibility to clone even`final`fields

[to contents](#java-core)

## Why method`clone()`declared in class`Object`, not in the interface`Cloneable`?

Method`clone()`declared in class`Object`indicating the modifier`native`to provide access to the standard shallow object copying mechanism. At the same time it was announced and how`protected`, so that this method cannot be called on objects that have not overridden it. Direct interface`Cloneable`is a marker (does not contain method declarations) and is needed only to indicate the very fact that this object is ready to be cloned. Calling an overridden method`clone()`in no`Cloneable`object will cause throwing`CloneNotSupportedException`.

[to contents](#java-core)

## Describe the hierarchy of exceptions.

Exceptions are divided into several classes, but they all have a common ancestor - the class`Throwable`, whose descendants are classes`Exception`And`Error`.

**Errors**are more serious problems that, according to the Java specification, should not be handled in a native program because they involve JVM-level problems. For example, exceptions of this kind occur if the memory available to the virtual machine has run out.

**Exceptions**are the result of problems in the program that are in principle solvable, predictable and the consequences of which can be eliminated within the program. For example, an integer was divided by zero.

[to contents](#java-core)

## What types of exceptions in Java do you know, how do they differ?

## What's happened_checked_And_unchecked exception_?

In Java, all exceptions are divided into two types:

-   **checked (checked exceptions)**must be processed by block`catch`or described in the method header (for example,`throws IOException`). The presence of such a handler/modifier in the method header is checked at the compilation stage;
-   **unchecked (unchecked/unchecked exceptions)**, which include errors`Error`(For example,`OutOfMemoryError`), which are not recommended to be handled, and runtime exceptions introduced by the class`RuntimeException`and his heirs (for example,`NullPointerException`), which may not be processed by the block`catch`and not be described in the method header.

[to contents](#java-core)

## Which operator allows you to force an exception to be thrown?

This is the operator`throw`:

```java
throw new Exception();
```

[to contents](#java-core)

## What does the keyword mean?`throws`?

Modifier`throws`is written in the method header and indicates that the method has the potential to throw an exception of the specified type.

[to contents](#java-core)

## How to write your own ("custom") exception?

It is necessary to inherit from the base class of the required exception type (for example, from`Exception`or`RuntimeException`).

```java
class CustomException extends Exception {
    public CustomException() {
        super();
    }

    public CustomException(final String string) {
        super(string + " is invalid");
    }

    public CustomException(final Throwable cause) {
        super(cause);
    }
}
```

[to contents](#java-core)

## Which ones exist?_unchecked exception_?

The most common:`ArithmeticException`,`ClassCastException`,`ConcurrentModificationException`,`IllegalArgumentException`,`IllegalStateException`,`IndexOutOfBoundsException`,`NoSuchElementException`,`NullPointerException`,`UnsupportedOperationException`.

[to contents](#java-core)

## What are class errors?`Error`?

Class errors`Error`represent the most serious problems at the JVM level. For example, exceptions of this kind occur if the memory available to the virtual machine has run out. It is not prohibited to handle such errors, but it is not recommended.

[to contents](#java-core)

## What do you know about`OutOfMemoryError`?

`OutOfMemoryError`thrown when the Java Virtual Machine is unable to create (allocate) an object due to insufficient memory and the garbage collector cannot free enough memory.

The memory area occupied by a java process consists of several parts. Type`OutOfMemoryError`depends on which of them did not have enough space:

-   `java.lang.OutOfMemoryError: Java heap space`: There is not enough space in the heap, namely, in the memory area in which objects created programmatically in the application are placed. Usually the problem lies in a memory leak. The size is set by parameters`-Xms`And`-Xmx`.
-   `java.lang.OutOfMemoryError: PermGen space`: (before Java 8) This error occurs when there is not enough space in the_Permanent_area, the size of which is specified by parameters`-XX:PermSize`And`-XX:MaxPermSize`.
-   `java.lang.OutOfMemoryError: GC overhead limit exceeded`: This error can occur both when the first and second areas are overflowed. This is due to the fact that there is little memory left and the garbage collector is constantly working, trying to free up some space. This error can be disabled using the parameter`-XX:-UseGCOverheadLimit`.
-   `java.lang.OutOfMemoryError: unable to create new native thread`: Thrown when no new threads can be created.

[to contents](#java-core)

## Describe the operation of the block_try-catch-finally_.

`try`— this keyword is used to mark the beginning of a block of code that could potentially lead to an error.`catch`— a keyword to mark the beginning of a block of code designed to intercept and handle exceptions if they occur.`finally`is a keyword to mark the beginning of a block of code that is optional. This block is placed after the last block`catch`. Control is transferred to the block`finally`either way, whether an exception was thrown or not.

The general form of the construction for handling an exception looks like this:

```java
try { 
    //код, который потенциально может привести к исключительной ситуации 
} 
catch(SomeException e ) { //в скобках указывается класс конкретной ожидаемой ошибки  
    //код обработки исключительной ситуации
} 
finally {
    //необязательный блок, код которого выполняется в любом случае
}
```

[to contents](#java-core)

## What is mechanism_try-with-resources_?

This design, which appeared in Java 7, allows you to use a block_try-catch_without worrying about closing resources used in a given code segment.
Resources are declared in parentheses immediately after`try`, a compiler already itself creates the section`finally`, in which the resources occupied in the block are released. Resources are entities that implement an interface`java.lang.Autocloseable`.

General view of the design:

```java
try(/*объявление ресурсов*/) {
    //...
} catch(Exception ex) {
    //...
} finally {
    //...
}
```

It is worth noting that the blocks`catch`and explicit`finally`are executed after the resources are closed in an implicit`finally`.

[to contents](#java-core)

## Is it possible to use a block_try-finally_(without`catch`)?

Such an entry is acceptable, but there is not much sense in such an entry; it is still better to have a block`catch`, which will handle the required exception.

[to contents](#java-core)

## Can one block`catch`catch multiple exceptions at once?

In Java 7, a new language construct has become available that allows you to catch multiple exceptions in one block`catch`:

```java
try {  
    //...
} catch(IOException | SQLException ex) {
    //...
}
```

[to contents](#java-core)

## Is the block always executed?`finally`?

Code in block`finally`will always be executed, regardless of whether an exception is thrown or not.

[to contents](#java-core)

## Are there situations where a block`finally`will not be fulfilled?

For example, when the JVM "dies" - in such a situation`finally`is unreachable and will not be executed, since a forced system exit from the program occurs:

```java
try { 
    System.exit(0); 
} catch(Exception e) { 
    e.printStackTrace(); 
} finally { }
```

[to contents](#java-core)

## Can the method_main()_throw an exception externally and if so, where will this exception be processed?

Maybe it will be transferred to the Java Virtual Machine (JVM).

[to contents](#java-core)

## Suppose there is a method that can throw`IOException`And`FileNotFoundException`in what order should the blocks go?`catch`? How many blocks`catch`will it be done?

The general rule is that you need to handle exceptions from “minor” to “major”. Those. cannot be placed in the first block`catch(Exception ex) {}`, otherwise all further blocks`catch()`They won’t be able to process anything anymore, because... any exception will match the handler`catch(Exception ex)`.

Thus, based on the fact that`FileNotFoundException extends IOException`needs to be processed first`FileNotFoundException`, and then`IOException`:

```java
void method() {
    try {
        //...
    } catch (FileNotFoundException ex) {
        //...
    } catch (IOException ex) {
        //...
    }
}
```

[to contents](#java-core)

## What's happened_generics_?

**Generics**is a technical term denoting a set of language properties that allow you to define and use generic types and methods. Generic types or methods differ from regular ones in that they have typed parameters.

An example of using generic types is_Java Collection Framework_. Yes, cool`LinkedList<E>`- a typical generalized type. It contains the parameter`E`, which represents the type of elements that will be stored in the collection. Objects of generic types are created by replacing parameterized types with real data types. Instead of just using`LinkedList`without saying anything about the type of the element in the list, it is suggested to use an exact type specification`LinkedList<String>`,`LinkedList<Integer>`etc.

[to contents](#java-core)

## What's happened_"internationalization"_,_"localization"_?

**Internationalization**- a way of creating applications in which they can be easily adapted for different audiences speaking different languages.

**Localization**- adaptation of the application interface to several languages. Adding a new language can introduce certain difficulties into interface localization.

[to contents](#java-core)

# Sources

-   [Quizful](http://www.quizful.net/interview/java/)
-   [JavaStudy.ru](http://javastudy.ru/interview/java-oop2/)
-   [ggenikus.github.io](https://ggenikus.github.io/blog/2014/05/04/gc/)
-   [St. Petersburg JVM testing group](https://blogs.oracle.com/vmrobot/entry/основы_сборки_мусора_в_hotspot)
-   [Object-oriented programming](http://oop-java.blogspot.ru/2006/02/blog-post_21.html)
-   [JavaRush](http://info.javarush.ru/)

[Interview Questions](README.md)
