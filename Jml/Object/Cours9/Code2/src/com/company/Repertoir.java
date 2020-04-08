package com.company;

import java.util.HashSet;
import java.util.Set;

public class Repertoir {

    private HashSet<Contact> listeContact = new HashSet();

    public HashSet<Contact> getListeContact() {
        return listeContact;
    }

    public void setListeContact(HashSet<Contact> listeContact) {
        this.listeContact = listeContact;
    }

    public Repertoir(Set<Contact> listeContact) {
        for (Contact contact : listeContact) {
            this.listeContact.add(contact);
        }
    }
}
