#include <iostream>
#include <fstream>
#include <cstring>
#include <ctime>
#include <vector>
#include <algorithm>
#include <math.h>

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

//Thuật toán sắp xếp kiểu chiếc lược (sort bằng cách so sánh 2 phần tử với index cách nhau 1 khoảng gap)
void combSort(int arr[], int n);

void interchangeSort(int arr[], int n);

//Thuật toán sắp xếp cocktail sort hay còn gọi là shaker sort (là bubble sort 2 chiều xuôi và ngược)
void shakerSort(int arr[], int n);

//Thuật toán sắp xếp quick sort 
int Partition(int arr[], int i, int j);         //Tìm vị trí then chốt (pivot) để sort về đúng vị trí
void quickSort(int arr[], int low, int high);   //Gọi đệ quy để chia nhỏ ra thành nhiều mảng rồi sort

//Thuật toán shell sort sử dụng gap là n/2 cho mỗi bước sort để chia thành nhiều sub - arrays nhỏ qua 
//mỗi lần chia thì gap /= 2 và sort bằng insertion sort
void shellSort(int arr[], int n);

//Thuật toán sắp xếp phần tử theo cơ số từ hàng đơn vị->trăm->ngàn->triệu... => Stable 
void radixSort(int arr[], int n);

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

void combSort(int arr[], int n)
{
    int gap = n - 1;

    while(gap > 0)
    {
        int index = 0;

        while(index + gap < n)
        {
            if(arr[index] > arr[index + gap])
            {
                swap(arr[index], arr[index + gap]);
            }

            index++;
        }

        gap -= 2;
    }

}

void StrangeSort(int arr[], int n)
{
    insertionSort(arr, n);

    int ans[100];

    for(int i = 0; i < n; i++)
    {
        ans[i] = arr[i];
    }

    int index = 0;

    int i = n - 1, j = 0;

    while(j <= i)
    {
        arr[index++] = ans[j];
        arr[index++] = ans[i];
        j++;
        i--;

        if(j == i)
        {
            arr[index++] = ans[j];
            break;
        }
    }

}

void interchangeSort(int arr[], int n)
{
    for(int i = 0; i < n; i++)
    {
        for(int j = i + 1; j < n; j++)
        {
            if(arr[i] > arr[j])
            {
                swap(arr[i], arr[j]);
            }
        }
    }
}

void shakerSort(int arr[], int n)
{
    int head = 0;
    int tail = n - 1;

    while(head < tail)
    {
        for(int i = head; i < tail; i++)
        {
            if(arr[i] > arr[i + 1])
            {
                swap(arr[i], arr[i + 1]);
            }
        }

        for(int i = tail - 1; i > head; i--)
        {
            if(arr[i] < arr[i - 1])
            {
                swap(arr[i], arr[i - 1]);
            }
        }

        head++;
        tail--;
    }
}

int Partition(int arr[], int i, int j)
{
    int pivot = j;
    j--;
    while(i < j)
    {
        while(arr[i] < arr[pivot] && i < j)
        {
            i++;
        }

        while(arr[j] > arr[pivot] && j > i)
        {
            j--;
        }

        if(i < j)
        {
            swap(arr[i], arr[j]);
            i++;
            j--;
        }
    }

    swap(arr[pivot], arr[i]);
    return i;
}

void quickSort(int arr[], int low, int high)
{
    if(low >= high)
    {
        return;
    }
    int index = Partition(arr, low, high);
    quickSort(arr, low, index - 1);
    quickSort(arr, index + 1, high);
}

void shellSort(int arr[], int n)
{
    int gap = n / 2;

    while(gap != 0)
    {
        for(int i = 0; i < n; i++)
        {
            int index = i;
            int temp = arr[i];
            while(temp < arr[index - gap] && index - gap >= 0)
            {
                arr[index] = arr[index - gap];
                index -= gap;
            }

            arr[index] = temp;
        }


        gap /= 2;
    } 
}

