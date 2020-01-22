# kotlin-extensions

[![](https://jitpack.io/v/cc.femto/kotlin-extensions.svg)](https://jitpack.io/#cc.femto/kotlin-extensions)

An assortment of Kotlin extension functions.


## Examples

### List.toggle
Make a copy of a `List` that contains a new element
or no longer contains that element dependent on whether it was
part of the collection before.

```kotlin
val list = listOf(1, 2, 3)

list.toggle(2) // [1, 3]
list.toggle(5) // [1, 2, 3, 5]
```

### List.plusIfNotNull
Make a copy of a `List` with an added element or return
the unmodified collection if the element to be added is null.

```kotlin
val list = listOf(1, 2)

list.plusIfNotNull(3) // [1, 2, 3]
list.plusIfNotNull(null) // [1, 2]
```


### List.replaceWith
Make a copy of a `List` replace elements that match a predicate
with a provided element.

```kotlin
val list = listOf(1, 2, 3, 4)

list.replaceWith(0) { it % 2 == 0 } // [1, 0, 3, 0]
```


## Binaries
```gradle
dependencies {
    implementation "cc.femto:kotlin-extensions:0.3"
}
```

Requires the JitPack repository:
```gradle
repositories {
    maven { url "https://jitpack.io" }
}
```
