// kotlinc SortingAlgorithms.kt -include-runtime -d /tmp/sorting-app.jar && java -jar /tmp/sorting-app.jar

// DSA - 1 - Bubble Sort

// Bubble Sort -  Bubble Sort is like comparing neighbors and swapping them if they’re in the wrong order.
// You keep repeating this until the biggest elements “bubble” to the end and everything is sorted.

// Given an array, arr[]. Sort the array using bubble sort algorithm.
// Input: arr[] = [4, 1, 3, 9, 7]
// Output: [1, 3, 4, 7, 9]
// Explanation: After Sorting the array in ascending order of their values is [1, 3, 4, 7, 9].
// Input: arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
// Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
// Explanation: Sort the array in ascending order of their values.
// Input: arr[] = [1, 2, 3, 4, 5]
// Output: [1, 2, 3, 4, 5]
// Explanation: An array that is already sorted should remain unchanged after applying bubble sort.
// Constraints:
// 1 ≤ arr.size() ≤ 103
// 1 ≤ arr[i] ≤ 103


fun main() {
    insertionSort(arr = intArrayOf(4, 1, 3, 9, 7))
 }

fun bubbleSort(arr : IntArray){

    for (i in 0 until arr.size - 1){

        var swapped = false

        for (j in 0 until arr.size - i - 1){
            if(arr[j] > arr[j + 1]){
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
                swapped = true
             }
        }

        if(!swapped){
            break
        }
      
    }

    println("array : ${arr.contentToString()}")
}

// DSA - 2 - Selection Sort

// Selection Sort is like picking the smallest item from the list and placing it at the front, one by one.
// You repeat this by finding the next smallest and placing it in the correct position until sorted.

// Given an array arr, use selection sort to sort arr[] in increasing order.

// Examples :
// Input: arr[] = [4, 1, 3, 9, 7]
// Output: [1, 3, 4, 7, 9]
// Explanation: Maintain sorted (in bold) and unsorted subarrays. Select 1. Array becomes 1 4 3 9 7. Select 3. Array becomes 1 3 4 9 7. Select 4. Array becomes 1 3 4 9 7. Select 7. Array becomes 1 3 4 7 9. Select 9. Array becomes 1 3 4 7 9.
// Input: arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
// Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
// Input: arr[] = [38, 31, 20, 14, 30]
// Output: [14, 20, 30, 31, 38]
// Constraints:
// 1 ≤ arr.size() ≤ 103
// 1 ≤ arr[i] ≤ 106

fun selectionSort(arr : IntArray){

    val n = arr.size

    for(i in 0 until n - 1){

        var minIndex = i

        for(j in i + 1 until n){
            if(arr[j] < arr[minIndex]){
                minIndex = j
            }
        }

        val temp = arr[minIndex]
        arr[minIndex] = arr[i]
        arr[i] = temp
    }
    println("array : ${arr.contentToString()}")
}

// DSA - 3 - Insertion Sort

// Insertion Sort is like arranging playing cards in your hand — you take one 
// element and insert it into its correct position among already sorted elements.

// Given an array arr[] of positive integers.The task is to complete the insertsort() function which is used to implement Insertion Sort.

// Examples:

// Input: arr[] = [4, 1, 3, 9, 7]
// Output: [1, 3, 4, 7, 9]
// Explanation: The sorted array will be [1, 3, 4, 7, 9].
// Input: arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
// Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
// Explanation: The sorted array will be [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].
// Input: arr[] = [4, 1, 9]
// Output: [1, 4, 9]
// Explanation: The sorted array will be [1, 4, 9].
// Constraints:
// 1 ≤ arr.size() ≤ 1000
// 1 ≤ arr[i] ≤ 10000

fun insertionSort(arr : IntArray){

    for(i in 1 until arr.size){

        val temp = arr[i]

        var j = i

        while(j > 0 && arr[j-1] > temp){
            arr[j] = arr[j - 1]
            j--
        }
        arr[j] = temp

        println("array : ${arr.contentToString()}")
    }

}