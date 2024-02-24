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
void AddItemToList(node* &lst, video item);
void InsertToList(node* &lst, int newpos, video item);
void RemoveFromList(node* &lst, int pos);
void ClearList(node* &lst);
video GetListEntry(node* lst, int pos);
void SetListEntry(node* &lst, int pos, video item);
void ouputLinkedList(node* head);

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

    if(newpos < 0 && newpos > n)
    {
        return;
    }

    if(newpos == 0)
    {
        lst = tmp;
    }

    if(newpos == n + 1)
    {
        AddItemToList(pCurr, item);
    }

    for(int i = 1; i < newpos - 1; i++)
    {
        pCurr = pCurr->pNext;
    }

    tmp->pNext = pCurr->pNext;
    pCurr->pNext = tmp;

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

// video GetListEntry(node* lst, int pos)
// {

// }

// void SetListEntry(node* &lst, int pos, video item)
// {

// }

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
        cout << "8. " << endl;

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
    }
    
    return 0;
}