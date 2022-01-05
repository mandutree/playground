public class algo {
    private int[] theArray = new int[50]; //

    private int arraySize = 10; // size of the array

    public void generateRandomArray() {

        for (int i = 0; i < arraySize; i++) { // loops to fill arrays with random numbers

            theArray[i] = (int) (Math.random() * 10) + 10; // 10 arrays with numbers 10 - 19
        }
    }
            public void printArray(){

                System.out.println("---------");

                for(int i = 0; i < arraySize; i++){ // loops to display data in the table

                    System.out.print("| " + i + " |"); // 1 is added to i 10 times to represent index number

                    System.out.println(theArray[i] + " |"); // the array in each index is shown in the table

                    System.out.println("---------");
                }
            }
            public int getValueAtIndex(int index){ // int index is the variable of the parameter

        if(index < arraySize) return theArray[index]; // if the index is smaller than arraySize = 10,
                // then it will return the value of the array

        return 0; // if the index is not smaller than arraySize, then it will return 0

            }
            public boolean doesArrayContainThisValue(int searchValue){

                boolean valueInArray = false;

                for(int i = 0; i < arraySize; i++){

                    if(theArray[i] == searchValue){ // sees if the values of each array match with the searched value

                        valueInArray = true;
                    }
                }
                return valueInArray; // returns a boolean statement if the value is there or not
            }
    public static void main(String[] args){

        algo newArray = new algo();

        newArray.generateRandomArray();

        newArray.printArray();

        System.out.println(newArray.getValueAtIndex(3));
    }
}