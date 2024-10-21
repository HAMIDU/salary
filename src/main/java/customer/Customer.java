package customer;

import java.util.Objects;

public class Customer extends CustomerUnique {
    public Customer(Long row, Long accountNo, String deviceType, Long amount) {
        super(accountNo,amount);
        this.row = row;
        this.deviceType = deviceType;
    }

    private Long row;


    private String deviceType;


    public Long getRow() {
        return row;
    }

    public void setRow(Long row) {
        this.row = row;
    }


    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(row, customer.row) && Objects.equals(deviceType, customer.deviceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, deviceType);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "row=" + row +
                ", deviceType='" + deviceType + '\'' +
                '}';
    }
}
