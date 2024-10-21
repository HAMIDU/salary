package customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class ReportSalary {
    static List<CustomerUnique> customerArrays = new ArrayList<>();

    static {
        loadList();
    }

    public static void main(String[] args) {

        long from = System.currentTimeMillis();

        Map<CustomerUnique, Long> resultMap = new HashMap<>();
        var sumTotal = new AtomicLong();

        customerArrays.forEach(e -> {
            resultMap.put(e, resultMap.getOrDefault(e, 0L) + 1L);
            sumTotal.set(Math.addExact(sumTotal.get(), e.getAmount()));
        });

       resultMap.entrySet().stream()
                .filter(x -> x.getValue() > 100).forEach((customerUniqueLongEntry) -> {
            System.out.print(" Duplicate Record is : ".concat(String.valueOf(customerUniqueLongEntry.getKey())));
            System.out.println(" Duplication Count is : ".concat(String.valueOf(customerUniqueLongEntry.getValue())));

        });

        System.out.println("Total AMount :" + sumTotal);

        long to = System.currentTimeMillis();

        System.out.println("Calc Time : " + Math.subtractExact(to, from) + " Milli Seconds");

    }

    static void loadList() {
        var i = 1;
        while (i <= 100) {
            customerArrays.add(new CustomerUnique(13660625l, 3000l));
            customerArrays.add(new CustomerUnique(13660625l, 3000l));
            customerArrays.add(new CustomerUnique(13660625l, 3000l));
            customerArrays.add(new CustomerUnique(13660625l, 4000l));
            customerArrays.add(new CustomerUnique(13660626l, 5000l));
            customerArrays.add(new CustomerUnique(13660626l, 5000l));
            customerArrays.add(new CustomerUnique(13660627l, 5000l));
            customerArrays.add(new CustomerUnique(13660627l, 6000l));
            customerArrays.add(new CustomerUnique(13660628l, 5000l));
            customerArrays.add(new CustomerUnique(13660629l, 5000l));
            i++;
        }
    }
}

