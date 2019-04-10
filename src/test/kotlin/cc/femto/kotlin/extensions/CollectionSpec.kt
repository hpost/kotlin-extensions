package cc.femto.kotlin.extensions

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.test.assertEquals

class CollectionSpec : Spek({
    describe("toggle") {
        context("element is not in the collection") {
            it("adds element to collection") {
                assertEquals(
                    expected = listOf(1, 2, 3),
                    actual = listOf(1, 2).toggle(3)
                )
            }
        }
        context("element is already in the collection") {
            it("removes element from collection") {
                assertEquals(
                    expected = listOf(1, 3),
                    actual = listOf(1, 2, 3).toggle(2)
                )
            }
        }
    }
})