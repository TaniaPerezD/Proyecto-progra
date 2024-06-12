


#include <iostream>
#include <string>
using namespace std;

char mensajes[9][30]={"Unidad","Comunión, división","Tres en uno, uno en tres","Estabilidad","Favor inmerecido","Humanidad","Perfeccion","Nuevo comienzo","Dar resultados positivos"};
char mensajesnuma[3][30]={"Visionario","Maestro de la obra","Humanitario"}; // al tratarse de una matriz de caracteres, cada letra tiene una casilla, por eso el maximo es 30



// Función para sumar los dígitos de un número
int sumarDigitos(int num) {
    int suma = 0;
    while (num != 0) {
        suma += num % 10;
        num /= 10;
    }
    if (suma == 10) {
        return 1; // Si la suma es 10, devolvemos 1 en su lugar
    }

    return suma;
}


void numymen(string f){
	int suma = 0;
	int total= 0;
    for (int i = 0; i < f.length(); ++i) {
        char c = f[i];
        if (isdigit(c)) {
            total += c - '0'; //consigue su valor mediante el código ASCII, simbilozado con '0', además verifica si es un digito, por eso no cuenta las barras /
        }
    }
    
    if(total>9 and total%11!=0){
    	suma=sumarDigitos(total);
    	
	}
	else{
		if(total%11==0){
			suma=total;
		}
		 
	}
    
    cout << "Tu numero es: " << suma << endl;
    
    if (suma >= 1 && suma <= 9) {
        cout << "El mensaje para ti es: " << mensajes[suma-1] << endl;
    } else 
    	cout<<"Felicidades, tu numero es un numero maestro!"<<endl; 
		if (suma == 11) {
        cout << "Mensaje especial para  11: " << mensajesnuma[0] << endl;
    } else 	
	if (suma == 22) {
        cout << "Mensaje especial para  22: " << mensajesnuma[1] << endl;
    } else 
	if (suma == 33) {
        cout << "Mensaje especial para 33: " << mensajesnuma[2] << endl;
    } 
    }

int main() {
    string fecha;
    cout << "Ingrese la fecha en formato dd/mm/aaaa: ";
    getline(cin, fecha);
    numymen(fecha);
}


