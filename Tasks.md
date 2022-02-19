## **Zadanie 1 (prawie największa liczba)**

Zadanie polega na znalezieniu w podanym zbiorze liczb wartości, która jest m-ta największa.

W pierwszej linii znajdują się dwie liczby:

n - liczba wartości w drugiej linii
m - parametr, która m-ta największa wartość nas interesuje
W drugiej linii znajduje się n wartości, odpowiadające wejściowemu zbiorowi. Jako wyjście należy podać m-tą największą wartość.

Przykład:

input:

4 3

1 2 3 4

output:

2

Dlaczego? 2 jest trzecią największą liczbą w zbiorze (3 oraz 4 są większe).

----------

## **Zadanie 2 (liczby prawie pierwsze):**
Zadanie polega na znalezieniu w podanym zbiorze liczb, które mają dokładnie dwa różne dzielniki inne od 1 i samej siebie.

W pierwszej linii podana będzie wartość m oznaczająca liczbę wartości, które stanowią wejściowy zbiór. W kolejnej linii znajduje się m liczb. Jako output należałoby wypisać niemalejąco wszystkie liczby, które spełniają warunki z treści zadania. Żadna z liczb nie będzie przekraczać 10 000 000 (10 milionów).

Przykład:
input:

4
15 6 9 19
output:

6 15
Dlaczego? 6 = 2x3, 15 = 3x5, 9 = 3x3 (tylko 1 różny), 19 to liczba pierwsza

----------

## Zadanie 3 (graf):
Zadanie polega na zaimplementowaniu algorytmu liczącego najkrótszą odległość pomiędzy wybranymi wierzchołkami w grafie.

W pierwszym wierszu są dwie liczby:

n - liczba wierzchołków (wierzchołki są numerowane od 1 do n)
m - liczba krawędzi
w następnych m wierszach zdefiniowane są krawędzie grafu. Wszystkie krawędzie są dwukierunkowe.

W ostatniej linii pliku znajdują się dwie liczby i oraz j (1 <= i, j <= n), są to numery wierzchołków oznaczających start oraz finisz.

Program wyjściowo powinien podać jedną liczbę - najkrótszą odległość między wierzchołkami n oraz m albo -1 w przypadku, gdy takiej trasy w podanym grafie nie ma.

Przykład:
input:

5 5

1 2

2 3

3 4

1 4

4 5

1 5

output:

2
Dlaczego? trasa 1-4-5 jest najkrótsza (i jest długości 2).****