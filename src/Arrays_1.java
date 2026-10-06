public class Arrays_1 {

    public   void SecondLargestNumber()
    {
        int[] numbers = {10, 25, 5, 40, 30, 40, 15};

        int largestNo= Integer.MIN_VALUE;
        int secondLargestNo = Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]>largestNo)
            {
                secondLargestNo=largestNo;
                largestNo=numbers[i];
            }
            else if (numbers[i]>secondLargestNo && numbers[i]!=largestNo)
            {
                secondLargestNo=numbers[i];
            }
        }

        System.out.println("Largest Number is " + largestNo);
        System.out.println("Second Largest Number is " + secondLargestNo);
    }

    public  static void Dupicates()
    {
        int[] transactionIds = {101, 105, 103, 101, 108, 105, 110, 103, 115,101,105};

        for(int i=0;i<transactionIds.length;i++)
        {
            boolean isProcessed= false;
            for(int k=0;k<i;k++)
            {
                if(transactionIds[i]==transactionIds[k])
                {
                   isProcessed=true;
                   break;
                }
            }
            if(!isProcessed) {
                int count = 1;
                for (int j = i + 1; j < transactionIds.length; j++) {
                    if (transactionIds[i] == transactionIds[j]) {
                        count++;
                    }
                }
                if (count > 1) {
                    System.out.println(transactionIds[i] + " is presnet " + count + " times");
                }
            }
        }
    }

    public static void FirstNonRepeatingElement()
    {
        int[] transactionIds = {101, 102, 103, 101, 102, 104, 103, 105};

        for(int i=0;i<transactionIds.length;i++)
        {
            boolean isProcessed=false;
            for(int k=0;k<i;k++)
            {
                if(transactionIds[i]==transactionIds[k]) {
                    isProcessed = true;
                    break;
                }
            }
            int count =1;
            for(int j=i+1;j<transactionIds.length;j++)
            {
                if(transactionIds[i]==transactionIds[j])
                {
                    count++;
                }
            }
            if(count==1 && (!isProcessed)) {
                System.out.println(transactionIds[i]);
                break;
            }
        }
    }

    public  static  void MoveZerosToEndByShifting()
    {
       int a[]= {0, 0,5};

       for(int i=0;i<a.length;i++)
       {
           if(a[i]==0)
           {
               for(int k=i;k<a.length-1;k++)
               {
                   a[k]=a[k+1];
               }
               a[a.length-1]=0;
           }
       }
       for(int i:a)
       {
           System.out.print(i + " ");
       }
    }

    public  static  void MoveZerosToEndByPosition()
    {
        int a[]= {0, 0,5,4,7,0,23};
        int position=0;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                a[position]=a[i];
                position++;
            }
        }

        for(int i=position;i<a.length;i++)
        {
            a[i]=0;
        }

        for(int i:a)
        {
            System.out.print(i + " ");
        }
    }

    public static void MissingNumber()
    {
        int[] a = {101, 102, 104, 105, 106};
        int ActualSum=0;
        int CalculatedSum=0;
        for(int i=0;i<a.length;i++)
        {
         ActualSum+=a[i];
        }

        for(int i=a[0];i<=a[a.length-1];i++)
        {
            CalculatedSum+=i;
        }

        System.out.println(ActualSum);
        System.out.println(CalculatedSum);
        System.out.println("Missing No is " + (CalculatedSum - ActualSum));
    }

    public  static void LongestConsectiveIncreaingStreak()
    {
        int a[]={10,20,30,40,1,2,3,4,5,6,7,8,34};

        int maxStreak=1;
        int count=1;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i+1]>a[i])
                count++;
            else
                count=0;
            if(count>maxStreak)
            {
                maxStreak=count;
            }
        }
        System.out.println("Longest Consective Increaing Streak is " + maxStreak);
    }


    public  static  void MaxConsectiveTrxsAboveThreshold()
    {
        int[] amounts = {5000, 12000, 15000, 18000,26000, 7000, 20000, 22000, 25000, 5000, 30000};
        int threshold = 10000;
        int maxCount=0;
        int count=0;

        for(int i=0;i<amounts.length-1;i++)
        {
            if(amounts[i]>threshold)
            {
                count++;
                if(count>maxCount) {
                    maxCount = count;
                }
            }else
            {
                count=0;
            }
        }
        System.out.println("Maximum Consecutive Transactions: " + maxCount);

    }

    public  static  void FirstRepeatingElement() {
        int[] transactionIds = {101, 102, 103, 104, 102, 105, 103};

        for (int i = 0; i < transactionIds.length; i++) {
            int count = 1;
            for (int j = i + 1; j < transactionIds.length; j++) {
                if (transactionIds[i] == transactionIds[j]) {
                    count++;
                }
            }
            if (count >1) {
                System.out.println("First  Repeated No is " + transactionIds[i]);
                break;
            }
        }
    }

    public  static  void MoveNegativeToStartByShiftingWithNewArray()
    {
        int[] transactions = {10, -5,0,1, 20, -10, 30, -2, 40,0,5};

        int[] originalArray= new int[transactions.length];
        for(int i=0;i<originalArray.length;i++)
        {
            originalArray[i]=transactions[i];
        }


        int pos=0;
        for(int i=0;i<transactions.length;i++)
        {
            if(transactions[i]<0)
            {
                transactions[pos]=transactions[i];
                pos++;
            }
        }

        for(int i=0;i<originalArray.length;i++)
        {
            if(originalArray[i]>=0)
            {
                transactions[pos]=originalArray[i];
                pos++;
            }
        }

        for(int i:transactions)
        {
            System.out.print(i + " ");
        }
    }

    public  static  void MoveNegativeToStartByShiftingWithoutNewArray()
    {
        int[] transactions =  {10, -5, 20, -10, 30, -2, 40};

        int pos=0;
        for(int i = 0; i < transactions.length; i++)
        {
            if(transactions[i] < 0)
            {
                int temp = transactions[i];

                for(int j = i; j > pos; j--)
                {
                    transactions[j] = transactions[j - 1];
                }

                transactions[pos] = temp;

                pos++;
            }
        }

        for(int i:transactions)
        {
            System.out.print(i + " ");
        }
    }


    public  static void main (String[] args)
    {
        Arrays_1 abb = new Arrays_1();

        //1st day
        //abb.SecondLargestNumber();
        //Dupicates();

        //2nd day
        //FirstNonRepeatingElement();
        //MoveZerosToEndByShifting();
        //MoveZerosToEndByPosition()

        //3rd Day
        //MissingNumber();
        //LongestConsectiveIncreaingStreak();

        //4th Day
        //MoveNegativeToStartByShiftingWithoutNewArray();
        //MoveNegativeToStartByShiftingWithNewArray();
        //FirstRepeatingElement();

        //5th day
        //MaxConsectiveTrxsAboveThreshold();
        //RotateTransactionArrayToRightByNthPosNewArray();
        //FindLongestSubarrayWithSumEqualToTarget();
         RotateTransactionArrayToRightByNthPos();

    }

    public  static  void RotateTransactionArrayToRightByNthPos()
    {
        int[] transactionIds = {101, 102, 103, 104, 105, 106};
        int position=2;
        //Expected O/P 105 106 101 102 103 104

        int n= (position%transactionIds.length);
        reverse(transactionIds ,0,transactionIds.length);
        reverse(transactionIds ,0,n);
        reverse(transactionIds ,n,transactionIds.length);

        for(int i:transactionIds)
        {
            System.out.print(i + " ");
        }

    }

    public  static void reverse(int array[], int  start, int end)
    {
        end = end - 1;

        while(start < end)
        {
            int tmp = array[start];
            array[start] = array[end];
            array[end] = tmp;

            start++;
            end--;
        }
    }
    public  static  void RotateTransactionArrayToRightByNthPosNewArray()
    {
        int[] transactionIds = {101, 102, 103, 104, 105, 106};
        int[] duplicates = new int[transactionIds.length];
            int position=8;

        int n= (position%transactionIds.length);
        int pos=0;
        for(int i=0;i<duplicates.length;i++)
        {
            int resultIndex = (n+i)%transactionIds.length;
            duplicates[resultIndex]= transactionIds[i];
        }

//        for(int i=0;i<duplicates.length;i++)
//        {
//            if(i<duplicates.length-n) {
//                duplicates[i+n] = transactionIds[i];
//            }else
//            {
//                duplicates[pos]=transactionIds[i];
//                pos++;
//            }
//        }


        for(int i:duplicates)
        {
            System.out.print(i + " ");
        }

    }
    public  static  void FindLongestSubarrayWithSumEqualToTarget()
    {
        int[] transactions = {2, 1, 5, 1, 3, 2, 1, 1};
        int target = 7;
        int maxOccurance=0;
        for(int i=0;i<transactions.length;i++)
        {
            int count=1;
            int sum=transactions[i];
            for(int j=i+1;j<transactions.length;j++)
            {
                sum=sum+transactions[j];
                count++;
                if(sum==target)
                {
                    if(count>maxOccurance)
                    {
                        maxOccurance=count;
                    }
                }
                else if(sum>target)
                    break;
            }
        }
        System.out.println("Max Occurance is " + maxOccurance);
    }
}
