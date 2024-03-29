#include <iostream>
#include <string>
using namespace std;

struct video{
string title;
string category;
int quantity;
};
struct node{
video data;
node* pNext;
};

bool IsListEmpty(node* lst);
int GetListLength(node* lst);

bool IsListEmpty(node* lst)
{
    return lst == NULL;
}

int GetListLength(node* lst)
{
    int count = 0;

    node* pCur = new node;
    pCur = lst;
    while(pCur != NULL)
    {
        count++;
        pCur = pCur->pNext;
    }

    return count;
}

void AddItemToList(node* &lst, video item)
{
    node *pCurr = new node;
    node *tmp = lst;
    pCurr->data = item;
    pCurr->pNext = NULL;
    if(lst == NULL)
    {
        lst = pCurr;
    }else{
        while(tmp->pNext != NULL)
        {
            tmp = tmp->pNext;
        }

        tmp->pNext = pCurr;
    }
}

void InsertToList(node* &lst, int newpos, video item)
{
    int n = GetListLength(lst);
    node* pPrev = NULL;
    node* pCurr = lst;
    node* tmp = new node;
    tmp->data = item;

    if(newpos <= 0 && newpos > n + 1)
    {
        return;
    }else if(newpos == 1)
    {
        tmp->pNext = pCurr;
        lst = tmp;
    }else if(newpos == n + 1)
    {
        AddItemToList(pCurr, item);
    }
    else{
        for(int i = 1; i < newpos - 1; i++)
        {
            pCurr = pCurr->pNext;
        }

        tmp->pNext = pCurr->pNext;
        pCurr->pNext = tmp;
    }

}

void RemoveFromList(node* &lst, int pos)
{
    int n = GetListLength(lst);
    node* pPrev = NULL;
    node* pCurr = lst;

    if(lst == NULL)
    {
        return;
    }
    else if(pos == 1)
    {
        lst = lst->pNext;
    }else if(pos == n)
    {
        node* pPrev = NULL;
        node* pCurr = lst;
        while(pCurr->pNext != NULL)
        {
            pPrev = pCurr;
            pCurr = pCurr->pNext;
        }
        pPrev->pNext = NULL;
    }
    else{
    for(int i = 1; i < pos; i++)
    {
        pPrev = pCurr;
        pCurr = pCurr->pNext;
    }

    pPrev->pNext = pCurr->pNext;
    }
}

void ClearList(node* &lst)
{
    lst = NULL;
}

video GetListEntry(node* lst, int pos)
{
    node* pCurr = lst;
    for(int i = 0; i < pos - 1; i++)
    {
        pCurr = pCurr->pNext;
    }
    return pCurr->data;
}

void SetListEntry(node* &lst, int pos, video item)
{
    node* pCurr = lst;
    for(int i = 0; i < pos - 1; i++)
    {
        pCurr = pCurr->pNext;
    }
    pCurr->data = item;
}

void ouputLinkedList(node* head)
{
   
    while(head != NULL)
    {
        cout << "Title: " << head->data.title << endl;
        cout << "Category: " << head->data.category << endl;
        cout << "Quantity: " << head->data.quantity << endl;
        head = head->pNext;
    }
}

int main()
{
    node* list = NULL;
    while(true)
    {
        cout << "1. Check the list is empty ?" << endl;
        cout << "2. Get List Length" << endl;
        cout << "3. Add Item To Last List" << endl;
        cout << "4. Insert To Position Of List" << endl;
        cout << "5. Remove Position From List" << endl;
        cout << "6. Clear List" << endl;
        cout << "7. Output Linked List" << endl;
        cout << "8. Get the video at the position pos in lst" << endl;
        cout << "9. Set the video at the position pos in lst to item" << endl;
        cout << "10. Sort video non-decreasing" << endl;
        int choice;
        cin >> choice;

        if(choice == 1)
        {
            cout << IsListEmpty(list) << endl;
        }else if(choice == 2)
        {
            cout << GetListLength(list) << endl;
        }else if(choice == 3)
        {
            video item;
            cout << "Title: "<< endl;
            cin.ignore();
            getline(cin, item.title);
            cout << "Category: " << endl;
            cin >> item.category;
            cout << "Quantity: " << endl;
            cin >> item.quantity;
            AddItemToList(list, item);

        }else if(choice == 4)
        {
            video item;
            int newpos;

            cout << "Position ";
            cin >> newpos;
            cout << "Title: "<< endl;
            cin.ignore();
            getline(cin, item.title);
            cout << "Category: " << endl;
            cin >> item.category;
            cout << "Quantity: " << endl;
            cin >> item.quantity;
            
            InsertToList(list, newpos, item);
        }
        else if(choice == 5)
        {
            int pos;
            cout << "Position: ";
            cin >> pos;
            RemoveFromList(list, pos);
        }
        else if(choice == 6)
        {
            ClearList(list);
        }else if(choice == 7)
        {
            ouputLinkedList(list);
        }
        else if(choice == 8)
        {
            int pos;
            cout << "Position: ";
            cin >> pos;
            video item = GetListEntry(list, pos);
            cout << "Title: " << item.title << endl;
            cout << "Category: " << item.category << endl;
            cout << "Quantity: " << item.quantity << endl;
        }
        else if(choice == 9)
        {
            int pos;
            cout << "Position: ";
            cin >> pos;
            video item;
            cout << "Title: "<< endl;
            cin.ignore();
            getline(cin, item.title);
            cout << "Category: " << endl;
            cin >> item.category;
            cout << "Quantity: " << endl;
            cin >> item.quantity;
            SetListEntry(list, pos, item);
        }
    }
    
    return 0;
}
