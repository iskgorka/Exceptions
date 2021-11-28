public class MyException extends Exception{
    int i;
    public String toString()
    {
        return "Error";
    }
    public MyException(int i){
        this.i = i;
        try{
            if (i<10){
                throw new MyException(20);
            }
        }
        catch(MyException e)
        {
            System.out.println("Exception: "+e.toString());
        }
    }
}
