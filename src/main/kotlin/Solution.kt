class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        answer = num_list.reversedArray()
        return answer
    }
}
fun main(){
    Solution().solution(intArrayOf(1,2,3,4,5))
    Solution().solution(intArrayOf(1,1,1,1,1,2))
    Solution().solution(intArrayOf(1,0,1,1,1,3,5))
}