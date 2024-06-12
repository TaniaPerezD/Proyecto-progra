#include <iostream>
using namespace std;

int divisores(int num) { //saca los divisores de los numeros y los suma 
    int suma = 1;
    for (int i = 2; i <= num / 2; i++) {
        if (num % i == 0) {
            suma += i;
        }
    }
    return suma;
}

void numerosamigos(int num1, int num2){
	
	int tot1=divisores(num1);
	int tot2=divisores(num2);
	
	if(num1==tot2 and num2==tot1){ //dos numeros amigos serán amigos cuando la suma de los divisores de a sea b y vicersa, por eso se usa and en la condición 
		cout<<"El numero "<<num1<<" y el numero "<<num2<<" son amigos"<<endl;
	}
	else{
		cout<<"El numero "<<num1<<" y el numero "<<num2<<" NO son amigos"<<endl;
	}
	
}

int main (){
	
	int numero1, numero2;
	
	cout<<"Ingrese el primer numero: ";
	cin>>numero1; 
	
	cout<<"Ingrese el segundo numero: ";
	cin>>numero2; 
	
	numerosamigos(numero1, numero2);
	
}
