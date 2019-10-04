package algorithms.easy

@Suppress("NAME_SHADOWING")
fun reverseBits(n: Int): Int {
    var n = n
    var res = 0
    for (i in 0 until 32) {
        res = res shl 1
        res += n and 1
        n = n shr 1
    }
    return res
}