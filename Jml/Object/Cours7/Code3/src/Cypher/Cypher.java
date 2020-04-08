package Cypher;

public abstract class Cypher {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



    @Override
    public String toString() {
        return this.message ;
    }

    public abstract void Chiffrement();

}
