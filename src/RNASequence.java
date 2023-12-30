import java.util.List;

public class RNASequence {
    public static void main(String[] args) {
        ProteinTranslator protein = new ProteinTranslator();
        List<String> proteinSequence =  protein.translate("AUGUUUUCU");
        System.out.printf("Nucleotide sequence: AUGUUUUCU Proteins: %s%n",proteinSequence);
        proteinSequence =  protein.translate("UGG");
        System.out.printf("Nucleotide sequence: UGG Proteins: %s%n",proteinSequence);
        proteinSequence =  protein.translate("AUGUUUUAA");
        System.out.printf("Nucleotide sequence: AUGUUUUAA Proteins: %s%n",proteinSequence);
        proteinSequence =  protein.translate("UAGUGG");
        System.out.printf("Nucleotide sequence: UAGUGG Proteins: %s%n",proteinSequence);
    }
}
