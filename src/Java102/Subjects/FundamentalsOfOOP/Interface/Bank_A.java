package Java102.Subjects.FundamentalsOfOOP.Interface;

public class Bank_A implements IBank{

    private String bankName;
    private String terminalId;
    private String password;

    Bank_A(String bankName, String terminalId, String password){
        this.bankName = bankName;
        this.terminalId = terminalId;
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress){
        System.out.println("User ip address: " + ipAddress);
        System.out.println("Machine ip adress: " + this.hostIpAddress);
        System.out.println("Connected to " + this.bankName + ".");
        return true;
    }

    @Override
    public boolean payment(double amount, String cardNumber, String expiryDate, String cvc){
        System.out.println("Waiting for process...");
        System.out.println("Process successful.");
        return true;
    }

    public String getBankName(){
        return this.bankName;
    }

    public void setBankName(String bankName){
        this.bankName = bankName;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
