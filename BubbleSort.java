
import java.util.*;

public class BubbleSort{
    
   /**
 *
// * @author Andre Sousa
 */

public static void main(String[] args){
    
    
     int aux = 0;
     int i = 0;

Random random = new Random();
            int array[] = new int[10]; // 10 numeros serão gerados. sempre mantenha a array com o valor que deseja armazenar 

            System.out.print("Vetor bagunçado:");
            for (i=0; i<array.length; i++) {
                 array[i] = random.nextInt(10); /* Gera números aleatórios com limite 10. Array precisa ser 10
                                                   Mude aqui e a Array para 100 ou 1000 para serem imprimidos 100 ou 1000 numeros
                                                  */
                 
                 System.out.print(array[i]+","); // Saída dos numeros gerados
            }
    
	for(i = 0; i<10; i++){
		for(int j = 0; j<9; j++){   //mude o J<9 para 99 se for 100 e 999 se for 1000
			if(array[j] > array[j + 1]){  //Mude o sinal >(maior) para <(menor) se quiser que ordene em forma decrescente
                            
                             aux = array[j];
				array[j] = array[j+1];
				array[j+1] = aux;
			}
		}
	}
	System.out.println("\n Vetor organizado em ordem Crescente:");
	for(i = 0; i<10; i++){
		System.out.print(" "+array[i]+",");
	}
        
       
        System.out.print("\n");
        System.out.print("Vetor bagunçado:");
        
            for (i=0; i<array.length; i++) {
                 array[i] = random.nextInt(10); /* Gera números aleatórios com limite 10. Array precisa ser 10
                                                   Mude aqui e a Array para 100 ou 1000 para serem imprimidos 100 ou 1000 numeros
                                                  */
                 
                 System.out.print(array[i]+","); // Saída dos numeros gerados
            }
    
	for(i = 0; i<10; i++){
		for(int j = 0; j<9; j++){
			if(array[j] < array[j + 1]){
                             aux = array[j];
				array[j] = array[j+1];
				array[j+1] = aux;
			}
		}
	}
	System.out.println("\n Vetor organizado em ordem Decrescente:");
	for(i = 0; i<10; i++){
		System.out.print(" "+array[i]+",");
	}
        
}     
        
}
    


     




    



