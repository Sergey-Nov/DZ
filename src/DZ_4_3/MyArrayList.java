package DZ_4_3;


public class MyArrayList {
    private int capacity = 10;
    private Object[] element;

    public MyArrayList(int capacity, Object[] element) {
        this.capacity = capacity;
        this.element = element;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Object[] getElement() {
        return element;
    }

    public void setElement(Object[] element) {
        this.element = element;
    }
    private boolean add(Object object){
        if (capacity!=element.length){
            for (int i = 0; i < element.length; i++) {
                if (element[i]==null){
                    this.element[i] = object;
                }else {
                    i++;
                }
            }
        }else {
            capacity *= 2;
        }
    return true;
    }
    private boolean addArray(Object[] objects){
        if (capacity!=element.length){
            for (int i = 0; i < element.length; i++) {
                if (element[i]==null){
                    this.element[i] = objects;
                }else {
                    i++;
                }
            }
        }else {
            capacity *= 2;
        }
        return true;
    }
    private boolean addToIndex(Object object, int index){
        if (capacity!= element.length){
            for (int i = index; i < element.length ; i++) {
                if (element[index]==null){
                    this.element[index]=object;
                }else if (element[index]!=null&element[index+1]==null){
                     Object swap;
                     swap = element[index];
                     element[index] = object;
                     element[index + 1]=swap;
                }
            }
        }else{
            capacity *= 2;
        }
        return true;
    }
}


