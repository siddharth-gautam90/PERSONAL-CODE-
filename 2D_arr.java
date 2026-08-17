 int[][] arr = { { 2, 3, 5 , 6, 3}, { 2, 3, 5, 7, 4 }, { 2, 3, 5, 7, 6} };
        // int[][] arr = new int[3][4];
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[0].length; j++) {
        //         //System.out.print(arr[i][j] + " ");
        //         arr[i][j] = sc.nextInt(); /// input from the user 
        //     }
        //     System.out.println();
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[0].length; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        //}
        // sum of elem in 2D arrays
        // int[][] arr = { { 2, 3, 5, 6, 3 }, { 2, 3, 5, 7, 4 }, { 2, 3, 5, 7, 6 } };
        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[0].length; j++) {
        // sum += arr[i][j];
        // }
        // }
        // System.out.println(sum);

        // find the maximum elem in 2D arr
        // int[][] arr = { { 4, 3, 5, 6, 3}, { 2, 3, 5, 8, 4}, { 2, 3, 5, 7, 6}};
        // int max = arr[0][0]; // start with first elem 
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[0].length; j++) {
        //         if (arr[i][j] > max) {
        //             max = arr[i][j]; // update value 
        //         }
        //     }
        // }
        //     System.out.print("Maximum number - " + max);

        // RoW WITH MAX SUM
        // int[][] arr = { { 4, 3, 5, 6, 3 }, { 2, 3, 5, 8, 4 }, { 2, 3, 5, 7, 6 } };
        // int maxSum = Integer.MIN_VALUE;
        // int row = -1;
        // for (int i = 0; i < arr.length; i++) {
        //     int sum = 0;
        //     for (int j = 0; j < arr[0].length; j++) {
        //         sum += arr[i][j];
        //     }
        //     if (sum > maxSum) {
        //         maxSum = sum;
        //         row = i;
        //     }
        // }
        // System.out.println(row + " " + maxSum);

        // find the maximum elem out of all the maximum elem of each row 
        // column wise print
        // int[][] arr = { { 4, 3, 5, 6, 3 }, { 2, 3, 5, 8, 4 }, { 9, 3, 5, 7, 6 } };
        // for (int i = 0; i<arr.length; i++) {
        // for (int j = 0; j < arr[0].length; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // for each loop
        int[][] arr = { { 4, 3, 5, 6, 3 }, { -1, 3, 5, 8, 4 }, { 9, 3, 5, 7, 6 } };
        // for (int i = 0; i < arr.length; i++) {
        //     for (int elem : arr[i]) {
        //         System.out.print(elem + " ");
        //     }
        //     System.out.println();
        // }

        // Print snake 
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0){
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else {
                for (int j = arr[0].length-1; j>=0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
