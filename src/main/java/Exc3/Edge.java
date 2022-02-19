package Exc3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Edge {
    private int A;
    private int B;

    public Edge(int a, int b) {
        A = a;
        B = b;
    }
}


