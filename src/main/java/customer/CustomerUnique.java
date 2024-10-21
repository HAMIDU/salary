package customer;

import java.util.Objects;

public class CustomerUnique {
    public CustomerUnique( Long accountNumber, Long transactionAmount) {
        this.accountNo = accountNumber;
        this.amount = transactionAmount;
    }


    private Long accountNo;


    private Long amount;

    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerUnique that = (CustomerUnique) o;
        return Objects.equals(accountNo, that.accountNo) && Objects.equals(amount, that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNo, amount);
    }

    @Override
    public String toString() {
        return "CustomerUnique{" +
                "accountNo=" + accountNo +
                ", amount=" + amount +
                '}';
    }
}
