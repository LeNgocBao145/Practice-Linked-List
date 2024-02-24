#include <iostream>

struct video{
char* title;
char category[5];
int quantity;
};
struct node{
video data;
node* pNext;
};

bool IsListEmpty(node* lst);
int GetListLength(node* lst);
int AddItemToList(node* &lst, video item);
int InsertToList(node* &lst, int newpos, video item);
int RemoveFromList(node* &lst, int pos);
void ClearList(node* &lst);
video GetListEntry(node* lst, int pos);
void SetListEntry(node* &lst, int pos, video item);

bool IsListEmpty(node* lst)
{
    return lst == NULL;
}

int GetListLength(node* lst)
{
    int count = 0;

    node* pCur = new node;
    while(lst->pNext != NULL)
    {
        count++;
        pCur = pCur->pNext;
    }

    return count;
}

int AddItemToList(node* &lst, video item)
{

}

int InsertToList(node* &lst, int newpos, video item)
{

}

int RemoveFromList(node* &lst, int pos)
{

}

void ClearList(node* &lst)
{
    
}

video GetListEntry(node* lst, int pos)
{

}

void SetListEntry(node* &lst, int pos, video item)
{

}

int main()
{


    return 0;
}