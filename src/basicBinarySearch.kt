fun main() {
    val arr = intArrayOf(2,3,4,10,40,50,80,100)
    val target = 10
    val result = binarySearch(arr,target)
    if (result != -1){
        println("Element found at index $result")
    }else println("Element not found")
}

fun binarySearch(arr:IntArray, target:Int):Int{
    var left = 0
    var right = arr.size -1

    while (left <= right){
        val mid = left + (right - left) / 2

        //checking if target is present at mid-variable
        if (arr[mid] == target){
            return mid
        }

        //checking if target greater, ignore left half
        if (arr[mid] < target){
            left = mid+1
        }

        //If target is smaller, ignore right half
        else right = mid -1
    }
    return -1
}

