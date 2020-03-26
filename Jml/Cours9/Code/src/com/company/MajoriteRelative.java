package com.company;


import java.util.Set;

class MajoriteRelative extends MajoriteAbsolue{

    public MajoriteRelative(int nbrInscrits, Set<Vote> votesPossibles){
        super(nbrInscrits, votesPossibles);
    }

    @Override
    public Vote getVainqueur(){
        int max = 0;
        Vote vainqueur = null;

        if (this.getEstClos()){
            Set<Vote> key = this.getVotesPossibles();
            for (Vote v : key){
                if (v != Vote.blanc && v != Vote.nul && this.getMap().get(v) > max ){
                    max = this.getMap().get(v);
                    vainqueur = v;
                }
            }
            return vainqueur;
        }else{
            throw new ScrutinClosException("le scrutin n'est pas encore clos");
        }
    }
}
