package megacom.Exeptions;

public class EnterYN extends RuntimeException{

    public EnterYN() {
        super("Enter only 'y' or 'n'");
    }
}
