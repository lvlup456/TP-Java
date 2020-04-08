package Cypher;

public class TranspoPaire extends Cypher{

    public TranspoPaire(String message) {
        this.setMessage(message);
    }

    //pas bon
    @Override
    public void Chiffrement() {
        int millieu = this.getMessage().length() /2;
        int i = 0;
        int j = millieu;
        String messageCrypte = "";

        while (i + 1 < millieu && j + 1 < this.getMessage().length()){
            messageCrypte = messageCrypte +  this.getMessage().charAt(i) + this.getMessage().charAt(i+1) + this.getMessage().charAt(j) + this.getMessage().charAt(j + 1);
            i += 2;
            j += 2;
        }

        if (i+1 != this.getMessage().length()){
            messageCrypte = messageCrypte + this.getMessage().charAt(i) + this.getMessage().charAt(i+1);
            i += 2;
        }
        if (i != this.getMessage().length()){
            messageCrypte = messageCrypte + this.getMessage().charAt(i);
            i ++;
        }

        if (j+1 != this.getMessage().length()){
            messageCrypte = messageCrypte + this.getMessage().charAt(j) + this.getMessage().charAt(j+1);
            j += 2;
        }

        if (j != this.getMessage().length()){
            messageCrypte = messageCrypte + this.getMessage().charAt(j);
            j += 1;
        }
        this.setMessage(messageCrypte);
    }
}
