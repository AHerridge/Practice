/*
 * Book.h
 *
 *  Created on: Oct 17, 2016
 *      Author: Alex
 */
#ifndef BOOK_H
#define	BOOK_H

#include <string>

using namespace std;

class Book
{
	string title;
	string isbn;
	float cost;
public:
	Book(string title, float cost, string isbn);
	string getTitle();
	string getIsbn();
	float getCost();
	void setTitle(const string& title);
	void setIsbn(const string& isbn);
	void setCost(float cost);
};

#endif
