package ch.cpnv.providers;

import java.util.ArrayList;

import ch.cpnv.gobangrybird.GobAngryBird;
import ch.cpnv.models.data.Vocabulary;
import ch.cpnv.models.data.Word;

public class VocProvider {

    private static VocProvider signle_instance = null;
    public ArrayList<Vocabulary> vocs;

    private VocProvider() {
        vocs = new ArrayList<Vocabulary>();
        Word w;
        Vocabulary voc = new Vocabulary("Amour");
        w = new Word("Bisous","Kiss"); voc.addWord(w);
        w = new Word("Je t'aime","I love you"); voc.addWord(w);
        vocs.add(voc);

        voc = new Vocabulary("Moto");
        w = new Word("Je fait un monstre whip","I make a monster whip"); voc.addWord(w);
        w = new Word("Go pour un backflip","Go for one backflip"); voc.addWord(w);
        vocs.add(voc);
    }

    public static VocProvider getInstance(){
        if(signle_instance == null)
            signle_instance = new VocProvider();
        return signle_instance;
    }

    public Vocabulary pickAVoc() {
        return  vocs.get(GobAngryBird.rand.nextInt(vocs.size()));
    }
}
