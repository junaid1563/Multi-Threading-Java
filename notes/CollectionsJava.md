[Interview Questions](README.md)

# Java Collections Framework


- [What's happened "collection"?](#whats-happened_collection_)
- [Name the main JCF interfaces and their implementations.](#name-the-main-jcf-interfaces-and-their-implementations)
- [Arrange the following interfaces in a hierarchy: `List`, `Set`, `Map`, `SortedSet`, `SortedMap`, `Collection`, `Iterable`, `Iterator`, `NavigableSet`, `NavigableMap`.](#arrange-the-following-interfaces-in-a-hierarchy-list-set-map-sortedset-sortedmap-collection-iterable-iterator-navigableset-navigablemap)
- [Why `Map` is not `Collection`, while `List` and `Set` are `Collection`?](#why-map--this-is-notcollection-while-listandsetarecollection)
- [What is the difference between the classes `java.util.Collection` and `java.util.Collections`?](#what-is-the-difference-between-the-classes-javautilcollectionand-javautilcollections)
- [What is “fail-fast behavior”?](#what-is-fail-fast-behavior)
- [What's the difference between fail-fast and fail-safe?](#whats-the-difference-between-fail-fast-and-fail-safe)
- [Give examples of iterators that implement fail-safe behavior](#give-examples-of-iterators-that-implement-fail-safe-behavior)
- [How are they different? `Enumeration` and `Iterator`.](#how-are-they-different-enumerationanditerator)
- [How are they connected? `Iterable` and `Iterator`?](#how-are-they-connected-iterableanditerator)
- [How are they connected? `Iterable`, `Iterator` and "for-each"?](#how-are-they-connected-iterableiteratorand-for-each)
- [Compare `Iterator` and `ListIterator`.](#compare-iteratorandlistiterator)
- [What happens when called `Iterator.next()` without prior call `Iterator.hasNext()`?](#what-happens-when-called-iteratornext-without-prior-call-iteratorhasnext)
- [How many elements will be skipped if `Iterator.next()` will be called after 10 calls `Iterator.hasNext()`?](#how-many-elements-will-be-skipped-if-iteratornext-will-be-called-after-10-calls-iteratorhasnext)
- [How will the collection behave if you call `iterator.remove()`?](#how-will-the-collection-behave-if-you-call-iteratorremove)
- [How will an already instantiated iterator behave for `collection`, if called `collection.remove()`?](#how-will-an-already-instantiated-iterator-behave-for-collection-if-called-collectionremove)
- [How to avoid `ConcurrentModificationException` while iterating through a collection?](#how-to-avoid-concurrentmodificationexception-while-iterating-through-a-collection)
- [Which collection implements the FIFO service discipline?](#which-collection-implements-the-fifo-service-discipline)
- [Which collection implements the FILO service discipline?](#which-collection-implements-the-filo-service-discipline)
- [How is it different? `ArrayList` from `Vector`?](#how-is-it-different-arraylist-fromvector)
- [Why did they add it? `ArrayList`, if you've already been `Vector`?](#why-did-they-add-it-arraylist-if-youve-already-beenvector)
- [How is it different? `ArrayList` from `LinkedList`? In what cases is it better to use the first one, and in what cases the second one?](#how-is-it-different-arraylist-fromlinkedlist-in-what-cases-is-it-better-to-use-the-first-one-and-in-what-cases-the-second-one)
- [What works faster? `ArrayList` or `LinkedList`?](#what-works-faster-arraylistorlinkedlist)
- [What is the worst running time of the method `contains()` for an element that is in `LinkedList`?](#what-is-the-worst-running-time-of-the-method-contains-for-an-element-that-is-inlinkedlist)
- [What is the worst running time of the method `contains()` for an element that is in `ArrayList`?](#what-is-the-worst-running-time-of-the-method-contains-for-an-element-that-is-inarraylist)
- [What is the worst running time of the method `add()` for `LinkedList`?](#what-is-the-worst-running-time-of-the-method-add-forlinkedlist)
- [What is the worst running time of the method `add()` for `ArrayList`?](#what-is-the-worst-running-time-of-the-method-add-forarraylist)
- [Need to add 1 million elements, what structure are you using?](#need-to-add-1-million-elements-what-structure-are-you-using)
- [How to remove elements from `ArrayList`? How does the size change in this case? `ArrayList`?](#how-to-remove-elements-from-arraylist-how-does-the-size-change-in-this-case-arraylist)
- [Propose an efficient algorithm for removing several adjacent elements from the middle of a list, implemented by `ArrayList`.](#propose-an-efficient-algorithm-for-removing-several-adjacent-elements-from-the-middle-of-a-list-implemented-by-arraylist)
- [How much additional memory is needed when calling `ArrayList.add()`?](#how-much-additional-memory-is-needed-when-calling-arraylistadd)
- [How much additional memory is allocated when calling `LinkedList.add()`?](#how-much-additional-memory-is-allocated-when-calling-linkedlistadd)
- [Estimate the amount of memory for storing one primitive type `byte` in `LinkedList`?](#estimate-the-amount-of-memory-for-storing-one-primitive-type-byte-inlinkedlist)
- [Estimate the amount of memory for storing one primitive type `byte` in `ArrayList`?](#estimate-the-amount-of-memory-for-storing-one-primitive-type-byte-inarraylist)
- [For `ArrayList` or for `LinkedList` operation of adding an element to the middle (`list.add(list.size()/2, newElement)`) slower?](#for-arraylist-or-for-linkedlist-operation-of-adding-an-element-to-the-middle-listaddlistsize2-newelement-slower)
- [In the class implementation `ArrayList` there are the following fields: `Object[] elementData`, `int size`. Explain why to store separately `size`, if you can always take `elementData.length`?](#in-the-class-implementation-arraylist-there-are-the-following-fields-object-elementdata-int-size-explain-why-to-store-separately-size-if-you-can-always-take-elementdatalength)
- [Compare interfaces `Queue` and `Deque`.](#compare-interfaces-queueanddeque)
- [Who is expanding who? `Queue` expands `Deque`, or `Deque` expands `Queue`?](#who-is-expanding-who-queue-expandsdeque-or-deque-expandsqueue)
- [Why `LinkedList` implements both `List` and `Deque`?](#why-linkedlist-implements-both-list-and-deque)
- [`LinkedList` - is it a singly, doubly, or four linked list?](#linkedlist---is-it-a-singly-doubly-or-four-linked-list)
- [How to iterate over elements `LinkedList` in reverse order without using slow `get(index)`?](#how-to-iterate-over-elements-linkedlist-in-reverse-order-without-using-slow-getindex)
- [What does `PriorityQueue` allow you to do?](#what-does-priorityqueue-allow-you-to-do)
- [`Stack` is considered "obsolete". What is recommended to replace it with? Why?](#stack-is-considered-obsolete-what-is-recommended-to-replace-it-with-why)
- [Why is `HashMap` needed, if there is `Hashtable`?](#why-is-hashmap-needed-if-there-is-hashtable)
- [What is the difference between `HashMap` and `IdentityHashMap`? What is `IdentityHashMap` for?](#what-is-the-difference-between-hashmap-and-identityhashmap-what-is-identityhashmap-for)
- [What is the difference between `HashMap` and `WeakHashMap`? What is `WeakHashMap` used for?](#what-is-the-difference-between-hashmap-and-weakhashmap-what-is-weakhashmap-used-for)
- [In `WeakHashMap` WeakReferences are used. Why not create `SoftHashMap` on SoftReferences?](#in-weakhashmap-weakreferences-are-used-why-not-create-softhashmap-on-softreferences)
- [In `WeakHashMap` WeakReferences are used. Why not create `PhantomHashMap` on Phantom References?](#in-weakhashmap-weakreferences-are-used-why-not-create-phantomhashmap-on-phantom-references)
- [`LinkedHashMap` - what's in it from `LinkedList`, and what from `HashMap`?](#linkedhashmap---whats-in-it-from-linkedlist-and-what-from-hashmap)
- [What does “sorting” mean in `SortedMap`, except that `toString()` outputs all elements in order?](#what-does-sorting-mean-in-sortedmap-except-that-tostring-outputs-all-elements-in-order)
- [How does `HashMap` work?](#how-does-hashmap-work)
- [According to Knuth and Cormen, there are two main hash table implementations: open addressing based and chaining based. How is `HashMap` implemented? Why do you think this particular implementation was chosen? What are the pros and cons of each approach?](#according-to-knuth-and-cormen-there-are-two-main-hash-table-implementations-open-addressing-based-and-chaining-based-how-is-hashmap-implemented-why-do-you-think-this-particular-implementation-was-chosen-what-are-the-pros-and-cons-of-each-approach)
- [How does `HashMap` work when trying to save two elements into it using keys with the same `hashCode()`, but for which `equals() == false`?](#how-does-hashmap-work-when-trying-to-save-two-elements-into-it-using-keys-with-the-same-hashcode-but-for-which-equals--false)
- [What is the initial number of buckets in `HashMap`?](#what-is-the-initial-number-of-buckets-in-hashmap)
- [What is the estimate of the time complexity of operations on elements from `HashMap`? Does `HashMap` guarantee the specified complexity of selecting an element?](#what-is-the-estimate-of-the-time-complexity-of-operations-on-elements-from-hashmap-does-hashmap-guarantee-the-specified-complexity-of-selecting-an-element)
- [Is it possible to have a situation where `HashMap` will degenerate into a list even with keys that have different `hashCode()`?](#is-it-possible-to-have-a-situation-where-hashmap-will-degenerate-into-a-list-even-with-keys-that-have-different-hashcode)
- [In what case can an element be lost in `HashMap`?](#in-what-case-can-an-element-be-lost-in-hashmap)
- [Why can't you use `byte[]` as a key in `HashMap`?](#why-cant-you-use-byte-as-a-key-in-hashmap)
- [What is the role of `equals()` and `hashCode()` in `HashMap`?](#what-is-the-role-of-equals-and-hashcode-in-hashmap)
- [What is the maximum number of values for `hashCode()`?](#what-is-the-maximum-number-of-values-for-hashcode)
- [What is the worst running time of the get(key) method for a key that is not in `HashMap`?](#what-is-the-worst-running-time-of-the-getkey-method-for-a-key-that-is-not-in-hashmap)
- [What is the worst running time of the get(key) method for a key that is in `HashMap`?](#what-is-the-worst-running-time-of-the-getkey-method-for-a-key-that-is-in-hashmap)
- [Why, despite the fact that the key in `HashMap` is not required to implement the interface `Comparable`, can a doubly linked list always be converted to a red-black tree?](#why-despite-the-fact-that-the-key-in-hashmap-is-not-required-to-implement-the-interface-comparable-can-a-doubly-linked-list-always-be-converted-to-a-red-black-tree)
- [How many transitions occur at the time of the call `HashMap.get(key)` by key that is in the table?](#how-many-transitions-occur-at-the-time-of-the-call-hashmapgetkey-by-key-that-is-in-the-table)
- [How many new objects are created when you add a new element to `HashMap`?](#how-many-new-objects-are-created-when-you-add-a-new-element-to-hashmap)
- [How and when does the number of buckets increase in `HashMap`?](#how-and-when-does-the-number-of-buckets-increase-in-hashmap)
- [Explain the meaning of parameters in a constructor `HashMap(int initialCapacity, float loadFactor)`.](#explain-the-meaning-of-parameters-in-a-constructor-hashmapint-initialcapacity-float-loadfactor)
- [Will `HashMap` work, if all added keys have the same `hashCode()`?](#will-hashmap-work-if-all-added-keys-have-the-same-hashcode)
- [How to iterate through all the keys in `Map`?](#how-to-iterate-through-all-the-keys-in-map)
- [How to loop through all values in `Map`?](#how-to-loop-through-all-values-in-map)
- [How to iterate through all key-value pairs in `Map`?](#how-to-iterate-through-all-key-value-pairs-in-map)
- [What are the differences between `TreeSet` and `HashSet`?](#what-are-the-differences-between-treeset-and-hashset)
- [What happens if you add elements to `TreeSet` in ascending order?](#what-happens-if-you-add-elements-to-treeset-in-ascending-order)
- [How is `LinkedHashSet` different from `HashSet`?](#how-is-linkedhashset-different-from-hashset)
- [For `Enum` there is a special class `java.util.EnumSet`. For what? What the authors weren’t happy with `HashSet` or `TreeSet`?](#for-enum-there-is-a-special-class-javautilenumset-for-what-what-the-authors-werent-happy-with-hashset-or-treeset)
- [What ways are there to iterate over the elements of a list?](#what-ways-are-there-to-iterate-over-the-elements-of-a-list)
- [How can I get synchronized objects of standard collections?](#how-can-i-get-synchronized-objects-of-standard-collections)
- [How to get a read-only collection?](#how-to-get-a-read-only-collection)
- [Write a single threaded program that causes a collection to throw `ConcurrentModificationException`.](#write-a-single-threaded-program-that-causes-a-collection-to-throw-concurrentmodificationexception)
- [Give an example when some collection throws `UnsupportedOperationException`.](#give-an-example-when-some-collection-throws-unsupportedoperationexception)
- [Implement the symmetric difference of two collections using the methods `Collection` (`addAll(...)`, `removeAll(...)`, `retainAll(...)`).](#implement-the-symmetric-difference-of-two-collections-using-the-methods-collection-addall-removeall-retainall)
- [How to make a cache with “invalidation policy” using LinkedHashMap?](#how-to-make-a-cache-with-invalidation-policy-using-linkedhashmap)
- [How to copy any elements in one line from `collection` to an array?](#how-to-copy-any-elements-in-one-line-from-collection-to-an-array)
- [As one call from `List` get `List` with all elements except the first and last 3?](#as-one-call-from-list-get-list-with-all-elements-except-the-first-and-last-3)
- [How to convert in one line from `HashSet` to `ArrayList`?](#how-to-convert-in-one-line-from-hashset-to-arraylist)
- [How to convert in one line from `ArrayList` to `HashSet`?](#how-to-convert-in-one-line-from-arraylist-to-hashset)
- [Make `HashSet` from the keys of `HashMap`.](#make-hashset-from-the-keys-of-hashmap)
- [Make `HashMap` from `HashSet<Map.Entry<K, V>>`.](#make-hashmap-from-hashsetmapentryk-v)

## What's happened_"collection"_?

_"Collection"_is a data structure, a set of objects. Data (objects in a set) can be numbers, strings, objects of custom classes, etc.

[to contents](#java-collections-framework)

## Name the main JCF interfaces and their implementations.

At the top of the hierarchy in the Java Collection Framework there are 2 interfaces:`Collection`And`Map`. These interfaces divide all collections included in the framework into two parts according to the type of data storage: simple sequential sets of elements and sets of key-value pairs, respectively.

Interface`Collection`extend interfaces:

-   `List`(list) is a collection in which duplicate values ​​are allowed. Implementations:
    -   `ArrayList`- encapsulates a regular array, the length of which automatically increases when new elements are added. The elements of such a collection are numbered, starting from zero, and can be accessed by index.
    -   `LinkedList`(bidirectional linked list) - consists of nodes, each of which contains both the data itself and two links to the next and previous node.
    -   `Vector`— implementation of a dynamic array of objects, the methods of which are synchronized.
    -   `Stack`— LIFO (last-in-first-out) stack implementation.
-   `Set`(set) describes an unordered collection containing no repeating elements. Implementations:
    -   `HashSet`- uses HashMap to store data. The element being added is used as the key, and the Object stub is used as the value. Due to implementation issues, the order of elements is not guaranteed when added.
    -   `LinkedHashSet`— guarantees that the order of elements when traversing the collection will be identical to the order in which elements were added.
    -   `TreeSet`— provides the ability to control the order of elements in a collection using an object`Comparator`, or saves elements using “natural ordering”.
-   `Queue`(queue) is designed to store elements with a predefined FIFO (first-in-first-out) insertion and retrieval method:
    -   `PriorityQueue`— provides the ability to control the order of elements in a collection using an object`Comparator`, or saves elements using “natural ordering”.
    -   `ArrayDeque`— implementation of the interface`Deque`, which extends the interface`Queue`methods that allow you to implement a LIFO (last-in-first-out) type construction.

Interface`Map`implemented by classes:

-   `Hashtable`is a hash table whose methods are synchronized. Does not allow use`null`as a value or key and is not ordered.
-   `HashMap`- hash table. Allows you to use`null`as a value or key and is not ordered.
-   `LinkedHashMap`— an ordered implementation of a hash table.
-   `TreeMap`— implementation based on red-black trees. Is ordered and provides the ability to control the order of elements in a collection using an object`Comparator`, or saves elements using “natural ordering”.
-   `WeakHashMap`is a hash table implementation that is organized using_weak references_for keys (the garbage collector will automatically remove the element from the collection at the next garbage collection if there are no hard links to the element's key).

[to contents](#java-collections-framework)

## Arrange the following interfaces in a hierarchy:`List`,`Set`,`Map`,`SortedSet`,`SortedMap`,`Collection`,`Iterable`,`Iterator`,`NavigableSet`,`NavigableMap`.

-   `Iterable`
    -   `Collection`
        -   `List`
        -   `Set`
            -   `SortedSet`
                -   `NavigableSet`
-   `Map`
    -   `SortedMap`
        -   `NavigableMap`
-   `Iterator`

[to contents](#java-collections-framework)

## Why`Map`- this is not`Collection`, while`List`And`Set`are`Collection`?

`Collection`is a collection of certain elements.`Map`is a collection of key-value pairs.

[to contents](#java-collections-framework)

## What is the difference between the classes`java.util.Collection`And`java.util.Collections`?

`java.util.Collections`- a set of static methods for working with collections.

`java.util.Collection`- one of the main interfaces of the Java Collections Framework.

[to contents](#java-collections-framework)

## What is “fail-fast behavior”?

**fail-fast behavior**means that if an error or a condition that could lead to an error occurs, the system immediately stops further operation and notifies about it. Using a fail-fast approach allows you to avoid non-deterministic program behavior over time.

In the Java Collections API, some iterators behave like fail-fast and throw away`ConcurrentModificationException`, if after its creation the collection was modified, i.e. added or removed an element directly from the collection rather than using iterator methods.

This behavior is implemented by counting the number of modifications of the collection (modification count):

-   when the collection changes, the modification counter also changes;
-   when creating an iterator, the current counter value is passed to it;
-   Each time the iterator is accessed, the stored counter value is compared with the current one, and if they do not match, an exception is thrown.

[to contents](#java-collections-framework)

## What's the difference between fail-fast and fail-safe?

In contrast to fail-fast, fail-safe iterators do not throw any exceptions when the structure changes because they operate on a clone of the collection instead of the original.

[to contents](#java-collections-framework)

## Give examples of iterators that implement fail-safe behavior

Collection Iterator`CopyOnWriteArrayList`and the view iterator`keySet`collections`ConcurrentHashMap`are examples of fail-safe iterators.

[to contents](#java-collections-framework)

## How are they different?`Enumeration`And`Iterator`.

Although both interfaces are designed to traverse collections, there are significant differences between them:

-   by using`Enumeration`you cannot add/remove elements;
-   V`Iterator`fixed method names to improve code readability (`Enumeration.hasMoreElements()`corresponds`Iterator.hasNext()`,`Enumeration.nextElement()`corresponds`Iterator.next()`etc);
-   `Enumeration`present in legacy classes such as`Vector`/`Stack`, whereas`Iterator`found in all modern collection classes.

[to contents](#java-collections-framework)

## How are they connected?`Iterable`And`Iterator`?

Interface`Iterable`has only one method -`iterator()`which returns`Iterator`.

[to contents](#java-collections-framework)

## How are they connected?`Iterable`,`Iterator`и «for-each»?

Classes that implement the interface`Iterable`, can be used in the design`for-each`which uses`Iterator`.

[to contents](#java-collections-framework)

## Compare`Iterator`And`ListIterator`.

-   `ListIterator`extends the interface`Iterator`
-   `ListIterator`can only be used to iterate over the elements of a collection`List`;
-   `Iterator`allows you to iterate over elements in one direction only, using the method`next()`. While`ListIterator`allows you to iterate over a list in both directions using methods`next()`And`previous()`;
-   `ListIterator`does not point to a specific element: its current position is located between elements that return methods`previous()`And`next()`.
-   With help`ListIterator`you can modify the list by adding/removing elements using methods`add()`And`remove()`.`Iterator`does not support this functionality.

[to contents](#java-collections-framework)

## What happens when called`Iterator.next()`without prior call`Iterator.hasNext()`?

If the iterator points to the last element of the collection, an exception will be thrown`NoSuchElementException`, otherwise the next element will be returned.

[to contents](#java-collections-framework)

## How many elements will be skipped if`Iterator.next()`will be called after 10 calls`Iterator.hasNext()`?

Not at all -`hasNext()`only checks for the presence of the next element.

[to contents](#java-collections-framework)

## How will the collection behave if you call`iterator.remove()`?

If I call`iterator.remove()`preceded by a challenge`iterator.next()`, That`iterator.remove()`remove the collection element pointed to by the iterator, otherwise it will be thrown`IllegalStateException()`.

[to contents](#java-collections-framework)

## How will an already instantiated iterator behave for`collection`, if called`collection.remove()`?

The next time the iterator methods are called, it will throw`ConcurrentModificationException`.

[to contents](#java-collections-framework)

## How to avoid`ConcurrentModificationException`while iterating through a collection?

-   Try to select or implement yourself another iterator that works according to the fail-safe principle.
-   Use`ConcurrentHashMap`And`CopyOnWriteArrayList`.
-   Convert the list to an array and iterate through the array.
-   Block list changes while searching using a block`synchronized`.

The downside to the last two options is performance degradation.

[to contents](#java-collections-framework)

## Which collection implements the FIFO service discipline?

FIFO, First-In-First-Out (“first in, first out”) - the collection is built on this principle`Queue`.

[to contents](#java-collections-framework)

## Which collection implements the FILO service discipline?

FILO, First-In-Last-Out (“first to come, last to leave”) - the collection is built on this principle`Stack`.

[to contents](#java-collections-framework)

## How is it different?`ArrayList`from`Vector`?

## Why did they add it?`ArrayList`, if you've already been`Vector`?

-   Class Methods`Vector`synchronized and`ArrayList`- No;
-   By default,`Vector`doubles its size when the memory allocated for elements runs out.`ArrayList`it increases its size only by half.

`Vector`This is a deprecated class and its use is deprecated.

[to contents](#java-collections-framework)

## How is it different?`ArrayList`from`LinkedList`? In what cases is it better to use the first one, and in what cases the second one?

`ArrayList`this is a list implemented based on an array, and`LinkedList`is a classic doubly linked list based on objects with links between them.

`ArrayList`:

-   access to an arbitrary element by index in_constant_time_O(1)_;
-   access elements by value_linear_time_O(N)_;
-   insertion at the end takes on average_constant_time_O(1)_;
-   Removing an arbitrary element from the list takes a significant amount of time because... in this case, all elements located “to the right” are shifted one cell to the left (the actual size of the array (capacity) does not change);
-   inserting an element into an arbitrary place in the list takes considerable time because in this case, all elements located “to the right” are shifted one cell to the right;
-   minimum overhead costs during storage.

`LinkedList`:

-   to get an element by index or value will require_linear_time_O(N)_;
-   but the first and last element of the list is always accessed in_constant_time_O(1)_— links are constantly stored to the first and last element;
-   to add and remove to the beginning or end of the list you will need_constant__O(1)_;
-   insertion or deletion to/from any location_constant__O(1)_;
-   but searching for the insertion and deletion position is_linear_time_O(N)_;
-   requires more memory to store the same number of elements, because in addition to the element itself, pointers to the next and previous elements of the list are also stored.

Generally,`LinkedList`loses in absolute terms`ArrayList`both in terms of memory consumption and speed of operations.`LinkedList`It is preferable to use when frequent insertion/removal operations are needed or in cases where a guaranteed time for adding an element to the list is needed.

[to contents](#java-collections-framework)

## What works faster?`ArrayList`or`LinkedList`?

It depends on what actions will be performed on the structure.

cm.[How is it different?`ArrayList`from`LinkedList`](#Чем-отличается-arraylist-от-linkedlist-В-каких-случаях-лучше-использовать-первый-а-в-каких-второй)

[to contents](#java-collections-framework)

## What is the worst running time of the method`contains()`for an element that is in`LinkedList`?

_O(N)_. The time it takes to search for an element is linearly proportional to the number of elements in the list.

[to contents](#java-collections-framework)

## What is the worst running time of the method`contains()`for an element that is in`ArrayList`?

_O(N)_. The time to search for an element is linearly proportional to the number of elements in the list.

[to contents](#java-collections-framework)

## What is the worst running time of the method`add()`for`LinkedList`?

_O(N)_. Adding to the beginning/end of the list takes time_O(1)_.

[to contents](#java-collections-framework)

## What is the worst running time of the method`add()`for`ArrayList`?

_O(N)_. Inserting an element at the end of the list takes time_O(1)_, but if the array capacity is insufficient, then a new array is created with an increased size and all elements from the old array are copied to the new one.

[to contents](#java-collections-framework)

## Need to add 1 million elements, what structure are you using?

An unambiguous answer can only be given based on information about which part of the list elements are added to, what will then happen to the list elements, and whether there are any restrictions on memory or execution speed.

cm.[How is it different?`ArrayList`from`LinkedList`](#Чем-отличается-arraylist-от-linkedlist-В-каких-случаях-лучше-использовать-первый-а-в-каких-второй)

[to contents](#java-collections-framework)

## How to remove elements from`ArrayList`? How does the size change in this case?`ArrayList`?

When removing an arbitrary element from the list, all elements located “to the right” are shifted one cell to the left and the actual size of the array (its capacity) does not change in any way. There is a mechanism for automatically “expanding” an array, but there is no automatic “compression”; you can only explicitly perform “compression” with the command`trimToSize()`.

[to contents](#java-collections-framework)

## Propose an efficient algorithm for removing several adjacent elements from the middle of a list, implemented by`ArrayList`.

Let's say you need to delete`n`elements from position`m`on the list. Instead of performing a single element removal`n`times (each time shifting by 1 position the elements that are “to the right” in the list), you need to shift all the elements that are “to the right”`n + m`positions on`n`elements “to the left” to the beginning of the list. So instead of doing`n`iterations of moving list elements, everything is done in 1 pass. But if we talk about overall efficiency, then the fastest way would be using`System.arraycopy()`, and you can access it through the method -`subList(int fromIndex, int toIndex)`

Example:

```java
import java.io.*;
import java.util.ArrayList;

public class Main {
    //позиция, с которой удаляем
    private static int m = 0;
    //количество удаляемых элементов
    private static int n = 0;
    //количество элементов в списке
    private static final int size = 1000000;
    //основной список (для удаления вызовом remove() и его копия для удаления путём перезаписи)
    private static ArrayList<Integer> initList, copyList;
    
    public static void main(String[] args){
        
        initList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            initList.add(i);
        }
        System.out.println("Список из 1.000.000 элементов заполнен");
        
        copyList = new ArrayList<>(initList);
        System.out.println("Создана копия списка\n");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("С какой позиции удаляем? > ");
            m = Integer.parseInt(br.readLine());
            System.out.print("Сколько удаляем? > ");
            n = Integer.parseInt(br.readLine());
        } catch(IOException e){
            System.err.println(e.toString());
        }
        System.out.println("\nВыполняем удаление вызовом remove()...");
        long start = System.currentTimeMillis();
        
        for (int i = m - 1; i < m + n - 1; i++) {
            initList.remove(i);
        }
        
        long finish = System.currentTimeMillis() - start;
        System.out.println("Время удаления с помощью вызова remove(): " + finish);
        System.out.println("Размер исходного списка после удаления: " + initList.size());
        
        System.out.println("\nВыполняем удаление путем перезаписи...\n");
        start = System.currentTimeMillis();
        
        removeEfficiently();
        
        finish = System.currentTimeMillis() - start;
        System.out.println("Время удаления путём смещения: " + finish);
        System.out.println("Размер копии списка:" + copyList.size());

        System.out.println("\nВыполняем удаление через SubList...\n");
        start = System.currentTimeMillis();

        initList.subList(m - 1, m + n).clear();

        finish = System.currentTimeMillis() - start;
        System.out.println("Время удаления через саблист: " + finish);
        System.out.println("Размер копии списка:" + copyList.size());
    }
    
    private static void removeEfficiently(){
        /* если необходимо удалить все элементы, начиная с указанного,
         * то удаляем элементы с конца до m
         */
        if (m + n >= size){
            int i = size - 1;
            while (i != m - 1){
                copyList.remove(i);
                i--;
            }
        } else{
            //переменная k необходима для отсчёта сдвига начиная от места вставка m
            for (int i  = m + n, k = 0; i < size; i++, k++) {
               copyList.set(m + k, copyList.get(i));
            }
            
            /* удаляем ненужные элементы в конце списка
             * удаляется всегда последний элемент, так как время этого действия
             * фиксировано и не зависит от размера списка
             */
            int i = size - 1;
            while (i != size - n - 1){
                copyList.remove(i);
                i--;
            }
            //сокращаем длину списка путём удаления пустых ячеек
            copyList.trimToSize();
        }
    }
}
```

Execution result:

    run:
    Список из 1.000.000 элементов заполнен
    Создана копия списка

    С какой позиции удаляем? > 600000
    Сколько удаляем? > 20000

    Выполняем удаление вызовом remove()...
    Время удаления с помощью вызова remove(): 928
    Размер исходного списка после удаления: 980000

    Выполняем удаление путем перезаписи...

    Время удаления путём смещения: 17
    Размер копии списка:980000

    Выполняем удаление через SubList...

    Время удаления через саблист: 1
    Размер копии списка:980000
    СБОРКА УСПЕШНО ЗАВЕРШЕНА (общее время: 33 секунды)

[to contents](#java-collections-framework)

## How much additional memory is needed when calling`ArrayList.add()`?

If there is enough space in the array to accommodate the new element, then no additional memory is required. Otherwise, a new array is created with a size 1.5 times larger than the existing one (this is true for JDK above 1.7, in earlier versions the increase size is different).

[to contents](#java-collections-framework)

## How much additional memory is allocated when calling`LinkedList.add()`?

One new instance of the nested class is created`Node`.

[to contents](#java-collections-framework)

## Estimate the amount of memory for storing one primitive type`byte`V`LinkedList`?

Each element`LinkedList`stores a link to the previous element, the next element and a link to the data.

```java
private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;
//...
}
```

For 32-bit systems, each link occupies 32 bits (4 bytes). The object (header) of the nested class itself`Node`takes 8 bytes. 4 + 4 + 4 + 8 = 20 bytes, and since The size of each object in Java is a multiple of 8, so we get 24 bytes. Type primitive`byte`takes up 1 byte of memory, but in JCF primitives are packed: an object of type`Byte`occupies 16 bytes in memory (8 bytes per object header, 1 byte per type field`byte`and 7 bytes for multiplicity 8). Let me also remind you that values ​​from -128 to 127 are cached and new objects are not created for them each time. Thus, in the x32 JVM, 24 bytes are spent storing one element in the list and 16 bytes are spent storing a boxed object of type`Byte`. Total 40 bytes.

For a 64-bit JVM, each reference occupies 64 bits (8 bytes), the header size of each object is 16 bytes (two machine words). The calculations are similar: 8 + 8 + 8 + 16 = 40 bytes and 24 bytes. Total 64 bytes.

[to contents](#java-collections-framework)

## Estimate the amount of memory for storing one primitive type`byte`V`ArrayList`?

`ArrayList`is based on an array, for primitive data types the value is automatically packed, so 16 bytes are spent on storing the packed object and 4 bytes (8 for x64) on storing a reference to this object in the data structure itself. Thus, in the x32 JVM, 4 bytes are used to store one element and 16 bytes are used to store a packed object of type`Byte`. For x64 - 8 bytes and 24 bytes, respectively.

[to contents](#java-collections-framework)

## For`ArrayList`or for`LinkedList`operation of adding an element to the middle (`list.add(list.size()/2, newElement)`) slower?

For`ArrayList`:

-   checking the array for capacity. If the capacity is not enough, then increase the size of the array and copy all elements into a new array (_O(N)_);
-   copies all elements to the right of the insertion position one position to the right (_O(N)_);
-   insert element (_O(1)_).

For`LinkedList`:

-   search for insertion position (_O(N)_);
-   insert element (_O(1)_).

In the worst case, inserting into the middle of the list is more efficient for`LinkedList`. In the rest - most likely for`ArrayList`, since copying of elements is carried out by calling the fast system method`System.arraycopy()`.

[to contents](#java-collections-framework)

## In the class implementation`ArrayList`there are the following fields:`Object[] elementData`,`int size`. Explain why to store separately`size`, if you can always take`elementData.length`?

Array size`elementData`represents capacity`ArrayList`, which is always greater than the variable`size`- the actual number of stored elements. If necessary, the capacity is automatically increased.

[to contents](#java-collections-framework)

## Compare interfaces`Queue`And`Deque`.

## Who is expanding who?`Queue`expands`Deque`, or`Deque`expands`Queue`?

`Queue`- this is a queue that is usually (but not necessarily) built according to the FIFO (First-In-First-Out) principle - accordingly, an element is retrieved from the beginning of the queue, an element is inserted at the end of the queue. Although this principle is violated, for example,`PriorityQueue`, using "natural ordering" or passed`Comparator`when inserting a new element.

`Deque`(Double Ended Queue) expands`Queue`and according to the documentation, it is a linear collection that supports insertion/retrieval of elements from both ends. In addition, interface implementations`Deque`can be built on a FIFO or LIFO principle.

Implementations and`Deque`, And`Queue`usually don't override methods`equals()`And`hashCode()`, instead using the inherited methods of the Object class based on reference comparisons.

[to contents](#java-collections-framework)

## Why`LinkedList`implements and`List`, And`Deque`?

`LinkedList`allows you to add elements to the beginning and end of the list in constant time, which is in good agreement with the behavior of the interface`Deque`.

[to contents](#java-collections-framework)

## `LinkedList`Is it a singly, doubly, or four linked list?

`Двусвязный`: each element`LinkedList`stores a link to the previous and next elements.

[to contents](#java-collections-framework)

## How to iterate over elements`LinkedList`in reverse order without using slow`get(index)`?

To do this in`LinkedList`there is a reverse iterator that can be obtained by calling the method`descendingIterator()`.

[to contents](#java-collections-framework)

## What it allows you to do`PriorityQueue`?

Feature`PriorityQueue`is the ability to control the order of elements. By default, elements are sorted using "natural ordering", but this behavior can be overridden using an object`Comparator`, which is set when creating the queue. This collection does not support null as elements.

Using`PriorityQueue`, you can, for example, implement Dijkstra's algorithm to find the shortest path from one vertex of the graph to another. Or to store objects according to a certain property.

[to contents](#java-collections-framework)

## `Stack`considered "obsolete". What is recommended to replace it with? Why?

`Stack`was added in Java 1.0 as an implementation of the LIFO (last-in-first-out) stack and is an extension of the collection`Vector`, although this somewhat violates the concept of a stack (for example, a class`Vector`provides the ability to access any element by index). Is a partially synchronized collection (except for the append method`push()`) with the consequential consequences of a negative impact on productivity. After the interface was added to Java 1.6`Deque`, it is recommended to use implementations of this particular interface, for example,`ArrayDeque`.

[to contents](#java-collections-framework)

## Why is it needed?`HashMap`, if there is`Hashtable`?

-   Class Methods`Hashtable`are synchronized, which leads to decreased performance, and`HashMap`- No;
-   `HashTable`cannot contain elements`null`, whereas`HashMap`may contain one key`null`and any number of values`null`;
-   Iterator у`HashMap`, unlike Enumeration`HashTable`, works on the “fail-fast” principle (throws an exception if there is any data inconsistency).

`Hashtable`This is a deprecated class and its use is deprecated.

[to contents](#java-collections-framework)

## What is the difference between`HashMap`And`IdentityHashMap`? What is it for?`IdentityHashMap`?

`IdentityHashMap`- this is a data structure that also implements the interface`Map`and which uses reference comparison when comparing keys (values), rather than calling a method`equals()`. In other words, in`IdentityHashMap`two keys`k1`And`k2`will be considered equal if they point to the same object, i.e. condition is met`k1`==`k2`.

`IdentityHashMap`doesn't use the method`hashCode()`, instead of which the method is used`System.identityHashCode()`, for this reason`IdentityHashMap`compared to`HashMap`has better performance, especially if the latter stores objects with expensive methods`equals()`And`hashCode()`.

One of the main requirements for use`HashMap`is the immutability of the key, and, because`IdentityHashMap`doesn't use methods`equals()`And`hashCode()`, then this rule does not apply to him.

`IdentityHashMap`can be used to implement serialization/cloning. When executing such algorithms, the program needs to maintain a hash table with all references to objects that have already been processed. Such a structure should not treat unique objects as equal, even if the method`equals()`returns`true`.

Sample code:

```java
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class Q2 {

    public static void main(String[] args) {
        Q2 q = new Q2();
        q.testHashMapAndIdentityHashMap();
    }

    private void testHashMapAndIdentityHashMap() {
        CreditCard visa = new CreditCard("VISA", "04/12/2019");

        Map<CreditCard, String> cardToExpiry = new HashMap<>();
        Map<CreditCard, String> cardToExpiryIdenity = new IdentityHashMap<>();

        System.out.println("adding to HM");
        // inserting objects to HashMap
        cardToExpiry.put(visa, visa.getExpiryDate());

        // inserting objects to IdentityHashMap
        cardToExpiryIdenity.put(visa, visa.getExpiryDate());
        System.out.println("adding to IHM");

        System.out.println("before modifying keys");
        String result = cardToExpiry.get(visa) != null ? "Yes" : "No";
        System.out.println("Does VISA card exists in HashMap? " + result);

        result = cardToExpiryIdenity.get(visa) != null ? "Yes" : "No";
        System.out.println("Does VISA card exists in IdenityHashMap? " + result);

        // modifying value object
        visa.setExpiryDate("02/11/2030");

        System.out.println("after modifying keys");
        result = cardToExpiry.get(visa) != null ? "Yes" : "No";
        System.out.println("Does VISA card exists in HashMap? " + result);

        result = cardToExpiryIdenity.get(visa) != null ? "Yes" : "No";
        System.out.println("Does VISA card exists in IdenityHashMap? " + result);

        System.out.println("cardToExpiry.containsKey");
        System.out.println(cardToExpiry.containsKey(visa));
        System.out.println("cardToExpiryIdenity.containsKey");
        System.out.println(cardToExpiryIdenity.containsKey(visa));
    }

}

class CreditCard {
    private String issuer;
    private String expiryDate;

    public CreditCard(String issuer, String expiryDate) {
        this.issuer = issuer;
        this.expiryDate = expiryDate;
    }

    public String getIssuer() {
        return issuer;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiry) {
        this.expiryDate = expiry;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((expiryDate == null) ? 0 : expiryDate.hashCode());
        result = prime * result + ((issuer == null) ? 0 : issuer.hashCode());
        System.out.println("hashCode = " + result);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals !!! ");
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CreditCard other = (CreditCard) obj;
        if (expiryDate == null) {
            if (other.expiryDate != null)
                return false;
        } else if (!expiryDate.equals(other.expiryDate))
            return false;
        if (issuer == null) {
            if (other.issuer != null)
                return false;
        } else if (!issuer.equals(other.issuer))
            return false;
        return true;
    }

}
```

Result of executing the code:

    adding to HM
    hashCode = 1285631513
    adding to IHM
    before modifying keys
    hashCode = 1285631513
    Does VISA card exists in HashMap? Yes
    Does VISA card exists in IdenityHashMap? Yes
    after modifying keys
    hashCode = 791156485
    Does VISA card exists in HashMap? No
    Does VISA card exists in IdenityHashMap? Yes
    cardToExpiry.containsKey
    hashCode = 791156485
    false
    cardToExpiryIdenity.containsKey
    true

[to contents](#java-collections-framework)

## What is the difference between`HashMap`And`WeakHashMap`? What is it used for?`WeakHashMap`?

There are 4 types of links in Java:_strong reference_,_soft (SoftReference)_,_weak (WeakReference)_And_phantom (PhantomReference)_. The features of each link type are related to how Garbage Collector works. If an object can only be reached using a WeakReference chain (that is, there are no strong or soft references to it), then the object will be marked for deletion.

`WeakHashMap`is a data structure that implements an interface`Map`and based on the use of WeakReference for storing keys. This way the key-value pair will be removed from`WeakHashMap`, if there are no longer strong references to the key object.

As an example of using such a data structure, the following situation can be given: let’s say there are objects that need to be expanded with additional information, but changing the class of these objects is undesirable or impossible. In this case, we add each object to`WeakHashMap`as a key, and as a value - the necessary information. Thus, as long as there is a strong (or soft) reference to the object, the hash table can be checked and information can be retrieved. Once an object is deleted, the WeakReference for that key will be placed in the ReferenceQueue and then the corresponding entry for that weak reference will be removed from`WeakHashMap`.

[to contents](#java-collections-framework)

## IN`WeakHashMap`WeakReferences are used. Why not create`SoftHashMap`на SoftReferences?

`SoftHashMap`provided in third party libraries, e.g.`Apache Commons`.

[to contents](#java-collections-framework)

## IN`WeakHashMap`WeakReferences are used. Why not create`PhantomHashMap`on Phantom References?

PhantomReference when calling a method`get()`always returns`null`, so it's hard to imagine the purpose of such a data structure.

[to contents](#java-collections-framework)

## `LinkedHashMap`- what's in it`LinkedList`, and what from`HashMap`?

Implementation`LinkedHashMap`different from`HashMap`support for a doubly linked list that determines the order of iteration through the elements of the data structure. By default, list items are ordered according to the order in which they were added to`LinkedHashMap`(insertion-order). However, the iteration order can be changed by setting the constructor parameter`accessOrder`in meaning`true`. In this case, access is carried out in the order of the last access to the element (access-order). This means that when calling methods`get()`or`put()`the element being accessed is moved to the end of the list.

When adding an element that is already present in`LinkedHashMap`(i.e. with the same key), the order of iteration over the elements does not change.

[to contents](#java-collections-framework)

## What does “sorting” mean?`SortedMap`, except that`toString()`does it output all elements in order?

It also manifests itself when iterating through a collection.

[to contents](#java-collections-framework)

## How it works`HashMap`?

`HashMap`consists of “baskets” (bucket). In technical terms, buckets are array elements that store references to lists of elements. When adding a new key-value pair, it calculates the hash code of the key, based on which the number of the basket (the number of the array cell) into which the new element will fall is calculated. If the basket is empty, then a link to the newly added element is stored in it, but if there is already an element there, then a sequential transition occurs along the links between the elements in the chain, in search of the last element, from which a link to the newly added element is placed. If an element with the same key was found in the list, it is replaced.

[to contents](#java-collections-framework)

## According to Knuth and Cormen, there are two main hash table implementations: open addressing based and chaining based. How it's implemented`HashMap`? Why do you think this particular implementation was chosen? What are the pros and cons of each approach?

`HashMap`implemented using the chain method, i.e. Each array cell (basket) has its own linked list, and when a collision occurs, a new element is added to this list.

For the chain method, the fill factor can be greater than 1, and as the number of elements increases, the performance decreases linearly. Such tables are convenient to use if the number of stored elements is unknown in advance, or there can be quite a lot of them, which leads to large fill factor values.

Open addressing methods include:

-   linear testing;
-   quadratic testing;
-   double hashing.

Disadvantages of structures with open addressing method:

-   The number of elements in a hash table cannot exceed the size of the array. As the number of elements increases and the fill factor increases, the performance of the structure drops sharply, so rehashing is necessary.
-   It is difficult to organize the removal of an element.
-   The first two open addressing methods lead to the problem of primary and secondary groupings.

Advantages of an open addressing hash table:

-   no costs for creating and storing list objects;
-   simplicity of organizing serialization/deserialization of an object.

[to contents](#java-collections-framework)

## How it works`HashMap`when trying to save two elements into it using keys with the same`hashCode()`, but for which`equals() == false`?

By value`hashCode()`The index of the array cell to the list of which this element will be added is calculated. Before adding, it checks for the presence of elements in this cell. If elements with such`hashCode()`is already present, but`equals()`methods are not equal, the element will be added to the end of the list.

[to contents](#java-collections-framework)

## What is the initial number of baskets in`HashMap`?

The default constructor is 16; using constructors with parameters, you can set an arbitrary initial number of baskets.

[to contents](#java-collections-framework)

## What is the estimate of the time complexity of operations on elements from`HashMap`? Does it guarantee`HashMap`the specified complexity of selecting an element?

In general, the operations of adding, searching, and deleting elements take constant time.

This complexity is not guaranteed, because if the hash function distributes elements evenly across buckets, the time complexity will be no worse[_Logarithmic time_](https://ru.wikipedia.org/wiki/%D0%92%D1%80%D0%B5%D0%BC%D0%B5%D0%BD%D0%BD%D0%B0%D1%8F_%D1%81%D0%BB%D0%BE%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C_%D0%B0%D0%BB%D0%B3%D0%BE%D1%80%D0%B8%D1%82%D0%BC%D0%B0#%D0%9B%D0%BE%D0%B3%D0%B0%D1%80%D0%B8%D1%84%D0%BC%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%BE%D0%B5_%D0%B2%D1%80%D0%B5%D0%BC%D1%8F)O(log(N)), and in the case where the hash function always returns the same value,`HashMap`will turn into a linked list with complexity O(n).

Example binary request code:

```java
public class Q {
    public static void main(String[] args) {
        Q q = new Q();
        q.binSearch();
    }

    private void binSearch() {
        int[] inpArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer result = binSearchF(inpArr, 1, 0, inpArr.length - 1);
        System.out.println("-----------------------");
        result = binSearchF(inpArr, 2, 0, inpArr.length - 1);
        System.out.println("Found at position " + result);
    }

    private Integer binSearchF(int[] inpArr, int searchValue, int low, int high) {
        Integer index = null;
        while (low <= high) {
            System.out.println("New iteration, low = " + low + ", high = " + high);
            int mid = (low + high) / 2;
            System.out.println("trying mid = " + mid + " inpArr[mid] = " + inpArr[mid]);
            if (inpArr[mid] < searchValue) {
                low = mid + 1;
                System.out.println("inpArr[mid] (" + inpArr[mid] + ") < searchValue(" + searchValue + "), mid = " + mid
                        + ", setting low = " + low);
            } else if (inpArr[mid] > searchValue) {
                high = mid - 1;
                System.out.println("inpArr[mid] (" + inpArr[mid] + ") > searchValue(" + searchValue + "), mid = " + mid
                        + ", setting high = " + high);
            } else if (inpArr[mid] == searchValue) {
                index = mid;
                System.out.println("found at index " + mid);
                break;
            }
        }
        return index;
    }
}
```

[to contents](#java-collections-framework)

## Is it possible to have a situation where`HashMap`will degenerate into a list even with keys that have different`hashCode()`?

This is possible if the method that determines the cart number returns the same values.

[to contents](#java-collections-framework)

## In what case can an element be lost in`HashMap`?

Let's say that the key is not a primitive, but an object with several fields. After adding an element to`HashMap`one field of the object that acts as a key is changed, which is involved in calculating the hash code. As a result, when trying to find a given item using the source key, the correct cart will be accessed, but`equals`will no longer find the specified key in the list of elements. However, even if`equals`is implemented in such a way that changing a given field of an object does not affect the result, then after increasing the size of the baskets and recalculating the hash codes of the elements, the specified element, with the changed field value, will most likely end up in a completely different basket and then be completely lost.

[to contents](#java-collections-framework)

## Why can't you use`byte[]`as a key in`HashMap`?

The hash code of an array does not depend on the elements stored in it, but is assigned when the array is created (the method for calculating the hash code of an array is not overridden and is calculated according to the standard`Object.hashCode()`based on a prime number generation algorithm). Also, arrays are not overridden`equals`and pointer comparison is performed. This leads to the fact that it will not be possible to access an element saved with an array key when using another array of the same size and with the same elements; access can only be achieved in one case - when using the same array reference that was used to save the element.

[to contents](#java-collections-framework)

## What is the role`equals()`And`hashCode()`V`HashMap`?

`hashCode`allows you to define a shopping cart to search for an item, and`equals`used to compare the keys of the items in the cart list and the searched key.

[to contents](#java-collections-framework)

## What is the maximum number of values`hashCode()`?

The number of values ​​follows from the signature`int hashCode()`and equal to the range of type`int`—**2<sup>32</sup>**.

[to contents](#java-collections-framework)

## What is the worst running time of the get(key) method for a key that is not in`HashMap`?

## What is the worst running time of the get(key) method for a key that is in`HashMap`?

**_O(N)_**. The worst case is searching for the key in`HashMap`, degenerate into a list due to the coincidence of keys in`hashCode()`and to find out whether an element with a certain key is stored, it may be necessary to iterate over the entire list.

But since Java 8, after a certain number of elements in the list, the linked list is converted to a red-black tree and the sampling complexity, even in the case of a bad hash function, is no worse_logarithmic__O(log(N))_

[to contents](#java-collections-framework)

## Why, despite the fact that the key is in`HashMap`not required to implement the interface`Comparable`, can a doubly linked list always be converted to a red-black tree?

A red-black tree is a self-balancing binary search tree. This means that to build it you need to be able to compare elements with each other.

In Java, comparison of objects is usually done using the method`compareTo()`, which is defined in the interface`Comparable`. At first glance, it seems logical that after Java 8 the key in`HashMap`an additional requirement has appeared - to implement`Comparable`.

To avoid this, the following algorithm is used when comparing keys:

1.  First, an attempt is made to compare the key hashes
2.  If the hashes are equal and both keys implement`Comparable`, then the method is called for comparison`compareTo()`
3.  If the keys are not implemented`Comparable`, then the comparison occurs using the method`tieBreakOrder()`, in which
    -   first an attempt will be made to compare the keys through the names of their classes (`getClass().getName()`)
    -   if the keys are instances of the same class, then the results of the method will be compared`System.identityHashCode()`

[to contents](#java-collections-framework)

## How many transitions occur at the time of the call`HashMap.get(key)`by key that is in the table?

-   key equal`null`:**1**- only one method is executed`getForNullKey()`.
-   any key other than`null`:**4**- calculation of the hash code of the key; determining the cart number; search for meaning; return value.

[to contents](#java-collections-framework)

## How many new objects are created when you add a new element to`HashMap`?

**One**new static nested class object`Entry<K,V>`.

[to contents](#java-collections-framework)

## How and when does the number of baskets increase in`HashMap`?

Besides`capacity`in`HashMap`there is another field`loadFactor`, on the basis of which the maximum number of occupied baskets is calculated`capacity * loadFactor`. at default`loadFactor = 0.75`. Upon reaching the limit value, the number of baskets is doubled and a new “location” is calculated for all stored items, taking into account the new number of baskets.

[to contents](#java-collections-framework)

## Explain the meaning of parameters in a constructor`HashMap(int initialCapacity, float loadFactor)`.

-   `initialCapacity`- original size`HashMap`, the number of buckets in the hash table at the time of its creation.
-   `loadFactor`- fill factor`HashMap`, when exceeded, the number of baskets increases and automatic rehashing occurs. Equal to the ratio of the number of elements already stored in the table to its size.

[to contents](#java-collections-framework)

## Will it work`HashMap`, if all added keys have the same`hashCode()`?

Yes, it will, but in this case`HashMap`degenerates into a connected list and loses its advantages.

## How to iterate through all the keys`Map`?

Use method`keySet()`, which returns a set`Set<K>`keys.

[to contents](#java-collections-framework)

## How to loop through all values`Map`?

Use method`values()`which returns a collection`Collection<V>`values.

[to contents](#java-collections-framework)

## How to iterate through all key-value pairs in`Map`?

Use method`entrySet()`, which returns a set`Set<Map.Entry<K, V>>`key-value pairs.

[to contents](#java-collections-framework)

## What are the differences`TreeSet`And`HashSet`?

`TreeSet`provides organized storage of elements in the form of a red-black tree. The complexity of performing basic operations is no worse_O(log(N))_(_Logarithmic time_).

`HashSet`uses the same approach for storing elements as`HashMap`, with the difference that in`HashSet`itself acts as the key and value`элемент`, Besides,`HashSet`does not support ordered storage of elements and provides time complexity for performing operations similarly`HashMap`.

[to contents](#java-collections-framework)

## What happens if you add elements to`TreeSet`ascending?

At the core`TreeSet`lies a red-black tree that can balance itself. As a result,`TreeSet`no matter what order you add elements to it, the benefits of this data structure will remain.

[to contents](#java-collections-framework)

## How`LinkedHashSet`different from`HashSet`?

`LinkedHashSet`different from`HashSet`only because it is based`LinkedHashMap`instead of`HashMap`. Thanks to this, the order of elements when traversing the collection is identical to the order in which elements are added (insertion-order). When adding an element that is already present in`LinkedHashSet`(i.e. with the same key), the order of traversing the elements does not change.

[to contents](#java-collections-framework)

## For`Enum`there is a special class`java.util.EnumSet`. For what? What the authors weren’t happy with`HashSet`or`TreeSet`?

`EnumSet`is the implementation of the interface`Set`for use with enumerations (`Enum`). The data structure stores objects of only one type`Enum`specified during creation. To store values`EnumSet`uses a bit array (_bit vector_), - this allows for high compactness and efficiency. Passage by`EnumSet`is carried out according to the order in which the enumeration elements are declared.

All basic operations are performed in_O(1)_and usually (but not guaranteed) faster than analogues from`HashSet`, and batch operations (_bulk operations_), such as`containsAll()`And`retainAll()`are even completed much faster.

Besides everything`EnumSet`provides many static initialization methods for simplified and convenient instantiation.

[to contents](#java-collections-framework)

## What ways are there to iterate over the elements of a list?

-   Loop with iterator

```java
Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) {
    //iterator.next();
}
```

-   Cycle`for`

```java
for (int i = 0; i < list.size(); i++) {
    //list.get(i);
}
```

-   Cycle`while`

```java
int i = 0;
while (i < list.size()) {
    //list.get(i);
    i++;
}
```

-   «for-each»

```java
for (String element : list) {
    //element;
}
```

[to contents](#java-collections-framework)

## How can I get synchronized objects of standard collections?

Using static methods`synchronizedMap()`And`synchronizedList()`class`Collections`. These methods return a synchronized decorator of the passed collection. However, manual synchronization is still required when traversing the collection.

```java
  Map m = Collections.synchronizedMap(new HashMap());
  List l = Collections.synchronizedList(new ArrayList());
```

Since Java 6, JCF has been extended with special collections that support multi-threaded access, such as`CopyOnWriteArrayList`And`ConcurrentHashMap`.

[to contents](#java-collections-framework)

## How to get a read-only collection?

With the help of:

-   `Collections.unmodifiableList(list)`;
-   `Collections.unmodifiableSet(set)`;
-   `Collections.unmodifiableMap(map)`.

These methods take a collection as a parameter, and return a read-only collection with the same elements inside.

[to contents](#java-collections-framework)

## Write a single threaded program that causes a collection to be thrown away`ConcurrentModificationException`.

```java
public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);

    for (Integer integer : list) {
        list.remove(1);
    }
}
```

[to contents](#java-collections-framework)

## Give an example when some collection throws away`UnsupportedOperationException`.

```java
public static void main(String[] args) {
    List<Integer> list = Collections.emptyList();
    list.add(0);
}
```

[to contents](#java-collections-framework)

## Implement the symmetric difference of two collections using the methods`Collection`(`addAll(...)`,`removeAll(...)`,`retainAll(...)`).

The symmetric difference of two collections is the set of elements that do not simultaneously belong to both original collections.

```java
<T> Collection<T> symmetricDifference(Collection<T> a, Collection<T> b) {    
    // Объединяем коллекции.
    Collection<T> result = new ArrayList<>(a);
    result.addAll(b);
    
    // Получаем пересечение коллекций.
    Collection<T> intersection = new ArrayList<>(a);
    intersection.retainAll(b);
    
    // Удаляем элементы, расположенные в обоих коллекциях.
    result.removeAll(intersection);

    return result;
}
```

[to contents](#java-collections-framework)

## How to make a cache with “invalidation policy” using LinkedHashMap?

Must be used_LRU-algorithm (Least Recently Used algorithm)_And`LinkedHashMap`with access-order. In this case, when an element is accessed, it will be moved to the end of the list, and the least used elements will be gradually grouped at the beginning of the list. Also in the standard implementation`LinkedHashMap`there is a method`removeEldestEntries()`which returns`true`if the current object`LinkedHashMap`should remove the least used element from the collection when using methods`put()`And`putAll()`.

```java
public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private static final int MAX_ENTRIES = 10;

    public LRUCache(int initialCapacity) {
        super(initialCapacity, 0.85f, true);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > MAX_ENTRIES;
    }
}
```

It is worth noting that`LinkedHashMap`does not allow you to fully implement the LRU algorithm, since when inserting an element already in the collection, the order of iteration through the elements does not change.

[to contents](#java-collections-framework)

## How to copy any elements in one line`collection`to an array?

```java
Object[] array = collection.toArray();
```

[to contents](#java-collections-framework)

## As one call from`List`get`List`with all elements except the first and last 3?

```java
List<Integer> subList = list.subList(3, list.size() - 3);
```

[to contents](#java-collections-framework)

## How to convert in one line`HashSet`V`ArrayList`?

```java
ArrayList<Integer> list = new ArrayList<>(new HashSet<>());
```

[to contents](#java-collections-framework)

## How to convert in one line`ArrayList`V`HashSet`?

```java
HashSet<Integer> set = new HashSet<>(new ArrayList<>());
```

[to contents](#java-collections-framework)

## Do`HashSet`from the keys`HashMap`.

```java
HashSet<Object> set = new HashSet<>(map.keySet());
```

[to contents](#java-collections-framework)

## Do`HashMap`from`HashSet<Map.Entry<K, V>>`.

```java
HashMap<K, V> map = new HashMap<>(set.size());
for (Map.Entry<K, V> entry : set) {
    map.put(entry.getKey(), entry.getValue());
}
```

[to contents](#java-collections-framework)

# Source

-   [parshinpn.pro](http://www.parshinpn.pro/content/voprosy-i-otvety-na-sobesedovanii-po-teme-java-collection-framework-chast-1)
-   [Habrakhabr](https://habrahabr.ru/post/162017/)
-   [Quizful](http://www.quizful.net/interview/java)
-   [JavaRush](http://info.javarush.ru/)
-   [Habrahabr:Java Collections Framework Reference](https://habrahabr.ru/post/237043/)

[Interview Questions](README.md)
