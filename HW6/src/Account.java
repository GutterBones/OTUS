import java.util.Objects;

public class Account {
    private final int accountId;
    private int clientId;
    public Account(int id){
        this.accountId = id;
    }
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String toString(){
        return Integer.toString(accountId);
    }

    public int hashCode() {
        return Objects.hash(accountId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountId == account.accountId;
    }
}
