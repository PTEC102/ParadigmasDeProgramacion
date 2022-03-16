#include <iostream>
#include <vector>

using namespace std;

int main () {
    //Altura triangulo
    int height;
    cin >> height;
    
    int spaceBetween = 0;

    for (int i = 0 ; i < height ; i++){
        if(i == 0){
            cout << "*" << endl;
        }else{
            cout << "*";
            for(int j = 0; j < spaceBetween ; j++){
                if(spaceBetween < height-2){
                    cout << " ";
                }else{
                    cout << "*";
                }
            }
            spaceBetween++;
            cout << "*" << endl;
        }
    }
    
    return 0;
}