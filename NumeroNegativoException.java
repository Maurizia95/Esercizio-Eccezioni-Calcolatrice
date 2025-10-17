public class NumeroNegativoException extends Exception { //la mia eccezione NumeroNegativoException eredita tutto da Exception, eccezione predefinita di java
        public NumeroNegativoException(String messaggio){ //costruttore della mia eccezione che prende una stringa messaggio
            super(messaggio); //super,richiama il costruttore della superclasse che leggerà quel messaggio (e.getMessage)
        }
    }

