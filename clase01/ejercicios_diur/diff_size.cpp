#include <iostream>

using namespace std;

int main() {
    int number1 = 400;
    short int number2 = 500;
    unsigned short int number3 = 600;
    long int number4 = 700;
    unsigned long int number5 = 800;
    unsigned long long int number6 = 900;
    char character1 = 'A';
    signed char character2 = 'B';
    unsigned char character3 = 'C';
    float digit1 = 20.00;
    double digit2 = 3.14159;
    long double digit3 = 1.414213;
    cout << "Diferencia entre espacio utilizado" << endl;
    
    //Print statements to show the size of various data types
    cout << "El tamaño del tipo de dato int " << number1 << " is: " << sizeof(number1) << " bytes." << endl;
    cout << "El tamaño del tipo de dato short int " << number2 <<  " is: " << sizeof(number2) << " bytes." << endl;
    cout << "El tamaño del tipo de dato unsigned short int " << number3 <<  " is: " << sizeof(number3) << " bytes." << endl;
    cout << "El tamaño del tipo de dato long int " << number4 <<  " is: " << sizeof(number4) << " bytes." << endl;
    cout << "El tamaño del tipo de dato unsigned long int " << number5 <<  " is: " << sizeof(number5) << " bytes." << endl;
    cout << "El tamaño del tipo de dato unsigned long long int " << number6 <<  " is: " << sizeof(number6) << " bytes." << endl;
    cout << "El tamaño del tipo de dato char " << character1 <<  " is: " << sizeof(character1) << " bytes." << endl;
    cout << "El tamaño del tipo de dato signed char " << character2 <<  " is: " << sizeof(character2) << " bytes." << endl;
    cout << "El tamaño del tipo de dato unsigned char " << character3 <<  " is: " << sizeof(character3) << " bytes." << endl;
    cout << "El tamaño del tipo de dato float " << digit1 <<  " is: " << sizeof(digit1) << " bytes." << endl;
    cout << "El tamaño del tipo de dato double " << digit2 <<  " is: " << sizeof(digit2) << " bytes." << endl;
    cout << "El tamaño del tipo de dato long double " << digit3 <<  " is: " << sizeof(digit3) << " bytes." << endl;
    return 0;    
}