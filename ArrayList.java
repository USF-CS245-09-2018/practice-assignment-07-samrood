public class ArrayList implements List {

    private Object[] list;
    private int size = 0;

    public ArrayList(){
        list = new Object[10];
    }

    public void grow_list(){
        Object[] newlist = new Object[(list.length)*2];
        for(int i = 1; i <size; i++){
            newlist[i] = list[i];
        }
        list = newlist;
    }

    public void add(Object obj) {
        if(list.length == size) {
            grow_list();
        }
        list[size] = obj;
        ++size;
    }

    public void add(int pos, Object obj) {
        if(pos<0 || pos >=size) {
            try{
                throw new Exception("not in range");
            }
            catch (Exception e){

            }
        }
        if(list.length == size) {
            grow_list();
        }
        for(int i=size; i>pos; i--) {
            list[i] = list[i - 1];
        }
        size++;
        list[pos]= obj;
    }

    public Object get(int pos) {
        if(pos<0 || pos>=size) {
            try{
                throw new Exception("not in range");
            }
            catch (Exception e){

            }
        }
        Object obj= list[pos];
        return obj;
    }

    public Object remove(int pos) {
        if(pos<0 || pos>=size) {
            try{
                throw new Exception("not in range");
            }
            catch (Exception e){

            }
        }
        Object obj = list[pos];
        for(int i=pos; i<size-1; i++){
            list[i] = list[i + 1];
        }
        --size;
        return obj;
    }

    public int size() {
        return size;
    }

}
