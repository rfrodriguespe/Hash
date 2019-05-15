package tabelashash;


import java.util.Scanner;

/** Class LinearProbingHashTableTest **/
public class LinearProbingHashTableTest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        /** maxSizeake object of LinearProbingHashTable **/
        LinearProbingHashTable lpht = new LinearProbingHashTable(40);
 
        char ch;
        /**  Perform LinearProbingHashTable operations  **/
        do    
        {
            System.out.println("\nOperacoes Tabela Hash\n");
            System.out.println("1. Inserir ");
            System.out.println("2. Remover");
            System.out.println("3. Imprimir");            
            System.out.println("4. Deletar");
            System.out.println("5. Tamanho");
 
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Entre com a chave e valor");
                lpht.insert(scan.next(), scan.next() ); 
                break;                          
            case 2 :                 
                System.out.println("Entre com  achave");
                lpht.remove( scan.next() ); 
                break;                        
            case 3 : 
                System.out.println("Entre com  achave");
                System.out.println("Valor = "+ lpht.get( scan.next() )); 
                break;                                   
            case 4 : 
                lpht.makeEmpty();
                System.out.println("Tabela Hash Vazia\n");
                break;
            case 5 : 
                System.out.println("Tamanho = "+ lpht.getSize() );
                break;         
            default : 
                System.out.println("Entrada invalida \n ");
                break;   
            }
            /** Display hash table **/
            lpht.printHashTable();  
 
            System.out.println("\nDeseja continuar (Digite s ou n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 's'|| ch == 'S');  
    }
}