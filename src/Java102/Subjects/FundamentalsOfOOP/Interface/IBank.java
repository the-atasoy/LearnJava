package Java102.Subjects.FundamentalsOfOOP.Interface;

public interface IBank {

    final String hostIpAddress = "127.0.0.1"; // You have to declare variable.
                                              // Cannot write String hostIpAddress;
                                              // Variables must be final.

    boolean connect(String ipAddress);
    boolean payment(double amount, String cardNumber, String expiryDate, String cvc);
}
