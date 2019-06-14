# kotlin-extensions

[![](https://jitpack.io/v/cc.femto/kotlin-extensions.svg)](https://jitpack.io/#cc.femto/kotlin-extensions)

An assortment of Kotlin extension functions.


## Examples

### Collection.toggle
Make a copy of a `Collection` that contains a new element
or no longer contains that element dependent on whether it was
part of the collection before.

```kotlin
val list = listOf(1, 2, 3)

list.toggle(2) // [1, 3]
list.toggle(5) // [1, 2, 3, 5]
```

### Collection.plusIfNotNull
Make a copy of a `Collection` with an added element or return
the unmodified collection if the element to be added is null.

```kotlin
val list = listOf(1, 2)

list.plusIfNotNull(3) // [1, 2, 3]
list.plusIfNotNull(null) // [1, 2]
```


## Binaries
```gradle
dependencies {
    implementation "cc.femto:kotlin-extensions:0.1"
}
```

Requires the JitPack repository:
```gradle
repositories {
    maven { url "https://jitpack.io" }
}
```
