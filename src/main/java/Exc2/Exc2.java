package Exc2;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class Exc2 {
    public ArrayList<Integer> getListWith3Divider(ArrayList<Integer> inputList) {
        log.warn("Zadanie 2");
        log.warn("Lista: "+inputList);
        List<Integer> list;
        list = inputList.stream().filter(n -> numberHave3Divisors(n)).collect(Collectors.toList());
        log.info(String.valueOf("WYNIK: "+list));
        return (ArrayList<Integer>) list;
    }

    public boolean numberHave3Divisors(int number) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 2; i*i < number; i++) {
            if (number % i == 0 && number!= i) {
                divisors.add(i);
                if (i != number / i) divisors.add(number / i);
            }
        }
        return divisors.size() == 2;
    }
}
