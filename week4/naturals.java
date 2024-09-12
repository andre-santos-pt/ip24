int[] naturals(int n) {
     int[] nats = new int[n];
      int i = 0;
                while(i < n) {
                    nats[i] = i + 1;
                    i = i + 1;
                }
     return nats;
}