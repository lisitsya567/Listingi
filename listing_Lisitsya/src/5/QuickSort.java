class QuickSort {
    static void sort(char items[]) {
        quicksort (items,0,items.length -1);
    }
    private static void quicksort(char items[], int left, int right) {
        int top, bottom;
        char comparand, value;

        top = left;
        bottom = right;
        comparand= items[((left + right)/2)];
        do {
            while ((items[top]< comparand) && (top<right)) top++;
            while ((comparand<items[bottom]) &&
                    (bottom>left)) bottom--;

            if (top<=bottom) {
                value=items[top];
                items[top] = items[bottom];
                items[bottom]=value;
                top++;
                bottom--;
            }
        } while (top<=bottom);
        if (((right+1)-left)== items.length) {
            for (int i=0; i<items.length; i++)
                System.out.print(items[i]);
            System.out.println();
        }
        if (left<bottom) quicksort(items,left,bottom);
        if(top<right) quicksort(items,top,right);
    }
}

class QuickSortDemo {
    public static void main(String[] args) {
        char seq[] = {'h','e','d','a','c','i'};

        System.out.println("Исходный порядок символов:");
        for (int i=0; i< seq.length; i++)
            System.out.print(seq[i]);

        System.out.println();
        QuickSort.sort(seq);

        System.out.print("Сортированный порядок:");
        for (int i=0; i<seq.length; i++)
            System.out.print(seq[i]);

        System.out.println();
    }
}