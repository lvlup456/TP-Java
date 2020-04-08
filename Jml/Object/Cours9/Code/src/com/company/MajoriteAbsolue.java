package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class MajoriteAbsolue {

    private int nbrInscrits;
    private Map<Vote, Integer> map;
    private boolean estClos = false;

    public MajoriteAbsolue(int nbrInscrits, Set<Vote> votesPossibles){
        this.nbrInscrits = nbrInscrits;
        this.map = new HashMap<Vote,Integer>();

        votesPossibles.add(Vote.blanc);
        votesPossibles.add(Vote.nul);

        for (Vote vote : votesPossibles){
            map.put(vote,0);
        }
    }

    public boolean getEstClos(){
        return this.estClos;
    }

    public Map<Vote, Integer> getMap(){
        return map;
    }

    public int getNbrInscrits(){
        return this.nbrInscrits;
    }


    public Set<Vote> getVotesPossibles(){

        return this.map.keySet();

    }

    public void ajouterVote(Vote v) {
        if (!this.estClos){
            if (map.containsKey(v)){
                int val = map.get(v);
                map.replace(v,val+1);
            }else{
                int val = map.get(Vote.nul);
                map.replace(Vote.nul,val+1);
            }
        }else{
            throw new ScrutinClosException("le scrutin est deja clos");
        }
    }

    public void afficherResultat(){
        if (this.estClos){
            Set<Vote> key = this.getVotesPossibles();
            for (Vote v : key){
                System.out.println("le vote : " + v.getNom() + " a " + this.map.get(v) + " votes");
            }
        }else{
            throw new ScrutinClosException("le scrutin n'est pas encore clos");
        }
    }

    public void cloture(){
        this.estClos = true;
        System.out.println("les resultats sont: ");
        this.afficherResultat();
    }

    public Vote getVainqueur(){
        int nbrGens=0;
        if (this.estClos){
            Set<Vote> key = this.getVotesPossibles();
            for (Vote v : key){
                if (v != Vote.blanc && v != Vote.nul){
                    nbrGens += this.map.get(v);
                }
            }

            for (Vote v : key){
                if (v != Vote.blanc && v != Vote.nul && this.map.get(v) > (nbrGens / 2) ){
                    return v;
                }
            }
        }else{
            throw new ScrutinClosException("le scrutin n'est pas encore clos");
        }
        return null;
    }


}
