#include <iostream>
#include <string>
using namespace std;

char vocales[5] = {'A', 'E', 'I', 'O', 'U'}; //arreglo para verificar las vocales, solo el mayusculas, ya que así se maneja el texto auxilar

string convermayus(string tex) { //convierte todo en mayusculas de manera temporal, solo para verificar o contar
    int largo = tex.size();
    for (int i = 0; i < largo; i++) {
        tex[i] = toupper(tex[i]);
    }
    return tex;
}

bool esvocal(char c) { //revisa si es caracter es una vocal iterando el arreglo 
    for (int i = 0; i < 5; ++i) {
        if (c == vocales[i]) {
            return true;
        }
    }
    return false;
}

bool escon(char c) { //revisa si es una letra, para evitar los espacios, y luego al no ser una vocal, es una cosonante
    if (isalpha(c)) {
        for (int i = 0; i < 5; ++i) {
            if (c == vocales[i]) {
                return false;
            }
        }
        return true;
    }
    return false;
}

void contarvoc(string text) { //cuenta vocales
    int largo = text.size();
    int vocales = 0;
    int consonantes = 0;

    for (int i = 0; i < largo; i++) {
        char letra = text[i];
        if (isalpha(letra)) {
            if (esvocal(letra)) {
                vocales++;
            }
        }
    }
    cout << "La cantidad de vocales en el texto es:  " << vocales << endl;
}

void contarcon(string text) { //cuenta consonantes
    int largo = text.size();
    int consonantes = 0;

    for (int i = 0; i < largo; i++) {
        char letra = text[i];
        if (isalpha(letra)) {
            if (escon(letra)) {
                consonantes++;
            }
        }
    }
    cout << "La cantidad de consonantes en el texto es:  " << consonantes << endl;
}

void buscar(string& tex, string buscar) { //busca una palabra en el texto
    string b = convermayus(buscar); //convierte el la palabra a buscar en mayuscula 
    int posicion = tex.find(b); //da la posición en la que se encuentra la palabra 
    if (posicion != -1) {
        cout << "La palabra esta en el texto" << endl;
    } else {
        cout << "La palabra NO esta en el texto" << endl; //es -1 porque la palabra puede estar incluso en la posición 0
    }
}

void byreem(string& tex, string buscar, string ree) {
    string b = convermayus(buscar);
    string t= convermayus(tex);
    int posicion = t.find(b);
    while (posicion != -1) { //por si encuentra la palabra más de una vez 
        tex.replace(posicion, b.size(), ree);
        posicion = t.find(b, posicion + ree.size());
    }
    cout << "El texto con la palabra cambiada es: " << tex << endl;
}

int main() {
	string texto; string aux; 
et:
    int opc; 
    string buscarp, reem, bree; 
    cout << "-----------------------------\n";
    cout << "Menu de opciones:\n";
    cout << "1. Ingresar texto \n";
    cout << "2. Contar vocales \n";
    cout << "3. Contar consonantes \n";
    cout << "4. Buscar una palabra \n";
    cout << "5. Reemplazar una palabra \n";
    cout << "6. Salir \n";
    cout << "Ingrese la opcion que desea \n";
    cin >> opc;
    switch(opc){
        case 1:{
		    cin.ignore();
		    while (texto.empty()) {
			    cout << "Ingrese el texto: ";
			    getline(cin, texto);
			    if (texto.empty()) {
			        cout << "No se ha ingresado ningun texto." << endl;
			    }
			}
		    aux = convermayus(texto); 
		    break;
		}
		case 2:{
		    contarvoc(aux); 
		    break;
		}
		case 3: {
		    contarcon(aux);
		    break;
		}
		case 4: {
		    cin.ignore();
		    cout << "Ingrese la palabra a buscar: ";
		    getline(cin, buscarp);
		    buscar(aux, buscarp);
		    break;
		}
		case 5:{
		    cin.ignore();
		    cout << "Ingrese la palabra a buscar para reemplazar: ";
		    getline(cin, bree);
		    cout << "Ingrese la palabra para que la reemplace: ";
		    getline(cin, reem);
		    byreem(texto, bree, reem);
		    break;
		}

        case 6:{
            exit(1);
        }
    
    }
    goto et; 
}
    
    

