package inbuildExamples.customstack;

public class DynamicStack extends Stack{

    public DynamicStack(){
        super(); // it will call the parent
    }

    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item) {
        if(this.isfull()){

            // this takes care of being full
            // double the array size
            int[] temp = new int[data.length*2];

            // copy all previous items in new data

            for(int i=0; i<data.length; i++){
                temp[i] = data[i];
            }
            data = temp;
        }

        // insert item;
        return super.push(item);
    }
}
