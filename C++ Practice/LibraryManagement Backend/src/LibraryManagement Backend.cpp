#include <iostream>
#include "Book.h"

using namespace std;

int main()
{
	Book book = Book("HP #3", 10.35, 100100101);
	cout << "$" << book.getCost() << endl;
	return 0;
}

