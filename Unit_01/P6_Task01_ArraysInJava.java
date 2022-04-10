package College.Unit_01;

public class P6_Task01_ArraysInJava {

    public static void main(String[] args) {

        //Declaration
        int array1[];
        int[] array2; //also correct
        int []array3; //also correct

        //Can not do array1[0]=1;
        //as we have not provided it any memory

        //initialization

        array1= new int[6];

        //Assigning values to the java Array
        for(int i=0;i<array1.length;i++) //length is the property of array
        {
            array1[i]=i;
        }

        int array4[]= {33,3,4,5}; //declaration,instantiation and initialization


        //passing array to method
        arrayAsParameter(array4);

        //passing anonymous array as parameter
        arrayAsParameter(new int[] {33,3,4,5});

        //Returning Array from the Method
        int [] array5= arrayAsReturnType();
        System.out.println(array5.toString()); //not printing exact array



        //MULTIDIMENTIONAL ARRAY IN JAVA
        int [][] arr6= new int[3][3]; //3 row and 3 col


        int counter=0;
        for(int i=0; i <3 ;i++)
        {
            for(int j=0;j<3;j++)
            {
                counter++;
                arr6[i][j]=counter;
            }
        }

        for(int i=0; i <3 ;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println(arr6[i][j]);
            }
        }


        System.out.println("\n\n");


        //ArrayIndexOutOfBoundException
        int arr[]= {50,60,70,80};
        for(int i=0; i <=arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("\n\n");



    }

    static void arrayAsParameter(int arr[])
    {
        for(int i=0; i <arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("\n\n");

    }

    static int[] arrayAsReturnType()
    {
        int array4[]= {33,3,4,5};
        return array4;
    }
}