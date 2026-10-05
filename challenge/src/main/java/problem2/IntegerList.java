package problem2;

public class IntegerList
{
    int[] list; //values in the list
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    public void increaseSize() {
        int[] newArray= new int[list.length * 2];
        for (int i=0; i<list.length; i++) {
            newArray[i] = list[i];
        }
        list= newArray;
    }

    public void addElement(int newVal) {
        int k= 0;
        while (k < list.length && (list[k] != 0)) k++;
        if (k == list.length) {
            increaseSize();
        }
        list[k] = newVal;
    }

    public void removeFirst(int newVal) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == newVal) {
                for (int j = i; j < list.length - 1; j++) {
                    list[j] = list[j + 1];
                }
                list[list.length - 1] = 0;
            }
        }
    }
    public void removeAll(int newVal) {
        int k= 0;
        for (int i=0; i<list.length; i++) {
            if (list[i] != newVal) {
                list[k++]= list[i];
            }
        }
        while (k < list.length) list[k++]=0;
    }


}