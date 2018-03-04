// lista jednokierunka.cpp: Określa punkt wejścia dla aplikacji konsoli.
//

#include "stdafx.h"
#include <iostream>

using namespace std;

struct elem
{
	int dane;
	elem *nast;
};
struct elemstos
{
	elem *lista;
	elemstos* poprzedni;
};

void add(elem*& pierwszy, elem*& ostatni, int liczba,int& liczbaelem)
{
	if (pierwszy == NULL)
	{
		pierwszy = ostatni = new elem;
		pierwszy->dane = liczba;
		pierwszy->nast = NULL;
		liczbaelem++;
	}
	else
	{
		ostatni->nast = new elem;
		ostatni = ostatni->nast;
		ostatni->dane = liczba;
		liczbaelem++;
	}
	}
void deleteelem(int numerelemdoskas, int &liczbaelem, elem* &pierwszy, elem* &ostatni)
{
	if (numerelemdoskas > liczbaelem ||numerelemdoskas<0||liczbaelem<1)
	{
		cout << "bledny numer elementu do skasowania lub nie ma co skasowac" << endl;
	}
	else
	{
		elem* pomoc=pierwszy;
		elem* pomoc2;
		if (numerelemdoskas == 1 && liczbaelem==1)//usuniecie pierwszego elementu gdy jest tylk jeden
		{
			liczbaelem--;
			delete pierwszy;
			pierwszy = ostatni = NULL;
		}

		else if (numerelemdoskas == 1 && liczbaelem>1)//usuniecie pierwszego elementu gdy jest ich wiecej w liscie
		{
			pierwszy = pierwszy->nast;
			delete pomoc;
			liczbaelem--;
		}
		else if (numerelemdoskas > 1 && numerelemdoskas==liczbaelem) //usuniecie ostatniego elementu
		{
			for (int i = 0; i < numerelemdoskas - 2; i++)
			{

				pomoc = pomoc->nast;
			}
		delete ostatni;
		ostatni = pomoc;
		ostatni->nast = NULL;
		liczbaelem--;
		}
		else if (numerelemdoskas > 1 && numerelemdoskas < liczbaelem)//usuniecie środkowego elementu
		{
			for (int i = 0; i < numerelemdoskas - 2; i++)
			{

				pomoc = pomoc->nast;
			}
		pomoc2 = pomoc->nast;
		pomoc->nast = pomoc2->nast;
		delete pomoc2;
		liczbaelem--;


		}

	}

}
elem* wypiszelemlisty(elem* lista,int a)
{
	for (int i = 1; i < a; i++)
	{
		lista=lista->nast;
	}
	return lista;
}

void pushstos( elemstos*& ostatni,elem *listael)
{
	elemstos* pomoc = new elemstos;
	pomoc->lista = listael;
	pomoc->poprzedni = ostatni;
	ostatni = pomoc;
}
int popstos(elemstos* &ostatni)
{
	int ret;
	ret = ostatni->lista->dane;
	elemstos* pomoc=ostatni->poprzedni;
	delete ostatni;
	ostatni = pomoc;
	cout << ret << endl;
	return ret;

}
void odwrocliste(elem* pierwszyelemlisty, int liczbaelem, elemstos*&stosik)
{
	for (int i = 0; i < liczbaelem; i++)
	{
		pushstos(stosik, pierwszyelemlisty);
		pierwszyelemlisty = pierwszyelemlisty->nast;
	}
	for (int i = 0; i < liczbaelem; i++)
	{
		popstos(stosik);
	}

}
int main()
{
	int a;
	int liczbael = 0;
	elem* pierwszy = NULL;
	elem* ostatni = NULL;
	elemstos*ostatnistos = NULL;
	
	add(pierwszy, ostatni, 1, liczbael);
	add(pierwszy, ostatni, 2, liczbael);
	add(pierwszy, ostatni, 3, liczbael);
	add(pierwszy, ostatni, 4, liczbael);
	add(pierwszy, ostatni, 5, liczbael);
	add(pierwszy, ostatni, 6, liczbael);
	odwrocliste(pierwszy, liczbael, ostatnistos);
	cin >> a;
	return 0;
}

