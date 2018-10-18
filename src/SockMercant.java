import java.io.IOException;
import java.util.*;

public class SockMercant {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
//        Set<Integer>distinctColorCodes = new HashSet<Integer>();
//        ArrayList<Integer>allSockColorsInDeck = new ArrayList<Integer>();
//        int numOfSingleSock = 0;
//        for(int sockColorCode : ar){
//            distinctColorCodes.add(sockColorCode);
//            allSockColorsInDeck.add(sockColorCode);
//        }
//        return distinctColorCodes.forEach(color -> { int numOfPair = 0;
//                allSockColorsInDeck.forEach(sockColor -> { int numOfPairEachColor = 0;
//                                                            if(sockColor.intValue() == color.intValue()){
//                                                                numOfPairEachColor++;
//                                                            }
//                                                            numOfPair += numOfPairEachColor/2;
//                                                         });
//        return numOfPair;});

//        Arrays.stream(ar)
//                .collect(Collectors.groupingBy(s -> s));
        Set<Integer>distinctColorCodes = new HashSet<Integer>();
        ArrayList<Integer>allSockColorsInDeck = new ArrayList<Integer>();
        for(int sockColorCode : ar){
            distinctColorCodes.add(sockColorCode);
            allSockColorsInDeck.add(sockColorCode);
        }

        int numOfPair = 0, numOfPairEachColor = 0;
        for(Integer colorCode: distinctColorCodes){
            numOfPairEachColor = Collections.frequency(allSockColorsInDeck,colorCode);
            numOfPair += numOfPairEachColor/2;
        }
        return numOfPair;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Burak\\Desktop\\testout.txt"));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] ar = new int[n];
//
//        String[] arItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int n = 4;
        int[] ar = {10, 9, 9, 8};

//        for (int i = 0; i < n; i++) {
//            int arItem = Integer.parseInt(arItems[i]);
//            ar[i] = arItem;
//        }
//        bufferedWriter.close();
//
//        scanner.close();

        int result = sockMerchant(n, ar);
        System.out.println(result);

    }
}