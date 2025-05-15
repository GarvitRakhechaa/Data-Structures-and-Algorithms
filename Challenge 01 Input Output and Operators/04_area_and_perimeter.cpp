// input 7,5
// output 35 , 24


#include<iostream>
using namespace std;

int main(){
    int l , b;

    cout << "enter the length: ";
    cin >> l;
    cout << "enter the breadt: ";
    cin >> b;

    cout << "area of object: " << l*b <<endl; 
    cout << "perimeter of object: " << 2*(l+b) ; 
    return 0;
}