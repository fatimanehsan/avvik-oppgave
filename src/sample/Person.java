package sample;

public class Person extends fodselsdato{
    private String navn;
    private String Epost;
    private String telefonnummer;
    private int alder;

   
    public Person (String navn, int alder, fodselsdato){
        super(fodselsdato);
        this.navn=navn;
        this.alder=alder;
        
    }
}

