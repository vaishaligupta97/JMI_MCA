#include<iostream.h>
template<class T>
class Node
{
	public:
		T coeff;
		T pow;
		Node *next;
		Node(T c,T p,Node *n=0)
		{
			coeff=c;
			pow=p;
			next=n;
		}
};
template<class T>
class poly
{
	Node<T> *head,*tail;
	public:
		poly()
		{
			head=tail=0;
		}
		int isempty()
		{
			if(head==0)
				return 1;
			else
				return 0;
		}
		void addtotail(T x,T y);
		void addpoly(poly&,poly&);
		void display();
};
template<class T>
void poly<T>::addtotail(T x,T y)
{
	Node<T> *temp=new Node<T>(x,y);
	if(isempty())
		head=tail=temp;
	else
	{
		tail->next=temp;
		tail=temp;
	}
}
template<class T>
void poly<T>::addpoly(poly<T>& l2,poly<T>& l3)
{
	Node<T> *temp,*temp1;
	temp=head;
	T t1;
	temp1=l2.head;
	while(temp!=0 && temp1!=0)
	{
	 if(temp->pow==temp1->pow)
	{
		t1=temp->coeff+temp1->coeff;
		l3.addtotail(t1,temp->pow);
		temp=temp->next;
		temp1=temp1->next;
	}
	else if(temp->pow>temp1->pow)
	{
		l3.addtotail(temp->coeff,temp->pow);
		temp=temp->next;
	}
	else
	{
		l3.addtotail(temp1->coeff,temp1->pow);
		temp1=temp1->next;
	}
	}
	if(temp!=0)
	{
		while(temp!=0)
		{
			l3.addtotail(temp->coeff,temp->pow);
			temp=temp->next;
		}
	}
	else 
	{
		while(temp1!=0)
		{
			l3.addtotail(temp1->coeff,temp1->pow);
			temp1=temp1->next;
		}
	}
}
template<class T>
void poly<T>::display()
{
	Node<T> *temp=head;
	while(temp!=0)
	{
		cout<<temp->coeff<<"x^"<<temp->pow<<" + ";
		temp=temp->next;
	}
}
int main()
{
	poly<int> l1,l2,l3;
	int ch,p,c;
	char ch1,ch2='y';
	do
	{
		cout<<"1.Addtotail"<<endl;
		cout<<"2.Add Polynomial"<<endl;
		cout<<"Enter your choice"<<endl;
		cin>>ch;
		switch(ch)
		{
			case 1: cout<<"Enter the coefficient"<<endl;
					cin>>c;
					cout<<"Enter the power"<<endl;
					cin>>p;
					l1.addtotail(c,p);
					break;
			case 2: while(ch2=='y')
					{
						cout<<"Enter the coefficient"<<endl;
						cin>>c;
						cout<<"Enter the power"<<endl;
						cin>>p;
						l2.addtotail(c,p);
						cout<<"Do you want to enter more"<<endl;
						cin>>ch2;
					}
					l1.addpoly(l2,l3);
					l3.display();
					break;
		}
		cout<<"do you want to continue(y,n)"<<endl;
		cin>>ch1;
	}
	while(ch1=='y' || ch1=='Y');
}
		

