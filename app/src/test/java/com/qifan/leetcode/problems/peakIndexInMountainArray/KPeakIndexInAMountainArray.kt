import junit.framework.Assert.assertEquals
import org.junit.Test

class KPeakIndexInAMountainArray {
    @Test
    fun Test1() {
        val array = intArrayOf(0, 2, 1, 0)
        assertEquals(peakIndexInMountainArray(array), 1)
    }

    @Test
    fun Test2() {
        val array = intArrayOf(0, 1, 0)
        assertEquals(peakIndexInMountainArray2(array), 1)
    }


    private fun peakIndexInMountainArray(A: IntArray): Int {
        var i = 0
        while (A[i] < A[i + 1]) i++
        return i
    }

    private fun peakIndexInMountainArray2(A: IntArray): Int {
        var lo = 0
        var hi = A.size - 1
        while (lo < hi) {
            val mi = lo + (hi - lo) / 2
            if (A[mi] < A[mi + 1])
                lo = mi + 1
            else
                hi = mi
        }
        return lo
    }

}