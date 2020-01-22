package cc.femto.kotlin.extensions

/**
 * Make a copy of a [List] that contains a new element
 * or no longer contains that element dependent on whether it was
 * part of the collection before.
 *
 * @param element that will be added/removed from the collection
 * @return copy of the collection with the element added/removed
 */
fun <E> List<E>.toggle(element: E) = when (element) {
    in this -> this - element
    else -> this + element
}

/**
 * Make a copy of a [List] with an added element or return
 * the unmodified collection if the element to be added is null.
 *
 * @param element that will be added to the collection if it is not null
 * @return copy of the collection with added non-null element or unmodified collection
 */
fun <E> List<E>.plusIfNotNull(element: E?) = when (element) {
    null -> this
    else -> this + element
}

/**
 * Make a copy of a [List] replace elements that match a predicate
 * with a provided element.
 *
 * @param element that will replace elements that match [shouldReplace] in the collection
 * @param shouldReplace predicate that determines whether an element should be replaced
 * @return copy of the collection with matching elements replaced with [element]
 */
fun <E> List<E>.replaceWith(element: E, shouldReplace: (E) -> Boolean) = this.map {
    when (shouldReplace(it)) {
        true -> element
        else -> it
    }
}
