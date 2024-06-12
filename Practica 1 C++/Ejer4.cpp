#include <iostream>
#include <string>
#include <cstring>
using namespace std;


int materias(int mat){
	int suma=0; 
	int aux=0; 
	for(int i=0; i<mat; i++){
		cout<<"Cuantos creditos tiene la materia: "<<i+1<<endl;
		cin>>aux;
		suma+=aux; 
	}
	return suma; 
	
}
int totalgen(int  total){// dependiendo del numero de creditos, el precio unitario varia
	if (total<16){
		return total*=582;	 
	}
	else{
		if(total==16){
			return total*=551,875;
		
		}
		else{
			if(total==17){
				return total*=525,29;
				
			}
			else{
				return total*=505;
			
			}
		}
	}
	
}

int  totalmed(int total){//la carrera de medicina tiene un tarifario diferente al resto de la UCB 
	if (total<16){
		return total*=582; 
		
	}
	else{
		if(total>15 and total<37){
			return total*=547;
 
		}
		else{
			if(total>36){
				return total*=531;
				 
			}
		}
	}
	
}

int descuento(int total){
	
	return total*=0.08; 
}
void reporte(char no[], char n[], char e[], char c[], int p, int d, int m, int f) { //imprime el reporte de todo lo necesario para identificar al estudiante
	if(f!=1){
		d=0;
	}
    cout << "NOMBRE:\t" << no << "\t\t\tNIT/CI:\t" << n << endl;
    cout << "ESTUDIANTE:" << e << "\t\tCI:\t" << c << endl;
    cout << "===================================\n";
    cout << "TOTAL POR TOMA DE MATERIAS:\t" << p << endl;
    cout << "MONTO PAGADO:\t\t\t" << m << endl;
    cout << "DESCUENTO:\t\t\t" << d << endl;
    cout << "DEUDA:\t\t\t\t" << p - m -d<< endl;
}


int main() {
et:
    int opc, carrera, mate, pago,  flag , monto, des;
    char nom[50]; 
	char nome[50]; 
	char nit[20]; 
	char ci[20]; 

    cout << "-----------------------------\n";
    cout << "Menu de opciones:\n";
    cout << "1. Agregar deuda \n";
    cout << "2. Descuento por pronto pago\n";
    cout << "3. Facturar monto \n";
    cout << "4. Reporte de estado de cuentas \n";
    cout << "5. Salir \n";
    cout << "Ingrese la opcion que desea \n";
    cin >> opc;
    switch (opc) {
    case 1: {
        cout << "De que carrera son las materias? (Medicina=1; Otra=0): ";
        cin >> carrera;
        if (carrera != 1 and carrera != 0 ) {
        	cout<<"Ingrese una opcion valida"<<endl; 
			break;     
        } 
        else{
        	cout << "Cuantas materias?: ";
        	cin >> mate;
        	int total = materias(mate);
        	
        	if(carrera==0){
        		pago = totalgen(total);
			}
			else{
				pago = totalmed(total);	
			}
		}
        break;	
		}
    case 2: {
    	flag=1; 
        des = descuento(pago);
        cout << "Se aplico el descuento con exito, el total es: " << pago - des << endl;

        break;
    }
    case 3: {
        cout << "Ingrese el monto a pagar: ";
        cin >> monto;
        cout << "Ingrese el nombre: ";
        cin >> nom;
        cout << "Ingrese el CI/NIT: ";
        cin >> nit;
        cout << "Ingrese el nombre del estudiante: ";
        cin.ignore(); 
		cin.getline(nome, sizeof(nome)); //es getline porque normalmente el cin solo toma el valor de la primera palabra
        cout << "Ingrese el CI del estudiante: ";
        cin >> ci;
        break;
    }
    case 4: {
        reporte(nom, nit, nome, ci, pago, des, monto,flag); 
        break;
    }
    case 5: exit(1);
    }
    goto et;
}
