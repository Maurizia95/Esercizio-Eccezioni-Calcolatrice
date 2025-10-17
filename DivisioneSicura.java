import java.util.Scanner;
import java.util.InputMismatchException;

// eccezione personalizzata
class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String messaggio) { //questa eccezione mi ritorna un messaggio prestabilito 
        super(messaggio);
    }
}


public class DivisioneSicura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //creo scanner per l'input da tastiera

        //blocco di codice che può contenere l'errore
        try {
            System.out.print("Inserisci il primo numero: ");
            int a = sc.nextInt();

            System.out.print("Inserisci il secondo numero: ");
            int b = sc.nextInt();

            if (a < 0 || b < 0) { //se si verifica questa condizione, se un numero è negativo
                throw new NumeroNegativoException("Non sono permessi numeri negativi!");//lancia l'eccezione 
            }

            int risultato = dividi(a, b); //dichiaro una variabile che conterrà il risultato del metodo dividi()
            System.out.println("Risultato: " + risultato);


        //gestiamo le eccezioni possibili
        } catch (NumeroNegativoException e) {
            System.err.println("Errore: " + e.getMessage());
        } catch(Exception e){
            System.err.println("Errore: " + e.getMessage());
        }
        /*catch (ArithmeticException e) {
            System.out.println("Errore: divisione per zero non permessa!");
        } catch (InputMismatchException e) {
            System.out.println("Errore: devi inserire un numero intero valido!");
        }*/
    }

    //metodo che effettua la divisione
    public static int dividi(int a, int b) {
        return a / b;

     } 
}

