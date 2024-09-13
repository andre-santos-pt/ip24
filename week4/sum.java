int sum(int[] array) {
     int sum = 0;
                int i = 0;
                while(i < array.length) {
                    sum = sum + array[i];
                    i = i + 1;
                }
                return sum;
}