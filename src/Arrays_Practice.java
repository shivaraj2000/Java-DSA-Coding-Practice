import java.security.PublicKey;

public class Arrays_Practice {

        public static  void MissingNumber()
        {
            int[] transactionIds = {101, 102, 103, 105, 106};

            int actualSUm=0;
            int calculatedSUm=0;
            for(int i=0;i<transactionIds.length;i++)
            {
                actualSUm+=transactionIds[i];
            }

            for(int i=transactionIds[0];i<=transactionIds[transactionIds.length-1];i++)
            {
                calculatedSUm+=i;
            }

            System.out.println("Missing Transaction ID: " + (calculatedSUm-actualSUm));
        }

        public  static  void LongestConsectiveIncreaingStreak()
        {
            int[] transactions = {10, 20, 30, 40, 1, 2, 3, 4, 5, 6, 7, 8, 34};

            int count=1;
            int max=1;
            for(int i=0;i<transactions.length-1;i++)
            {
                if(transactions[i+1]>transactions[i])
                {
                    count++;
                    if(count>max)
                        max=count;

                }else
                {
                    count=1;
                }
            }

                System.out.println("Longest Streak: "+max);
        }

        public  static  void Dupicates()
        {
            int[] transactionIds = {101, 102, 103, 101, 104, 105, 102, 106, 103,101};


            for(int i=0;i<transactionIds.length;i++)
            {
                boolean isProcseed= false;
                for(int k=0;k<i;k++)
                {
                    if(transactionIds[i]==transactionIds[k])
                    {
                     isProcseed=true;
                    }
                }
                int count=1;
                for(int j=i+1;j<transactionIds.length;j++)
                {
                    if(transactionIds[i]==transactionIds[j])
                    {
                        count++;
                    }
                }
                if(count>1 && !(isProcseed))
                {
                    System.out.println("Dupliactes " + transactionIds[i] + " --> " +count);
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

    public void SecondLargestNumber()
    {
        int[] amounts = {5000, 12000, 8000, 25000, 15000, 25000};

        int largest=Integer.MIN_VALUE;
        int secondLargest= Integer.MIN_VALUE;
        for(int i=0;i<amounts.length;i++)
        {
            if(amounts[i]>largest)
            {
                secondLargest=largest;
                largest=amounts[i];
            }
            else if (amounts[i]>secondLargest && amounts[i]!=largest)
            {
                secondLargest=amounts[i];
            }
        }
        System.out.println("Second Largest No is " + secondLargest);
    }

    public  static  void FirstNonRepeatingElement()
    {
        int[] transactionIds = {101, 102, 103, 104, 102, 105, 103};

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
            int count=1;
            for(int j=i+1;j<transactionIds.length;j++)
            {
                if(transactionIds[i]==transactionIds[j])
                {
                    count++;
                }
            }
            if(count==1 && !(isProcessed)) {
                System.out.println("First Non Repeated No is " + transactionIds[i]);
                break;
            }

        }
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


    public  static void main (String[] args)
    {
        Arrays_Practice abb = new Arrays_Practice();
        //abb.SecondLargestNumber();
        //Dupicates();
        //FirstNonRepeatingElement();
        //MoveNegativeToStartByShiftingWithNewArray();
        //MoveNegativeToStartByShiftingWithoutNewArray();
        //MissingNumber();
        //LongestConsectiveIncreaingStreak();
        FirstRepeatingElement();
    }
}
