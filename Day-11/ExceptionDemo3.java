public class ExceptionDemo3 {
    public static void main(String[] args) {
        LowAttendanceException l = new LowAttendanceException(null);

        try{
            l.CheckAttendance(50);
        }
        catch(LowAttendanceException le){
            System.out.println("ready to pay fine");
        }
}

static class LowAttendanceException extends RuntimeException
{
    public LowAttendanceException(String msg){

        System.out.println(msg);
    }
    
    public void CheckAttendance(int percentage){
        if(percentage > 60){
            System.out.println("allow for exam");
        } else {
            //exception possible
            //anonymous object
            throw new LowAttendanceException(null);
        }
    }
}

}
