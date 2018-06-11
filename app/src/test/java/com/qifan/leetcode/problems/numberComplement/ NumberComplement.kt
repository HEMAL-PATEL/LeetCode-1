class Solution {
    fun findComplement(num: Int): Int {
        val mask = (Integer.highestOneBit(num) shl 1) - 1
        return num xor mask
    }
}