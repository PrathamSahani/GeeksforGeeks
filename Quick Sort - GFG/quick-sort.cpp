//{ Driver Code Starts
#include <stdio.h>
#include <bits/stdc++.h>
using namespace std;

/* Function to print an array */
void printArray(int arr[], int size)
{
    int i;
    for (i=0; i < size; i++)
        printf("%d ", arr[i]);
    printf("\n");
}

// } Driver Code Ends
class Solution
{
    public:
    //Function to sort an array using quick sort algorithm.
 void quickSort(int arr[], int low, int high){
        if(low>=high){
            return;
        }
        int partitionIndex = partition(arr, low, high);
        quickSort(arr, low, partitionIndex-1);
        quickSort(arr, partitionIndex+1, high);
        return;
    }

    int partition (int arr[], int low, int high){
       int pivotIndex = high;
       int countOfNumberLessEqualToPivotValue = 0;
       
       for(int i=low; i<high; i++){
           if(arr[i] <= arr[pivotIndex]){
               countOfNumberLessEqualToPivotValue++;
           }
       }       
       // place pivot at right index
       int partitionIndex = low + countOfNumberLessEqualToPivotValue;
       swap(arr[pivotIndex], arr[partitionIndex]);
       
       int i=low, j=high;
       while(i<partitionIndex && j>partitionIndex){
           while(arr[i]<=arr[partitionIndex]){
               i++;
           }
           while(arr[j]>arr[partitionIndex]){
               j--;
           }
           if(i<partitionIndex && j>partitionIndex){
               swap(arr[i], arr[j]);
           }
       }
       return partitionIndex;
    }
};


//{ Driver Code Starts.
int main()
{
    int arr[1000],n,T,i;
    scanf("%d",&T);
    while(T--){
    scanf("%d",&n);
    for(i=0;i<n;i++)
      scanf("%d",&arr[i]);
      Solution ob;
    ob.quickSort(arr, 0, n-1);
    printArray(arr, n);
    }
    return 0;
}
// } Driver Code Ends