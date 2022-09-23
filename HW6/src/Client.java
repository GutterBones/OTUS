import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Client {
    private final String clientName;
    private final int clientAge;
    private final int clientId;
    private final Set<Account> clientAccounts= new HashSet<>();

    public Client(String clientName, int clientAge, int clientId) {
        this.clientName = clientName;
        this.clientAge = clientAge;
        this.clientId = clientId;
    }

    public void addAccount (int accountId) {
        Account newAccount = new Account(accountId);
        newAccount.setClientId(accountId);
        clientAccounts.add(newAccount);
    }

   public boolean equals(Object otherObj) {
        if (this == otherObj) return true;
        if (otherObj == null) return false;
        if (getClass() != otherObj.getClass()) return false;
        Client other = (Client)otherObj;
        return this.clientName.equals(other.clientName)
                && this.clientAge == other.clientAge
                && this.clientId == other.clientId;
   }

   public int hashCode() {
        return Objects.hash(clientName,clientAge, clientId);
   }

   public String toString(){
        return "Name:" + clientName + " Age:" + clientAge + " Accounts:" + clientAccounts;
   }

}
