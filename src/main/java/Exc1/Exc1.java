package Exc1;

import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.List;


@Slf4j
public class Exc1 {

    public int almostGreatestNumber(int m, List<Integer> list) {
        try {
            log.warn("ZADANIE 1");
            log.warn("m- ta największa wartość: "+m);
            log.warn("Lista: " + list);

            Collections.sort(list);
            Collections.reverse(list);
            list = list.subList(0, m);
            log.info(m + " największa liczba: " + list.get(list.size() - 1));
            return list.get(list.size() - 1);
        } catch (NullPointerException exception) {
            log.error("Podano wartość null . Błąd: " + exception);
        }
        return -1;
    }
}
