#include <iostream>
#include <fstream>
#include <cstring>
#include <ctime>
#include <vector>


using namespace std;

//Thuật toán đệ quy chia mảng sắp xếp 
void mergeSort(int s[], int l, int r);
void merge(int s[], int l, int m, int r);

//Thuật toán Selection Sort
void selectionSort(int arr[], int n);

//Thuật toán Insert Sort
void insertionSort(int arr[], int n);

//Thuật toán Counting Sort 
void countingSort(int arr[], int n);

//Thuật toán sắp xếp Binary Tree giảm dần
void heapifyMax(int arr[], int n, int i);

//Thuật toán sắp xếp Binary Tree tăng dần
void heapifyMin(int arr[], int n, int i);

//Thuật toán sắp xếp vun đống Heap tăng dần
void heapSortMax(int arr[], int n);

//Thuật toán sắp xếp vun đống Heap giảm dần
void heapSortMin(int arr[], int n);

void selectionSort(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        int index = i;
        for (int j = i + 1; j < n; j++)
        {
            if (arr[index] > arr[j])
            {
                index = j;
            }
        }
        swap(arr[i], arr[index]);
    }

    for (int j = 0; j < n; j++)
    {
        cout << arr[j] << " ";
    }
}

void insertionSort(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        int x = arr[i];
        int pos = i - 1;
        while (pos >= 0 && x < arr[pos])
        {
            arr[pos + 1] = arr[pos];
            pos--;
        }
        arr[pos + 1] = x;
    }

    for (int j = 0; j < n; j++)
    {
        cout << arr[j] << " ";
    }
}

void countingSort(int arr[], int n)
{
    int count[100001]{};
    int m = 0;
    for (int i = 0; i < n; i++)
    {
        count[arr[i]]++;
        m = max(m, arr[i]);
    }

    for (int i = 0; i <= m; i++)
    {
        if (count[i] != 0)
        {
            for (int j = 0; j < count[i]; j++)
            {
                cout << i << " ";
            }
        }
    }


}

void mergeSort(int s[], int l, int r)
{
    if (l >= r)
    {
        return;
    }
    int m = (l + r) / 2;
    mergeSort(s, l, m);
    mergeSort(s, m + 1, r);
    merge(s, l, m, r);
}

void merge(int s[], int l, int m, int r)
{
    vector<int> x(s + l, s + m + 1);
    vector<int> y(s + m + 1, s + r + 1);
    int i = 0;
    int j = 0;

    while (i < x.size() && j < y.size())
    {
        if (x[i] < y[j])
        {
            s[l] = x[i];
            l++;
            i++;
        }
        else
        {
            s[l] = y[j];
            j++;
            l++;
        }
    }

    while (i < x.size())
    {
        s[l] = x[i];
        l++;
        i++;
    }

    while (j < y.size())
    {
        s[l] = y[j];
        l++;
        j++;
    }

}

void heapifyMax(int arr[], int n, int i)
{
    int left = 2 * i + 1;
    int right = 2 * i + 2;
    int Largest = i;

    if(left < n && arr[left] > arr[Largest])
    {
        Largest = left;
    }

    if(right < n && arr[right] > arr[Largest])
    {
        Largest = right;
    }

    if(Largest != i)
    {
        swap(arr[i], arr[Largest]);
        heapifyMax(arr, n, Largest);
    }
}

void heapifyMin(int arr[], int n, int i)
{
    int left = 2 * i + 1;
    int right = 2 * i + 2;
    int Smallest = i;

    if(left < n && arr[left] < arr[Smallest])
    {
        Smallest = left;
    }

    if(right < n && arr[right] < arr[Smallest])
    {
        Smallest = right;
    }

    if(Smallest != i)
    {
        swap(arr[i], arr[Smallest]);
        heapifyMin(arr, n, Smallest);
    }
}

void heapSortMax(int arr[], int n)
{
    for(int i =  n / 2 - 1; i >= 0; i--)
    {
        heapifyMax(arr, n, i);
    }

    for(int i = n - 1; i >= 0; i--)
    {
        swap(arr[0], arr[i]);
        heapifyMax(arr, i, 0);
    }
}

void heapSortMin(int arr[], int n)
{
    for(int i =  n / 2 - 1; i >= 0; i--)
    {
        heapifyMin(arr, n, i);
    }

    for(int i = n - 1; i >= 0; i--)
    {
        swap(arr[0], arr[i]);
        heapifyMin(arr, i, 0);
    }
}

int main() {
    int numbers[100];
    int n;
    cin >> n;
    for (int j = 0; j < n; j++)
    {
        numbers[j] = rand() % ( 99 - 10);
    }
    
    heapSortMin(numbers, n);
    for (int j = 0; j < n; j++)
    {
        cout << numbers[j] << " ";
    }
    return 0;
}
