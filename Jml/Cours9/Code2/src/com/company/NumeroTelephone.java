package com.company;

import java.util.Objects;

public class NumeroTelephone {
    private String numero;
    private String type;

    public NumeroTelephone(String numero, String type) {
        this.numero = numero;
        this.type = type;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumeroTelephone that = (NumeroTelephone) o;
        return Objects.equals(numero, that.numero) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, type);
    }

    @Override
    public String toString() {
        return "numero " + type + " : " + numero;
    }
}
