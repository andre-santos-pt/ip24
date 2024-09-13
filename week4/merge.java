int[] merge(int[] left, int[] right) {
                int[] merge = new int[left.length + right.length];
                int i = 0;
                while(i < left.length) {
                    merge[i] = left[i];
                    i = i + 1;
                }
                int j = 0;
                while(j < right.length) {
                    merge[j + left.length] = right[j];
                    j = j + 1;
                }
                return merge;
            }