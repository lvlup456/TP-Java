package Cypher;

public class Transposition extends Cypher {

    public Transposition(String message) {
            setMessage(message);
    }

    @Override
    public void Chiffrement() {
        int millieu = this.getMessage().length() /2;
        int i = 0;
        int j = millieu;
        String messageCrypte = "";

        while (i < millieu && j < this.getMessage().length()){
            messageCrypte = messageCrypte +  this.getMessage().charAt(i) + this.getMessage().charAt(j);
            i++;
            j++;
        }

        if (j != this.getMessage().length()){
            messageCrypte += this.getMessage().charAt(j);
        }
        if (i != this.getMessage().length()){
            messageCrypte += this.getMessage().charAt(i);
        }
        this.setMessage(messageCrypte);
    }
}
