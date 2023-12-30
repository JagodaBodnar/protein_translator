import java.util.ArrayList;
import java.util.List;

public class ProteinTranslator {
    List<String> translate(String rnaSequence) {
        List<String> protein = new ArrayList<>();
        for(int i=0; i < rnaSequence.length(); i+=3){
            if(translateNucleotides(rnaSequence.substring(i, i+3)).equals("STOP")){
                break;
            }
           protein.add(translateNucleotides(rnaSequence.substring(i, i+3)));
        }
        return protein;
    }
    public String translateNucleotides(String nucleotide){
       return switch(nucleotide){
            case "AUG" -> "Methionine";
            case "UUU", "UUC" -> "Phenylalanine";
            case "UUA", "UUG" -> "Leucine";
            case "UCU", "UCC", "UCA","UCG"  -> "Serine";
            case "UAU", "UAC"  -> "Tyrosine";
            case "UGU", "UGC"  -> "Cysteine";
            case "UGG" -> "Tryptophan";
            case "UAA", "UAG", "UGA"  -> "STOP";
            default -> throw new IllegalArgumentException("Wrong nucleotide");
        };
    }
}