void radixSort(int arr[], int n)
{
    //Tìm phần tử lớn nhất
    int max = arr[0];
    int min = arr[0];
    for(int i = 0; i < n; i++)
    {
        if(max < arr[i])
        {
            max = arr[i];
        }else if(min > arr[i]){
            min = arr[i];
        }
    }

    int countPos = 0;
    int countNeg = 0;
    int* negatives = new int[n];
    int* positives = new int[n];

    for(int i = 0; i < n; i++)
    {
        if(arr[i] < 0)
        {
            negatives[countNeg++] = abs(arr[i]);
        }else
        {
            positives[countPos++] = arr[i];
        }
    }
    
    int divid = 1;

    if(countNeg != 0)
    {
        while(abs(min) / divid > 0)
        {

            int *ans = new int[countNeg];
            int exist[10] = {0};

            for(int i = 0; i < countNeg; i++)
            {
                int index = (negatives[i] / divid) % 10;
                exist[index]++;
            }

            //Tính mảng cộng dồn để đếm số phần tử xuất hiện và vị trí của chúng
            for(int i = 1; i < 10; i++)
            {
                exist[i] += exist[i - 1];
            }


            //Gán và sắp xếp các phần tử vào mảng phụ
            for(int i = countNeg - 1; i >= 0; i--)
            {
                int index = (negatives[i] / divid) % 10;
                ans[exist[index] - 1] = negatives[i];
                exist[index]--;
            }

            //Gán phần tử kết quả vào mảng chính
            int index = 0;

            for(int i = 0; i < countNeg; i++)
            {
                negatives[i] = ans[i]; 
            }

            divid *= 10;
            delete[] ans;
        }
    }

    divid = 1;

    if(countPos > 0)
    {
        while(max / divid > 0)
        {

            int *ans = new int[countPos];
            int exist[10] = {0};

            for(int i = 0; i < countPos; i++)
            {
                int index = (positives[i] / divid) % 10;
                exist[index]++;
            }

            //Tính mảng cộng dồn để đếm số phần tử xuất hiện và vị trí của chúng
            for(int i = 1; i < 10; i++)
            {
                exist[i] += exist[i - 1];
            }


            //Gán và sắp xếp các phần tử vào mảng phụ
            for(int i = countPos - 1; i >= 0; i--)
            {
                int index = (positives[i] / divid) % 10;
                ans[exist[index] - 1] = positives[i];
                exist[index]--;
            }

            //Gán phần tử kết quả vào mảng chính
            for(int i = 0; i < countPos; i++)
            {
                positives[i] = ans[i]; 
            }

            divid *= 10;
            delete[] ans;
        }
    }

    int index = 0;

    for(int i = countNeg - 1; i >= 0; i--)
    {
        arr[index] = (-1) * negatives[i];
        index++;
    }

    for(int i = 0; i < countPos; i++)
    {
        arr[countNeg + i] = positives[i];
    }
}


void radixSort2(int a[], int n)
{
	int b[10000], m = a[0], exp = 1;

	for (int i = 0; i < n; i++)
		if (a[i] > m)
			m = a[i];

	while (m / exp > 0)
	{
		int bucket[10] = {0};
		for (int i = 0; i < n; i++)
			bucket[a[i] / exp % 10]++;
		for (int i = 1; i < 10; i++)
			bucket[i] += bucket[i - 1];
		for (int i = n - 1; i >= 0; i--)
			b[--bucket[a[i] / exp % 10]] = a[i];
		for (int i = 0; i < n; i++)
			a[i] = b[i];
		exp *= 10;
	}
}

int main() {
    int numbers[100];
    int n;
    cin >> n;
    for (int j = 0; j < n; j++)
    {
        //numbers[j] = rand() % (599 - 10);

        int lower_bound = -300;
        int upper_bound = -100;
        numbers[j] = lower_bound + rand() % (upper_bound - lower_bound + 1);
        //cin >> numbers[j];
    }

    for (int j = 0; j < n; j++)
    {
        cout << numbers[j] << " ";
    }

    cout << endl;

    radixSort(numbers, n);
    
    // for(int i =  n / 2 - 1; i >= 0; i--)
    // {
    //     heapifyMax(numbers, n, i);
    // }
    
    for (int j = 0; j < n; j++)
    {
        cout << numbers[j] << " ";
    }
    return 0;
}
