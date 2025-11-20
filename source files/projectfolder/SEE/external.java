package SEE;

import CIE.personal;

public class external extends personal {
    public int[] see = new int[5];

    public external(String usn, String name, int sem, int[] see) {
        super(usn, name, sem);
        for (int i = 0; i < 5; i++)
            this.see[i] = see[i];
    }
}
