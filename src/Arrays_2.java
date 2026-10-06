public class Arrays_2 {

    public  static  void TwoSumTransactionAmounts()
    {
        int[] transactions = {500, 1200, 300, 700, 1500, 800};
        int target = 2000;

        for(int i=0;i<transactions.length;i++)
        {
            for(int j=i+1;j<transactions.length;j++)
            {
                if(transactions[i] + transactions [j] ==target)
                {
                    System.out.println(transactions[i] + " + " + transactions[j] +" = " + target +
                            " and we found there indexes as " + i + " " + j);
                }
            }
        }
    }

    public  static  void MaximumProfitfromTransactionAmountsUsingOn2()
    {
        int[] transactionAmounts = {1000, 700, 1200, 500, 1500, 900, 2000};

        int maxDiff= Integer.MIN_VALUE;
        int Diff=Integer.MIN_VALUE;
        for(int i=transactionAmounts.length-1;i>=0;i--)
        {
            for(int j=0;j<i;j++)
            {
                Diff=transactionAmounts[i]-transactionAmounts[j];
                if(Diff>maxDiff)
                {
                    maxDiff=Diff;
                }
            }
        }
        System.out.println("Maximum Difference = " + maxDiff);
    }

    public  static  void MaximumProfitfromTransactionAmountsUsingOn()
    {
        int[] amounts = {10, 7, 12, 5, 15};
        int minSoFar= Integer.MAX_VALUE;
        int maxDiff = Integer.MIN_VALUE;

        for(int i=0;i<amounts.length;i++)
        {
            if(amounts[i]<minSoFar)
            {
                minSoFar=amounts[i];
            }else if (amounts[i] - minSoFar > maxDiff)
            {
                maxDiff=amounts[i]-minSoFar;
            }
        }
        System.out.println("Maximum Difference = " + maxDiff);
    }

    public static  void MergeTwoSortedTransactionArrays()
    {
        int[] bankA = {100, 101, 104, 108, 115, 120};
        int[] bankB = {102, 103, 110, 116, 125};
        int[] bankC = new int[bankB.length+bankA.length];

        int i=0;
        int j=0;
        int k=0;
        while(bankA.length>i && bankB.length>j)
        {
            if(bankA[i]>bankB[j])
            {
                bankC[k]=bankB[j];
                j++;
                k++;
            }else
            {
                bankC[k]=bankA[i];
                i++;
                k++;
            }

        }
        while(bankA.length>i)
        {
            bankC[k]=bankA[i];
            i++;
            k++;
        }
        while(bankB.length>j)
        {
            bankC[k]=bankB[j];
            j++;
            k++;
        }
        for(int m : bankC)
        {
            System.out.print(m + " ");
        }
    }

    public static void LongestContiguousSubArray()
    {
        int a[]={1,1,1,1,0,0,0,0,0,1,1};
        int Long=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            int countZero=0;
            int countOne=0;
            for(int j=i;j<a.length;j++)
            {
                if(a[j]==0)
                    countZero++;
                else
                    countOne++;
                if(countZero==countOne)
                {
                    int m=j-i+1;
                    if(m>Long)
                    {
                        Long=m;
                    }
                }
            }
        }
        System.out.println("Longest Count is "+ Long);
    }

    public static  void main (String[] args)
    {
        //6th Day
        //MergeTwoSortedTransactionArrays();
        LongestContiguousSubArray();

        //5th Day
        //TwoSumTransactionAmounts();
        //MaximumProfitfromTransactionAmountsUsingOn2();
        //MaximumProfitfromTransactionAmountsUsingOn();

    }
}
