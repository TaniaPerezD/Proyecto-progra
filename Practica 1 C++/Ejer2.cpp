#include <iostream>
#include <string>
#include <sstream>

using namespace std;

int contarp(string texto) {
    stringstream ss(texto);// la variable ss contiene todo el contenido de texto 
    string palabra;
    int contador = 0;
    while (ss >> palabra) { //va sacando las palabras de ss y las guarda en palabra, por esto el contador va subiendo, el bucle solo se corta cuando ya no haya palabras por sacar
        contador++;
    }
    return contador;
}

int main() {
	string texto; 
    cout << "Ingrese el texto: ";
	getline(cin, texto); //como es un texto, cin por si solo tomaría el primer valor y nada más
    int numpal = contarp(texto);
    cout << "El numero de palabras en el texto es: " << numpal << endl;
}
