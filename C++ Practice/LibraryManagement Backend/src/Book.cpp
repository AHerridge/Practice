/*
 * Book.cpp
 *
 *  Created on: Oct 17, 2016
 *      Author: Alex
 */

#include "Book.h"

using namespace std;

Book::Book(string title, float cost, string isbn)
{
	this->title = title;
	this->cost = cost;
	this->isbn = isbn;
}

string Book::getTitle()
{
	return this->title;
}

string Book::getIsbn()
{
	return this->isbn;
}

float Book::getCost()
{
	return this->cost;
}

void Book::setTitle(const string& title)
{
	this->title = title;
}

void Book::setIsbn(const string& title)
{
	this->isbn = isbn;
}

void Book::setCost(float cost)
{
	this->cost = cost;
}
