// input a,b
// output 
// • Sum (a + b)
// • Difference (a -b)
// • Product (a* b)
// • Integer Division (a / b, discarding any remainder)


#include<iostream>
using namespace std;

int main(){
    int a,b;
    cout << "enter first number: ";
    cin >> a;
    cout << "enter seond number: ";
    cin >> b ;

    cout << a+b << endl;
    cout << a-b << endl;
    cout << a*b << endl;
    cout << a/b ;
    return 0;
}